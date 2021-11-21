package wargame;

import java.util.ArrayList;

public class Army {
    private ArrayList<Warrior> army = new ArrayList<>();

    public boolean isAlive()
    {
        for (int v = 0; v < army.size(); v++) if (!army.get(v).isAlive()) army.remove(v);
        return army.size() > 0;
    }

    public Warrior get(int index){
        try {
            return army.get(index);
        }
        catch (IndexOutOfBoundsException ex) {
            return null;
        }
    }

    public void addUnits(Warrior warrior) {
        army.add(warrior);
        if (army.size() > 1)
        {
            int preLast = army.size() - 2;
            army.get(preLast).setNextUnit(warrior);
            army.get(army.size() - 1).setPrevUnit(army.get(preLast));
        }
    }

    public void addStraightUnit(Warrior warrior) {
        army.add(warrior);
    }

    public boolean tryDeleteUnits(int index)
    {
        try {
            army.remove(index);
            return true;
        }
        catch (IndexOutOfBoundsException ex) {
            return false;
        }
    }

    public boolean tryDeleteUnits(int start, int count)
    {
        try {
            for (int i = 0; i < count; i++) army.remove(start);
            return true;
        }
        catch (IndexOutOfBoundsException ex) {
            return false;
        }
    }

    public void deleteDeadUnits(){
        army.removeIf(u -> !u.isAlive());
    }

    public int armySize(){
        return army.size();
    }

}
