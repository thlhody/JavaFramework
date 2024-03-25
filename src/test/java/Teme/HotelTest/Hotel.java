package Teme.HotelTest;

public class Hotel {

    public String numeHotel, locatieHotel;
    public Integer nrCamere;
    public Integer nrSingle,nrDouble,nrMatrimonial;
    public Boolean arePiscina, areRoomService, micDejunInlcus;
    public Double rating, pretCamera, pretPersoane;
    public Hotel(String numeHotel, String locatieHotel, Integer nrCamere, Boolean arePiscina, Boolean areRoomService,
                 Boolean micDejunInlcus, Double rating, Double pretCamera) {
        this.numeHotel = numeHotel;
        this.locatieHotel = locatieHotel;
        this.nrCamere = nrCamere;
        this.arePiscina = arePiscina;
        this.areRoomService = areRoomService;
        this.micDejunInlcus = micDejunInlcus;
        this.rating = rating;
        this.pretCamera = pretCamera;
    }
    public Hotel(String numeHotel, String locatieHotel, Integer nrCamere, Integer nrSingleBed, Integer nrDoubleBed, Integer nrMatrimonial,
                 Boolean arePiscina, Boolean areRoomService, Boolean micDejunInlcus, Double rating, Double pretPersoane) {
        this.numeHotel = numeHotel;
        this.locatieHotel = locatieHotel;
        this.nrCamere = nrCamere;
        this.nrSingle = nrSingleBed;
        this.nrDouble = nrDoubleBed;
        this.nrMatrimonial = nrMatrimonial;
        this.arePiscina = arePiscina;
        this.areRoomService = areRoomService;
        this.micDejunInlcus = micDejunInlcus;
        this.rating = rating;
        this.pretPersoane = pretPersoane;
    }

