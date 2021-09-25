// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Wiesel2lePzMrs120mmmortar</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Wiesel2lePzMrs120mmmortar.createInstance()</code> or <code>new Wiesel2lePzMrs120mmmortar()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Fighting Vehicle = <code>2</code>; </li>
 *     <li> SubCategory: Wiesel2armouredweaponscarrier  = <code>11</code>; </li>
 *     <li> Specific: Wiesel2lePzMrs120mmmortar  = <code>2</code>; </li>
 *     <li> Entity type uid: 22732; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@210ab13f. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredFightingVehicle
 * @see SubCategory

 */
public final class Wiesel2lePzMrs120mmmortar extends EntityType
{
    /** Default constructor */
    public Wiesel2lePzMrs120mmmortar()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 16250, Armored Fighting Vehicle
        setSubCategory((byte)11); // uid 22730, Wiesel 2 armoured weapons carrier
        setSpecific((byte)2); // uid 22732, Wiesel 2 lePzMrs 120 mm (mortar)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Wiesel2lePzMrs120mmmortar createInstance()
    {
            return new Wiesel2lePzMrs120mmmortar();
    }
}
