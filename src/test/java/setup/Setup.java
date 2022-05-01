package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class Setup {
    public WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver", "/Users/masadilyas/Downloads/Automation-Project1-main/src/test/resources/chromedriver");
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--headed");
        driver = new ChromeDriver(ops);
        //FirefoxOptions ops = new FirefoxOptions();
        //ops.addArguments("--headed");
        //System.setProperty("webdriver.gecko.driver", ".\\src\\test\\resources\\geckodriver.exe");
        //driver = new FirefoxDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://cfahome.okta.com/login/login.htm?fromURI=%2Fapp%2Fchickfila_cfasupplyoracleerptest_1%2Fexkdhsl96qEKI5kdn1t7%2Fsso%2Fsaml%3FSAMLRequest%3DhVJLc9owEP4rHl042bLNK2gwGQpNSwOFCSTT5JJR5TXWIEuOJMfw7ysbMpP2QK%252B7%252B%252B332B3fHgvhvYM2XMmkEwVhxwPJVMrlPuk87u78m87tZGxoIUoyrWwuH%252BCtAmM9h5OGtI0EVVoSRQ03RNICDLGMbKerJYmDkJRaWcWUQBfI0fAE5daWBOO6roO6Gyi9x3EYRvjXarllORTU59JYKhkg705pBi11gjIqjCttLiu%252FcNkKvcr%252F%252BzxkyPfdbuNv1tsd8hbzBPHUX4eb0TDiT6vlevU4q8ubBT%252B%252B%252FBj102d7%252F230sB7y2fMojRnyni4JIbfRwY2pYNEqtK4UxrEf9vxuuAsHpNsncf8FeXMXEpfUtqjGrnF%252BWUZzVUCgDpYGTBWYliVmOWeHjAv66tqmKktxUpoyAaBL67a8RhiOhzQ3YjR4%252B3q%252F6B9SGdkhNkbhJn90vg9pVelPh7meCzUGdCOvjbig9vp4U3GRZe0oAWm5PaHJhzE4vCu%252FERsItecyqMwgOJtgQlVp45X0el2saIEzSMf4k%252BKP9%252FrpGBbzjRKcnf4rKQqifyRV0pTAeMYhRd5UCFXPNFALCbK6AoQnZ9K%252F33jyBw%253D%253D%26RelayState%3Did-8kTJE7Yp5CrFKGU3bMYh9YnDiEl277pUQKCoYbMj%26SigAlg%3Dhttp%253A%252F%252Fwww.w3.org%252F2001%252F04%252Fxmldsig-more%2523rsa-sha256%26Signature%3DTDR9G7c0aL81EDjxViEzF%252BrY0es47F%252FP0G9IIdmPxN3p0Ltk6xNj412O%252FCeQlWxkGlVA8zVWt4hRsQ83GhNLaVSpdNBcMQhz%252BF%252BHXHU8GhjlK2HocJOjSZ6YDtN3sxbqauufw066oMQd%252B3VXGu3TTPGPP2PaQ61fUG3SjEmhoku%252Bvk%252FeLasvk1RXfxLtOTZsQh5Iq6cUOxzXHKj2bNYebWIOirC4AIQAFJJ53PtSErIrTZpzJuzJozL0StH%252BnO1PkeDGzmeb%252FEVdcqfG69N86ln84uca31hnqzJJtoCn8SyfvSQzkNYnVFKR%252FNKpZYurO5ZaVFmXQ%252F45REjzficYkryd1fIXuNyb9nrSLUSD%252BNm%252ByuaLPycRdkcGd%252BQWKtSzrX%252FKTHvoLefkewBpjr1kYz929bCJiSs2ClodpXdzoV7VYNo5a60bRI0DfBTD9XZgHodRccT60oHX6BwFROvhB2YZapRCvuHTe%252FBcoF64PVxoPhmOg4BSDCacicwSWpjH");

    }

//    @AfterTest
//    public void afterTest(){
//        driver.quit();
//    }
}
