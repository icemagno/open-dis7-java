// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.afg.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_545mmAK74</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_545mmAK74.createInstance()</code> or <code>new _545mmAK74()</code>. </p>
 * <ul>
 *     <li> Country: Afghanistan (AFG) = <code>1</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: Afghan National Army (ANA) = <code>11</code>; </li>
 *     <li> SubCategory: AssaultRifles  = <code>5</code>; </li>
 *     <li> Specific: _545mmAK74  = <code>10</code>; </li>
 *     <li> Entity type uid: 32182; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2513155a. </p>
 * @see Country#AFGHANISTAN_AFG
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AfghanNationalArmyANA
 * @see SubCategory

 */
public final class _545mmAK74 extends EntityType
{
    /** Default constructor */
    public _545mmAK74()
    {
        setCountry(Country.AFGHANISTAN_AFG);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 32180, Afghan National Army (ANA)
        setSubCategory((byte)5); // uid 32181, Assault Rifles
        setSpecific((byte)10); // uid 32182, 5.45mm AK-74
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _545mmAK74 createInstance()
    {
            return new _545mmAK74();
    }
}
