package com.company1.patterns.decorator;

import com.company1.patterns.decorator.beverage.DarkRoast;
import com.company1.patterns.decorator.beverage.Espresso;
import com.company1.patterns.decorator.beverage.HouseBlend;
import com.company1.patterns.decorator.extras.Mocha;
import com.company1.patterns.decorator.extras.Soy;
import com.company1.patterns.decorator.extras.Whip;

public class StarCoffee {
    public static void main(String[] args) {
        Beverage beverageEspresso = new Espresso();
        System.out.println(beverageEspresso.getDescription() + "$ " + beverageEspresso.cost());

        Beverage beverageDarkRoast = new DarkRoast();
        beverageDarkRoast = new Mocha(beverageDarkRoast);
        beverageDarkRoast = new Mocha(beverageDarkRoast);
        beverageDarkRoast = new Whip(beverageDarkRoast);

        System.out.println(beverageDarkRoast.getDescription() + "$ " + beverageDarkRoast.cost());


        Beverage beverageHouseBlend = new HouseBlend();
        beverageHouseBlend = new Soy(beverageHouseBlend);
        beverageHouseBlend = new Mocha(beverageHouseBlend);
        beverageHouseBlend = new Whip(beverageHouseBlend);

        System.out.println(beverageHouseBlend.getDescription() + "$ " + beverageHouseBlend.cost());

    }
}
