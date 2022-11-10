package ro.ctrln.java;

import java.math.BigDecimal;

public class GenericMethod {

    public static<T> void showElements(T[] elements){ // Orice fel de parametri are loc dupa cuvintul "static"
        for (T elemente : elements) {
            System.out.println("Element from Generic method is; " + elemente);
        }
  /*  }
    public static void showElements(String[] elements) {
        for (String elemente : elements) {
            System.out.println("Elementul este; " + elemente);
        }
    }

    public static void showElements(Integer[] elements) {
        for (Integer elemente : elements) {
            System.out.println("Elementul este; " + elemente);
        }
    }

    public static void showElements(BigDecimal[] elements) {
        for (BigDecimal elemente : elements) {
            System.out.println("Elementul este; " + elemente);
        }
    }
    public static void showElements(TestClass[] elements) {
        for (TestClass elemente : elements) {
            System.out.println("Elementul este; " + elemente);
        }

   */ }
}