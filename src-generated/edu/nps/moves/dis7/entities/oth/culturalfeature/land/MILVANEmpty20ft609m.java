// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MILVANEmpty20ft609m</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MILVANEmpty20ft609m.createInstance()</code> or <code>new MILVANEmpty20ft609m()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Cargo Container = <code>16</code>; </li>
 *     <li> SubCategory: MILVAN  = <code>1</code>; </li>
 *     <li> Specific: MILVANEmpty20ft609m  = <code>1</code>; </li>
 *     <li> Entity type uid: 22916; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4a336377. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CargoContainer
 * @see SubCategory

 */
public final class MILVANEmpty20ft609m extends EntityType
{
    /** Default constructor */
    public MILVANEmpty20ft609m()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)16); // uid 22062, Cargo Container
        setSubCategory((byte)1); // uid 22915, MILVAN
        setSpecific((byte)1); // uid 22916, MILVAN, Empty, 20ft (6.09m)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MILVANEmpty20ft609m createInstance()
    {
            return new MILVANEmpty20ft609m();
    }
}
