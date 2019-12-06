package com.company;

import java.util.function.Predicate;

public class Person {
    private int age;
    private boolean isDriving;
    private boolean isPregnat;

    public Person(int age, boolean isDriving, boolean isPregnat) {
        this.age = age;
        this.isDriving = isDriving;
        this.isPregnat = isPregnat;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDriving() {
        return isDriving;
    }

    public void setDriving(boolean driving) {
        isDriving = driving;
    }

    public boolean isPregnat() {
        return isPregnat;
    }

    public void setPregnat(boolean pregnat) {
        isPregnat = pregnat;
    }


    public Predicate<Person> canDrink = p->p.getAge()>=18 && !p.isDriving() && !p.isPregnat();

}
