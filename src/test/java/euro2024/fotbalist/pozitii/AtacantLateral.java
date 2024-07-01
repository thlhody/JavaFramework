package euro2024.fotbalist.pozitii;

import euro2024.fotbalist.Fotbalist;
import euro2024.fotbalist.interfete.AtacantInterface;

public class AtacantLateral extends Fotbalist implements AtacantInterface {
    public AtacantLateral(String nume, String prenume, String oras, String nationalitate, Integer varsta, Double rating, String pozitieTeren, String club, String nationala, Integer nrTricou, Boolean esteCapitan, Boolean esteTitular) {
        super(nume, prenume, oras, nationalitate, varsta, rating, pozitieTeren, club, nationala, nrTricou, esteCapitan, esteTitular);
    }

    @Override
    public void evitaOffSide() {

    }

    @Override
    public void executaPenalty() {

    }

    @Override
    public void simuleazaFault() {

    }

    @Override
    public void centreaza() {

    }

    @Override
    public void alearga() {

    }

    @Override
    public void dribleaza() {

    }

    @Override
    public void paseaza() {

    }

    @Override
    public void suteaza() {

    }

    @Override
    public void marcheaza() {

    }
}
