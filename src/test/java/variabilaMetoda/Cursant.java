package variabilaMetoda;

import org.testng.annotations.Test;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

public class Cursant {
    // o clasa este un sablon specific unui obiect/produs care trebuie sa contina un nume (cursant).
    // putem avea mai multe clase dar nu este recomandat, preferabil sa fie modular sa fie scalabil.
    // o variabila este proprietate sau atributul unei clase si putem avea multe variabile.
    // putem aveam 2 tipuri de variabile globale si locale.
    // metoda este o actiune intr-o clasa.
    // o metoda poate contine parametri.
    // void - afiseaza.
    // return - executa si returneaza informatia.
    // String - sir de caractere.
    // Integer - numere.
    // Float/Double/BigDecimal - numere cu zecimale 32biti/64biti/128biti.
    // Character - doar 1 caracter.
    // Boolean - true/false only answer.

    public String nume;
    public String prenume;
    public Integer varsta;
    public Double inaltime;
    public Float greutate;
    public Character sexul;
    public Boolean areRestante;

    @Test
    public void metodaTest(){
          nume = "Tudor";
//        prenume = "Hody";
//        varsta = 35;
//        inaltime = 1.75;
//        greutate = 62.5f;
//        sexul = 'M';
//        areRestante = false;

        prezentareCursant("Andrei","George",34,1.56,65.4f,'M',true);
        calculMedie(5,7,9,6,9);
        prezentareCursant("Tudor","Hody",35,1.75,62.5f,'M',false);
        calculMedie(8,7,9,10,10);
        prezentareCursant("Simona","Syss",35,1.65,55.5f,'F',false);
        calculMedie(5,7,9,6,10);
        System.out.println(getSalariu());

    }

    public void prezentareCursant(String par1, String par2, Integer par3, Double par4, Float par5, Character par6, Boolean par7){

        System.out.println("Ma numesc: "+par1+" "+par2+".");
        System.out.println("Avand varsta: "+par3+" inaltimea: "+par4+" si greutatea: "+par5+".");
        System.out.println("Avand sexul: "+par6+"."+"Cu sau fara restante?: "+par7);
        System.out.println("---------------------------------------------------");
        nume="Tudor";
    }
    // calculam media cursantului
    public void calculMedie(Integer nota1, Integer nota2, Integer nota3, Integer nota4, Integer nota5){

        Integer medie=(nota1+nota2+nota3+nota4+nota5)/5;
        System.out.println("Media cursantului este: "+medie+"\n");
        nume="Tudor2";
    }

    //exemplu metoda cu return
    public Integer getSalariu(){
        Integer salar = 2000;
        return salar;
    }

}
