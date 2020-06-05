/**
 * Copyright (c) 2008-2020, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */
package edu.nps.moves.dis7.utilities;

import edu.nps.moves.dis7.Pdu;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;

/**
 * DisNetworking.java created on Jul 29, 2019
 * Simple multicast receive and send methods
 */
public class DisNetworking
{
  public class BuffAndLength
  {
    public byte[] buff;
    public int length;

    public BuffAndLength(byte[] buff, int length)
    {
      this.buff = buff;
      this.length = length;
    }
  }

  private int DIS_PORT = 3000;
  private String MCAST_GROUP = "230.0.0.0";
  private static final int MAX_DIS_PDU_SIZE = 8192;

  public DisNetworking()
  {
    this(3000, "230.0.0.0");
  }

  public DisNetworking(int port, String mcastgroup)
  {
    DIS_PORT = port;
    MCAST_GROUP = mcastgroup;
  }

  public int getPort()
  {
    return DIS_PORT;
  }

  public String getIp()
  {
    return MCAST_GROUP;
  }

  public void stop()
  {
    if(rsocket != null) {
      rsocket.close();
      rsocket = null;
    }
    
    if(ssocket != null) {
      ssocket.close();
      ssocket = null;
    }
  }
  
  public Pdu receivePdu() throws IOException
  {
    PduFactory pduFactory = new PduFactory();
    BuffAndLength blen = receiveRawPdu();
    return pduFactory.createPdu(blen.buff);
  }
  
  private MulticastSocket rsocket;
  InetSocketAddress group;
  InetAddress maddr;
  byte buffer[];
  DatagramPacket packet;
  public BuffAndLength receiveRawPdu() throws IOException
  {
    rsocket = new MulticastSocket(DIS_PORT);
    maddr = InetAddress.getByName(MCAST_GROUP);
    group = new InetSocketAddress(maddr, DIS_PORT);
    rsocket.joinGroup(group, DisThreadedNetIF.findIp4Interface());
    buffer = new byte[MAX_DIS_PDU_SIZE];
    packet = new DatagramPacket(buffer, buffer.length);

    //System.out.println("Listening on " + MCAST_GROUP + ":" + DIS_PORT + " if:" + socket.getNetworkInterface().getDisplayName());
    rsocket.receive(packet);   //blocks here waiting for next DIS pdu to be received on broadcast IP and specified port 
    //System.out.println("packet received from " + packet.getSocketAddress());
    
    rsocket.leaveGroup(group, DisThreadedNetIF.findIp4Interface());
    rsocket.close();
    rsocket = null;
    return new BuffAndLength(packet.getData(), packet.getLength());
  }

  ByteArrayOutputStream baos;
  DataOutputStream dos;
  public void sendPdu(Pdu pdu) throws Exception
  {
    // turn object into byte stream
    baos = new ByteArrayOutputStream();
    dos = new DataOutputStream(baos);
    pdu.marshal(dos);
    
    sendRawPdu(baos.toByteArray());
  }

  MulticastSocket ssocket;
  public void sendRawPdu(byte[] data) throws IOException
  {
    ssocket = new MulticastSocket();
    maddr = InetAddress.getByName(MCAST_GROUP);
    
    // load byte buffer into packet and send
    packet = new DatagramPacket(data, data.length, maddr, DIS_PORT);
    ssocket.send(packet);

    ssocket.close();
    ssocket = null;
    //System.out.println("sent to " + maddr.getHostAddress() + ":" + DIS_PORT);
  }
}
