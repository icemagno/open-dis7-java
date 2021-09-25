// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class7majoritems;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Quad30mmADENCannon</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Quad30mmADENCannon.createInstance()</code> or <code>new Quad30mmADENCannon()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_7_MAJOR_ITEMS</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: M - Weapons = <code>9</code>; </li>
 *     <li> SubCategory: _30mmADENCannon  = <code>2</code>; </li>
 *     <li> Specific: Quad30mmADENCannon  = <code>3</code>; </li>
 *     <li> Entity type uid: 30748; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@77d0dbba. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see MWeapons
 * @see SubCategory

 */
public final class Quad30mmADENCannon extends EntityType
{
    /** Default constructor */
    public Quad30mmADENCannon()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_7_MAJOR_ITEMS));

        setCategory((byte)9); // uid 30622, M - Weapons
        setSubCategory((byte)2); // uid 30745, 30mm ADEN Cannon
        setSpecific((byte)3); // uid 30748, Quad 30mm ADEN Cannon
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Quad30mmADENCannon createInstance()
    {
            return new Quad30mmADENCannon();
    }
}
