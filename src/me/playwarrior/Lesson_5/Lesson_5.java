package me.playwarrior.Lesson_5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Robin on 4/9/2018.
 */
public class Lesson_5 {

    public static void main(String[] args){
        forLoop();
    }

    private static List<String> obj = new ArrayList<>();

    public static void forLoop(){
        for(int i = 0; i < 6; i++){
            System.out.println(i);
        }

        for(Object ob : obj){

        }
    }

    public static void whileLoop(){
        /** VAN DEZE ZIJN ER EIGENLIJK TWEE SOORTEN DO-WHILE & WHILE LOOP */


        /**

            while(boolean){
                //code
            }

            KIJK DEZE CODE BLIJFT RUNNEN WANNEER DE BOOLEAN TRUE BLIJFT
            CORRECT!

            EN DE DO-WHILE LOOP

            do{

            ]while(boolean);

            DEZE DOET IN PRINCIPE HETZELFDE MAAR CHECK DE BOOLEAN PAS DAARNA!
         */

        boolean my = false;

        while(my){
            //CODE
        }

        do{

        }while(my);

    }

    /**
     DAN DE RUNNABLES! >:)

     DEZE KAN OP VERSCHILLENDE MANIEREN GEMAAKT WORDEN.

     DOORMIDDEL VAN HET IMPLEMENTEREN EN HET OBJECT ZELF!


     public class myClass implements Runnable {

        public void run {
            //insert code etc
        }

     }

     VOOR HET OBJECT MOET WEL EERST DE IMPLEMENTATION GEDAAN WORDEN IN EEN ANDERE CLASS!

     public class Main {

        private Runnable runnable = new myClass();
        private Thread thread = new Thread(runnable);

        DE THREAD ZORGT ER VOOR DAT DE RUNNABLE BLIJFT RUNNEN!

        public synchronized void start(){
            thread.start();
            DIT ZORGT ER VOOR DAT DE THREAD GESTART WORDT!
        }

        public synchronized void stop(){
            try{
            thread.join();
            } catch(Exception ex){
                ex.printTrackTrace();
            }
        }

        DIT ZORGT VOOR HET STOPPEN ERVAN!

        THREAD HEEFT EEN STOP FUNCTIE ZELF... MAAR DIE IS NIET GOED EN WORDT OOK DOOR
        NIEMAND GEBRUIKT

        INPRINCIPE IS DIT HOE EEN RUNNABLE WERKT!

     }


     */
}
