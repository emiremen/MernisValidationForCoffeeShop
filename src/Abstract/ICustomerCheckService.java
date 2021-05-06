package Abstract;

import Entities.Customer;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public interface ICustomerCheckService {
    boolean CheckIfRealPerson(Customer customer) throws ServiceException, RemoteException;
}
