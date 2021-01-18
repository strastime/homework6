package ru.homework6;

public abstract class Animal {

    //protected String Name;
    protected int run;
    protected int swimming;
    protected double jump;


    public Animal(int run, double jump, int swimming) {

        //this.Name = Name;
        this.run = run;
        this.swimming = swimming;
        this.jump = jump;

    }

    public static void main(String[] args) {
        Cat cat = new Cat(200,2,0);
        Dog dog = new Dog(500, (double) 0.5,10);
        Dog dog1 = new Dog(600, (double) 0.4,7);

            cat.run();
            cat.jump();
            cat.swimming();

            dog.run();
            dog.jump();
            dog.swimming();

            dog1.run();
            dog1.jump();
            dog1.swimming();
    }




}
