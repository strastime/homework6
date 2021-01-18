package ru.homework6;

public class Cat extends Animal {

        private int max_run = 200;
        private double max_jump = 2;
        private  int max_swiming = 0;

        public Cat (int run, double jump, int swimming){
                super(run,jump,swimming);

        }
        public void run (){
                if (run<= max_run) {
                        System.out.println("Кошка пробежала " + run + " метров" );
                }
                else
                {
                        System.out.println("Кошка не может " + run + " м пробежать.");
                }

        }
        public void jump ()    {
                if (jump <= max_jump) {
                        System.out.println("Кошка прыгнула " + jump + " метров" );
                }
                else
                {
                        System.out.println("Кошка не может прыгнуть " + jump +" м.");
                }

        }
        public void swimming ()    {
                if (swimming<= max_swiming) {
                        System.out.println("Кошка проплыла не умеет плавать!!!" );
                }
                else
                {
                        System.out.println("Кошка не умеет плавать.");
                }

        }

}
