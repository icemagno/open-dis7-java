// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.nor.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>P965Gnist</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>P965Gnist.createInstance()</code> or <code>new P965Gnist()</code>. </p>
 * <ul>
 *     <li> Country: Norway (NOR) = <code>163</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: SkjoldClass  = <code>3</code>; </li>
 *     <li> Specific: P965Gnist  = <code>6</code>; </li>
 *     <li> Entity type uid: 22947; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@ec2bf82. </p>
 * @see Country#NORWAY_NOR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class P965Gnist extends EntityType
{
    /** Default constructor */
    public P965Gnist()
    {
        setCountry(Country.NORWAY_NOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18957, Light/Patrol Craft
        setSubCategory((byte)3); // uid 22941, Skjold Class
        setSpecific((byte)6); // uid 22947, P965 Gnist
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static P965Gnist createInstance()
    {
            return new P965Gnist();
    }
}
