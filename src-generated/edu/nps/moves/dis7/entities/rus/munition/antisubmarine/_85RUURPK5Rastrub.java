// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.munition.antisubmarine;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_85RUURPK5Rastrub</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_85RUURPK5Rastrub.createInstance()</code> or <code>new _85RUURPK5Rastrub()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_SUBMARINE</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: SSN14Silex  = <code>2</code>; </li>
 *     <li> Specific: _85RUURPK5Rastrub  = <code>3</code>; </li>
 *     <li> Entity type uid: 30583; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@504497fa. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class _85RUURPK5Rastrub extends EntityType
{
    /** Default constructor */
    public _85RUURPK5Rastrub()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SUBMARINE));

        setCategory((byte)1); // uid 20606, Guided
        setSubCategory((byte)2); // uid 20608, SS-N-14 Silex
        setSpecific((byte)3); // uid 30583, 85RU/URPK-5 Rastrub
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _85RUURPK5Rastrub createInstance()
    {
            return new _85RUURPK5Rastrub();
    }
}
