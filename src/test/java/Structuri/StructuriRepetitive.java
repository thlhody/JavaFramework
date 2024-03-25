package Structuri;

import org.testng.annotations.Test;

public class StructuriRepetitive {
    // structuri repetitive = for, while, for each


    @Test
    public void metodaTest(){
        afisamZeceNumere(10);
        afisamZeceNumereWhile(10);
        afisamNumerelePare(20);
    }
    public void afisamZeceNumere(Integer capat){
        //ca sa intelegi: for(Integer index=0; index<=capat; index=index+1;)
        // index finit de pasii
        for(int index=0; index<=capat; index++){
            System.out.println(index);
        }
    }
    //aceeasi metoda cu while
    public void afisamZeceNumereWhile(Integer capat){
        // index infinit de pasii
        Integer index=0;
        while (index<=capat){
            System.out.println(index);
            index++;
        }
    }
    //vreau sa afizez numerele pare de la 0 la 20

    public void afisamNumerelePare(Integer numar){
        for(int i=2; i<=numar; i++){
            if(i%2==0) {
                System.out.println(i);
            }
        }
    }

}
