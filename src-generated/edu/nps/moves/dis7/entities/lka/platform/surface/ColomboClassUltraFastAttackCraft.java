// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.lka.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ColomboClassUltraFastAttackCraft</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ColomboClassUltraFastAttackCraft.createInstance()</code> or <code>new ColomboClassUltraFastAttackCraft()</code>. </p>
 * <ul>
 *     <li> Country: Sri Lanka (LKA) = <code>200</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: ColomboClassUltraFastAttackCraft  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 26423; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@b16e202. </p>
 * @see Country#SRI_LANKA_LKA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class ColomboClassUltraFastAttackCraft extends EntityType
{
    /** Default constructor */
    public ColomboClassUltraFastAttackCraft()
    {
        setCountry(Country.SRI_LANKA_LKA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 26422, Light/Patrol Craft
        setSubCategory((byte)1); // uid 26423, Colombo Class Ultra Fast Attack Craft
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ColomboClassUltraFastAttackCraft createInstance()
    {
            return new ColomboClassUltraFastAttackCraft();
    }
}
