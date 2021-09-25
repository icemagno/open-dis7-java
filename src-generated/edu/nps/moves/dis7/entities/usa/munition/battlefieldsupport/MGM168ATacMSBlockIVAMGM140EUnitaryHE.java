// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MGM168ATacMSBlockIVAMGM140EUnitaryHE</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MGM168ATacMSBlockIVAMGM140EUnitaryHE.createInstance()</code> or <code>new MGM168ATacMSBlockIVAMGM140EUnitaryHE()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: MGM140ArmyTacticalMissileSystemATacMS  = <code>17</code>; </li>
 *     <li> Specific: MGM168ATacMSBlockIVAMGM140EUnitaryHE  = <code>5</code>; </li>
 *     <li> Entity type uid: 19934; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6ad6ae45. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class MGM168ATacMSBlockIVAMGM140EUnitaryHE extends EntityType
{
    /** Default constructor */
    public MGM168ATacMSBlockIVAMGM140EUnitaryHE()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)1); // uid 19887, Guided
        setSubCategory((byte)17); // uid 19929, MGM-140 Army Tactical Missile System (ATacMS)
        setSpecific((byte)5); // uid 19934, MGM-168 ATacMS - Block IVA (MGM-140E, Unitary HE)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MGM168ATacMSBlockIVAMGM140EUnitaryHE createInstance()
    {
            return new MGM168ATacMSBlockIVAMGM140EUnitaryHE();
    }
}
