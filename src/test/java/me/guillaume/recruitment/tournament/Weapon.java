package me.guillaume.recruitment.tournament;

public class Weapon {
    private String name;
    private int dmg;
    private String effect;

    public Weapon(String name, int dmg,String effect){
        this.name = name;
        this.dmg = dmg;
        this.effect = effect;
    }
    public Weapon(String name, int dmg){
        this.name = name;
        this.dmg = dmg;
        this.effect = "none";
    }

    public int getDamage(){
        return dmg;
    }

    public String getName() {
        return name;
    }

    public String getEffect() {
        return effect;
    }
}
