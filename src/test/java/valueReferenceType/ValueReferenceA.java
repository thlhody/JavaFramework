package valueReferenceType;

import org.testng.annotations.Test;

public class ValueReferenceA {

    public int originalInt = 10;
    public String originalString = "Tudor";
    public Fruct mar = new Fruct("mar", "primavara");
    public int secondInt = 5;

    @Test
    public void testMethod() {

        System.out.println("1. VALUE TYPE");
        valueTypeExample(originalInt);
        System.out.println("Valoare initiala este: " + originalInt);

        System.out.println("2. REFERENCE TYPE - STRING OBJECT");
        referenceTypeStrineEx(originalString);
        System.out.println("Valoare initiala este: " + originalString);

        System.out.println("3. REFERENCE TYPE - OBJECT");
        referenceTypeObjectEx(mar);
        mar.descriere();

        System.out.println("4. FINAL");
        secondInt = secondInt + 10;

    }

    public void valueTypeExample(Integer value) {
        value = value + 5;
        System.out.println("Valoare noua este: " + value);

    }

    public void referenceTypeStrineEx(String value) {
        value = value + " Hody";
        System.out.println("Valoare noua este: " + value);

    }

    public void referenceTypeObjectEx(Fruct fruct) {
        fruct.sezon = "toamna";
        fruct.descriere();

    }
}
