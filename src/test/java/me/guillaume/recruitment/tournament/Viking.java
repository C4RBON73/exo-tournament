package me.guillaume.recruitment.tournament;

public class Viking extends Duelist {
    public Viking(){
        super(120,new Weapon("Axe",6,"Buckler-Breaker"));
    }
    public Viking equip(String str){
        if (str.equals("buckler")){
            this.setBuckler();
        }
        if (str.equals("armor")){
            this.setArmor();
        }
        return this;
    }
}
