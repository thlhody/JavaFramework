package euro2024.fotbalist;

import euro2024.Persoana;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Fotbalist extends Persoana {

    private String pozitieTeren, club, nationala;
    private Integer nrTricou;
    private Boolean esteCapitan, esteTitular;


    public Fotbalist(String nume, String prenume, String oras, String nationalitate, Integer varsta, Double rating,
                     String pozitieTeren, String club, String nationala, Integer nrTricou, Boolean esteCapitan, Boolean esteTitular) {
        super(nume, prenume, oras, nationalitate, varsta, rating);
        this.pozitieTeren = pozitieTeren;
        this.club = club;
        this.nationala = nationala;
        this.nrTricou = nrTricou;
        this.esteCapitan = esteCapitan;
        this.esteTitular = esteTitular;

    }
}
