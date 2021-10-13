// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.pak.munition.tactical;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ShaheenIIStage1Booster</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ShaheenIIStage1Booster.createInstance()</code> or <code>new ShaheenIIStage1Booster()</code>. </p>
 * <ul>
 *     <li> Country: Pakistan (PAK) = <code>165</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>TACTICAL</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: ShaheenIIHatf6  = <code>4</code>; </li>
 *     <li> Specific: ShaheenIIStage1Booster  = <code>3</code>; </li>
 *     <li> Entity type uid: 32544; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2bba35ef. </p>
 * @see Country#PAKISTAN_PAK
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class ShaheenIIStage1Booster extends EntityType
{
    /** Default constructor */
    public ShaheenIIStage1Booster()
    {
        setCountry(Country.PAKISTAN_PAK);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.TACTICAL));

        setCategory((byte)1); // uid 31392, Guided
        setSubCategory((byte)4); // uid 32541, Shaheen II (Hatf-6)
        setSpecific((byte)3); // uid 32544, Shaheen II Stage 1 Booster
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ShaheenIIStage1Booster createInstance()
    {
            return new ShaheenIIStage1Booster();
    }
}
