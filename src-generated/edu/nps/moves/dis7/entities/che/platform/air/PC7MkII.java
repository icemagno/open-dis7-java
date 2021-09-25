// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.che.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PC7MkII</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PC7MkII.createInstance()</code> or <code>new PC7MkII()</code>. </p>
 * <ul>
 *     <li> Country: Switzerland (CHE) = <code>206</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Trainer = <code>40</code>; </li>
 *     <li> SubCategory: PilatusPC7  = <code>1</code>; </li>
 *     <li> Specific: PC7MkII  = <code>2</code>; </li>
 *     <li> Entity type uid: 19051; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@255eaa6b. </p>
 * @see Country#SWITZERLAND_CHE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Trainer
 * @see SubCategory

 */
public final class PC7MkII extends EntityType
{
    /** Default constructor */
    public PC7MkII()
    {
        setCountry(Country.SWITZERLAND_CHE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 19048, Trainer
        setSubCategory((byte)1); // uid 19049, Pilatus PC-7
        setSpecific((byte)2); // uid 19051, PC-7 Mk II
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PC7MkII createInstance()
    {
            return new PC7MkII();
    }
}
