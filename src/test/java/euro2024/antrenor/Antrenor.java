package euro2024.antrenor;

import euro2024.Persoana;

public class Antrenor extends Persoana implements AntrenorInterface{

    private Integer aniExperienta, nrTrofee;
    private String echipaNationala;

    public Antrenor(String nume, String prenume, String oras, String nationalitate, Integer varsta, Double rating) {
        super(nume, prenume, oras, nationalitate, varsta, rating);
        this.aniExperienta = aniExperienta;
        this.nrTrofee = nrTrofee;
        this.echipaNationala = echipaNationala;
    }


    @Override
    public void strategieAntrenamente() {

    }

    @Override
    public void selectionare() {

    }

    @Override
    public void implementareStrategii() {

    }

    @Override
    public void conferintaPresa() {

    }
}
