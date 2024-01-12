package me.guillaume.recruitment.tournament;

public class Buckler {
    private int hp;
    private boolean last;

    public Buckler(){
        hp =3;
        last = false;
    }

    public int getHp() {
        return hp;
    }

    public void Hit(String str) {
        if(str.equals("Axe")) {
            this.hp -= 1;
        }
    }

    public boolean chanceToBlock() {
        last = !last;
        return last;

    }
}
