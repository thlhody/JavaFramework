package Obiect;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class ObiectTest {
    @Test
    public void metodaTest() {
        List<String> dotariExtAudi = Arrays.asList("Oglinzi Electrice", "Faruri LED", "Camera Video");
        Audi AudiPrimavera = new Audi("Audi", "A1", "Rosu",
                "Benzina", 2020, 1999, 10000, dotariExtAudi);
        AudiPrimavera.prezentareAudi();
        AudiPrimavera.setCuloare("Verde");
        AudiPrimavera.getPret();
        AudiPrimavera.prezentareAudi();
        AudiPrimavera.pornesteMasina();
        System.out.println();


        System.out.println();
        List<String> dotariExtBMW = Arrays.asList("Oglinzi Electrice", "Faruri LED", "Camera Video");
        List<String> dotariIntBMW = Arrays.asList("Incalzire Scaune", "Cruise Control", "Incalzire Volan");
        BMW BMWModel = new BMW("BMW", "X5", "Negru", "Disel", 2022, 1500, 1000, dotariExtBMW, dotariIntBMW);
        BMWModel.prezentareBMW();
        BMWModel.afisareImpozit();
        BMWModel.pornesteMasina();
        BMWModel.afisarePret();
        BMWModel.afisarePret(10);
        BMWModel.afisarePret("craciun");
        System.out.println();
//
//        Masina Toyota = new Masina("Toyota","Prius","Alb","Benzina",2023,1000, 15000);
//        Toyota.prezentareMasina();
//        Toyota.afisareImpozit();
    }
}
