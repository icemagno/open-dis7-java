// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bra.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DPICM1</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DPICM1.createInstance()</code> or <code>new DPICM1()</code>. </p>
 * <ul>
 *     <li> Country: Brazil (BRA) = <code>29</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: RocketASTROS  = <code>1</code>; </li>
 *     <li> Specific: _300mmSS60  = <code>3</code>; </li>
 *     <li> Entity type uid: 21792; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@26c8b296. </p>
 * @see Country#BRAZIL_BRA
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class DPICM1 extends EntityType
{
    /** Default constructor */
    public DPICM1()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 21778, Ballistic
        setSubCategory((byte)1); // uid 21779, Rocket ASTROS
        setSpecific((byte)3); // uid 21789, 300 mm SS-60
        setExtra((byte)3); // uid 21792, DPICM
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DPICM1 createInstance()
    {
            return new DPICM1();
    }
}
