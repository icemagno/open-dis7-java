// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Y9XZGX9PsychologicalOperationsCyberwarfare</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Y9XZGX9PsychologicalOperationsCyberwarfare.createInstance()</code> or <code>new Y9XZGX9PsychologicalOperationsCyberwarfare()</code>. </p>
 * <ul>
 *     <li> Country: China, People's Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Electronic Warfare (EW) = <code>6</code>; </li>
 *     <li> SubCategory: Y9EW  = <code>4</code>; </li>
 *     <li> Specific: Y9XZGX9PsychologicalOperationsCyberwarfare  = <code>2</code>; </li>
 *     <li> Entity type uid: 35174; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6e4784bc. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ElectronicWarfareEW
 * @see SubCategory

 */
public final class Y9XZGX9PsychologicalOperationsCyberwarfare extends EntityType
{
    /** Default constructor */
    public Y9XZGX9PsychologicalOperationsCyberwarfare()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)6); // uid 35127, Electronic Warfare (EW)
        setSubCategory((byte)4); // uid 35172, Y-9 EW
        setSpecific((byte)2); // uid 35174, Y-9XZ (GX-9) Psychological Operations/Cyberwarfare
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Y9XZGX9PsychologicalOperationsCyberwarfare createInstance()
    {
            return new Y9XZGX9PsychologicalOperationsCyberwarfare();
    }
}