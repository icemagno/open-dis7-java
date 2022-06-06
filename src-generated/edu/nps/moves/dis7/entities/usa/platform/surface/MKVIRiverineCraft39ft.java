// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MKVIRiverineCraft39ft</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MKVIRiverineCraft39ft.createInstance()</code> or <code>new MKVIRiverineCraft39ft()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/patrol craft = <code>7</code>; </li>
 *     <li> SubCategory: MKVISpecialOperationsCraft  = <code>4</code>; </li>
 *     <li> Specific: MKVIRiverineCraft39ft  = <code>2</code>; </li>
 *     <li> Entity type uid: 34122; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@656c5c3. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Lightpatrolcraft
 * @see SubCategory

 */
public final class MKVIRiverineCraft39ft extends EntityType
{
    /** Default constructor */
    public MKVIRiverineCraft39ft()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 11573, Light/patrol craft
        setSubCategory((byte)4); // uid 34120, MK VI Special Operations Craft
        setSpecific((byte)2); // uid 34122, MK VI Riverine Craft, 39ft
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MKVIRiverineCraft39ft createInstance()
    {
            return new MKVIRiverineCraft39ft();
    }
}