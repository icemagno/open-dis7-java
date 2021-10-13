// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bel.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Mk4Mk40wAPKWSwFZ319HEAPWarhead</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Mk4Mk40wAPKWSwFZ319HEAPWarhead.createInstance()</code> or <code>new Mk4Mk40wAPKWSwFZ319HEAPWarhead()</code>. </p>
 * <ul>
 *     <li> Country: Belgium (BEL) = <code>21</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: FZMk4Mk40FFAR70mm275inwAPKWS  = <code>1</code>; </li>
 *     <li> Specific: Mk4Mk40wAPKWSwFZ319HEAPWarhead  = <code>4</code>; </li>
 *     <li> Entity type uid: 30314; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@57151b3a. </p>
 * @see Country#BELGIUM_BEL
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class Mk4Mk40wAPKWSwFZ319HEAPWarhead extends EntityType
{
    /** Default constructor */
    public Mk4Mk40wAPKWSwFZ319HEAPWarhead()
    {
        setCountry(Country.BELGIUM_BEL);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)1); // uid 30309, Guided
        setSubCategory((byte)1); // uid 30310, FZ Mk4/Mk40 FFAR (70 mm, 2.75 in) w/APKWS
        setSpecific((byte)4); // uid 30314, Mk4/Mk40 w/APKWS w/ FZ319 HEAP Warhead
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Mk4Mk40wAPKWSwFZ319HEAPWarhead createInstance()
    {
            return new Mk4Mk40wAPKWSwFZ319HEAPWarhead();
    }
}
