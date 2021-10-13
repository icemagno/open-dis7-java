// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Kamenkaclassnavalsurvey82</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Kamenkaclassnavalsurvey82.createInstance()</code> or <code>new Kamenkaclassnavalsurvey82()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: Kamenkaclassnavalsurvey  = <code>35</code>; </li>
 *     <li> Specific: _82  = <code>4</code>; </li>
 *     <li> Entity type uid: 14096; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7c84195. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class Kamenkaclassnavalsurvey82 extends EntityType
{
    /** Default constructor */
    public Kamenkaclassnavalsurvey82()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 13805, Auxiliary
        setSubCategory((byte)35); // uid 14092, Kamenka class (naval survey)
        setSpecific((byte)4); // uid 14096, 82
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Kamenkaclassnavalsurvey82 createInstance()
    {
            return new Kamenkaclassnavalsurvey82();
    }
}
