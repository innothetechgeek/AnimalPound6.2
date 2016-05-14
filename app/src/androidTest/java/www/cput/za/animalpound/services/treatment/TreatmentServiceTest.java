package www.cput.za.animalpound.services.treatment;

import android.test.AndroidTestCase;

import www.cput.za.animalpound.conf.App;
import www.cput.za.animalpound.domain.Treatment;
import www.cput.za.animalpound.services.treatment.Impl.TreatmentServiceImpl;

/**
 * Created by Game330 on 2016-05-14.
 */
public class TreatmentServiceTest extends AndroidTestCase {

    private TreatmentServiceImpl treatmentService;

    public void testSaveTreatment() throws Exception {

        Treatment treatment = new Treatment.Builder()
                .treatmentNO(Long.parseLong("324"))
                .Instructions("Twice a day")
                .ExpiryDate("23/05/17")
                .build();
        treatmentService = new TreatmentServiceImpl();
        treatmentService.addTreatment(App.getAppContext());
        treatmentService.saveTreatment(treatment);
        System.out.print("TreatmentSaved!!");
    }
}
