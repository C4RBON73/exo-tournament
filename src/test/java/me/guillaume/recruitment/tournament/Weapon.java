package me.guillaume.recruitment.tournament;

public class Weapon {
    private String name;
    private int dmg;

    public Weapon(String name, int dmg){
        this.name = name;
        this.dmg = dmg;
    }
    public int getDamage(){
        return dmg;
    }

    public String getName() {
        return name;
    }
}
