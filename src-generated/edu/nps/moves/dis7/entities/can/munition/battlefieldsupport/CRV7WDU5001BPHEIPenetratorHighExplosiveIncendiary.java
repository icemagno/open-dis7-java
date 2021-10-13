// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.can.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CRV7WDU5001BPHEIPenetratorHighExplosiveIncendiary</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CRV7WDU5001BPHEIPenetratorHighExplosiveIncendiary.createInstance()</code> or <code>new CRV7WDU5001BPHEIPenetratorHighExplosiveIncendiary()</code>. </p>
 * <ul>
 *     <li> Country: Canada (CAN) = <code>39</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _70mm275in  = <code>1</code>; </li>
 *     <li> Specific: CRV7WDU5001BPHEI_PenetratorHighExplosiveIncendiary  = <code>7</code>; </li>
 *     <li> Entity type uid: 21768; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@de579ff. </p>
 * @see Country#CANADA_CAN
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class CRV7WDU5001BPHEIPenetratorHighExplosiveIncendiary extends EntityType
{
    /** Default constructor */
    public CRV7WDU5001BPHEIPenetratorHighExplosiveIncendiary()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 21760, Ballistic
        setSubCategory((byte)1); // uid 21761, 70 mm(2.75in)
        setSpecific((byte)7); // uid 21768, CRV7 WDU-5001/B PHEI: Penetrator High Explosive Incendiary
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CRV7WDU5001BPHEIPenetratorHighExplosiveIncendiary createInstance()
    {
            return new CRV7WDU5001BPHEIPenetratorHighExplosiveIncendiary();
    }
}
