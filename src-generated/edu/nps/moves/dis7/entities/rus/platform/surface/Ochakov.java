// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Ochakov</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Ochakov.createInstance()</code> or <code>new Ochakov()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided-missile Cruiser = <code>3</code>; </li>
 *     <li> SubCategory: Karaclass  = <code>3</code>; </li>
 *     <li> Specific: Ochakov  = <code>2</code>; </li>
 *     <li> Entity type uid: 13517; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@40368a46. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedmissileCruiser
 * @see SubCategory

 */
public final class Ochakov extends EntityType
{
    /** Default constructor */
    public Ochakov()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)3); // uid 13504, Guided-missile Cruiser
        setSubCategory((byte)3); // uid 13515, Kara class
        setSpecific((byte)2); // uid 13517, Ochakov
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Ochakov createInstance()
    {
            return new Ochakov();
    }
}
