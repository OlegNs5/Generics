package ownership;

import ownership.adnotation.Owner;

//@Owner(ownerName = OwnersDatabase.getOwnerName(0)) - aici valorile trebuie sa fie constante// eroare de compilare
@Owner(ownerName = "John",ownerType = OwnerType.PERSON)
@Owner(ownerName = "Companie SRL",ownerType = OwnerType.COMPANY)
public class Apartament extends LivingSpace{

}
