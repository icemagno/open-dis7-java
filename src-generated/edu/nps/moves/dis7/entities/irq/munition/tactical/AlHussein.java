// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.irq.munition.tactical;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AlHussein</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AlHussein.createInstance()</code> or <code>new AlHussein()</code>. </p>
 * <ul>
 *     <li> Country: Iraq (IRQ) = <code>102</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>TACTICAL</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: AlHussein  = <code>2</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 21273; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@11c581a0. </p>
 * @see Country#IRAQ_IRQ
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class AlHussein extends EntityType
{
    /** Default constructor */
    public AlHussein()
    {
        setCountry(Country.IRAQ_IRQ);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.TACTICAL));

        setCategory((byte)2); // uid 21271, Ballistic
        setSubCategory((byte)2); // uid 21273, Al Hussein
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AlHussein createInstance()
    {
            return new AlHussein();
    }
}
