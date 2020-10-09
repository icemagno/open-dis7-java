package edu.nps.moves.dis7.jammers.Noise.BistaticClutter;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 *
 * Jamming technique uid: 284
 */
public class BistaticClutter extends JammingTechnique
{
    public BistaticClutter()
    {
        setKind((byte)1); // Noise
        setCategory((byte)15); // Bistatic Clutter
    }
}