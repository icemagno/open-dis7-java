// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ind.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>L19Mahish</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>L19Mahish.createInstance()</code> or <code>new L19Mahish()</code>. </p>
 * <ul>
 *     <li> Country: India (IND) = <code>99</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tank Landing Ship = <code>10</code>; </li>
 *     <li> SubCategory: Polnochnyclass  = <code>1</code>; </li>
 *     <li> Specific: L19Mahish  = <code>3</code>; </li>
 *     <li> Entity type uid: 23174; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@51acdf2e. </p>
 * @see Country#INDIA_IND
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see TankLandingShip
 * @see SubCategory

 */
public final class L19Mahish extends EntityType
{
    /** Default constructor */
    public L19Mahish()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)10); // uid 23170, Tank Landing Ship
        setSubCategory((byte)1); // uid 23171, Polnochny class
        setSpecific((byte)3); // uid 23174, L19 Mahish
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static L19Mahish createInstance()
    {
            return new L19Mahish();
    }
}
