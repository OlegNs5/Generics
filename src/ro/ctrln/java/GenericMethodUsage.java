package ro.ctrln.java;

import java.math.BigDecimal;

public class GenericMethodUsage {
    public static void main(String[] args) {
        String[] stringurile = {"unu", "doi", "trei", "patru", "cinci"};
        GenericMethod.showElements(stringurile);

        Integer[] integers = {1,2,3,4,5,6,7,8,9};
        GenericMethod.showElements(integers);

        BigDecimal[] bigDecimals = {new BigDecimal("2.3"),new BigDecimal("5")};
        GenericMethod.showElements(bigDecimals);

        TestClass[] testClass ={new TestClass("TestUnu"), new TestClass("TestDoi")};
        GenericMethod.showElements(testClass);

        Double[] doubles ={2.3,3D,4.5,69D};
        GenericMethod.showElements(doubles);

    }
}
