package me.playwarrior.Lesson3;

/**
 * Created by Robin on 1/4/2018.     
 */
public class Lesson_3 {

    public static void main(String[] args) {
        /**
         THESE CONDITIONS ALWAYS REPRESENTS BOOLEANS, THAT MEANS THAT THEY ARE EITHER TRUE OR FALSE!

         if(condition){

         } else if(condition){

         } else {

         }

         */
        boolean myBoolean = true;
        if(myBoolean){
           System.out.println("TRUE");
        }

        /**

         THESE CONDITIONS CAN ALSO USED BY VARIABLES WITH DIFFERENT OPERATORS

         == (equals)
         != (not equals)
         >= (greater or equals)
         <= (less or equals)
         <  (less)
         >  (greater)
         !  (not) THIS ONE CAN ON BE USED ON BOOLEANS

         */
        int myAge = 11;
        if(myAge > 12){

        } else if(myAge < 10){

        }

        /**

         IF-STATEMENTS CAN CONTAIN MORE THAN CONDITION!
         IN SOME CASES BOTH CONDITIONS DON'T HAVE TO BE TRUE

         OPERATORS
         || (at least one has to be true)
         && (both have to be true)

         */

        if(myAge == 10 || myBoolean){
            System.out.println("WORKED!");
        }

        if(myAge == 10 && myBoolean){
            System.out.println("WORKED!");
        }
    }
}
