package multimi;

import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.*;

public class Multimi {

    // multimi = array, list, map

    @Test
    public void metodaTest(){
//        colegiCursArray();
//        colegiCursLista();
//        diferiteGrupeMap();
//        tariOraseMap();
        intelegereHashMap();

    }

    //reprezentam multimea colegilor de la curs
    //folosim array
    public void colegiCursArray(){

        String[] colegi = new String[4];
        colegi[0]="Tudor";
        colegi[1]="Daniel";
        colegi[2]="Andrei";
        colegi[3]="Alex";
        for (int i=0; i<colegi.length; i++){
            System.out.println(colegi[i]);
        }
    }
    //folosim lista

    public void colegiCursLista(){

        List<String> colegi= new ArrayList<>();
        colegi.add("Tudor");
        colegi.add("Daniel");
        colegi.add("Andrei");
        colegi.add("Alex");
        colegi.add("Robert");
        for (int i=0; i<colegi.size(); i++){
            System.out.println(colegi.get(i));
        }
    }

    // map => key(ar fi frunct) - value(ar fi mar

    public void diferiteGrupeMap(){
        Map<String,String> grupeMap = new HashMap<>();
        grupeMap.put("Fruct","Mar");
        grupeMap.put("Haine","Pantaloni");
        grupeMap.put("Electronice","Telefon");
        for (String key: grupeMap.keySet()){
            System.out.println("cheia este "+key);
            System.out.println("valoare este "+grupeMap.get(key));
        }
    }

    //reprezentam niste tari cu orasele care le apartin
    public void tariOraseMap(){

        Map<String,List<String>> tariOrase = new HashMap<>();

        List<String> romaniaO = new ArrayList<>();
        romaniaO.add("Timisoara");
        romaniaO.add("Bucuresti");
        romaniaO.add("Cluj");
        romaniaO.add("Oradea");

        List<String> spaniaO = new ArrayList<>();
        spaniaO.add("Barcelona");
        spaniaO.add("Madrid");
        spaniaO.add("Tenerife");

        List<String> italiaO = new ArrayList<>();
        italiaO.add("Roma");
        italiaO.add("Milano");
        italiaO.add("Napoli");

        tariOrase.put("Romania",romaniaO);
        tariOrase.put("Spania",spaniaO);
        tariOrase.put("Italia",italiaO);

        for(String key : tariOrase.keySet()){
            System.out.println("Cheia este "+key);
            System.out.println("Valoarea este "+ tariOrase.get(key));
        }

    }
    //tema reteta + lista de ingrediente

    // hash map in hash mamp with a list

    public void intelegereHashMap(){
        Map<String,Map<String,List<String>>> mapMapList = new HashMap<>();
        Map<String,List<String>> mapList = new HashMap<>();
        List<String> listaA = new ArrayList<>(Arrays.asList("a1","b2","c3"));
        mapList.put("InnerMapLA",listaA);
        mapMapList.put("OuterMapKey",mapList);

        for (Map.Entry<String, Map<String, List<String>>> outerEntry : mapMapList.entrySet()) {
            String outerKey = outerEntry.getKey();

            Map<String, List<String>> innerMap = outerEntry.getValue();

            System.out.println("Outer Key: " + outerKey);

            for (Map.Entry<String, List<String>> innerEntry : innerMap.entrySet()) {
                String innerKey = innerEntry.getKey();

                List<String> innerList = innerEntry.getValue();

                System.out.println("Inner Key: " + innerKey);
                System.out.println("Inner List: " + innerList);
            }
        }
    }
}
