// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SohoCluster</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SohoCluster.createInstance()</code> or <code>new SohoCluster()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SPACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Unmanned = <code>2</code>; </li>
 *     <li> SubCategory: Sciencesatellite  = <code>13</code>; </li>
 *     <li> Specific: SohoCluster  = <code>4</code>; </li>
 *     <li> Entity type uid: 16828; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3abada5a. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Unmanned
 * @see SubCategory

 */
public final class SohoCluster extends EntityType
{
    /** Default constructor */
    public SohoCluster()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)2); // uid 16811, Unmanned
        setSubCategory((byte)13); // uid 16824, Science satellite
        setSpecific((byte)4); // uid 16828, Soho & Cluster
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SohoCluster createInstance()
    {
            return new SohoCluster();
    }
}
