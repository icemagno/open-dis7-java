// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GenericUAVwithDroppableBomb</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GenericUAVwithDroppableBomb.createInstance()</code> or <code>new GenericUAVwithDroppableBomb()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Unmanned = <code>50</code>; </li>
 *     <li> SubCategory: GenericUAV  = <code>1</code>; </li>
 *     <li> Specific: GenericUAVwithDroppableBomb  = <code>1</code>; </li>
 *     <li> Entity type uid: 31033; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@669d2b1b. </p>
 * @see Country#OTHER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Unmanned
 * @see SubCategory

 */
public final class GenericUAVwithDroppableBomb extends EntityType
{
    /** Default constructor */
    public GenericUAVwithDroppableBomb()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)50); // uid 31031, Unmanned
        setSubCategory((byte)1); // uid 31032, Generic UAV
        setSpecific((byte)1); // uid 31033, Generic UAV - with Droppable Bomb
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GenericUAVwithDroppableBomb createInstance()
    {
            return new GenericUAVwithDroppableBomb();
    }
}
