// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.jor.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ALHashimRotorkClassLCU</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ALHashimRotorkClassLCU.createInstance()</code> or <code>new ALHashimRotorkClassLCU()</code>. </p>
 * <ul>
 *     <li> Country: Jordan (JOR) = <code>114</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Landing Craft = <code>11</code>; </li>
 *     <li> SubCategory: ALHashimRotorkClassLCU  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 18273; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@eb6449b. </p>
 * @see Country#JORDAN_JOR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LandingCraft
 * @see SubCategory

 */
public final class ALHashimRotorkClassLCU extends EntityType
{
    /** Default constructor */
    public ALHashimRotorkClassLCU()
    {
        setCountry(Country.JORDAN_JOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)11); // uid 18272, Landing Craft
        setSubCategory((byte)1); // uid 18273, AL Hashim (Rotork) Class (LCU)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ALHashimRotorkClassLCU createInstance()
    {
            return new ALHashimRotorkClassLCU();
    }
}
