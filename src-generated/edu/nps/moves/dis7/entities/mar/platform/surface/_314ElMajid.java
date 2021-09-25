// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.mar.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_314ElMajid</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_314ElMajid.createInstance()</code> or <code>new _314ElMajid()</code>. </p>
 * <ul>
 *     <li> Country: Morocco (MAR) = <code>147</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: CormoranClass  = <code>1</code>; </li>
 *     <li> Specific: _314ElMajid  = <code>5</code>; </li>
 *     <li> Entity type uid: 27703; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1b822fcc. </p>
 * @see Country#MOROCCO_MAR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class _314ElMajid extends EntityType
{
    /** Default constructor */
    public _314ElMajid()
    {
        setCountry(Country.MOROCCO_MAR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 27697, Light/Patrol Craft
        setSubCategory((byte)1); // uid 27698, Cormoran Class
        setSpecific((byte)5); // uid 27703, 314 El Majid
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _314ElMajid createInstance()
    {
            return new _314ElMajid();
    }
}
