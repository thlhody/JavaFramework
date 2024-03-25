package Obiect;

import java.util.Arrays;
import java.util.List;

public class Audi extends Masina {

    private List<String> dotariExterioare;
    private Integer pretFinal;

    public Audi(String marca, String model, String culoare, String carburant, Integer anProd,
                Integer capacitateCilindrica, Integer pret, List<String> dotariExterioare) {
        super(marca, model, culoare, carburant, anProd, capacitateCilindrica, pret);
        this.dotariExterioare = dotariExterioare;
    }
    public void prezentareAudi() {
        prezentareMasina();
        calculDotari();
        System.out.println("Pretul cu dotarii este: " + pretFinal);
        System.out.println("Dotarile exterioare sunt: " + dotariExterioare);
    }
    public void calculDotari() {
        pretFinal = getPret();
        for (int i = 0; i < dotariExterioare.size(); i++) {
            switch (dotariExterioare.get(i)) {
                case "Oglinzi Electrice":
                    pretFinal += 120;
                    break;
                case "Faruri LED":
                    pretFinal += 100;
                    break;
                case "Camera Video":
                    pretFinal += 130;
                    break;
            }
        }
    }
    public void pornesteMasina() {
//        super.pornesteMasina();
        System.out.println("Masina Audi porneste de la buton!");
    }
}

