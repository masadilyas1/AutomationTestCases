package page;

import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(id = "okta-signin-username")
    WebElement userName;
    @FindBy(id = "okta-signin-submit")
    WebElement next;
    @FindBy(id = "input59")
    WebElement password;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement verify;
    @FindBy(id = "ssoBtn")
    WebElement singleSignOn;

    public Login(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void doLogin() throws InterruptedException {
        Thread.sleep(3000);
        userName.sendKeys("Masad.ilyas1");
        next.click();
        password.sendKeys("Adnanisthebest)");
        Thread.sleep(3000);
        verify.click();
        Thread.sleep(3000);
        driver.get("https://ekvo-test.login.us6.oraclecloud.com/oam/server/obrareq.cgi?encquery%3DpynOMvxseWfAcxDQqG2FTXegMCC3BG6yfbi0b%2BcJky90u0pmeIDEGYlBMe82kdlJY9WX7BcEEZNEpi9By8zG3Zr8AcCn1Hd6lBOVHMnhHA2ScCXdaT4S7AeqOGuvvHjy6I3IzAXXl%2BcjijJgz1q5F587V3aUs19JOMDGjRKn8m%2BMabMq%2BxDoZqjKUuq4wfjDcEpRiqC9WJZXJgrKcMoWkO6N7588heylqmNqiZNhE8YlkSWdq0Qn63SON8P9forXgGpuC82b7OkyagMc4smK3%2BGfdwfZYGBOgP42rvuIVYEt5JSlDixde25YKLLVZN2g0bTymS7AGuMkho%2B5Lm4JR5FQ9CRV7eqIY2baX1tLBviVO0qCEuuO2IvaM3LK%2BT3nYF7GPrG8%2BWDTEiOKQAEkpFFR%2FzPPGF9J9%2FJXK8oIzPmd40zXA0i0ZUe8lIWBs7pQ1fbOHCjRV9HB3%2B6L5vJOkBH%2B5hHHf11QBz01F5UAHLEM78AbxntyJ6aLI7c%2Bac89iXCfCRo9ll%2FBOQxJVkvVk3qC7EBhbx6ALpWti6DMVFityG1fhC7rr4TI%2BpTIFu30WTTWsHIRUSibwsU1mhvmJfcftkjzbfcCXhM%2F5w4ACYQiBv2UBFhxhOGLHpTSXkNiSCbTvzbCSDXYWUrmTOUYzYCFKDZocDf6Q4%2FOrOXlQCo8Zs%2FERObhT3NJYfBWnuaOsEGhiDXqodr2cC7GjKET1%2FZzuWCbFCO0bb7ORVqow59Gzb2aIH4HME89HhNf391QuLM6ysx8yYy4v0n%2B1HSxOT9b4LSoAc%2BQi%2F4X3fzpGzvG7vZBh7lXJxv%2F0ffs9uDHClk1eCCxn9WzrIF%2BNqAlQnX%2BUKKvRBQFIe9Yit1sX5yWk99wv5OkkU2Jd5kyhniaaxuTRq9%2FHlUaSXFaKcgIGKJYRpxaWCFH00cTr4KoBc09b3lFAyaNGRW1Fqfx2IqNYnliv%2B4%2F%2F8B8n5Ia%2F%2B6A6XeJw44ew9CuammI1QhkaYKCpCHVpDNEyIerO9dJoYpK%2BBANHz6ALdelvUUABZSkfS4h0M8GtNFjaikx7VZHWz4YkNevUCiM0kb4kCNkgpwBAy9sRhmJ7ZxjSLgDt2nSyAecB4yR0JAuwzivpnhQHbPpi6ysHn0o%2FMdM%2FbrQlObvtEWMQiPGVozE21lOdXLezvkVQ2CvxpSQlrFFEcMamdVjxVRdlJSARqB%2FsywY0EzsIxcdgcbNkYukamfr4Do1S6nqIIPEQWaW6VsK%2FzQTmDF3CNDwjRZmLVMpiM7k99Q%2BwlSoXibtVt1pRVrzuINPyEV3lHj6%2B4TN3ukHLw6cyzgNigWVvmdIHBwTFM%2BufvYczT4WWFzgl3CwjuAnsbHLs8DknpwzynTTLUe%2Brrtc%2BQx7E0F29kogpKJrVGkj6oLw3s0sSE8ewznYUvFBRLWx6NugYacXVeltcd7WGOtnOgFAHEbjGNoPPazvtL%2FQtNw26T7vJNAyanMplpldh11v3cvkfEjwAStclSdb6mS47gAfKMIuonHqHUJyDhLNBWwlUUwP%2FqPuMXMdXXLriHg%2Bgtlg%2Fj3LGZm0hN59%2Fvdu7118RfQHC1hlsEj3ONoTPw8jqzl7LNH67oXGzuz1dtzoHVbWTu0rKoEDQP%2Bk2IBR3WHqSHjf5qd28NWD9S7krGXbJA57wwNVFulkYr6i7Ea%2F3g%3D%3D%20agentid%3DOraFusionApp_11AG%20ver%3D1%20crmethod%3D2%26cksum%3D771773eed91de6593d6e95db1be705cc1bf3ba60&ECID-Context=1.005rNsB3ITcFw0pLoQ8DyY0005sZ0002Ss%3BkXjE");
        Thread.sleep(5000);
        singleSignOn.click();
        Thread.sleep(3000);
    }
}
