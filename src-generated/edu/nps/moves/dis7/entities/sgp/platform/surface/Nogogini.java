// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.sgp.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Nogogini</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Nogogini.createInstance()</code> or <code>new Nogogini()</code>. </p>
 * <ul>
 *     <li> Country: Singapore (SGP) = <code>193</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tanker (Group 3 Merchant) = <code>82</code>; </li>
 *     <li> SubCategory: LiquidPetroleumGasLPGTanker  = <code>1</code>; </li>
 *     <li> Specific: Nogogini  = <code>1</code>; </li>
 *     <li> Entity type uid: 24552; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@42b6d0cc. </p>
 * @see Country#SINGAPORE_SGP
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see TankerGroup3Merchant
 * @see SubCategory

 */
public final class Nogogini extends EntityType
{
    /** Default constructor */
    public Nogogini()
    {
        setCountry(Country.SINGAPORE_SGP);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)82); // uid 24550, Tanker (Group 3 Merchant)
        setSubCategory((byte)1); // uid 24551, Liquid Petroleum Gas (LPG)Tanker
        setSpecific((byte)1); // uid 24552, Nogogini
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Nogogini createInstance()
    {
            return new Nogogini();
    }
}
