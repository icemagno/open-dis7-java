// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SSN784NorthDakota</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SSN784NorthDakota.createInstance()</code> or <code>new SSN784NorthDakota()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SSN (Nuclear Attack-Torpedo) = <code>3</code>; </li>
 *     <li> SubCategory: VirginiaClass  = <code>5</code>; </li>
 *     <li> Specific: SSN784NorthDakota  = <code>11</code>; </li>
 *     <li> Entity type uid: 29536; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@51ff3c4b. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSNNuclearAttackTorpedo
 * @see SubCategory

 */
public final class SSN784NorthDakota extends EntityType
{
    /** Default constructor */
    public SSN784NorthDakota()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)3); // uid 12301, SSN (Nuclear Attack-Torpedo)
        setSubCategory((byte)5); // uid 12405, Virginia Class
        setSpecific((byte)11); // uid 29536, SSN 784 North Dakota
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SSN784NorthDakota createInstance()
    {
            return new SSN784NorthDakota();
    }
}
