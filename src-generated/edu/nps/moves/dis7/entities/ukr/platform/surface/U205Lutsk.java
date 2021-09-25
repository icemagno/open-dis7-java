// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ukr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>U205Lutsk</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>U205Lutsk.createInstance()</code> or <code>new U205Lutsk()</code>. </p>
 * <ul>
 *     <li> Country: Ukraine (UKR) = <code>265</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Frigate (including Corvette) = <code>50</code>; </li>
 *     <li> SubCategory: GrishaVClass  = <code>2</code>; </li>
 *     <li> Specific: U205Lutsk  = <code>1</code>; </li>
 *     <li> Entity type uid: 27850; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4acb7ecc. </p>
 * @see Country#UKRAINE_UKR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FrigateincludingCorvette
 * @see SubCategory

 */
public final class U205Lutsk extends EntityType
{
    /** Default constructor */
    public U205Lutsk()
    {
        setCountry(Country.UKRAINE_UKR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 27845, Frigate (including Corvette)
        setSubCategory((byte)2); // uid 27849, Grisha V Class
        setSpecific((byte)1); // uid 27850, U-205 Lutsk
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static U205Lutsk createInstance()
    {
            return new U205Lutsk();
    }
}
