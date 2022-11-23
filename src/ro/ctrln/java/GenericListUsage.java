package ro.ctrln.java;

import java.math.BigDecimal;

public class GenericListUsage {
    public static void main(String[] args) {
        GenericList<Integer> integers = new GenericList<>();
        integers.addElement(3);
        integers.addElement(5);
        integers.addElement(-3);
        integers.addElement(163);
        System.out.println("Marimea dupa adaugare este: " + integers.getSize());
        System.out.println(integers.getElement(2));
        System.out.println(integers.getElement(0));
//        System.out.println(integers.getElement(100));
        integers.removeElement(1);
        System.out.println("Marimea dupa stergere este: " + integers.getSize());

        GenericList<String> strings = new GenericList<>();
        strings.addElement("one");
        strings.addElement("two");
        strings.addElement("three");
        strings.addElement("four");
        System.out.println("Marimea strings " + strings.getSize());
        strings.removeElement(1);
        System.out.println("Marimea dupa stergere " + strings.getSize());

        for (int index = 0; index < strings.getSize(); index++) {
            System.out.println("Elementul de pe pozitia "+index+" este: "+strings.getElement(index));
        }
        GenericList<BigDecimal> bigDecimals = new GenericList<>();
        bigDecimals.addElement(BigDecimal.valueOf(23));
        bigDecimals.addElement(new BigDecimal("2.45"));
        bigDecimals.addElement(BigDecimal.valueOf(2.46));
        bigDecimals.addElement(new BigDecimal("2.47"));
        System.out.println("Elementul de pe pozitia 0 este: " + bigDecimals.getElement(0));
        System.out.println("Elementul de pe pozitia 1 este: " + bigDecimals.getElement(1));
        System.out.println("Elementul de pe pozitia 2 este: " + bigDecimals.getElement(2));
        System.out.println("Elementul de pe pozitia 3 este: " + bigDecimals.getElement(3));

        System.out.println("Marimea dupa adaugarea elementelor este : " + bigDecimals.getSize());

        bigDecimals.removeElement(2);
        System.out.println("Elementul de pe pozitia 0 este: " + bigDecimals.getElement(0));
        System.out.println("Elementul de pe pozitia 1 este: " + bigDecimals.getElement(1));
        System.out.println("Elementul de pe pozitia 2 este: " + bigDecimals.getElement(2));

        System.out.println("Marimea dupa stergerea elementelor este : " + bigDecimals.getSize());
    }
}
