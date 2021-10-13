// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.munition.antipersonnel;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_46x30mmDrill</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_46x30mmDrill.createInstance()</code> or <code>new _46x30mmDrill()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_PERSONNEL</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _46mm  = <code>4</code>; </li>
 *     <li> Specific: _46x30mmDrill  = <code>7</code>; </li>
 *     <li> Entity type uid: 25748; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5763a655. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class _46x30mmDrill extends EntityType
{
    /** Default constructor */
    public _46x30mmDrill()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_PERSONNEL));

        setCategory((byte)2); // uid 21247, Ballistic
        setSubCategory((byte)4); // uid 25741, 4.6 mm
        setSpecific((byte)7); // uid 25748, 4.6x30 mm Drill
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _46x30mmDrill createInstance()
    {
            return new _46x30mmDrill();
    }
}
