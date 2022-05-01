package testrunner;

import org.testng.annotations.Test;
import page.CreateOrder;
import page.Login;
import setup.Setup;

public class OrderCreationTestRunner extends Setup {
    CreateOrder createOrder;
    Login login;

    @Test
    public void orderCreation() throws InterruptedException {
        login = new Login(driver);
        login.doLogin();
        createOrder = new CreateOrder(driver);
        createOrder.createOrder();
    }
}
