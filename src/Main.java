import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import org.apache.log4j.BasicConfigurator;

public class Main {

    public static void main(String[] args) throws Exception {
        BasicConfigurator.configure();
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.save(new Customer(1,"Ahmet","Yılmaz", 1994,"36589652451"));
    }
}
