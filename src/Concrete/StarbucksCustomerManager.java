package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class StarbucksCustomerManager extends BaseCustomerManager {

    ICustomerCheckService _customerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService){
        _customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) throws ServiceException, RemoteException {
        if (_customerCheckService.CheckIfRealPerson(customer)) {
            super.save(customer);
        }
        else {
            System.out.println("Not a valid person");
        }
    }
}
