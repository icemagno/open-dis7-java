// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.dnk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>P524Nymfen</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>P524Nymfen.createInstance()</code> or <code>new P524Nymfen()</code>. </p>
 * <ul>
 *     <li> Country: Denmark (DNK) = <code>57</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/ Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: DianaClass  = <code>3</code>; </li>
 *     <li> Specific: P524Nymfen  = <code>5</code>; </li>
 *     <li> Entity type uid: 25459; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4d5d943d. </p>
 * @see Country#ACTION_RESPONSE_RELIABLE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class P524Nymfen extends EntityType
{
    /** Default constructor */
    public P524Nymfen()
    {
        setCountry(Country.ACTION_RESPONSE_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18790, Light/ Patrol Craft
        setSubCategory((byte)3); // uid 25454, Diana Class
        setSpecific((byte)5); // uid 25459, P524 Nymfen
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static P524Nymfen createInstance()
    {
            return new P524Nymfen();
    }
}
