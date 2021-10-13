// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.tur.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F4E2020Terminator</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F4E2020Terminator.createInstance()</code> or <code>new F4E2020Terminator()</code>. </p>
 * <ul>
 *     <li> Country: Turkey (TUR) = <code>218</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fighter/Air Defense = <code>1</code>; </li>
 *     <li> SubCategory: McDonnellDouglasF4PhantomII  = <code>1</code>; </li>
 *     <li> Specific: F4E2020Terminator  = <code>2</code>; </li>
 *     <li> Entity type uid: 30596; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@119aa36. </p>
 * @see Country#TURKEY_TUR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FighterAirDefense
 * @see SubCategory

 */
public final class F4E2020Terminator extends EntityType
{
    /** Default constructor */
    public F4E2020Terminator()
    {
        setCountry(Country.TURKEY_TUR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 30593, Fighter/Air Defense
        setSubCategory((byte)1); // uid 30594, McDonnell-Douglas F-4 Phantom II
        setSpecific((byte)2); // uid 30596, F-4E 2020 Terminator
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F4E2020Terminator createInstance()
    {
            return new F4E2020Terminator();
    }
}
