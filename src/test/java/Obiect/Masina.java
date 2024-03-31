package Obiect;

public class Masina {

    // Constructor = are ca rol sa initializeze variabilele unei clase
    // putem sa recunoastem un constructor dupa numele clasei
    // de cele mai multe ori constructorul este public
    // exista 2 tipuri de constructori: cu parametri sau fara parametri.
    // intr-o clasa java exista un construnctor default fara parametrii.
    // Obiect = instanta unei clase
    // dintr-o clasa putem instantia 'n' obiecte
    // obiectele se diferentiaza prin numele lor sau numarul de parametri pe care il primesc.
    // in momentul cand un obiect primeste valori (se initializeaza) se apeleaza constructorul din clasa parinte



    private String model, culoare, carburant;
    private String marca;
    private Integer anProd, capacitateCilindrica;
    private Integer pret;

    // exista 4 concepte OOP - mostenire, incapsulare, abstractizare, polimorfism
    //Mostenirea = conceptul prin care o clasa este mostenita(extinsa) de o alta clasa
    //cand o clasa mosteneste o alta clasa se formeaza o relatie de parinte-copil
    //in java o clasa poate mostenii doar o singura clasa
    //cand se aplica mostenirea copilul poate accesa toate variabilelel/metodele din parinte daca sunt publice/protected
    //in momentul cand copilul mosteneste parintele copilul trebuie sa apeleze constructorul din parinte cu super


    //incapsulare - conceptul prin care excludem posibilitate ca unele informatii sa fie modificate din exteriorul clasei
    //access control in java:  public,private,protected,default
    //public - ofera vizibilitate in toate pachetele din proiect
    //private - restrange vizibilitatea doar in clasa unde este definit
    //ca sa oferim vizibilitate proprietatile in alte clase apelam la conceptul getter/setter


    //polimorfism - conceptul prin care o metoda poate avea implementari diferite
    //polimorfismul este de 2 feluri dinamic(override) si static(overload)
    //polimorfismul dinamic - intr-o ierarhie de clase obtinute prin mostenire o metoda poate avea implementari diferite
    //                      - se regaseste tot timpul in procesul de mostenire.
    //polimorfismul static - cel mai des intalnit conceptul;

    public Masina(String marca, String model, String culoare, String carburant, Integer anProd, Integer capacitateCilindrica) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.carburant = carburant;
        this.anProd = anProd;
        this.capacitateCilindrica = capacitateCilindrica;
    }

    public Masina(String marca, String model, String culoare, String carburant, Integer anProd, Integer capacitateCilindrica, Integer pret) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.carburant = carburant;
        this.anProd = anProd;
        this.capacitateCilindrica = capacitateCilindrica;
        this.pret = pret;
    }

    // definim prima implementare pentru o metoda pe care o vom suprascrie
    public void pornesteMasina(){
        System.out.println("Masina porneste de la cheie!");
    }

    public void prezentareMasina(){

        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Culoarea masinii este: " + culoare);
        System.out.println("Tipul de carburant este: " + carburant);
        System.out.println("Anul productie este: " + anProd);
        System.out.println("Capacitatea cilindrica este: " + capacitateCilindrica);
        if(pret != null ){
            System.out.println("Pretul masini este: "+ pret);
        }else{
            System.out.println("Masina este moca");
        }
    }

    public void afisareImpozit(){
        if(anProd>=2023){
            System.out.println("Pentru  " + marca+" din anul "+ anProd+ " Impozitul este 5 lei");
        } else if (anProd>2020 && anProd<2023) {
            System.out.println("Pentru  " + marca+" din anul "+ anProd+ " Impozitul este 10 lei");

        }else if (anProd==2020){
            System.out.println("Pentru  " + marca+" din anul "+ anProd+ " Impozitul este 20 lei");

        }else {
            System.out.println("Impozitul este moca");
        }

    }

    public String getModel() {
        return model;
    }

    public String getCuloare() {
        return culoare;
    }

    public String getCarburant() {
        return carburant;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getAnProd() {
        return anProd;
    }

    public Integer getCapacitateCilindrica() {
        return capacitateCilindrica;
    }

    public Integer getPret() {
        return pret;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public void setAnProd(Integer anProd) {
        this.anProd = anProd;
    }

    public void setCapacitateCilindrica(Integer capacitateCilindrica) {
        this.capacitateCilindrica = capacitateCilindrica;
    }
}
//facem getter/setter

