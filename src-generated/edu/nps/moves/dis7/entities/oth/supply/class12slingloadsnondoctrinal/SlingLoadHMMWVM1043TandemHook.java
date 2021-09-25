// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class12slingloadsnondoctrinal;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SlingLoadHMMWVM1043TandemHook</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SlingLoadHMMWVM1043TandemHook.createInstance()</code> or <code>new SlingLoadHMMWVM1043TandemHook()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_12_SLING_LOADS_NON_DOCTRINAL</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: Sling Load, Vehicles = <code>5</code>; </li>
 *     <li> SubCategory: SlingLoadHighMobilityMultipurposeWheeledVehicleHMMWV  = <code>1</code>; </li>
 *     <li> Specific: SlingLoadHMMWVM1043TandemHook  = <code>4</code>; </li>
 *     <li> Entity type uid: 30834; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7aa3857b. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see SlingLoadVehicles
 * @see SubCategory

 */
public final class SlingLoadHMMWVM1043TandemHook extends EntityType
{
    /** Default constructor */
    public SlingLoadHMMWVM1043TandemHook()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_12_SLING_LOADS_NON_DOCTRINAL));

        setCategory((byte)5); // uid 30829, Sling Load, Vehicles
        setSubCategory((byte)1); // uid 30830, Sling Load, High Mobility Multipurpose Wheeled Vehicle (HMMWV)
        setSpecific((byte)4); // uid 30834, Sling Load, HMMWV, M1043, Tandem Hook
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SlingLoadHMMWVM1043TandemHook createInstance()
    {
            return new SlingLoadHMMWVM1043TandemHook();
    }
}
