// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.radio.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ANUSQ140V3CMIDSFighterDataLinkFDLLVT3</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ANUSQ140V3CMIDSFighterDataLinkFDLLVT3.createInstance()</code> or <code>new ANUSQ140V3CMIDSFighterDataLinkFDLLVT3()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Radio = <code>7</code>; </li>
 *     <li> Category: Link 16 Terminal = <code>21</code>; </li>
 *     <li> SubCategory: JointElectronicsTypeDesignationSystemJETDSNonspecificSeries  = <code>1</code>; </li>
 *     <li> Specific: ANUSQ140V3CMIDSFighterDataLinkFDLLVT3  = <code>33</code>; </li>
 *     <li> Entity type uid: 26811; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@48af5f38. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#RADIO
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Link16Terminal
 * @see SubCategory

 */
public final class ANUSQ140V3CMIDSFighterDataLinkFDLLVT3 extends EntityType
{
    /** Default constructor */
    public ANUSQ140V3CMIDSFighterDataLinkFDLLVT3()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.RADIO);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 26798, Link 16 Terminal
        setSubCategory((byte)1); // uid 26799, Joint Electronics Type Designation System (JETDS) Non-specific Series
        setSpecific((byte)33); // uid 26811, AN/USQ-140(V)3(C) MIDS Fighter Data Link (FDL) LVT(3)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ANUSQ140V3CMIDSFighterDataLinkFDLLVT3 createInstance()
    {
            return new ANUSQ140V3CMIDSFighterDataLinkFDLLVT3();
    }
}
