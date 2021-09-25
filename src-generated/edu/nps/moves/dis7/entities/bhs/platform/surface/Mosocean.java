// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bhs.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Mosocean</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Mosocean.createInstance()</code> or <code>new Mosocean()</code>. </p>
 * <ul>
 *     <li> Country: Bahamas (BHS) = <code>15</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tanker (Group 3 Merchant) = <code>82</code>; </li>
 *     <li> SubCategory: CrudeOilTankerupto159999DWT  = <code>5</code>; </li>
 *     <li> Specific: Mosocean  = <code>2</code>; </li>
 *     <li> Entity type uid: 24493; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@668bc3d5. </p>
 * @see Country#BAHAMAS_BHS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see TankerGroup3Merchant
 * @see SubCategory

 */
public final class Mosocean extends EntityType
{
    /** Default constructor */
    public Mosocean()
    {
        setCountry(Country.BAHAMAS_BHS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)82); // uid 24486, Tanker (Group 3 Merchant)
        setSubCategory((byte)5); // uid 24487, Crude Oil Tanker (up to 159,999 DWT)
        setSpecific((byte)2); // uid 24493, Mosocean
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Mosocean createInstance()
    {
            return new Mosocean();
    }
}
