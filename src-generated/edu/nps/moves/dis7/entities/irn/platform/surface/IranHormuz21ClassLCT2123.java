// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.irn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>IranHormuz21ClassLCT2123</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>IranHormuz21ClassLCT2123.createInstance()</code> or <code>new IranHormuz21ClassLCT2123()</code>. </p>
 * <ul>
 *     <li> Country: Iran (Islamic Republic of) (IRN) = <code>101</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Landing Craft = <code>11</code>; </li>
 *     <li> SubCategory: IranHormuz21ClassLCT  = <code>3</code>; </li>
 *     <li> Specific: _2123  = <code>1</code>; </li>
 *     <li> Entity type uid: 18108; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@70a36a66. </p>
 * @see Country#IRAN_ISLAMIC_REPUBLIC_OF_IRN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LandingCraft
 * @see SubCategory

 */
public final class IranHormuz21ClassLCT2123 extends EntityType
{
    /** Default constructor */
    public IranHormuz21ClassLCT2123()
    {
        setCountry(Country.IRAN_ISLAMIC_REPUBLIC_OF_IRN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)11); // uid 18104, Landing Craft
        setSubCategory((byte)3); // uid 18107, Iran Hormuz 21 Class (LCT)
        setSpecific((byte)1); // uid 18108, 21-23
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static IranHormuz21ClassLCT2123 createInstance()
    {
            return new IranHormuz21ClassLCT2123();
    }
}
