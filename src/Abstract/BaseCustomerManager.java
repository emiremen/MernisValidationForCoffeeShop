package Abstract;

import Entities.Customer;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public abstract class BaseCustomerManager implements ICustomerService{
    @Override
    public void save(Customer customer) throws ServiceException, RemoteException {
        System.out.println("Saved to db: " + customer.name);
    }
}
