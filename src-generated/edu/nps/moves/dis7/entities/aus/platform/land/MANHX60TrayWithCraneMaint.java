// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MANHX60TrayWithCraneMaint</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MANHX60TrayWithCraneMaint.createInstance()</code> or <code>new MANHX60TrayWithCraneMaint()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: MANHX604x4  = <code>1</code>; </li>
 *     <li> Specific: MANHX60TrayWithCrane  = <code>2</code>; </li>
 *     <li> Entity type uid: 29726; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@4926097b. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class MANHX60TrayWithCraneMaint extends EntityType
{
    /** Default constructor */
    public MANHX60TrayWithCraneMaint()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 29715, Large Wheeled Utility Vehicle
        setSubCategory((byte)1); // uid 29716, MAN HX60 - 4x4
        setSpecific((byte)2); // uid 29722, MAN HX60 Tray, With Crane
        setExtra((byte)4); // uid 29726, MAN HX60 Tray, With Crane, Maint
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MANHX60TrayWithCraneMaint createInstance()
    {
            return new MANHX60TrayWithCraneMaint();
    }
}
