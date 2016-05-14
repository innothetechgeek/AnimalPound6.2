package www.cput.za.animalpound.services.customer;

import android.test.AndroidTestCase;

import www.cput.za.animalpound.conf.App;
import www.cput.za.animalpound.domain.Address;
import www.cput.za.animalpound.services.customer.Impl.AddressServiceImpl;

/**
 * Created by Game330 on 2016-05-14.
 */
public class AdressServicesTest extends AndroidTestCase {

    private AddressServiceImpl addressService;

    public void testSaveAddress() throws Exception {

        Address address = new Address.Builder()
                .room("287")
                .street("Watergang")
                .surbub("Stellenbosch")
                .zipCode("7600")
                .build();
        addressService = new AddressServiceImpl();
        addressService.addAddress(App.getAppContext(), address);
        addressService.postAddress(address);
        System.out.print("Address Saved!!");
    }
}
