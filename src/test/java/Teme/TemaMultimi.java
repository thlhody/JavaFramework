package Teme;

import org.testng.annotations.Test;

import java.util.*;

public class TemaMultimi {
    // List de string
    @Test
    public void metodaTest(){

//        listaCursant();
//        listaCursantA();
//        arrayCursant();
//        arrayCursantA();
//        arrayCursantB();
       arrayCursantC();
       hashMapCursant();
       hashMapCursantA();
       tariOraseMap();
    }
    public void listaCursant(){
// creez lista , listele sunt dinamice si poti adauga scoate din ele elemente fara probleme.
        List<String> cursantA = new ArrayList<>();
// adaug cursanti in lista
        cursantA.add("Andrei");
        cursantA.add("Tudor");
        cursantA.add("Alex");
        cursantA.add("Vasile");
        System.out.println("Printez primul cursant: " +cursantA);
        System.out.println("Printez cursantul de pe pozitia 1: " +cursantA.get(1));
// adaug cursant nou
        System.out.println("Am adaugat cursant nou? "+cursantA.add("Ion"));
        System.out.println("Printez lista noua de cursanti: " +cursantA);
// afisez dimensiunea listei
        System.out.println("Lista noua are: "+cursantA.size()+" cursanti.");
        System.out.println("--------");
    }
    public void listaCursantA(){
//creez lista cu fructele
        List<String> cursantA = new ArrayList<>(Arrays.asList("Gheorghe","Alex","Ion","Tudor"));

        System.out.println("Printez primul cursant: " +cursantA);
        System.out.println("Printez cursantul de pe pozitia 2: " +cursantA.get(2));
// adaug fructe
        System.out.println("Am adaugat cursant nou? "+cursantA.add("Vasile"));
        System.out.println("Printez lista noua de cursanti: " +cursantA);

        System.out.println("Lista noua are: "+cursantA.size()+" cursanti.");
        System.out.println("--------");
    }
    public void arrayCursant(){
        //declar un array de 5 elemente, array este o lista  de elemente fixa nu se mai pot adauga sau scoate elemente
        String[] cursanti = new String[5];

        cursanti[0]="Alex";
        cursanti[1]="Tudor";
        cursanti[2]="Gheorghe";
        cursanti[3]="Ion";
        cursanti[4]="Vasile";
        //fructe[5]="Andrei"; //- eroare index array out of bounds
        //printez pozitia 0 si 1 din array
        System.out.println("Primul cursant: "+cursanti[0]);
        System.out.println("Al doilea cursant: "+cursanti[1]);
        //parcurg array si printez fiecare pozitie in parte
        System.out.println("Toti cursanti:");
        for (String cursant : cursanti){
            System.out.println(cursant);
        }
        System.out.println("------");
    }
    public void arrayCursantA(){
        // declaram array(matrice) cu 6 elemente fixe, nu se mai pot adauga alti cursanti
        String[] cursanti = {"Andrei","Alex","Ion","Gheorghe","Tudor","Vasile"};
        //printez pozitia 0 si 1 din array
        System.out.println("Primul cursant: "+cursanti[0]);
        System.out.println("Al doilea cursant: "+cursanti[1]);
        //parcurg array si printez fiecare pozitie in parte
        System.out.println("Afisez toti cursanti:");
        for (String cursant : cursanti){
            System.out.println(cursant);
        }
        System.out.println("------");
    }
    public void arrayCursantB(){
        // declaram 2 arrays(matrice)
        String[] cursanti = {"Alex","Ion","Vasile","Gheorghe","Tudor","Andrei"};
        Integer[] pozitie ={1,2,3,4,5,6};
        //printez pozitia 0 si 1 din array
        System.out.println("Primul cursant: "+cursanti[0]+" pe pozitia "+ pozitie[0]);
        System.out.println("Al doilea cursant: "+cursanti[1]+" pe pozitia "+ pozitie[1]);
        //parcurg array si printez fiecare pozitie in parte
        System.out.println("Toti cursanti:");
        for (int i=0; i<cursanti.length; i++){
            System.out.println("Pozitia " + pozitie[i]+": "+cursanti[i]);
        }
        System.out.println("------");
    }
    public void arrayCursantC(){
        // declaram 2 arrays(matrice)
        String[] cursuri = {"DevOps","QA Auto","QA Manual","Intro IT","UI/UX","Design"};
        //fiecare matrice trebuie sa fie egal ca numar de elemente daca nu apare o eroare
        String[] cursanti ={"Ana","Tudor","Alex","Andrei","Ion","Gheorghe"};
        //printez pozitia 0 si 1 din array
        System.out.println("Primul cursant: "+cursanti[0]+" invata "+ cursuri[0]);
        System.out.println("Al doilea cursant: "+cursanti[1]+" invata "+ cursuri[5]);
        //parcurg array si printez fiecare nume si fructul de pe aceeasi pozitie
        System.out.println("Afisam toti cursanti si cursurile aferente");
        for (int i=0; i<cursuri.length; i++){
            System.out.println(cursanti[i]+", invata "+cursuri[i]);
        }
        System.out.println("------");
    }
    public void hashMapCursant(){
        // creem un hashMap cu 2 String
        Map<String,String> stringMap = new HashMap<>();
        // adaugam informatiile in hashmap
        stringMap.put("Nume Cursant","Tudor");
        stringMap.put("Varsta Cursant","35");
        stringMap.put("Domiciliul","Timisoara");
        stringMap.put("Curs","QA Auto");
        //printam continutul acelui hashmap
        System.out.println("Nume cursant: "+stringMap.get("Nume Cursant"));
        System.out.println("Varsta Cursant: "+stringMap.get("Varsta Cursant"));
        System.out.println("Domiciliul Cursant: "+stringMap.get("Domiciliul"));
        System.out.println("Cursul: "+stringMap.get("Curs"));
        System.out.println("Cursantul "+stringMap.get("Nume Cursant")+" are varsta "
                            +stringMap.get("Varsta Cursant")+" si domiciliul in "
                            +stringMap.get("Domiciliul")+" ."+" Invata: "+stringMap.get("Curs"));
        // inlocuim datele cu alte date
        stringMap.replace("Nume Cursant","Andrei");
        stringMap.replace("Varsta Cursant","37");
        stringMap.replace("Domiciliul","Bucuresti");
        stringMap.replace("Curs","DevOps");
        // printam din nou cu datele noi
        System.out.println("Cursantul "+stringMap.get("Nume Cursant")+" are varsta "
                            +stringMap.get("Varsta Cursant")+" si invata "
                            +stringMap.get("Curs")+" ."+ "Domiciliul: "+stringMap.get("Domiciliul"));

        //stergem o intrare din hashMap
        //stringMap.remove("Varsta Cursant");
        System.out.println("Exista Label(key) Varsta Cursant? "+stringMap.containsKey("Varsta Cursant"));
        System.out.println("Exista valoare Varstei? "+ stringMap.containsValue("37"));

        System.out.println("Exista label(key) Nume Cursant? "+stringMap.containsKey("Nume Cursant"));
        System.out.println("Exista valoare Nume Cursant? "+stringMap.containsValue("Andrei"));

        System.out.println("Afisam label(key)-urile continuite in hashmap: "+stringMap.keySet());
        System.out.println("Afisam valorile continute in hashmap: "+stringMap.values());

        //iteram prin HASHMAP

        for (Map.Entry<String,String> intrari : stringMap.entrySet()){
            System.out.println("Label(key): "+intrari.getKey()+", Valori: "+intrari.getValue());
        }
        //rezultatul iterari este total alandala
        //folosint HashMap nu garanteaz ca ordine intrarilor este diferita de ordinea iesirilor.
        // goleste toate intrarile din hashmap
        stringMap.clear();
    }

