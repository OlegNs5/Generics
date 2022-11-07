package ro.ctrln.java;

import java.math.BigDecimal;
import java.util.ArrayList;

public class GenericClass {
    public static void main(String[] args) {

        ArrayList<BigDecimal> objectList = new ArrayList<>(); //Un asa tip de vetor nu te forteaza sa pui un tip de data anume,...
        BigDecimal[] bigDecimalVector = new BigDecimal[34];//Spre exemplu primeste doar BigDecimal

//        objectList.add(new Object()); //vector 0 ;
//        objectList.add("String");//vector 1 ;
//        objectList.add(2);//vector 2 ;
        objectList.add(new BigDecimal(3.5));//vector 3 ;
        objectList.add( BigDecimal.valueOf(4));

        bigDecimalVector[0] = new BigDecimal(100);

        System.out.println(objectList.add(BigDecimal.valueOf(3.14)));//vector 4 ;
//        System.out.println(objectList.get(4)); //get(vector 4);

        System.out.println(objectList.get(1));

//        BigDecimal bigDecimal = (BigDecimal) objectList.get(3); // aici ne oblica sa facem Cast pentru ca sa transmitem un BigDecima NU un obiect
//        System.out.println("BigDecinal: " + bigDecimal);

        String stringElement = objectList.get(1).toString(); // aici pe linga cast trebuie sa stii si pozitia elementului String
        System.out.println("String: "+ stringElement);
    }
}
