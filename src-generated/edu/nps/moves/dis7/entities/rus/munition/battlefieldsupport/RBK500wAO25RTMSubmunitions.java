// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>RBK500wAO25RTMSubmunitions</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>RBK500wAO25RTMSubmunitions.createInstance()</code> or <code>new RBK500wAO25RTMSubmunitions()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: ClusterBombs  = <code>53</code>; </li>
 *     <li> Specific: RBK500wAO25RTMSubmunitions  = <code>1</code>; </li>
 *     <li> Entity type uid: 27416; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1c6e3ff9. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class RBK500wAO25RTMSubmunitions extends EntityType
{
    /** Default constructor */
    public RBK500wAO25RTMSubmunitions()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 20785, Ballistic
        setSubCategory((byte)53); // uid 27415, Cluster Bombs
        setSpecific((byte)1); // uid 27416, RBK-500 w/ AO 2.5RTM Submunitions
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static RBK500wAO25RTMSubmunitions createInstance()
    {
            return new RBK500wAO25RTMSubmunitions();
    }
}
