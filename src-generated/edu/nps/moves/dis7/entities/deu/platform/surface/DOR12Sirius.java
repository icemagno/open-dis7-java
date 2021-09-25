// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DOR12Sirius</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DOR12Sirius.createInstance()</code> or <code>new DOR12Sirius()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fishing Vessel = <code>86</code>; </li>
 *     <li> SubCategory: MediumFishingVesselupto65ft198m  = <code>2</code>; </li>
 *     <li> Specific: DOR12Sirius  = <code>1</code>; </li>
 *     <li> Entity type uid: 30388; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@68702e03. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FishingVessel
 * @see SubCategory

 */
public final class DOR12Sirius extends EntityType
{
    /** Default constructor */
    public DOR12Sirius()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)86); // uid 27584, Fishing Vessel
        setSubCategory((byte)2); // uid 30387, Medium Fishing Vessel (up to 65ft/19.8m)
        setSpecific((byte)1); // uid 30388, DOR 12 Sirius
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DOR12Sirius createInstance()
    {
            return new DOR12Sirius();
    }
}
