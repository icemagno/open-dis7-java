// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.radio.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Link16Terminal</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Link16Terminal.createInstance()</code> or <code>new Link16Terminal()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Radio = <code>7</code>; </li>
 *     <li> Category: Link 16 Terminal = <code>21</code>; </li>
 *     <li> SubCategory:  <code>(none)</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 26798; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@20a9f5fb. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#RADIO
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Link16Terminal

 */
public final class Link16Terminal extends EntityType
{
    /** Default constructor */
    public Link16Terminal()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.RADIO);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 26798, Link 16 Terminal
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Link16Terminal createInstance()
    {
            return new Link16Terminal();
    }
}
