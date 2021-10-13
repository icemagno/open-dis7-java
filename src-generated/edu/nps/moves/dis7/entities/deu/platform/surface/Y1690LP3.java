// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Y1690LP3</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Y1690LP3.createInstance()</code> or <code>new Y1690LP3()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Utility = <code>18</code>; </li>
 *     <li> SubCategory: Type718Class  = <code>5</code>; </li>
 *     <li> Specific: Y1690LP3  = <code>3</code>; </li>
 *     <li> Entity type uid: 16703; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@38604b81. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Utility
 * @see SubCategory

 */
public final class Y1690LP3 extends EntityType
{
    /** Default constructor */
    public Y1690LP3()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)18); // uid 16684, Utility
        setSubCategory((byte)5); // uid 16700, Type 718 Class
        setSpecific((byte)3); // uid 16703, Y 1690 LP 3
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Y1690LP3 createInstance()
    {
            return new Y1690LP3();
    }
}
