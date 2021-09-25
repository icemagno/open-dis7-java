// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.are.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Hawk63C</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Hawk63C.createInstance()</code> or <code>new Hawk63C()</code>. </p>
 * <ul>
 *     <li> Country: United Arab Emirates (ARE) = <code>223</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Trainer = <code>40</code>; </li>
 *     <li> SubCategory: BAESystemsHawk  = <code>1</code>; </li>
 *     <li> Specific: Hawk63  = <code>2</code>; </li>
 *     <li> Entity type uid: 28584; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@3b920bdc. </p>
 * @see Country#UNITED_ARAB_EMIRATES_ARE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Trainer
 * @see SubCategory

 */
public final class Hawk63C extends EntityType
{
    /** Default constructor */
    public Hawk63C()
    {
        setCountry(Country.UNITED_ARAB_EMIRATES_ARE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 28579, Trainer
        setSubCategory((byte)1); // uid 28580, BAE Systems Hawk
        setSpecific((byte)2); // uid 28582, Hawk 63
        setExtra((byte)2); // uid 28584, Hawk 63C
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Hawk63C createInstance()
    {
            return new Hawk63C();
    }
}
