// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AntiTankRockets1</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AntiTankRockets1.createInstance()</code> or <code>new AntiTankRockets1()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: Civilian = <code>130</code>; </li>
 *     <li> SubCategory: AntiTankRockets  = <code>45</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 32735; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7ab2ba47. </p>
 * @see Country#OTHER
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Civilian
 * @see SubCategory

 */
public final class AntiTankRockets1 extends EntityType
{
    /** Default constructor */
    public AntiTankRockets1()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)130); // uid 32731, Civilian
        setSubCategory((byte)45); // uid 32735, Anti-Tank Rockets
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AntiTankRockets1 createInstance()
    {
            return new AntiTankRockets1();
    }
}
