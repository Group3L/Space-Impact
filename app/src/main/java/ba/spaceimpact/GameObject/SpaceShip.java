package ba.spaceimpact.GameObject;

import android.graphics.RectF;

/**
 * Created by busraarabaci on 02/11/2017.
 */

public interface SpaceShip extends GameObject{

    public void move(float x, float y);
    public Bullet shoot();
    public void getHit(int amount);

}
