// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>B6DBadgerASMplatform</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>B6DBadgerASMplatform.createInstance()</code> or <code>new B6DBadgerASMplatform()</code>. </p>
 * <ul>
 *     <li> Country: China, Peoples Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Bomber = <code>3</code>; </li>
 *     <li> SubCategory: XianH6B6Badger  = <code>2</code>; </li>
 *     <li> Specific: B6DBadgerASMplatform  = <code>2</code>; </li>
 *     <li> Entity type uid: 16993; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@76a4d6c. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Bomber
 * @see SubCategory

 */
public final class B6DBadgerASMplatform extends EntityType
{
    /** Default constructor */
    public B6DBadgerASMplatform()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)3); // uid 16989, Bomber
        setSubCategory((byte)2); // uid 16991, Xian H-6 (B-6) Badger
        setSpecific((byte)2); // uid 16993, B-6D Badger (ASM platform)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static B6DBadgerASMplatform createInstance()
    {
            return new B6DBadgerASMplatform();
    }
}