    // %d - reprezinta Integer, %s - reprezinta String, %c - reprezinta un Character, %b - reprezinta Boolean ,
    // %.2f - reprezinta Float/Double/BigDecimal si va arata doar 2 zecimale in functie de cate zecimale dorim sa afisam putem schimba .2 in orice numar dorim
    // %f - este float se asteapta la un float/double/bigdecimal
    // %x - reprezinta un Integer in format hexadecimal , se asteapta la un integer care va fii afisat in format hexadecimal
    // %e sau %E - reprezinta un numar stintific  exemplu Double 123456.789 daca il reprezentam cu %e/%E va arata 1.2345678e/E+05 - indica exponentul la puterea a 10.
    // %n - functioneza la fel \n -newline care muta obiectul pe alta linie.
    public void afisareHotel(){
        if (pretCamera == null){
            System.out.println("   |  Nume       |  Locatie    |  Camere     | Single      | Double      | Matrimonial | Piscina     | RoomService |  MicDejun   | Rating      | Pret/Persoane|");
            System.out.println("   |-------------|-------------|-------------|-------------|-------------|-------------|-------------|-------------|-------------|-------------|--------------|");
            System.out.printf( "   | %-11s | %-11s | %11d |  %10d | %11d |  %10d | %11b | %11b | %11b | %11.1f | %12.2f |\n",
                    numeHotel,locatieHotel,nrCamere,nrSingle,nrDouble,nrMatrimonial,arePiscina,areRoomService,micDejunInlcus,rating,pretPersoane);
        }else {
            System.out.println("   |  Nume       |  Locatie    |  Camere     | Piscina     | RoomService |  MicDejun   | Rating      | Pret/Camera |");
            System.out.println("   |-------------|-------------|-------------|-------------|-------------|-------------|-------------|-------------|");
            System.out.printf("   | %-11s | %-11s | %11d | %11b | %11b | %11b | %11.1f | %11.2f |\n",
                    numeHotel, locatieHotel, nrCamere, arePiscina, areRoomService, micDejunInlcus, rating, pretCamera);
        }
    }
    public void rezervareCamera(Integer numarNopti, Integer nrCamereRezervate) {
        if (nrCamereRezervate <= nrCamere) {
            Double costTotal = pretCamera * numarNopti * nrCamereRezervate;
            System.out.println("Pret total pentru " +nrCamereRezervate +" camera/e pentru "+ numarNopti + " nopti: " + costTotal);
            nrCamere -=nrCamereRezervate;
        } else {
            System.out.println("Nu avem camere disponibile!");
        }
    }
  //compozitie - mostenire
    public void rezervareCamera(Integer numarNopti, Integer numarPersoane,Integer persoaneMatrimonial, String prefCamera) {
        Double pretTotal = numarNopti*(numarPersoane*pretPersoane);
        if(prefCamera.equals("single")){
            if (numarPersoane <= nrSingle){
            System.out.println("Pret total pentru camera single pentru " + numarPersoane + " persoane pentru " + numarNopti + " nopti: " + pretTotal);
            nrSingle -= numarPersoane;
            } else {
                System.out.println("Nu avem locuri libere single, locuri disponibile: "+nrSingle);
            }
        } else if (prefCamera.equals("double")) {
            if (numarPersoane <= 2* nrDouble) {
                Integer nrDoubleUtilizat = numarPersoane /2;
                if (numarPersoane % 2 != 0) {
                    Double pretPat = pretTotal / numarPersoane;
                    Double pretPatTotalImpar = (numarPersoane - 1) * pretPat + (pretPat * 1.5);
                    Double pretPatDoubleImpar = pretPat * 1.5;
                    System.out.println("Pret total camera dubla pentru " + numarPersoane + " persoane, pentru " + numarNopti + " nopti: " + pretPatTotalImpar);
                    System.out.println("Pret total camera dubla o persoana 50% extra, pentru " + numarNopti + " nopti: " + pretPatDoubleImpar);
                    nrDouble -= 1;
                } else {
                    System.out.println("Pret total camera dubla pentru " + numarPersoane + " persoane, pentru " + numarNopti + " nopti: " + pretTotal);
                }
                nrDouble -= nrDoubleUtilizat;
            } else {
                System.out.println("Nu avem locuri libere double, locuri disponibile: "+nrDouble);
            }
        } else if (prefCamera.equals("matrimonial")){
            if(persoaneMatrimonial>0){
                if (numarPersoane <= 2* nrMatrimonial) {
                    Integer nrMatriUtilizat = numarPersoane /2;
                    if (numarPersoane % 2 != 0) {
                        Double pretPat = pretTotal / numarPersoane;
                        Double pretPatTotalImpar = (numarPersoane - 1) * pretPat + (pretPat * 1.5);
                        Double pretMatrimonialImpar = pretPat * 1.5;
                        System.out.println("Pret total camera matrimoniala pentru " + numarPersoane + " persoane, pentru " + numarNopti + " nopti: " + pretPatTotalImpar);
                        System.out.println("Pret total camera matrimoniala o persoana 50% extra, pentru " + numarNopti + " nopti: " + pretMatrimonialImpar);
                        nrMatrimonial -= 1;
                    } else {
                        System.out.println("Pret total camera dubla pentru " + numarPersoane + " persoane, pentru " + numarNopti + " nopti: " + pretTotal);
                    }
                    nrMatrimonial -= nrMatriUtilizat;
                } else {
                    System.out.println("Nu avem locuri libere double, locuri disponibile: "+nrDouble);
                }
            }else if (persoaneMatrimonial==0){
                Integer patSingle = numarPersoane % 2;
                Integer patDouble = numarPersoane / 2;
                nrSingle -= patSingle;
                nrDouble -= patDouble;
                System.out.println("Pret total  camera dubla,single pentru " + numarPersoane + " persoane, pentru " + numarNopti + " nopti: " + pretTotal);
            }
        } else if (prefCamera.equals("default")){
            Integer patSingle = numarPersoane % 2;
            Integer patDouble = numarPersoane / 2;
            nrSingle -= patSingle;
            nrDouble -= patDouble;
            System.out.println("Pret total  camera dubla,single pentru " + numarPersoane + " persoane, pentru " + numarNopti + " nopti: " + pretTotal);
        }
    }
    public void anulareRezervare(Integer nrCamereAnulate){
        nrCamere += nrCamereAnulate;
        System.out.println(nrCamereAnulate+ " camera/e au fost anulate. Numarul de camere disponibile a fost actualizat!");
    }
}

