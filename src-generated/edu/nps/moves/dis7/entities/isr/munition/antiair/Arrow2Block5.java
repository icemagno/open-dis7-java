// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.isr.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Arrow2Block5</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Arrow2Block5.createInstance()</code> or <code>new Arrow2Block5()</code>. </p>
 * <ul>
 *     <li> Country: Israel (ISR) = <code>105</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_AIR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: ArrowHetz  = <code>6</code>; </li>
 *     <li> Specific: Arrow2Block5  = <code>6</code>; </li>
 *     <li> Entity type uid: 29022; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3a6e9856. </p>
 * @see Country#ISRAEL_ISR
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class Arrow2Block5 extends EntityType
{
    /** Default constructor */
    public Arrow2Block5()
    {
        setCountry(Country.ISRAEL_ISR);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 21282, Guided
        setSubCategory((byte)6); // uid 29016, Arrow / Hetz
        setSpecific((byte)6); // uid 29022, Arrow 2 Block-5
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Arrow2Block5 createInstance()
    {
            return new Arrow2Block5();
    }
}
