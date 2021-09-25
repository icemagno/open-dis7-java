// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.prk.munition.tactical;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Bukkeuksong2SeparatedWarhead</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Bukkeuksong2SeparatedWarhead.createInstance()</code> or <code>new Bukkeuksong2SeparatedWarhead()</code>. </p>
 * <ul>
 *     <li> Country: Korea (Democratic Peoples Republic of) (PRK) = <code>119</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>TACTICAL</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: Bukkeuksong2  = <code>63</code>; </li>
 *     <li> Specific: Bukkeuksong2SeparatedWarhead  = <code>2</code>; </li>
 *     <li> Entity type uid: 32516; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2bf2d6eb. </p>
 * @see Country#KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class Bukkeuksong2SeparatedWarhead extends EntityType
{
    /** Default constructor */
    public Bukkeuksong2SeparatedWarhead()
    {
        setCountry(Country.KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.TACTICAL));

        setCategory((byte)1); // uid 32499, Guided
        setSubCategory((byte)63); // uid 32514, Bukkeuksong-2
        setSpecific((byte)2); // uid 32516, Bukkeuksong-2 Separated Warhead
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Bukkeuksong2SeparatedWarhead createInstance()
    {
            return new Bukkeuksong2SeparatedWarhead();
    }
}
