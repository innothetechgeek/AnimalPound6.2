package www.cput.za.animalpound.services.animal;

import android.test.AndroidTestCase;

import www.cput.za.animalpound.conf.App;
import www.cput.za.animalpound.domain.LivingArea;
import www.cput.za.animalpound.services.animal.Impl.LivingAreaServiceImpl;

/**
 * Created by Game330 on 2016-05-14.
 */
public class LivingAreaServiceTest extends AndroidTestCase {


    private LivingAreaServiceImpl livingArea;


    public void testSaveAnimal() throws Exception {

        LivingArea lArea = new LivingArea.Builder()
                .livingAreaId(Long.parseLong("43344"))
                .livingAreaName("Kraal")
                .build();


        livingArea = new LivingAreaServiceImpl();
        livingArea.addLivingArea(App.getAppContext());
        livingArea.saveLivingAra(lArea);
        System.out.print("LivingAreaSaved!!");
    }
}