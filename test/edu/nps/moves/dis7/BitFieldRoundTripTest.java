/**
 * Copyright (c) 2008-2019, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 */
package edu.nps.moves.dis7;

import edu.nps.moves.dis7.enumerations.AppearanceCamouflageType;
import edu.nps.moves.dis7.enumerations.ForceID;
import edu.nps.moves.dis7.enumerations.LandPlatformAppearance;
import edu.nps.moves.dis7.util.DisNetworking;
import edu.nps.moves.dis7.util.PduFactory;
import java.io.IOException;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Bit Field Round TripTest")
public class BitFieldRoundTripTest
{

  public BitFieldRoundTripTest()
  {
  }

  @BeforeAll
  public static void setUpClass()
  {
    System.out.println("BitFieldRoundTripTest");
  }

  @AfterAll
  public static void tearDownClass()
  {
  }

  @BeforeEach
  public void setUp()
  {
  }

  @AfterEach
  public void tearDown()
  {
  }


  private Pdu receivedPdu;
  private Object waiter = new Object();

  @Test
  public void testBitFieldRoundTrip()
  {
    PduFactory factory = new PduFactory();

    EntityStatePdu espdu = factory.makeEntityStatePdu();
    
    espdu.setForceId(ForceID.FRIENDLY_9);
    espdu.setEntityType(new edu.nps.moves.dis7.entities.usa.platform.land.MK48_14_logisticsplatformtruck());
    Vector3Float lv = new Vector3Float();
    lv.setX(5.0f);
    espdu.setEntityLinearVelocity(lv);
    Vector3Double loc = new Vector3Double();
    loc.setX(10.0d).setY(20.0d).setZ(1.0d);
    espdu.setEntityLocation(loc);
    
    EulerAngles euler = new EulerAngles();
    euler.setPhi(25.0f).setPsi(35.0f).setTheta(45.0f);
    espdu.setEntityOrientation(euler);
    
    LandPlatformAppearance app = new LandPlatformAppearance();
    app.set(LandPlatformAppearance.BLACKOUT_BRAKE_LIGHTS_ON, 1)
      .set(LandPlatformAppearance.CAMOUFLAGE_TYPE, AppearanceCamouflageType.FOREST_CAMOUFLAGE.getValue())
      .set(LandPlatformAppearance.IS_FROZEN,1);
  
    setUpReceiver();

    try {
      Thread.sleep(250l); // make sure receiver is listening
      new DisNetworking().sendPdu(espdu);
      Thread.sleep(1000l); 
    }
    catch (Exception ex) {
      System.err.println("Error sending Multicast: " + ex.getLocalizedMessage());
      System.exit(1);
    }

    // Compare
    // If we made it this far, we've sent and received.  Now compare.
    dump("Sent pdu: ",espdu);
    dump("Rcvd pdu: ",espdu);
    boolean same = receivedPdu.equals(espdu);
    assertTrue(same, "Sent and received pdu not the same");
  }

  private void setUpReceiver()
  {
    Thread rcvThread = new Thread(() -> {
      try {
        receivedPdu = new DisNetworking().receivePdu();  // blocks
      }
      catch (IOException ex) {
        System.err.println("Error receiving Multicast: " + ex.getLocalizedMessage());
        System.exit(1);
      }
      //   waiter.notify();
    });

    rcvThread.setPriority(Thread.NORM_PRIORITY);
    rcvThread.setDaemon(true);
    rcvThread.start();
  }
  private void dump(String s, EntityStatePdu espdu)
  {
    System.out.println(s);
    System.out.println("Alternative EntityType: "+espdu.alternativeEntityType.toString());
    System.out.println("Entity Capabilities: "+espdu.capabilities.toString());
    System.out.println("Dead Reckoning Parameters: "+ espdu.getDeadReckoningParameters().toString());
    System.out.println("Entity Appearance: "+ espdu.getEntityAppearance());
    System.out.println("Entity ID: "+ espdu.getEntityID().toString());
    System.out.println("Entity Linear Velocity: "+ espdu.getEntityLinearVelocity().toString());
    System.out.println("Entity Location: "+ espdu.getEntityLocation().toString());
    System.out.println("Entity Orientation: "+ espdu.getEntityOrientation().toString());
    System.out.println("Entity Type: "+ espdu.getEntityType().toString());
    System.out.println("Exercise ID: "+ espdu.getExerciseID());
    System.out.println("Force ID: "+ espdu.getForceId().toString());
    System.out.println("Length: "+ espdu.getLength());
    System.out.println("Marking: "+ espdu.getMarking().toString());
    System.out.println("Pdu Status: "+ espdu.getPduStatus().toString());
    System.out.println("Pdu Type: "+ espdu.getPduType().toString());
    System.out.println("Protocol Family: "+ espdu.getProtocolFamily().toString());
    System.out.println("Protocol Version: "+ espdu.getProtocolVersion());
    System.out.println("Timestamp: "+ espdu.getTimestamp());
    System.out.println("Variable Parameters: "+ espdu.getVariableParameters().toString());
    System.out.println();
 }
  public static void main(String[] args)
  {
    new BitFieldRoundTripTest().testBitFieldRoundTrip();
  }
}
