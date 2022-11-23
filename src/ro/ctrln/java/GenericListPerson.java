package ro.ctrln.java;

public class GenericListPerson {
    public static void main(String[] args) {
        GenericList<Person> persons = new GenericList<>();
        persons.addElement(new Person("Andrei"));
        persons.addElement(new Person("Elena"));
        persons.addElement(new Person("Cristi"));
        persons.addElement(new Person("Aura"));

        for (int index=0; index<persons.getSize(); index++) {
            System.out.println("Numele persoanei de pe pozitia "+index+" este "+persons.getElement(index));
        }
        persons.removeElement(1);
        System.out.println("Numarul listei depa stergere este: "+persons.getSize());

        for (int index=0; index<persons.getSize(); index++) {
            System.out.println("Numele persoanei de pe pozitia "+index+" este "+persons.getElement(index));
        }
        }
}
