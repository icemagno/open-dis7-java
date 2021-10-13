// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_556mmAusteyrF88SA1LTR</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_556mmAusteyrF88SA1LTR.createInstance()</code> or <code>new _556mmAusteyrF88SA1LTR()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: Australian Army = <code>11</code>; </li>
 *     <li> SubCategory: AssaultRifles  = <code>5</code>; </li>
 *     <li> Specific: _556mmAusteyrF88SA1LTR  = <code>61</code>; </li>
 *     <li> Entity type uid: 31470; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5350ab17. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AustralianArmy
 * @see SubCategory

 */
public final class _556mmAusteyrF88SA1LTR extends EntityType
{
    /** Default constructor */
    public _556mmAusteyrF88SA1LTR()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 31462, Australian Army
        setSubCategory((byte)5); // uid 31463, Assault Rifles
        setSpecific((byte)61); // uid 31470, 5.56mm Austeyr F88-S-A1 LTR
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _556mmAusteyrF88SA1LTR createInstance()
    {
            return new _556mmAusteyrF88SA1LTR();
    }
}
