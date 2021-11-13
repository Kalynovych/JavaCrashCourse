package wargame;

import java.util.EventListener;

public interface HealEventListener extends EventListener {
    void heal(Warrior w);

}
