// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bhr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F90Sabha</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F90Sabha.createInstance()</code> or <code>new F90Sabha()</code>. </p>
 * <ul>
 *     <li> Country: Bahrain (BHR) = <code>16</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: OliverPerryClass  = <code>1</code>; </li>
 *     <li> Specific: F90Sabha  = <code>1</code>; </li>
 *     <li> Entity type uid: 32604; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@73f792cf. </p>
 * @see Country#BAHRAIN_BHR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class F90Sabha extends EntityType
{
    /** Default constructor */
    public F90Sabha()
    {
        setCountry(Country.BAHRAIN_BHR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 32602, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 32603, Oliver Perry Class
        setSpecific((byte)1); // uid 32604, F90 Sabha
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F90Sabha createInstance()
    {
            return new F90Sabha();
    }
}
