// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.csk.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TamaraTrashDrum</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TamaraTrashDrum.createInstance()</code> or <code>new TamaraTrashDrum()</code>. </p>
 * <ul>
 *     <li> Country: Czechoslovakia (CSK) = <code>56</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: RF Passive (intercept and DF) = <code>3</code>; </li>
 *     <li> SubCategory: IdentificationClassificationRadar  = <code>16</code>; </li>
 *     <li> Specific: TamaraTrashDrum  = <code>2</code>; </li>
 *     <li> Entity type uid: 22503; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5b490d5e. </p>
 * @see Country#ACTION_REQUEST_RELIABLE
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see RFPassiveinterceptandDF
 * @see SubCategory

 */
public final class TamaraTrashDrum extends EntityType
{
    /** Default constructor */
    public TamaraTrashDrum()
    {
        setCountry(Country.ACTION_REQUEST_RELIABLE);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 22500, RF Passive (intercept and DF)
        setSubCategory((byte)16); // uid 22501, Identification/Classification Radar
        setSpecific((byte)2); // uid 22503, Tamara (Trash Drum)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TamaraTrashDrum createInstance()
    {
            return new TamaraTrashDrum();
    }
}
