// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.can.expendable.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>WDIWhiteSARNightBallLight</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>WDIWhiteSARNightBallLight.createInstance()</code> or <code>new WDIWhiteSARNightBallLight()</code>. </p>
 * <ul>
 *     <li> Country: Canada (CAN) = <code>39</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Expendable = <code>8</code>; </li>
 *     <li> Category: SAR Night Light (SRNL) = <code>13</code>; </li>
 *     <li> SubCategory: LEDSRNL  = <code>1</code>; </li>
 *     <li> Specific: WDIWhiteSARNightBallLight  = <code>2</code>; </li>
 *     <li> Entity type uid: 31837; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@60a4e619. </p>
 * @see Country#CANADA_CAN
 * @see EntityKind#EXPENDABLE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SARNightLightSRNL
 * @see SubCategory

 */
public final class WDIWhiteSARNightBallLight extends EntityType
{
    /** Default constructor */
    public WDIWhiteSARNightBallLight()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)13); // uid 31834, SAR Night Light (SRNL)
        setSubCategory((byte)1); // uid 31835, LED SRNL
        setSpecific((byte)2); // uid 31837, WDI White SAR Night Ball Light
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static WDIWhiteSARNightBallLight createInstance()
    {
            return new WDIWhiteSARNightBallLight();
    }
}
