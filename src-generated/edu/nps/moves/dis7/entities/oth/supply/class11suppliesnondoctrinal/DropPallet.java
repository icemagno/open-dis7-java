// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class11suppliesnondoctrinal;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DropPallet</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DropPallet.createInstance()</code> or <code>new DropPallet()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_11_SUPPLIES_NON_DOCTRINAL</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: Pallets = <code>2</code>; </li>
 *     <li> SubCategory: CargoPallet  = <code>4</code>; </li>
 *     <li> Specific: DropPallet  = <code>1</code>; </li>
 *     <li> Entity type uid: 31991; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@75a226ea. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see Pallets
 * @see SubCategory

 */
public final class DropPallet extends EntityType
{
    /** Default constructor */
    public DropPallet()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_11_SUPPLIES_NON_DOCTRINAL));

        setCategory((byte)2); // uid 30810, Pallets
        setSubCategory((byte)4); // uid 30814, Cargo Pallet
        setSpecific((byte)1); // uid 31991, Drop Pallet
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DropPallet createInstance()
    {
            return new DropPallet();
    }
}
