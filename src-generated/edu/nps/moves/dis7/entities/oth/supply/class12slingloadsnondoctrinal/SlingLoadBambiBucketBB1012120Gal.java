// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class12slingloadsnondoctrinal;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SlingLoadBambiBucketBB1012120Gal</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SlingLoadBambiBucketBB1012120Gal.createInstance()</code> or <code>new SlingLoadBambiBucketBB1012120Gal()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_12_SLING_LOADS_NON_DOCTRINAL</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: Sling Load, Water Bucket = <code>4</code>; </li>
 *     <li> SubCategory: SlingLoadBambiBucketBB1012120Gal  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 30826; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@136fece2. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see SlingLoadWaterBucket
 * @see SubCategory

 */
public final class SlingLoadBambiBucketBB1012120Gal extends EntityType
{
    /** Default constructor */
    public SlingLoadBambiBucketBB1012120Gal()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_12_SLING_LOADS_NON_DOCTRINAL));

        setCategory((byte)4); // uid 30825, Sling Load, Water Bucket
        setSubCategory((byte)1); // uid 30826, Sling Load, Bambi Bucket (BB 1012), 120 Gal
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SlingLoadBambiBucketBB1012120Gal createInstance()
    {
            return new SlingLoadBambiBucketBB1012120Gal();
    }
}
