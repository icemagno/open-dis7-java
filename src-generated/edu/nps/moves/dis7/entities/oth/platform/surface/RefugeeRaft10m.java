// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>RefugeeRaft10m</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>RefugeeRaft10m.createInstance()</code> or <code>new RefugeeRaft10m()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Other Vessels = <code>87</code>; </li>
 *     <li> SubCategory: GenericRefugeeRaft  = <code>10</code>; </li>
 *     <li> Specific: RefugeeRaft10m  = <code>1</code>; </li>
 *     <li> Entity type uid: 29693; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@13cda7c9. </p>
 * @see Country#OTHER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see OtherVessels
 * @see SubCategory

 */
public final class RefugeeRaft10m extends EntityType
{
    /** Default constructor */
    public RefugeeRaft10m()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)87); // uid 24656, Other Vessels
        setSubCategory((byte)10); // uid 29692, Generic Refugee Raft
        setSpecific((byte)1); // uid 29693, Refugee Raft, 10m
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static RefugeeRaft10m createInstance()
    {
            return new RefugeeRaft10m();
    }
}
