// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.gbr.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ChallengerMBTMark2GunVariant</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ChallengerMBTMark2GunVariant.createInstance()</code> or <code>new ChallengerMBTMark2GunVariant()</code>. </p>
 * <ul>
 *     <li> Country: United Kingdom of Great Britain and Northern Ireland (GBR) = <code>224</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tank = <code>1</code>; </li>
 *     <li> SubCategory: ChallengerMBT  = <code>2</code>; </li>
 *     <li> Specific: MarkII  = <code>2</code>; </li>
 *     <li> Entity type uid: 28139; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@7fb66650. </p>
 * @see Country#UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Tank
 * @see SubCategory

 */
public final class ChallengerMBTMark2GunVariant extends EntityType
{
    /** Default constructor */
    public ChallengerMBTMark2GunVariant()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 14882, Tank
        setSubCategory((byte)2); // uid 14884, Challenger MBT
        setSpecific((byte)2); // uid 14886, Mark II
        setExtra((byte)3); // uid 28139, Challenger MBT Mark 2 Gun Variant
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ChallengerMBTMark2GunVariant createInstance()
    {
            return new ChallengerMBTMark2GunVariant();
    }
}
