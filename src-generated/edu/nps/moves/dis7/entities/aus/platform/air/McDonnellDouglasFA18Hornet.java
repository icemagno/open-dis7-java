// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>McDonnellDouglasFA18Hornet</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>McDonnellDouglasFA18Hornet.createInstance()</code> or <code>new McDonnellDouglasFA18Hornet()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fighter/Air Defense = <code>1</code>; </li>
 *     <li> SubCategory: McDonnellDouglasFA18Hornet  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 29315; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3abfe836. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FighterAirDefense
 * @see SubCategory

 */
public final class McDonnellDouglasFA18Hornet extends EntityType
{
    /** Default constructor */
    public McDonnellDouglasFA18Hornet()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 29312, Fighter/Air Defense
        setSubCategory((byte)1); // uid 29315, McDonnell-Douglas F/A-18 Hornet
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static McDonnellDouglasFA18Hornet createInstance()
    {
            return new McDonnellDouglasFA18Hornet();
    }
}
