package ownership;

import ownership.adnotation.Owners;
import ownership.adnotation.Owner;

import java.lang.annotation.Annotation;

public class BuildingOwnersDatabase {
    public static void main(String[] args) {

        scanClass(Block.class); //Refactorizare !! Nice

        scanClass(Apartament.class); //Refactorizare !! Nice

        for (Annotation annotation : House.class.getAnnotations()) {
            if (annotation instanceof Owners) {
                Owners owners = (Owners) annotation;
                for (Owner ownerAnnotation : owners.value()) { //Nu inteleg asta
                    ownership.Owner owner = new ownership.Owner(ownerAnnotation.ownerName(), ownerAnnotation.ownerType());
                    OwnersDatabase.addOwner(owner);
                }
            }
        }
        for (Annotation annotation : SingleRoom.class.getAnnotations()) {
            if (annotation instanceof Owner) {
                Owner ownerAnnotation = (Owner) annotation;
                ownership.Owner owner = new ownership.Owner(ownerAnnotation.ownerName(), ownerAnnotation.ownerType());
                OwnersDatabase.addOwner(owner);
            }
        }

        for (int index = 0; index < OwnersDatabase.getSize(); index++) {
            System.out.println(OwnersDatabase.getOwner(index));
        }
    }

public static void scanClass(Class housingClass) {
    for (Annotation annotation : housingClass.getAnnotations()) {
        if (annotation instanceof Owners) {
            Owners owners = (Owners) annotation;
            for (Owner ownerAnnotation : owners.value()) { //Nu inteleg asta
                ownership.Owner owner = new ownership.Owner(ownerAnnotation.ownerName(), ownerAnnotation.ownerType());
                System.out.println(owner);
            }
        }

    }

}}