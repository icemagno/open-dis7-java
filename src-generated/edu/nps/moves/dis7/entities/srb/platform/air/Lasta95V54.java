// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.srb.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Lasta95V54</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Lasta95V54.createInstance()</code> or <code>new Lasta95V54()</code>. </p>
 * <ul>
 *     <li> Country: Serbia (SRB) = <code>276</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Trainer = <code>40</code>; </li>
 *     <li> SubCategory: Lasta95  = <code>1</code>; </li>
 *     <li> Specific: Lasta95V54  = <code>2</code>; </li>
 *     <li> Entity type uid: 30175; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2f66f0d0. </p>
 * @see Country#SERBIA_SRB
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Trainer
 * @see SubCategory

 */
public final class Lasta95V54 extends EntityType
{
    /** Default constructor */
    public Lasta95V54()
    {
        setCountry(Country.SERBIA_SRB);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 30172, Trainer
        setSubCategory((byte)1); // uid 30173, Lasta 95
        setSpecific((byte)2); // uid 30175, Lasta 95V-54
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Lasta95V54 createInstance()
    {
            return new Lasta95V54();
    }
}
