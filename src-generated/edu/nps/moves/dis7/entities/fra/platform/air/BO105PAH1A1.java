// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BO105PAH1A1</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BO105PAH1A1.createInstance()</code> or <code>new BO105PAH1A1()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Attack Helicopter = <code>20</code>; </li>
 *     <li> SubCategory: EurocopterBO105PAH1VBHBSH1  = <code>3</code>; </li>
 *     <li> Specific: BO105PAH1A1  = <code>1</code>; </li>
 *     <li> Entity type uid: 15826; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4d02f94e. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AttackHelicopter
 * @see SubCategory

 */
public final class BO105PAH1A1 extends EntityType
{
    /** Default constructor */
    public BO105PAH1A1()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)20); // uid 15818, Attack Helicopter
        setSubCategory((byte)3); // uid 15825, Eurocopter BO 105/PAH-1/VBH/BSH-1
        setSpecific((byte)1); // uid 15826, BO 105 PAH-1A1
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BO105PAH1A1 createInstance()
    {
            return new BO105PAH1A1();
    }
}
