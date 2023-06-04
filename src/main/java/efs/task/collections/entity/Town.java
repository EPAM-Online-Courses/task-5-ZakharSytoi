package efs.task.collections.entity;

import java.util.List;

public class Town implements Comparable {
    private String townName;
    private List<String> startingHeroClasses;

    public Town(String townName, List<String> startingHeroesClass) {
        this.townName = townName;
        startingHeroClasses = startingHeroesClass;
    }

    public String getTownName() {
        return townName;
    }

    public List<String> getStartingHeroClasses() {
        return startingHeroClasses;
    }

    //TODO implementacja metody equal porównująca obiekty Town na podstawie tylko townName.
    @Override
    public boolean equals(Object o) {
        if(o == this)return true;
        if(o instanceof Town) {
            return this.townName.equals(((Town) o).townName);
        }
        return false;
    }

    //TODO implementacja metody equal biorąca pod uwagę tylko townName.
    @Override
    public int hashCode() {
        return townName.hashCode();
    }

    @Override
    public String toString() {
        return "Miasto :" + townName;
    }

    @Override
    public int compareTo(Object o) {
        return this.townName.compareTo(((Town)o).getTownName());
    }
}
