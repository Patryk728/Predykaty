package com.company;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
	    Person p = new Person(15,false,false);
	    orderBeer(p);

    }

    static void orderBeer(Person p)
    {
        if(p.canDrink.test(p))
        {
            System.out.println("Możesz pić");
        }
        else
        {
            System.out.println("Nie możesz pić");
        }
    }
}
