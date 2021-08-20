package edu.nps.moves.dis7.enumerations;

import edu.nps.moves.dis7.pdus.*;

// autogenerated using string template disbitset1.txt

/**
 * Generated from XML,
 *  UID 202, marshal size 8,
 * MinefieldDataPaintScheme
 */
public class MinefieldDataPaintScheme extends DisBitSet 
{
// autogenerated using string template disbitsetcommentxref.txt

  /**
   * Identifies the algae build-up on the mine, Use {@link MinefieldPaintSchemeAlgae} values for this field
   */
// autogenerated using string template disbitset16.txt

  public static Bits ALGAE = new Bits(0, 2, MinefieldPaintSchemeAlgae.class);
// autogenerated using string template disbitsetcommentxref.txt

  /**
   * Identifies the paint scheme of the mine, Use {@link MinefieldPaintSchemePaintScheme} values for this field
   */
// autogenerated using string template disbitset16.txt

  public static Bits PAINTSCHEME = new Bits(2, 6, MinefieldPaintSchemePaintScheme.class);;

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
  public MinefieldDataPaintScheme()
  {
    super(8); // length from bitfield element
  }

  /** Default constructor with parameters
   * @param wh Bits custom data structure
   * @param value bits of interest  */
  public MinefieldDataPaintScheme(Bits wh, int value)
  {
    this();
    set(wh,value);
  }

  /** Accessor method to set value
   * @param wh Bits custom data structure
   * @param value bits of interest
   * @return this object */
  public MinefieldDataPaintScheme set(Bits wh, int value)
  {
    //if((value & ~wh.inputmask) != 0)
    //  throw new EnumNotFoundException("bad bits passed to "+getClass().getSimpleName()+", field "+wh.name() + " cannot be "+value);

    setbits(wh.position,wh.length,value);
    return this;
  }
/*
  public MinefieldDataPaintScheme set(Bits wh, Object val) throws Exception
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
  public MinefieldDataPaintScheme set(int start, int length, int value)
  {
      setbits(start,length,value);
      return this;
  }

  /** Provide string representation
   * @return string representation */
  @Override
  public String toString()
  {
      return "MinefieldDataPaintScheme: " + super.toString();
  }
}
