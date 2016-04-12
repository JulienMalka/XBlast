package ch.epfl.xblast.server;

import ch.epfl.xblast.Direction;

/**
 * @author Yaron Dibner (257145)
 * @author Julien Malka (259041)
 */
public final class ExplosionPainter {
    private static final byte BYTE_FOR_BLACK_BOMB = 20;
    private static final byte BYTE_FOR_WHITE_BOMB = 21;

    public static final byte BYTE_FOR_EMPTY = 16;

    private ExplosionPainter() {
    }

    public static byte byteForBomb(Bomb bomb) {
        int f = bomb.fuseLength();
        if ((f & (f - 1)) == 0) {
            return BYTE_FOR_WHITE_BOMB;
        }
        return BYTE_FOR_BLACK_BOMB;
    }

    public static byte byteForBlast(boolean blastInN, boolean blastInE,
            boolean blastInS, boolean blastInW) {
        int nFB = 0;
        nFB = (nFB << 1) | (blastInN ? 1 : 0);
        nFB = (nFB << 1) | (blastInE ? 1 : 0);
        nFB = (nFB << 1) | (blastInS ? 1 : 0);
        nFB = (nFB << 1) | (blastInW ? 1 : 0);

        return (byte) nFB;
    }
}