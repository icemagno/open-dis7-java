// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.nld.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>FokkerF50</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>FokkerF50.createInstance()</code> or <code>new FokkerF50()</code>. </p>
 * <ul>
 *     <li> Country: Netherlands (NLD) = <code>153</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Cargo/Tanker = <code>4</code>; </li>
 *     <li> SubCategory: FokkerF50F60Family  = <code>2</code>; </li>
 *     <li> Specific: FokkerF50  = <code>1</code>; </li>
 *     <li> Entity type uid: 28195; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@411341bd. </p>
 * @see Country#NETHERLANDS_NLD
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CargoTanker
 * @see SubCategory

 */
public final class FokkerF50 extends EntityType
{
    /** Default constructor */
    public FokkerF50()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)4); // uid 18933, Cargo/Tanker
        setSubCategory((byte)2); // uid 28194, Fokker F50/F60 Family
        setSpecific((byte)1); // uid 28195, Fokker F50
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static FokkerF50 createInstance()
    {
            return new FokkerF50();
    }
}
