// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.jor.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ALHamza</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ALHamza.createInstance()</code> or <code>new ALHamza()</code>. </p>
 * <ul>
 *     <li> Country: Jordan (JOR) = <code>114</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Landing Craft = <code>11</code>; </li>
 *     <li> SubCategory: ALHashimRotorkClassLCU  = <code>1</code>; </li>
 *     <li> Specific: ALHamza  = <code>3</code>; </li>
 *     <li> Entity type uid: 18276; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@76ba13c. </p>
 * @see Country#JORDAN_JOR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LandingCraft
 * @see SubCategory

 */
public final class ALHamza extends EntityType
{
    /** Default constructor */
    public ALHamza()
    {
        setCountry(Country.JORDAN_JOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)11); // uid 18272, Landing Craft
        setSubCategory((byte)1); // uid 18273, AL Hashim (Rotork) Class (LCU)
        setSpecific((byte)3); // uid 18276, AL Hamza
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ALHamza createInstance()
    {
            return new ALHamza();
    }
}
