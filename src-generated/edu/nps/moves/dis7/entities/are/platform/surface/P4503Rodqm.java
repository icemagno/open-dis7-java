// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.are.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>P4503Rodqm</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>P4503Rodqm.createInstance()</code> or <code>new P4503Rodqm()</code>. </p>
 * <ul>
 *     <li> Country: United Arab Emirates (ARE) = <code>223</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: BanYasLurssenTNC45Classfastattackcraftmissile  = <code>3</code>; </li>
 *     <li> Specific: P4503Rodqm  = <code>3</code>; </li>
 *     <li> Entity type uid: 18703; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3dd31157. </p>
 * @see Country#UNITED_ARAB_EMIRATES_ARE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class P4503Rodqm extends EntityType
{
    /** Default constructor */
    public P4503Rodqm()
    {
        setCountry(Country.UNITED_ARAB_EMIRATES_ARE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18692, Light/Patrol Craft
        setSubCategory((byte)3); // uid 18700, Ban Yas (Lurssen TNC 45) Class (fast attack craft-missile)
        setSpecific((byte)3); // uid 18703, P4503 Rodqm
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static P4503Rodqm createInstance()
    {
            return new P4503Rodqm();
    }
}
