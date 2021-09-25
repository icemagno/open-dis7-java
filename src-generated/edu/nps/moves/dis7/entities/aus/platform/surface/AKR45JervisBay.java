// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AKR45JervisBay</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AKR45JervisBay.createInstance()</code> or <code>new AKR45JervisBay()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: IncatclassFastSealiftCatamaran  = <code>1</code>; </li>
 *     <li> Specific: AKR45JervisBay  = <code>1</code>; </li>
 *     <li> Entity type uid: 17596; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4cdbe50f. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class AKR45JervisBay extends EntityType
{
    /** Default constructor */
    public AKR45JervisBay()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 17594, Auxiliary
        setSubCategory((byte)1); // uid 17595, Incat class: Fast Sealift Catamaran
        setSpecific((byte)1); // uid 17596, AKR45 Jervis Bay
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AKR45JervisBay createInstance()
    {
            return new AKR45JervisBay();
    }
}
