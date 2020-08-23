package edu.nps.moves.dis7.enumerations;

import edu.nps.moves.dis7.*;

/**
 * Generated from XML, SISO-REF-010-v28, 2020-05-07<br>
 * UID 236 marshal size 16<br>
 * ______________________________________
 */
public class LinearObjectAppearanceExhaustSmoke extends DisBitSet 
{
  /**
   * 8-bit unsigned integer indicating the percent opacity of the smoke (0..100)
   */
  public static Bits undef = new Bits(0, 8);
  /**
   * Describes whether or not the smoke is attached to the vehicle
   */
  public static Bits undef_2 = new Bits(8, 1);
  /**
   * Describes the chemical content of the smoke, Use {@link AppearanceObjectSpecificChemicalType} values for this field
   */
  public static Bits undef_3 = new Bits(9, 2, AppearanceObjectSpecificChemicalType.class);

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

  public LinearObjectAppearanceExhaustSmoke()
  {
    super(16); // length from bitfield element
  }

  public LinearObjectAppearanceExhaustSmoke(Bits wh, int i)
  {
    this();
    set(wh,i);
  }

  public LinearObjectAppearanceExhaustSmoke set(Bits wh, int val)
  {
    //if((val & ~wh.inputmask) != 0)
    //  throw new EnumNotFoundException("bad bits passed to "+getClass().getSimpleName()+", field "+wh.name() + " cannot be "+val);

    setbits(wh.position,wh.length,val);
    return this;
  }
/*
  public LinearObjectAppearanceExhaustSmoke set(Bits wh, Object val) throws Exception
  {
    if(val.getClass() != wh.cls)
      throw new EnumNotFoundException("bad enum passed to "+getClass().getSimpleName()+", field "+wh.name() + " cannot be "+val.getClass().getSimpleName());;
    Method getValueMethod = wh.cls.getMethod("getValue",null);
    int bits = (int)getValueMethod.invoke(val, (Object[])null);
    setbits(wh.position,wh.length,bits);
    return this;
  }
*/
  // Some bitfields are defined without specific bits enumerated 
  public LinearObjectAppearanceExhaustSmoke set(int start, int length, int val)
  {
      setbits(start,length,val);
      return this;
  }
  
  @Override
  public String toString()
  {
      return "LinearObjectAppearanceExhaustSmoke: " + super.toString();
  }
}
