// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>OneReactorUnit</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>OneReactorUnit.createInstance()</code> or <code>new OneReactorUnit()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Nuclear Power Plant = <code>12</code>; </li>
 *     <li> SubCategory: PressurizedWaterReactor  = <code>1</code>; </li>
 *     <li> Specific: OneReactorUnit  = <code>1</code>; </li>
 *     <li> Entity type uid: 22026; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@632d4cf2. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see NuclearPowerPlant
 * @see SubCategory

 */
public final class OneReactorUnit extends EntityType
{
    /** Default constructor */
    public OneReactorUnit()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)12); // uid 22023, Nuclear Power Plant
        setSubCategory((byte)1); // uid 22025, Pressurized Water Reactor
        setSpecific((byte)1); // uid 22026, One Reactor Unit
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static OneReactorUnit createInstance()
    {
            return new OneReactorUnit();
    }
}
