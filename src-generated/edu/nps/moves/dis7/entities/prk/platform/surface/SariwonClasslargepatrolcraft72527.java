// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.prk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SariwonClasslargepatrolcraft72527</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SariwonClasslargepatrolcraft72527.createInstance()</code> or <code>new SariwonClasslargepatrolcraft72527()</code>. </p>
 * <ul>
 *     <li> Country: Korea (Democratic Peoples Republic of) (PRK) = <code>119</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: SariwonClasslargepatrolcraft  = <code>4</code>; </li>
 *     <li> Specific: _72527  = <code>1</code>; </li>
 *     <li> Entity type uid: 17773; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2cf92cc7. </p>
 * @see Country#KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightpatrolCraft
 * @see SubCategory

 */
public final class SariwonClasslargepatrolcraft72527 extends EntityType
{
    /** Default constructor */
    public SariwonClasslargepatrolcraft72527()
    {
        setCountry(Country.KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17768, Light/patrol Craft
        setSubCategory((byte)4); // uid 17772, Sariwon Class (large patrol craft)
        setSpecific((byte)1); // uid 17773, 725-27
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SariwonClasslargepatrolcraft72527 createInstance()
    {
            return new SariwonClasslargepatrolcraft72527();
    }
}
