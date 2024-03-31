package Obiect;

import java.util.Arrays;
import java.util.List;

public class BMW extends Masina {
    private List<String> dotariExterioare;
    private List<String> dotariInterioare;
    private Integer pretFinal;

    public BMW(String marca, String model, String culoare, String carburant, Integer anProd,
               Integer capacitateCilindrica, Integer pret, List<String> dotariExterioare, List<String> dotariInterioare) {
        super(marca, model, culoare, carburant, anProd, capacitateCilindrica, pret);
        this.dotariExterioare = dotariExterioare;
        this.dotariInterioare = dotariInterioare;
    }

    public void prezentareBMW() {
        prezentareMasina();
        calculDotari();
        System.out.println("Pretul cu dotarii este: " + getPret());
        System.out.println("Dotarile exterioare sunt: " + dotariExterioare);
        System.out.println("Dotarile exterioare sunt: " + dotariInterioare);
    }

    public void afisarePret() {
        System.out.println("Pret final: " + pretFinal);
    }

    public void afisarePret(Integer reducere) {
        System.out.println("Pre final cu reducere:");
    }

    public void afisarePret(String voucher) {
        System.out.println("Pre final cu reducere:");
    }

    public void calculDotari() {
        pretFinal = getPret();
        for (int i = 0; i < dotariExterioare.size(); i++) {
            switch (dotariExterioare.get(i)) {
                case "Oglinzi Electrice":
                    pretFinal += 70;
                    break;
                case "Faruri LED":
                    pretFinal += 90;
                    break;
                case "Camera Video":
                    pretFinal += 110;
                    break;
            }
        }
        for (int i = 0; i < dotariInterioare.size(); i++) {
            switch (dotariInterioare.get(i)) {
                case "Incalzire Scaune":
                    pretFinal += 100;
                    break;
                case "Cruise Control":
                    pretFinal += +190;
                    break;
                case "Incalzire Volan":
                    pretFinal += 130;
                    break;
            }
        }
    }

    public void pornesteMasina() {
        System.out.println("Masina BMW porneste de la buton si cheie si distanta!");
    }
}