    public void hashMapCursantA(){
        // vom folosii linkedHashMap pentru a pastra ordine inserari - iesirii.
        // creem un linkedHashMap cu 2 String
        Map<String,String> linkedStringMap = new LinkedHashMap<>();
        // adaugam informatiile in hashmap
        linkedStringMap.put("Nume Cursant","Tudor");
        linkedStringMap.put("Varsta Cursant","35");
        linkedStringMap.put("Domiciliul","Timisoara");
        linkedStringMap.put("Curs","QA Auto");
        //printam continutul acelui linkedhashmap
        System.out.println("Nume cursant: "+linkedStringMap.get("Nume Cursant"));
        System.out.println("Varsta Cursant: "+linkedStringMap.get("Varsta Cursant"));
        System.out.println("Domiciliul Cursant: "+linkedStringMap.get("Domiciliul"));
        System.out.println("Cursul: "+linkedStringMap.get("Curs"));
        System.out.println("Cursantul "+linkedStringMap.get("Nume Cursant")+" are varsta "
                +linkedStringMap.get("Varsta Cursant")+" si domiciliul in "
                +linkedStringMap.get("Domiciliul")+" ."+" Invata: "+linkedStringMap.get("Curs"));

    //iteram prin LinkedHASHMAP

        for (Map.Entry<String,String> intrari : linkedStringMap.entrySet()){
        System.out.println("Label(key): "+intrari.getKey()+", Valori: "+intrari.getValue());
        }
    }
    public void tariOraseMap(){
        Map<String,List<String>> tariOrase = new LinkedHashMap<>();

        List<String> oraseRomania = Arrays.asList("Timisoara","Cluj","Bucuresti","Sibiu");
        List<String> oraseGermania = Arrays.asList("Munchen","Berlin","Cologne","Sttugart");
        List<String> oraseFranta = Arrays.asList("Paris","Nantes","Marseille");
        List<String> oraseItalia = Arrays.asList("Milan","Genoa","San Marino","Rome","Naples");

        tariOrase.put("Romania", oraseRomania);
        tariOrase.put("Germania",oraseGermania);
        tariOrase.put("Franta",oraseFranta);
        tariOrase.put("Italia",oraseItalia);

        for(Map.Entry<String,List<String>> intrari : tariOrase.entrySet()){
            String tari = intrari.getKey();
            List<String> orase = intrari.getValue();
            System.out.println(tari+": "+orase);
        }
    }
}
