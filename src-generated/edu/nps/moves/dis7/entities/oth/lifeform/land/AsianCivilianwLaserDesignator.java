// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AsianCivilianwLaserDesignator</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AsianCivilianwLaserDesignator.createInstance()</code> or <code>new AsianCivilianwLaserDesignator()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: Civilian = <code>130</code>; </li>
 *     <li> SubCategory: Lasers  = <code>153</code>; </li>
 *     <li> Specific: CivilianwLaserDesignator  = <code>1</code>; </li>
 *     <li> Entity type uid: 32745; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@141bb6b8. </p>
 * @see Country#OTHER
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Civilian
 * @see SubCategory

 */
public final class AsianCivilianwLaserDesignator extends EntityType
{
    /** Default constructor */
    public AsianCivilianwLaserDesignator()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)130); // uid 32731, Civilian
        setSubCategory((byte)153); // uid 32743, Lasers
        setSpecific((byte)1); // uid 32744, Civilian w/ Laser Designator
        setExtra((byte)1); // uid 32745, Asian Civilian w/ Laser Designator
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AsianCivilianwLaserDesignator createInstance()
    {
            return new AsianCivilianwLaserDesignator();
    }
}
