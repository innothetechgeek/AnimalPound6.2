package www.cput.za.animalpound.services.animal;

import android.test.AndroidTestCase;

import www.cput.za.animalpound.conf.App;
import www.cput.za.animalpound.domain.AnimalRecord;
import www.cput.za.animalpound.services.animal.Impl.AnimalRecordServiceImpl;

/**
 * Created by Game330 on 2016-05-14.
 */
public class AnimalRecordServiceTest extends AndroidTestCase {
    private AnimalRecordServiceImpl animalRec;





    public void testSaveAnimal() throws Exception {

        AnimalRecord animal = new AnimalRecord.Builder()
                .id(Long.parseLong("DSFDSF232"))
                .arrivalDate("14/04/2016")
                .leavingDate("14/04/2017")
                .build();


        animalRec = new  AnimalRecordServiceImpl();
        animalRec.addAnimal(App.getAppContext());
        animalRec.saveAnimal(animal);
        System.out.print("AnimalSaved!!");
    }
}
