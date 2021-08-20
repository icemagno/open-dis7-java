package edu.nps.moves.dis7.enumerations;

import edu.nps.moves.dis7.pdus.*;

// autogenerated using string template disbitset1.txt

/**
 * Generated from XML,
 *  UID 455, marshal size 32,
 * MunitionCapabilities
 */
public class MunitionCapabilities extends DisBitSet implements EntityCapabilities
{
// autogenerated using string template disbitsetcomment.txt

  /**
   * This entry is reserved for backward compatibility and may not be reused
   */
// autogenerated using string template disbitset15.txt

  public static Bits RESERVED = new Bits(0, 5);
// autogenerated using string template disbitsetcomment.txt

  /**
   * The Entity is an IED or contains an IED. The extended appearance record (if available) will identify how well hidden the IED is on the Entity. An Attached Part (if applicable, for instance a jury-rigged munition does not apply here) will identify the IED explicitly.
   */
// autogenerated using string template disbitset15.txt

  public static Bits IEDPRESENCEINDICATOR = new Bits(7, 1);;

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
  public MunitionCapabilities()
  {
    super(32); // length from bitfield element
  }

  /** Default constructor with parameters
   * @param wh Bits custom data structure
   * @param value bits of interest  */
  public MunitionCapabilities(Bits wh, int value)
  {
    this();
    set(wh,value);
  }

  /** Accessor method to set value
   * @param wh Bits custom data structure
   * @param value bits of interest
   * @return this object */
  public MunitionCapabilities set(Bits wh, int value)
  {
    //if((value & ~wh.inputmask) != 0)
    //  throw new EnumNotFoundException("bad bits passed to "+getClass().getSimpleName()+", field "+wh.name() + " cannot be "+value);

    setbits(wh.position,wh.length,value);
    return this;
  }
/*
  public MunitionCapabilities set(Bits wh, Object val) throws Exception
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
  public MunitionCapabilities set(int start, int length, int value)
  {
      setbits(start,length,value);
      return this;
  }

  /** Provide string representation
   * @return string representation */
  @Override
  public String toString()
  {
      return "MunitionCapabilities: " + super.toString();
  }
}
