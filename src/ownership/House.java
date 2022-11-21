package ownership;

import ownership.adnotation.Owner;
import ownership.adnotation.Owners;

@Owners({
        @Owner(ownerName="DEF SA",ownerType=OwnerType.COMPANY)
})
public class House extends Housing {

}
