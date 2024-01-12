package me.guillaume.recruitment.tournament;

public class Duelist {
    private int HitPoint;
    private Weapon weapon;

    public Duelist(int hp, Weapon wp){
        HitPoint = hp;
        weapon = wp;
    }
    public int hitPoints(){
        return this.HitPoint;
    }
    public void loseHp(int l){

        this.HitPoint -= l;
        if (HitPoint < 0){
            HitPoint = 0;
        }
    }
    public int damage(){
        return this.weapon.getDamage();
    }
    public void engage(Duelist him){
        while (this.hitPoints() > 0 && him.hitPoints() > 0){
            him.loseHp(this.damage());
            if(him.hitPoints() == 0){
                break;
            }
            this.loseHp(him.damage());
        }
    }
}
