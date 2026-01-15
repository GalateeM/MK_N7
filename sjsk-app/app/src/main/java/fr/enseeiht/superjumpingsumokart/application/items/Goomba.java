package fr.enseeiht.superjumpingsumokart.application.items;

import android.util.Log;
import android.widget.ImageButton;

import fr.enseeiht.superjumpingsumokart.R;
import fr.enseeiht.superjumpingsumokart.application.DroneController;
import fr.enseeiht.superjumpingsumokart.arpack.DetectionTask;
import fr.enseeiht.superjumpingsumokart.arpack.GUIGame;

/**
 * Implementation of a goomba {@link Item}.
 */


public class Goomba extends Item {

    /**
     * The logging tag. Useful for debugging.
     */
    private final static String ITEM_TAG = "Item.Goomba";

    /**
     * Name of the {@link Item}.
     */
    private final static String NAME = "goomba";

    /**
     * Reference of the {@link GUIGame}.
     */
    private final GUIGame GUI_GAME;

    /**
     * Default constructor of the class {@link Goomba}.
     */
    public Goomba(GUIGame guiGame) {
        super(NAME);
        GUI_GAME = guiGame;
    }

    @Override
    public boolean useItem(DroneController droneController, DetectionTask.Symbol symbol) {
        return true;
    }

    @Override
    public void applyEffect(DroneController droneController) {
        GUI_GAME.GUI_GAME_HANDLER.sendEmptyMessage(GUIGame.ANIMATE_GOOMBA);
        droneController.spinningJump();
    }

    //TODO
    @Override
    public void assignResource(ImageButton ib) {
        ib.setImageResource(R.drawable.magicbox);
    }
}
