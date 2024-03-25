package Structuri;

import org.testng.annotations.Test;

public class StructuriAlternative {
    //structuri alternative= if...then...else/ switch...case.

    @Test
    public void metodaTest(){
        //numarMaiMareCaX(10);
        //numarMaiMareCaX(11);
        //numarMaiMareCaX(9);
//        parPozitiv(0);
//        parPozitiv(1);
//        parPozitiv(2);
//        parPozitiv(3);
//        parPozitiv(4);
//        parPozitiv(-1);
//        parPozitiv(-2);
//        parPozitiv(-3);
//        parPozitiv(-4);
//        parPozitiv(15);
//        parPozitiv(16);
//        parPozitiv(-15);
//        parPozitiv(-16);
//        verificaPropozitie("Ana are mere", "Ana","mere");
//        verificaPropozitie("Ana are mere", "ana","Mere");
//        verificaPropozitie("Ana are mere", "George","pere");
        zileleSaptamana(5);

    }
    //verificam daca un numar este mai mare decat 10.

    public void numarMaiMareCaX(Integer numar1){

        if (numar1>10) {
            System.out.println(numar1 + " este mai mare ca 10");
        } else if(numar1==10){
            System.out.println(numar1+" este egal cu 10");
        } else {
            System.out.println(numar1+" nu este mai mare ca 10");
        }
    }
    // verificam daca un numar este par si pozitiv
    public void parPozitiv(Integer numar2){
        if (numar2%2==0){
            if(numar2>=0){
                System.out.println("Numarul "+numar2+" este par si pozitiv");
            }
            else {
                System.out.println("Numarul "+numar2+" este par si negativ");
            }
        } else {
            if(numar2>=0){
                System.out.println("Numarul "+numar2+" este impar si pozitiv");
            }
            else {
                System.out.println("Numarul "+numar2+" este impar si negativ");
            }
        }
    }
    // verificam ca o propozitie contine 2 cuvinte.
    // Ana are mere => cauta si mere.
    public void verificaPropozitie(String propozitie, String cuvant1, String cuvant2){
        if(!(propozitie.contains(cuvant1) && propozitie.contains(cuvant2))){
            System.out.println(cuvant1+" chiar are "+cuvant2);
        }else {
            System.out.println("Ana nu are mere");
        }
    }
//reprezentam cazurile pentru zilele saptamani

    // if merge pe conditii
    // switch case valoare

    public void zileleSaptamana(Integer zi){
        switch (zi){
            case 1:
                System.out.println("Azi e Luni");
                break;
            case 2:
                System.out.println("Azi e Marti");
                break;
            case 3:
                System.out.println("Azi e Miercuri");
                break;
            default:
                System.out.println("Nu exista ziua respectiva");
        }
    }
}
