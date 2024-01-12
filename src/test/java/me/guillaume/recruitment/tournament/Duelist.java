package me.guillaume.recruitment.tournament;

public abstract class Duelist {
    private int HitPoint;
    private Weapon weapon;
    private Buckler buckler;

    public Duelist(int hp, Weapon wp){
        HitPoint = hp;
        weapon = wp;
    }
    public void setBuckler(){
        buckler = new Buckler();
    }
    public int hitPoints(){
        return this.HitPoint;
    }
    public void loseHp(int l,String str) {
        boolean res = false;
        if (buckler.getHp() > 0) {
            res = buckler.chanceToBlock();
        }
        if (res) {
            buckler.Hit(str);
        } else {
            this.HitPoint -= l;
            if (HitPoint < 0) {
                HitPoint = 0;
            }
        }
    }

    public abstract Duelist equip(String str);

    public int damage(){
        return this.weapon.getDamage();
    }
    public void engage(Duelist him){
        while (this.hitPoints() > 0 && him.hitPoints() > 0){
            him.loseHp(this.damage(),this.weapon.getEffect());
            if(him.hitPoints() == 0){
                break;
            }
            this.loseHp(him.damage(),him.weapon.getEffect());
        }
    }
}
