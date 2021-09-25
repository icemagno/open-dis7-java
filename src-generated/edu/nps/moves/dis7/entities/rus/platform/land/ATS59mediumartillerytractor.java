// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ATS59mediumartillerytractor</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ATS59mediumartillerytractor.createInstance()</code> or <code>new ATS59mediumartillerytractor()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Small tracked utility vehicle = <code>8</code>; </li>
 *     <li> SubCategory: ATS59mediumartillerytractor  = <code>4</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 12939; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@37c5fc56. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Smalltrackedutilityvehicle
 * @see SubCategory

 */
public final class ATS59mediumartillerytractor extends EntityType
{
    /** Default constructor */
    public ATS59mediumartillerytractor()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)8); // uid 12935, Small tracked utility vehicle
        setSubCategory((byte)4); // uid 12939, ATS-59 medium artillery tractor
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ATS59mediumartillerytractor createInstance()
    {
            return new ATS59mediumartillerytractor();
    }
}
