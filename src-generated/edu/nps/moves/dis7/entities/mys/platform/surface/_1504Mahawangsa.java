// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.mys.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_1504Mahawangsa</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_1504Mahawangsa.createInstance()</code> or <code>new _1504Mahawangsa()</code>. </p>
 * <ul>
 *     <li> Country: Malaysia (MYS) = <code>132</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: InderaSaktiClass  = <code>1</code>; </li>
 *     <li> Specific: _1504Mahawangsa  = <code>2</code>; </li>
 *     <li> Entity type uid: 27406; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4de025bf. </p>
 * @see Country#MALAYSIA_MYS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class _1504Mahawangsa extends EntityType
{
    /** Default constructor */
    public _1504Mahawangsa()
    {
        setCountry(Country.MALAYSIA_MYS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 27403, Auxiliary
        setSubCategory((byte)1); // uid 27404, Indera Sakti Class
        setSpecific((byte)2); // uid 27406, 1504 Mahawangsa
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _1504Mahawangsa createInstance()
    {
            return new _1504Mahawangsa();
    }
}
