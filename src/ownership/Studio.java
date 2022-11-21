package ownership;

import ownership.adnotation.Owner;
import ownership.adnotation.Owners;

@Owners({
        @Owner(ownerName = "Lisa", ownerType = OwnerType.PERSON ),
        @Owner(ownerName= "Company SA", ownerType=OwnerType.COMPANY),
        @Owner(ownerName= "Company Subsidiary SA", ownerType=OwnerType.COMPANY)
})
public class Studio extends LivingSpace{

}
