// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.zaf.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M2004RedPhosphorus</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M2004RedPhosphorus.createInstance()</code> or <code>new M2004RedPhosphorus()</code>. </p>
 * <ul>
 *     <li> Country: South Africa (ZAF) = <code>197</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _155mm  = <code>1</code>; </li>
 *     <li> Specific: DenelUnassisted155mm  = <code>1</code>; </li>
 *     <li> Entity type uid: 26979; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@5d829ef0. </p>
 * @see Country#SOUTH_AFRICA_ZAF
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class M2004RedPhosphorus extends EntityType
{
    /** Default constructor */
    public M2004RedPhosphorus()
    {
        setCountry(Country.SOUTH_AFRICA_ZAF);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 26972, Ballistic
        setSubCategory((byte)1); // uid 26973, 155mm
        setSpecific((byte)1); // uid 26974, Denel, Unassisted, 155mm
        setExtra((byte)5); // uid 26979, M2004 Red Phosphorus
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M2004RedPhosphorus createInstance()
    {
            return new M2004RedPhosphorus();
    }
}
