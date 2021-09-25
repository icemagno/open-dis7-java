// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>API1</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>API1.createInstance()</code> or <code>new API1()</code>. </p>
 * <ul>
 *     <li> Country: China, Peoples Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_AIR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _145mmType56  = <code>2</code>; </li>
 *     <li> Specific: API  = <code>1</code>; </li>
 *     <li> Entity type uid: 21340; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4b9c411. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class API1 extends EntityType
{
    /** Default constructor */
    public API1()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)2); // uid 21335, Ballistic
        setSubCategory((byte)2); // uid 21339, 14.5 mm Type 56
        setSpecific((byte)1); // uid 21340, API
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static API1 createInstance()
    {
            return new API1();
    }
}
