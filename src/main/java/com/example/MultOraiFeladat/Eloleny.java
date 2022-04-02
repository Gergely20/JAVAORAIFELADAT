package com.example.MultOraiFeladat;

interface Ehsegszint{
    public void ehsegmutato();
}

public class Eloleny implements Ehsegszint{
    int ehes;

    public Eloleny(int ehes) {
        this.ehes = ehes;
    }

    public void ehsegmutato() {
        if (this.ehes > 0) {
            System.out.println("még élek");
        }
        if (this.ehes == 100) {
            System.out.println("jól vagyok lakva");
        }
        if (this.ehes <= 0) {
            System.out.println("éhen haltam");
        }
    }

}
