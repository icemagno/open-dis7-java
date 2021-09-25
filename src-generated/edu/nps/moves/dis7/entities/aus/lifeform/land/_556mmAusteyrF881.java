// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_556mmAusteyrF881</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_556mmAusteyrF881.createInstance()</code> or <code>new _556mmAusteyrF881()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: Royal Australian Air Force (RAAF) = <code>13</code>; </li>
 *     <li> SubCategory: AssaultRifles  = <code>5</code>; </li>
 *     <li> Specific: _556mmAusteyrF88  = <code>55</code>; </li>
 *     <li> Entity type uid: 31519; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@601f264d. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see RoyalAustralianAirForceRAAF
 * @see SubCategory

 */
public final class _556mmAusteyrF881 extends EntityType
{
    /** Default constructor */
    public _556mmAusteyrF881()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)13); // uid 31517, Royal Australian Air Force (RAAF)
        setSubCategory((byte)5); // uid 31518, Assault Rifles
        setSpecific((byte)55); // uid 31519, 5.56mm Austeyr F88
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _556mmAusteyrF881 createInstance()
    {
            return new _556mmAusteyrF881();
    }
}
