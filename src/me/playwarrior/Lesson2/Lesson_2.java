package me.playwarrior.Lesson2;

/**
 * Created by Robin on 1/4/2018.
 */
public class Lesson_2 {

    private int x = 2;
    Lesson_2 lesson_2 = new Lesson_2();

    /**DIFFERENT LEVELS OF ACCESSIBILITY*/
    public void publicMethod(){
        lesson_2.publicMethod();
    }

    protected void protectedMethod(){

    }

    /**A METHOD CAN ALSO ASK FOR PARAMETERS OR RATHER CALLED ARGUMENTS, THESE ARGUMENTS ARE VARIABLES OR OBJECTS, IT GIVES THE NEEDED INFORMATION TO RUN THE METHOD**/
    private void privateMethod(String myString){
        int x = localMethod();
    }

    /**RETURN STATEMENT, RETURNS A VARIABLE OR AN OBJECT (DEPENDING ON WHAT THE METHOD STATES)*/
    int localMethod(){
        return 1;
    }

    /**
     * THEN EACH METHOD CAN BE GIVEN A STATIC-MODIFIER
     *  WITH THIS MODIFIER, THE METHOD CAN BE CALLED WITH JUST THE CLASS
     *
     *  FOR EXAMPLE:
     *
     *  (CLASS NAME).(METHOD NAME)
     *      Lesson_2.publicMethod();
     *
     *  BUT STATIC DOESN'T MEAN EVERYWHERE!
     *
     *  IT HIGHLY DEPENDS ON OTHER MODIFIER LIKE PRIVATE, PROTECTED, PUBLIC
     **/
    public static void staticMethod(){

    }

    /**

     public static (overal)               x
     protected static (in de folder)
     private static (in de class)
     public (overal maar met object)
     protected (in de folder met object)
     private (in de class)                getX() return x;

     */

}
