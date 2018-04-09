package me.playwarrior.Lesson_4;

import java.util.*;

/**
 * Created by Robin on 4/4/2018.
 */
public class Lesson_4 {

    private List<Integer> list = new ArrayList<>();

    /*
        LISTS ARE JUST A WAY OF STORING OBJECTS OF THE SAME TYPE

        FOR EXAMPLE INTEGERS
    */

    private HashMap<String, Integer> map = new HashMap<>();

    /*
        MAPS ARE JUST A WAY OF STORING OBJECTS WITH A CERTAIN KEY

        WHENEVER YOU ADD AN OBJECT YOU HAVE TO INSERT A KEY ASWELL.

        KINDA LIKE THE DOOR MECHANISM, TO RETRIEVE CERTAIN INFORMATION YOU NEED A KEY!
    */

    private Set<Object> set = new HashSet<>();

    /*
        SETS ARE JUST LIKE LISTS. THE ONLY DIFFERENCE THERE IS, IS THAT IT CANT STORE DUPLICATES

        OF ONE OBJECT.
    */

    private Queue<Object> queue = new PriorityQueue<>();

    /*
        QUEUE HAVE A FEW MAIN METHODS, PEEK AND POLL AND OFFER.

        PEEK:
        -USING THE OBJECT WITHOUT REMOVING IT OUT OF THE QUEUE

        POLL:
        -USING THE OBJECT WITH REMOVING IT OUT OF THE QUEUE

        OFFER(Object obj):
        -RETURNS A BOOLEAN IF THE QUEUE HAS THE OBJECT
    */

    private Object[] array = new Object[10];

    private Object[] array2 = new Object[]{};

    /*
        ARRAY ARE LISTS THAT CANT BE EASILY MODIFIED LIKE LISTS

         ARRAYS CAN BE CREATED IN TWO WAYS

         Object[] array = new Object[size]; //defining a size with adding elements later

         Object[] array = new Object[]{element, element, element} //adding the elements now without a maximum size

         BOTH LISTS AND ARRAYS CAN BE CONVERTED TO ONE ANOTHER WITH THE METHODS

         Lists.toArray(List<?> list);
         Arrays.toList<Object[] array);
    */
}
