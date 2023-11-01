package com.company1;

import com.company1.patterns.observer.CatholicChurch;
import com.company1.patterns.observer.Parishioner;

public class Main {
    public static void main(String[] args) {
        CatholicChurch observable = new CatholicChurch();
        Parishioner parishioner1 = new Parishioner("Aboba Abobovich");
        Parishioner parishioner2 = new Parishioner("Aboba Abobovich II");
        observable.addPropertyChangeListener(parishioner1);
        observable.addPropertyChangeListener(parishioner2);

        observable.setNews("Дева Мария была девой");
        observable.setNews("Дева Мария не была девой");
        
        observable.removePropertyChangeListener(parishioner1);

        observable.setNews("aboba I ymer");
    }
}