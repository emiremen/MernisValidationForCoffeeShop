package Adapters;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import Mernis.KPSPublicLocator;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class MernisServiceAdapter implements ICustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) throws ServiceException, RemoteException {
        KPSPublicLocator client = new KPSPublicLocator();
        long tc = Long.parseLong(customer.nationalityId);
        return client.getKPSPublicSoap().TCKimlikNoDogrula(tc, customer.name, customer.surname, customer.yearOfBirth);
    }
}
