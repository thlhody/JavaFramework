package Teme.HotelTest;

import org.testng.annotations.Test;

public class HotelMain {
    @Test
    public void metodaTest(){

        Hotel Trandafir = new Hotel("Trandafir","Timisoara", 10, false,
                true,true,4.3,399.80);

        Hotel Crin = new Hotel("Crin","Oradea", 15, true,
                false,true,4.8,500.34);

        Hotel Continental = new Hotel("Continental","Timisoara", 50,
                20,24,10,false,true,true,3.3,10.00);

        Continental.afisareHotel();
        System.out.println();
        Continental.rezervareCamera(10,2,2, "matrimonial");
        Continental.afisareHotel();
    }
}
