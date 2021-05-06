package Abstract;

import Entities.Customer;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public interface ICustomerService {
    void save(Customer customer) throws ServiceException, RemoteException;
}
