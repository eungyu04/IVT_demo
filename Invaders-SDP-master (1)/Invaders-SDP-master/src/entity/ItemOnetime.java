package entity;

import java.awt.*;

public class ItemOnetime extends Entity {

    private int speed;

    /** Sprite types. */
    public static enum SpriteType {
        /** attactspeed item */
        ItemAttackSpeed,
        /** barrier item */
        ItemBarrier,
        /** recovery item */
        ItemRecovery,
        /** Bomb item */
        ItemBomb
    };

    /**
     * Public constructor.aa
     */
    public ItemOnetime(final int positionX, final int positionY, final int speed) {
        super(positionX, positionY, 3 * 3, 3 * 3, Color.magenta);

        this.speed = speed;
    }


    /**
     1
     */

    /**
      2
     */

    /**
     * 3
     */

    /**
     *
     */

}
