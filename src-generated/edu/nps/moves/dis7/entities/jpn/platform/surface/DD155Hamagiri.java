// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.jpn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DD155Hamagiri</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DD155Hamagiri.createInstance()</code> or <code>new DD155Hamagiri()</code>. </p>
 * <ul>
 *     <li> Country: Japan (JPN) = <code>110</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Destroyer (DD) = <code>5</code>; </li>
 *     <li> SubCategory: AsagiriClassDD  = <code>3</code>; </li>
 *     <li> Specific: DD155Hamagiri  = <code>5</code>; </li>
 *     <li> Entity type uid: 29507; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@65aa6596. </p>
 * @see Country#JAPAN_JPN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see DestroyerDD
 * @see SubCategory

 */
public final class DD155Hamagiri extends EntityType
{
    /** Default constructor */
    public DD155Hamagiri()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)5); // uid 18890, Destroyer (DD)
        setSubCategory((byte)3); // uid 18893, Asagiri Class (DD)
        setSpecific((byte)5); // uid 29507, DD-155 Hamagiri
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DD155Hamagiri createInstance()
    {
            return new DD155Hamagiri();
    }
}
