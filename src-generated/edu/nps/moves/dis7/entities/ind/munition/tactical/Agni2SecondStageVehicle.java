// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ind.munition.tactical;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Agni2SecondStageVehicle</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Agni2SecondStageVehicle.createInstance()</code> or <code>new Agni2SecondStageVehicle()</code>. </p>
 * <ul>
 *     <li> Country: India (IND) = <code>99</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>TACTICAL</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: Agni2  = <code>1</code>; </li>
 *     <li> Specific: Agni2SecondStageVehicle  = <code>1</code>; </li>
 *     <li> Entity type uid: 32535; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@76a362a4. </p>
 * @see Country#INDIA_IND
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class Agni2SecondStageVehicle extends EntityType
{
    /** Default constructor */
    public Agni2SecondStageVehicle()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.TACTICAL));

        setCategory((byte)1); // uid 32533, Guided
        setSubCategory((byte)1); // uid 32534, Agni 2
        setSpecific((byte)1); // uid 32535, Agni 2 Second Stage Vehicle
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Agni2SecondStageVehicle createInstance()
    {
            return new Agni2SecondStageVehicle();
    }
}
