package www.cput.za.animalpound.services.customer;

import android.test.AndroidTestCase;

import www.cput.za.animalpound.conf.App;
import www.cput.za.animalpound.domain.Customer;
import www.cput.za.animalpound.repository.customer.Impl.CustomerRepositoryImpl;
import www.cput.za.animalpound.services.customer.Impl.CustomerServiceImpl;

/**
 * Created by Game330 on 2016-05-14.
 */
public class CustomerServiceTest extends AndroidTestCase {
    private CustomerServiceImpl customerService;

    public void testSaveCustomer() throws Exception {

        Customer cust = new Customer.Builder()
                .id(Long.parseLong("#24324"))
                .custName("Innocent")
                .custSurname("Mphokeli")
                .build();
        customerService = new CustomerServiceImpl();
        customerService.addCustomer(App.getAppContext());
        customerService.saveCustomer(cust);
        System.out.print("Address Saved!!");
    }
}
