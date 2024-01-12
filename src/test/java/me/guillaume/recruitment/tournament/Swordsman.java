package me.guillaume.recruitment.tournament;

public class Swordsman extends Duelist {
    public Swordsman(){
        super(100,new Weapon("One-handed Sword",5));
    }

    public Swordsman equip(String str){
        if (str.equals("buckler")){
            this.setBuckler();
        }
        return this;
    }
}

