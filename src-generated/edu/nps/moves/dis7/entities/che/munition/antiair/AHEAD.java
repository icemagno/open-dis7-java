// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.che.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AHEAD</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AHEAD.createInstance()</code> or <code>new AHEAD()</code>. </p>
 * <ul>
 *     <li> Country: Switzerland (CHE) = <code>206</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_AIR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _35mm  = <code>1</code>; </li>
 *     <li> Specific: AHEAD  = <code>4</code>; </li>
 *     <li> Entity type uid: 21730; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@dd737ea. </p>
 * @see Country#SWITZERLAND_CHE
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class AHEAD extends EntityType
{
    /** Default constructor */
    public AHEAD()
    {
        setCountry(Country.SWITZERLAND_CHE);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)2); // uid 21725, Ballistic
        setSubCategory((byte)1); // uid 21726, 35 mm
        setSpecific((byte)4); // uid 21730, AHEAD
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AHEAD createInstance()
    {
            return new AHEAD();
    }
}
