// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CSS10ADFA31WheeledTransporterErectorLauncherTEL</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CSS10ADFA31WheeledTransporterErectorLauncherTEL.createInstance()</code> or <code>new CSS10ADFA31WheeledTransporterErectorLauncherTEL()</code>. </p>
 * <ul>
 *     <li> Country: China, Peoples Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Self-Propelled Artillery = <code>4</code>; </li>
 *     <li> SubCategory: CSS10DF31WheeledTransporterErectorLauncherTEL  = <code>29</code>; </li>
 *     <li> Specific: CSS10ADFA31WheeledTransporterErectorLauncherTEL  = <code>1</code>; </li>
 *     <li> Entity type uid: 31966; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@18bf3d14. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SelfPropelledArtillery
 * @see SubCategory

 */
public final class CSS10ADFA31WheeledTransporterErectorLauncherTEL extends EntityType
{
    /** Default constructor */
    public CSS10ADFA31WheeledTransporterErectorLauncherTEL()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 16884, Self-Propelled Artillery
        setSubCategory((byte)29); // uid 31965, CSS-10 (DF-31) Wheeled Transporter Erector Launcher (TEL)
        setSpecific((byte)1); // uid 31966, CSS-10A (DFA-31) Wheeled Transporter Erector Launcher (TEL)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CSS10ADFA31WheeledTransporterErectorLauncherTEL createInstance()
    {
            return new CSS10ADFA31WheeledTransporterErectorLauncherTEL();
    }
}
