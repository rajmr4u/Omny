package com.rajesh.omny.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<DataObject> data1 = new ArrayList<DataObject>();
        ArrayList<DataObject> data2 = new ArrayList<DataObject>();
        ArrayList<DataObject> finaldata = new ArrayList<DataObject>();
        ArrayList<DataObject> conflictdata = new ArrayList<>();
        DataObject dt1 = new DataObject("1","A");
        DataObject dt2 = new DataObject("2","B");
        DataObject dt3 = new DataObject("3","C");
        data1.add(dt1);
        data1.add(dt2);
        data1.add(dt3);

        DataObject dt4 = new DataObject("4","D");
        DataObject dt5 = new DataObject("5","E");
        DataObject dt6 = new DataObject("6","F");

        DataObject dt7 = new DataObject("3","Z");
        data2.add(dt4);
        data2.add(dt5);
        data2.add(dt6);
        data2.add(dt7);


        Map<String,DataObject> map = new HashMap<String,DataObject>();
       for(DataObject d : data1) {
           map.put(d.getKey(),d);
       }

       for(DataObject d2 : data2) {

          if(map.containsKey(d2.getKey())){
                  DataObject d1 = map.get(d2.getKey());
               if(!d1.getValue().equals(d2.getValue())){
                   conflictdata.add(d2);
                   conflictdata.add(d1);
                   break;
               }
           }else
               map.put(d2.getKey(),d2);
       }
        finaldata.addAll(map.values());

        System.out.println("Final Consolidated Data:");

        for(DataObject d : finaldata) {
            System.out.println(d);
        }
        System.out.println("\nConflict Data:");
        for(DataObject d : conflictdata) {
            System.out.println(d);
        }

    }
}