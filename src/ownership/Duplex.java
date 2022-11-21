package ownership;

import ownership.adnotation.Owner;

@Owner(ownerName="ABC SRL",ownerType = OwnerType.COMPANY)
@Owner(ownerName="AZERTY SA",ownerType = OwnerType.COMPANY)
public class Duplex extends Housing {

}
