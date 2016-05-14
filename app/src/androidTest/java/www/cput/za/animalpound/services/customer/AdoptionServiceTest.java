package www.cput.za.animalpound.services.customer;

import android.test.AndroidTestCase;

import www.cput.za.animalpound.conf.App;
import www.cput.za.animalpound.conf.AppUtil;
import www.cput.za.animalpound.domain.Adoption;
import www.cput.za.animalpound.services.customer.Impl.AdoptionServiceImpl;

/**
 * Created by Game330 on 2016-05-14.
 */
public class AdoptionServiceTest extends AndroidTestCase {

    private AdoptionServiceImpl adoptionService;

    public void testSaveAdoption() throws Exception {

        Adoption address = new Adoption.Builder()
               .adoptionId(Long.parseLong("34324"))
                .adoptionDate(AppUtil.getDate("23/43/2016"))
                .comment("Adopted")
                .build();
        adoptionService =   new AdoptionServiceImpl();
        adoptionService.addAdoption(App.getAppContext());
        adoptionService.saveAdoption(address);
        System.out.print("AdoptionSaved!!");
    }
}
