package ch.epfl.xblast.server;

/**
 * @author Yaron Dibner (257145)
 * @author Julien Malka (259041)
*/
public interface Ticks {
    public final static int PLAYER_DYING_TICKS = 8;
    public final static int PLAYER_INVULNERABLE_TICKS = 64;
    public final static int BOMB_FUSE_TICKS = 100;
    public final static int EXPLOSION_TICKS = 30;
    public final static int WALL_CRUMBLING_TICKS = 30;
    public final static int BONUS_DISAPPEARING_TICKS = 30;
}