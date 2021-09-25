// autogenerated using string template disbitset1.txt

package edu.nps.moves.dis7.enumerations;

import edu.nps.moves.dis7.pdus.*;

/**
 * Generated from XML,
 *  UID 233, marshal size 16,
 * PointObjectAppearanceCrater
 */
public class PointObjectAppearanceCrater extends DisBitSet 
{

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 0, length=8) 8-bit unsigned integer indicating the diameter of the crater in meters
   */
  // autogenerated using string template disbitset15.txt
  public static Bits DIAMETER = new Bits(0, 8);

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 8, length=8) 8-bit unsigned integer indicating the depth of the crater in centimeters
   */
  // autogenerated using string template disbitset15.txt
  public static Bits DEPTH = new Bits(8, 8);

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 16, length=8) 8-bit unsigned integer indicating the height of the crater in centimeters
   */
  // autogenerated using string template disbitset15.txt
  public static Bits HEIGHT = new Bits(16, 8);

  // autogenerated using string template disbitsetcommentxref.txt
  /**
   * (bit position 30, length=2) Describes the breached appearance of the object,  use {@link AppearanceLinearObjectTankDitchBreach} values for this field
   */
  // autogenerated using string template disbitset16.txt
  public static Bits BREACHSTATE = new Bits(30, 2, AppearanceLinearObjectTankDitchBreach.class);
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
  public PointObjectAppearanceCrater()
  {
    super(16); // length from bitfield element
  }

  /** Default constructor with parameters
   * @param wh Bits custom data structure
   * @param value bits of interest  */
  public PointObjectAppearanceCrater(Bits wh, int value)
  {
    this();
    set(wh,value);
  }

  /** Accessor method to set value
   * @param wh Bits custom data structure
   * @param value bits of interest
   * @return this object */
  public PointObjectAppearanceCrater set(Bits wh, int value)
  {
    //if((value & ~wh.inputmask) != 0)
    //  throw new EnumNotFoundException("bad bits passed to "+getClass().getSimpleName()+", field "+wh.name() + " cannot be "+value);

    setbits(wh.position,wh.length,value);
    return this;
  }
/*
  public PointObjectAppearanceCrater set(Bits wh, Object val) throws Exception
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
  public PointObjectAppearanceCrater set(int start, int length, int value)
  {
      setbits(start,length,value);
      return this;
  }

  /** Provide string representation
   * @return string representation */
  @Override
  public String toString()
  {
      return "PointObjectAppearanceCrater: " + super.toString();
  }
}
