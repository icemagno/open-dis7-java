// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>McDonnellDouglasC17A</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>McDonnellDouglasC17A.createInstance()</code> or <code>new McDonnellDouglasC17A()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Cargo/Tanker = <code>4</code>; </li>
 *     <li> SubCategory: McDonnellDouglasC17A  = <code>9</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 10927; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@73613ae5. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CargoTanker
 * @see SubCategory

 */
public final class McDonnellDouglasC17A extends EntityType
{
    /** Default constructor */
    public McDonnellDouglasC17A()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)4); // uid 10867, Cargo/Tanker
        setSubCategory((byte)9); // uid 10927, McDonnell-Douglas C-17A
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static McDonnellDouglasC17A createInstance()
    {
            return new McDonnellDouglasC17A();
    }
}
