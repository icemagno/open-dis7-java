// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PressureCookerWithWire</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PressureCookerWithWire.createInstance()</code> or <code>new PressureCookerWithWire()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Appliances = <code>22</code>; </li>
 *     <li> SubCategory: Countertop  = <code>1</code>; </li>
 *     <li> Specific: PressureCookerWithWire  = <code>4</code>; </li>
 *     <li> Entity type uid: 26484; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@56b05bd7. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Appliances
 * @see SubCategory

 */
public final class PressureCookerWithWire extends EntityType
{
    /** Default constructor */
    public PressureCookerWithWire()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)22); // uid 26475, Appliances
        setSubCategory((byte)1); // uid 26476, Countertop
        setSpecific((byte)4); // uid 26484, Pressure Cooker With Wire
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PressureCookerWithWire createInstance()
    {
            return new PressureCookerWithWire();
    }
}
