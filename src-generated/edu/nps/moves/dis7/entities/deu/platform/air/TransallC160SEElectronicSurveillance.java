// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TransallC160SEElectronicSurveillance</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TransallC160SEElectronicSurveillance.createInstance()</code> or <code>new TransallC160SEElectronicSurveillance()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Surveillance/C2 = <code>8</code>; </li>
 *     <li> SubCategory: TransallC160  = <code>1</code>; </li>
 *     <li> Specific: TransallC160SEElectronicSurveillance  = <code>2</code>; </li>
 *     <li> Entity type uid: 16349; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@15f47664. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SurveillanceC2
 * @see SubCategory

 */
public final class TransallC160SEElectronicSurveillance extends EntityType
{
    /** Default constructor */
    public TransallC160SEElectronicSurveillance()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)8); // uid 16346, Surveillance/C2
        setSubCategory((byte)1); // uid 16347, Transall C-160
        setSpecific((byte)2); // uid 16349, Transall C-160SE Electronic Surveillance
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TransallC160SEElectronicSurveillance createInstance()
    {
            return new TransallC160SEElectronicSurveillance();
    }
}
