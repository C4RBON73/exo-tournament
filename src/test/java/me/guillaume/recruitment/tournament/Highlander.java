package me.guillaume.recruitment.tournament;

public class Highlander extends Duelist{
    public Highlander(){
        super(150,new Weapon("One-handed Sword",12,"fatigue"));
    }

    public Highlander equip(String str){
        if (str.equals("buckler")){
            this.setBuckler();
        }
        return this;
    }
}
