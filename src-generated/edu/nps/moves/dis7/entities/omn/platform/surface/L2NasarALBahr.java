// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.omn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>L2NasarALBahr</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>L2NasarALBahr.createInstance()</code> or <code>new L2NasarALBahr()</code>. </p>
 * <ul>
 *     <li> Country: Oman (OMN) = <code>164</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Amphibious Cargo Ship = <code>55</code>; </li>
 *     <li> SubCategory: LandingShipLogistic  = <code>1</code>; </li>
 *     <li> Specific: L2NasarALBahr  = <code>1</code>; </li>
 *     <li> Entity type uid: 17974; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@54e7391d. </p>
 * @see Country#OMAN_OMN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AmphibiousCargoShip
 * @see SubCategory

 */
public final class L2NasarALBahr extends EntityType
{
    /** Default constructor */
    public L2NasarALBahr()
    {
        setCountry(Country.OMAN_OMN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)55); // uid 17972, Amphibious Cargo Ship
        setSubCategory((byte)1); // uid 17973, Landing Ship-Logistic
        setSpecific((byte)1); // uid 17974, L2 Nasar AL Bahr
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static L2NasarALBahr createInstance()
    {
            return new L2NasarALBahr();
    }
}
