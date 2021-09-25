// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GenericLifebuoywithLight</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GenericLifebuoywithLight.createInstance()</code> or <code>new GenericLifebuoywithLight()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Life-Saving Equipment = <code>101</code>; </li>
 *     <li> SubCategory: GenericLifebuoy  = <code>4</code>; </li>
 *     <li> Specific: GenericLifebuoywithLight  = <code>2</code>; </li>
 *     <li> Entity type uid: 30880; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2d691f3d. </p>
 * @see Country#OTHER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LifeSavingEquipment
 * @see SubCategory

 */
public final class GenericLifebuoywithLight extends EntityType
{
    /** Default constructor */
    public GenericLifebuoywithLight()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)101); // uid 30867, Life-Saving Equipment
        setSubCategory((byte)4); // uid 30878, Generic Lifebuoy
        setSpecific((byte)2); // uid 30880, Generic Lifebuoy with Light
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GenericLifebuoywithLight createInstance()
    {
            return new GenericLifebuoywithLight();
    }
}
