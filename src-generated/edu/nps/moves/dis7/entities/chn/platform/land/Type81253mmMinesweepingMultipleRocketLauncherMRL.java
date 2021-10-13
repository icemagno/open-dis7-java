// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Type81253mmMinesweepingMultipleRocketLauncherMRL</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Type81253mmMinesweepingMultipleRocketLauncherMRL.createInstance()</code> or <code>new Type81253mmMinesweepingMultipleRocketLauncherMRL()</code>. </p>
 * <ul>
 *     <li> Country: China, Peoples Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Self-Propelled Artillery = <code>4</code>; </li>
 *     <li> SubCategory: Type81253mmMinesweepingMultipleRocketLauncherMRL  = <code>49</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 31949; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4d1b0d2a. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SelfPropelledArtillery
 * @see SubCategory

 */
public final class Type81253mmMinesweepingMultipleRocketLauncherMRL extends EntityType
{
    /** Default constructor */
    public Type81253mmMinesweepingMultipleRocketLauncherMRL()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 16884, Self-Propelled Artillery
        setSubCategory((byte)49); // uid 31949, Type 81 253mm Minesweeping Multiple Rocket Launcher (MRL)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Type81253mmMinesweepingMultipleRocketLauncherMRL createInstance()
    {
            return new Type81253mmMinesweepingMultipleRocketLauncherMRL();
    }
}
