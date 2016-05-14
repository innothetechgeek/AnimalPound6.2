package www.cput.za.animalpound.services.Animal;

import android.content.Context;
import android.content.Intent;
import android.test.AndroidTestCase;
import android.util.Log;

import www.cput.za.animalpound.conf.App;
import www.cput.za.animalpound.domain.AnimalHealth;
import www.cput.za.animalpound.services.animal.Impl.AnimalHealthServiceImpl;
import www.cput.za.animalpound.services.animal.Impl.AnimalRecordServiceImpl;

/**
 * Created by Game330 on 2016-05-13.
 */
public class AnimalHealthServiceTest extends AndroidTestCase {
    private AnimalHealthServiceImpl animalHealth;





    public void testSaveAnimalHealth() throws Exception {

        AnimalHealth aHealth = new AnimalHealth.Builder()
                .condition("Well")
                .id(Long.parseLong("23432432"))
                .build();
        animalHealth = new AnimalHealthServiceImpl();
        animalHealth.addHealth(App.getAppContext());
        animalHealth.saveHealth(aHealth);
            System.out.print("AnimalSaved!!");
    }
}
