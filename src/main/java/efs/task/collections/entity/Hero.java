package efs.task.collections.entity;

import java.util.Objects;

public class Hero {
    private String name;
    private String heroClass;

    public Hero(String name, String heroClass) {
        this.name = name;
        this.heroClass = heroClass;
    }

    public String getName() {
        return name;
    }

    public String getHeroClass() {
        return heroClass;
    }

    //TODO implementacja metody equal porównująca obiekty Hero na podstawie pól name i heroClass.
    @Override
    public boolean equals(Object o) {
        if(o == this) return true;
        if ((o instanceof Hero)) {
            return ((Hero) o).name.equals(this.name) && ((Hero) o).heroClass.equals(this.heroClass);
        }
        else return false;
    }

    //TODO implementacja metody equal biorąca pod uwagę name i heroClass.
    @Override
    public int hashCode() {
        return Objects.hash(name, heroClass);
    }



    @Override
    public String toString() {
        return "My name is " + name + "and I am " + heroClass;
    }
}
