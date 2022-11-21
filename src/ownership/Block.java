package ownership;

import ownership.adnotation.Owner;

@Owner(ownerName="ABC SRL",ownerType = OwnerType.COMPANY)
@Owner(ownerName="ABC QWERTY",ownerType = OwnerType.COMPANY)
public class Block extends Housing {
    public static class Apartment extends LivingSpace {
    }
}
