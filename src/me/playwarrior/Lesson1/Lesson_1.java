package me.playwarrior.Lesson1;

import me.playwarrior.Lesson2.Lesson_2;

/**
 * Created by Robin on 1/4/2018.
 */
public class Lesson_1 {

    public Lesson_2 lesson_2 = new Lesson_2();

    public static void main(String[] args) {
        /**ALL DATA-TYPES IN JAVA*/
        Object myObject = new Object();
        int myInt = 1;
        double myDouble = 6.3;
        float myFloat = 5.6F;
        short myShort = 10;
        long myLong = 1234567891;
        boolean myBoolean = false;
        byte myByte = 2;
        String myString = "This is text";

        /** THE WAY TO PRINT SOMETHING TO THE CONSOLE */
        System.out.println(myInt);

        System.out.println(myInt);

        System.out.printf("%s \n", myString);

        /** MATH OPERATORS += -= *= /= %= */
        myDouble = myDouble + 2.1;

        myDouble += 2.1;
        myDouble -= 2.1;
        myDouble *= 2.1;
        myDouble /= 2.1;
        myDouble %= 2.1;

        myDouble = (myDouble + 2.1) % 2;

        myDouble = myDouble * 2 % 5 / 2;

        System.out.println(myDouble);

        /**

         OTHER MATH OPERATORS (SHIFTING)

         Int << Int (shifting left)
         Int >> Int (shifting right)

          2 = 10
          2048 = 100000000000

         2^1 = 2^11


          2 = 10
          1 = 1


         */

        int a = 2 << 10;
        int b = 2 >> 1;

        System.out.println(Integer.toBinaryString(a) + " Actual Number: " + a + " is equal to 2^11");
        System.out.println(Integer.toBinaryString(b) + " Actual Number: " + b);
    }

}
