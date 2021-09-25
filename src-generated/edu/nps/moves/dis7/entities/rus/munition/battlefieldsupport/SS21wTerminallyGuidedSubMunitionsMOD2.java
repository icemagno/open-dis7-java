// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SS21wTerminallyGuidedSubMunitionsMOD2</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SS21wTerminallyGuidedSubMunitionsMOD2.createInstance()</code> or <code>new SS21wTerminallyGuidedSubMunitionsMOD2()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: SS21Scarab  = <code>17</code>; </li>
 *     <li> Specific: SS21wTerminallyGuidedSubMunitionsMOD2  = <code>5</code>; </li>
 *     <li> Entity type uid: 25051; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@d6b532f. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class SS21wTerminallyGuidedSubMunitionsMOD2 extends EntityType
{
    /** Default constructor */
    public SS21wTerminallyGuidedSubMunitionsMOD2()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)1); // uid 20760, Guided
        setSubCategory((byte)17); // uid 20781, SS-21 Scarab
        setSpecific((byte)5); // uid 25051, SS-21, w/ Terminally Guided Sub-Munitions, MOD 2
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SS21wTerminallyGuidedSubMunitionsMOD2 createInstance()
    {
            return new SS21wTerminallyGuidedSubMunitionsMOD2();
    }
}
