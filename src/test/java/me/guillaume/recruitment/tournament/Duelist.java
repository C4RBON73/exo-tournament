package me.guillaume.recruitment.tournament;

public abstract class Duelist {
    private int HitPoint;
    private Weapon weapon;
    private Buckler buckler;
    private Armor armor;
    private int stamina;

    public Duelist(int hp, Weapon wp){
        HitPoint = hp;
        weapon = wp;
        buckler = null;
        armor = null;
        stamina = 2;
    }
    public void setBuckler(){
        buckler = new Buckler();
    }
    public void setArmor(){
        armor = new Armor();
    }
    public int hitPoints(){
        return this.HitPoint;
    }

    public void loseHp(int l,String str) {
        boolean res = false;
        if (l != 0) {
            if (buckler != null) {
                if (buckler.getHp() > 0) {//Blocage du bouclier
                    res = buckler.chanceToBlock();
                }
            }
            if (res) {
                buckler.Hit(str);

            } else { // Calcul de dégat
                if (this.armor == null) {
                    this.HitPoint -= l;
                } else {
                    this.HitPoint -= l - armor.getDef();
                }
                //Test pur mettre les valeur de HP à 0 au lieu de négative
                if (HitPoint < 0) {
                    HitPoint = 0;
                }
            }
        }
    }
    public abstract Duelist equip(String str);

    public int damage(){
        if (weapon.getEffect().equals("fatigue")) { //Effet d'Endurance
            if (stamina == 0) {
                stamina = 2;
                return 0;
            }else{
                stamina -=1;
            }
        }
        if (this.armor != null){
            return this.weapon.getDamage() + this.armor.getAtt();
        }else{
            return this.weapon.getDamage();
        }
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
