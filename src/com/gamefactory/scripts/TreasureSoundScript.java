package com.gamefactory.scripts;

import com.gamefactory.components.Position;
import com.gamefactory.components.Sound;
import com.gamefactory.displayable.ComponentManager;
import com.gamefactory.displayable.GameObject;
import com.gamefactory.displayable.Script;
import com.gamefactory.utils.events.Event;
import com.gamefactory.utils.timer.Timer;
import java.util.EventObject;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author scalpa
 */
public class TreasureSoundScript extends Script {

    private Position position;
    private Sound sound;
    private final Timer timer;
    float distance;

    public TreasureSoundScript() {
        this.timer = new Timer();
    }

    @Override
    public void init(ComponentManager owner) {
        super.init(owner); //To change body of generated methods, choose Tools | Templates.
        sound = (Sound) this.owner.getComponent(Sound.class);
        this.timer.start();
    }

    @Override
    public void update() {
        if (timer.getElapsedTime(TimeUnit.SECONDS) > 10) {
            this.getNotifier().notifyObservers("REQUEST_POSITION", "HERO");
        }
    }

    @Override
    public void onNotify(Event event) {
        if (event.hasMessage() && event.isExpected("POSITION") && ((GameObject) event.getSource()).getId().equals("HERO")) {
            Position hero;
            hero = (Position) event.getMessage();
            float distance = position.distanceWith(hero);
        }

    }

}
