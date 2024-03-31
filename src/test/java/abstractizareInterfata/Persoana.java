package abstractizareInterfata;

public class Persoana {

    //Abstractizare - conceptul prin care definim comportamentul unei clase;
    //              - acest concept se poate face folosind interfete sau clase abstracte;
    //Interfata - se recunoaste dupa cuvantul "interface"
    //          - contine doar metode abstracte(metode care nu au body);
    //          - toate metodele sun publice;
    //          - putem avea metode de tip void sau return;
    //          - nu putem avea un constructor -> nu putem face un obiect;
    //          - o interfata se implementeaza, o clasa se mosteneste;
    //          - o interfata poate mosteni o alta interfata insa nu poate exitinde o clasa abstracta;
    //Clasa - care implementeaza interfata -> trebuie sa ofere implementarea pentru toate metodele abstracte;
    //      - poate implementa N interfete

    private String nume, prenume;
    private Integer varsta;

    public Persoana(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }
}

