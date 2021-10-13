// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ita.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>G222VSakaG222GE</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>G222VSakaG222GE.createInstance()</code> or <code>new G222VSakaG222GE()</code>. </p>
 * <ul>
 *     <li> Country: Italy (ITA) = <code>106</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Cargo/Tanker = <code>4</code>; </li>
 *     <li> SubCategory: G222C27Spartan  = <code>1</code>; </li>
 *     <li> Specific: G222VSakaG222GE  = <code>8</code>; </li>
 *     <li> Entity type uid: 22928; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2a7686a7. </p>
 * @see Country#ITALY_ITA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CargoTanker
 * @see SubCategory

 */
public final class G222VSakaG222GE extends EntityType
{
    /** Default constructor */
    public G222VSakaG222GE()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)4); // uid 18311, Cargo/Tanker
        setSubCategory((byte)1); // uid 18312, G.222/C-27 Spartan
        setSpecific((byte)8); // uid 22928, G.222VS (aka G.222GE)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static G222VSakaG222GE createInstance()
    {
            return new G222VSakaG222GE();
    }
}
