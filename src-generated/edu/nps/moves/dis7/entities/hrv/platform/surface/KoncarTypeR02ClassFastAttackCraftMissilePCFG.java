// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.hrv.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>KoncarTypeR02ClassFastAttackCraftMissilePCFG</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>KoncarTypeR02ClassFastAttackCraftMissilePCFG.createInstance()</code> or <code>new KoncarTypeR02ClassFastAttackCraftMissilePCFG()</code>. </p>
 * <ul>
 *     <li> Country: Croatia (HRV) = <code>249</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: KoncarTypeR02ClassFastAttackCraftMissilePCFG  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 19333; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6c64cb25. </p>
 * @see Country#CROATIA_HRV
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class KoncarTypeR02ClassFastAttackCraftMissilePCFG extends EntityType
{
    /** Default constructor */
    public KoncarTypeR02ClassFastAttackCraftMissilePCFG()
    {
        setCountry(Country.CROATIA_HRV);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 19332, Light/Patrol Craft
        setSubCategory((byte)1); // uid 19333, Koncar (Type R-02) Class (Fast Attack Craft-Missile) (PCFG)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static KoncarTypeR02ClassFastAttackCraftMissilePCFG createInstance()
    {
            return new KoncarTypeR02ClassFastAttackCraftMissilePCFG();
    }
}
