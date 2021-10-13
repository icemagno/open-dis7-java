// autogenerated using string template disbitset1.txt

package edu.nps.moves.dis7.enumerations;

import edu.nps.moves.dis7.pdus.*;

/**
 * Generated from XML,
 *  UID 459, marshal size 32,
 * SupplyCapabilities
 */
public class SupplyCapabilities extends DisBitSet implements EntityCapabilities
{

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 0, boolean) Describes whether the entity is able to supply some type of ammunition in response to an appropriate service request
   */
  // autogenerated using string template disbitset15.txt
  public static Bits AMMUNITIONSUPPLY = new Bits(0, 1);

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 1, boolean) Describes whether the entity is able to supply some type of fuel in response to an appropriate service request
   */
  // autogenerated using string template disbitset15.txt
  public static Bits FUELSUPPLY = new Bits(1, 1);

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 2, length=3) This entry is reserved for backward compatibility and may not be reused
   */
  // autogenerated using string template disbitset15.txt
  public static Bits RESERVED = new Bits(2, 3);

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 6, boolean) The Entity is able to be carried as a sling load payload. The extended appearance record (if available) will identify if it is currently sling loaded and entity association and/or entity offset records (if available) will provide additional sling load details (such as carrier).
   */
  // autogenerated using string template disbitset15.txt
  public static Bits SLINGLOADABLE = new Bits(6, 1);

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 7, boolean) The Entity is an IED or contains an IED. The extended appearance record (if available) will identify how well hidden the IED is on the Entity. An Attached Part (if applicable, for instance a jury-rigged munition does not apply here) will identify the IED explicitly.
   */
  // autogenerated using string template disbitset15.txt
  public static Bits IEDPRESENCEINDICATOR = new Bits(7, 1);
  // autogenerated using string template disbitset2.txt
  /** Internal class */
  public static class Bits
  {
    private int position;
    private int length;
    private int inputmask;
    private Class cls;

    private Bits(int position) {
      this(position,1, null);
    }
    
    private Bits(int position, Class cls) {
      this(position,1, cls);
    }

    private Bits(int position, int length ) {
      this(position,length,null);
    }

    private Bits(int position, int length, Class cls) {
      this.position = position;
      this.length = length;
      this.cls = cls;
      inputmask = calculateMask(length);
    }
  }

  /** Default constructor */
  public SupplyCapabilities()
  {
    super(32); // length from bitfield element
  }

  /** Default constructor with parameters
   * @param wh Bits custom data structure
   * @param value bits of interest  */
  public SupplyCapabilities(Bits wh, int value)
  {
    this();
    set(wh,value);
  }

  /** Accessor method to set value
   * @param wh Bits custom data structure
   * @param value bits of interest
   * @return this object */
  public SupplyCapabilities set(Bits wh, int value)
  {
    //if((value & ~wh.inputmask) != 0)
    //  throw new EnumNotFoundException("bad bits passed to "+getClass().getSimpleName()+", field "+wh.name() + " cannot be "+value);

    setbits(wh.position,wh.length,value);
    return this;
  }
/*
  public SupplyCapabilities set(Bits wh, Object val) throws Exception
  {
    if(val.getClass() != wh.cls)
      throw new EnumNotFoundException("bad enum passed to "+getClass().getSimpleName()+", field "+wh.name() + " cannot be "+val.getClass().getSimpleName());;
    Method getValueMethod = wh.cls.getMethod("getValue",null);
    int bits = (int)getValueMethod.invoke(val, (Object[])null);
    setbits(wh.position,wh.length,bits);
    return this;
  }
*/
  /** Some bitfields are defined without specific bits enumerated
   * @param start initial position in bit array
   * @param length number of bits
   * @param value bits of interest
   * @return this object */
  public SupplyCapabilities set(int start, int length, int value)
  {
      setbits(start,length,value);
      return this;
  }

  /** Provide string representation
   * @return string representation */
  @Override
  public String toString()
  {
      return "SupplyCapabilities: " + super.toString();
  }
}
