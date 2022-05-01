package testrunner;

import org.testng.annotations.Test;
import page.Login;
import setup.Setup;

public class LoginTestRunner extends Setup {
    Login login;

    @Test
    public void Login() throws InterruptedException {
        login = new Login(driver);
        login.doLogin();
    }
}
