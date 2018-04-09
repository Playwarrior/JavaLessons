package me.playwarrior.Lesson_4;

import java.util.*;

/**
 * Created by Robin on 4/9/2018.
 */
public class Lesson_5 {

    private List<Object> objects = new ArrayList<Object>();

    public void list(){
        Object obj = new Object();
        objects.add(obj);
        if(objects.contains(obj)){
            objects.remove(obj);
        }
        //RETURNS SIZE OF THE LIST
        objects.size();

        //EMPTYING LIST
        objects.clear();
    }

    private Map<String, Integer> map = new HashMap<>();

    public void map(){
        map.put("Marvin", 17);
        map.put("Robin", 16);

        int age = map.get("Marvin");

        Set<String> keys = map.keySet(); //Robin, Marvin

        Collection<Integer> ages = map.values(); //16, 17

        map.containsKey("Marvin");
        map.containsValue(16);
    }

    private Queue<String> queue = new PriorityQueue<>();

    public void queue(){
        queue.offer("Marvin");

        queue.peek();
    }

    private Set<String> set = new HashSet<>();

    public void set(){
        set.add("Marvin");




        set.add("Marvin");
    }

}
