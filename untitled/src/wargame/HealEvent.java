package wargame;

import java.util.HashSet;

public class HealEvent {
    private HashSet<HealEventListener> listeners = new HashSet<>();

    public void addListener(HealEventListener listener) {
        listeners.add(listener);
    }

    public void removeListener(HealEventListener listener) {
        listeners.remove(listener);
    }

    public void onHeal(Warrior sender) {
        listeners.forEach(x -> x.heal(sender));
    }

}
