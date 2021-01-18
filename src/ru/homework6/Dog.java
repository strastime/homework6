package ru.homework6;

public class Dog extends Animal{
        private int max_run = 500;
        private double max_jump = 0.5;
        private  int max_swiming = 10;

    public Dog (int run, double jump, int swimming){
        super(run,jump,swimming);

    }
        public void run (){
        if (run<= max_run) {
            System.out.println("Собакака пробежала " + run + " метров" );
        }
        else
        {
            System.out.println("Собака не может " + run + " м пробежать.");
        }

    }
    public void jump ()    {
        if (jump <= max_jump) {
            System.out.println("Собакака прыгнула " + jump + " метров" );
        }
        else
        {
            System.out.println("Собака не может прыгнуть " + jump +" м.");
        }

    }
    public void swimming ()    {
        if (swimming<= max_swiming) {
            System.out.println("Собакака проплыла " + swimming + " метров" );
        }
        else
        {
            System.out.println("Собака не может проплыть " + swimming +" м.");
        }

    }

}
