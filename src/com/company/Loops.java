package com.company;

public class Loops {
    public static void main (String[] args) {
      performWhileLoop0to100();
      performWhileLoop100to0();
      performForLoop1to100();
      performHelloWorld();
    }

//        5.	Create a new class called Loops. In the main method of this class, create the following loops with any variables you feel are needed:
//        a.	A while loop that prints all even numbers from 0 to 100

        private static void performWhileLoop0to100() {
            int counter = 0;

            while (counter <= 100) {
                    System.out.println(counter);
                counter += 2;
            }
        }

//        b.	A while loop that prints every 3rd number going backwards from 100 until we reach 0
        private static void performWhileLoop100to0() {
            int counter = 100;
            while (counter >= 0) {
                System.out.println(counter);
                counter -= 3;
        }
        }

//        c.	A for loop that prints every other number from 1 to 100

            private static void performForLoop1to100() {
            int counter = 100;
            for(int i = 1; i <= 100; i++) {
                System.out.println(i);
            }
            }

//        d.	A for loop that prints every number from 0 to 100, but if the number is divisible by 3, it prints “Hello” instead of the number, and if the number is divisible by 5, it prints “World” instead of the number, and if it is divisible by both 3 and 5, it prints “HelloWorld” instead of the number.

                private static void performHelloWorld() {
                int counter = 100;
                for(int i = 1; i <= 100; i++) {
                    if (i % 3 == 0 & i % 5 == 0) {
                        System.out.println("HelloWorld");
                    } else if (i % 5 == 0 ) {
                        System.out.println("World");
                    } else if (i % 3 == 0) {
                        System.out.println("Hello");
                    } else {
                        System.out.println(i);
                    }
                }
                }



}
