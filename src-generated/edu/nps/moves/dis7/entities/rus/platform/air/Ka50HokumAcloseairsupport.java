// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Ka50HokumAcloseairsupport</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Ka50HokumAcloseairsupport.createInstance()</code> or <code>new Ka50HokumAcloseairsupport()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Attack helicopter = <code>20</code>; </li>
 *     <li> SubCategory: Ka50Hokum  = <code>3</code>; </li>
 *     <li> Specific: Ka50HokumAcloseairsupport  = <code>1</code>; </li>
 *     <li> Entity type uid: 13423; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@e4d2696. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Attackhelicopter
 * @see SubCategory

 */
public final class Ka50HokumAcloseairsupport extends EntityType
{
    /** Default constructor */
    public Ka50HokumAcloseairsupport()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)20); // uid 13407, Attack helicopter
        setSubCategory((byte)3); // uid 13422, Ka-50 Hokum
        setSpecific((byte)1); // uid 13423, Ka-50 Hokum A close air support
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Ka50HokumAcloseairsupport createInstance()
    {
            return new Ka50HokumAcloseairsupport();
    }
}
