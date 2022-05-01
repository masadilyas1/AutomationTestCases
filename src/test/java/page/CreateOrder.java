package page;

import org.checkerframework.checker.signature.qual.FieldDescriptor;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateOrder {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(id = "groupNode_order_management_1")
    WebElement orderManagementLink;
    @FindBy(id = "itemNode_order_management_order_management_1")
    WebElement orderManagement;
    @FindBy(xpath = "//span[@class='xrf']")
    WebElement createOrder;
    @FindBy(xpath = "//select[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:soc3::content']")
    WebElement businessUnit;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:partyNameId::content")
    WebElement customer;
    @FindBy(xpath = "//input[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:orderType1Id::content']")
    WebElement orderType;
    @FindBy(xpath = "//img[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:itemNumberId2:searchIcoId::icon']")
    WebElement lookingGlass;
    @FindBy(xpath = "//input[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:itemNumberId2:Popup1:0:Advan1:0:efqrp:value00::content']")
    WebElement itemNumber;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:itemNumberId2:Popup1:0:Advan1:0:efqrp::search")
    WebElement itemSearch;
//    @FindBy(xpath = "//span[contains(text(),'100063')]")
    @FindBy(xpath = "//span[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:itemNumberId2:Popup1:0:Advan1:0:rstab:_ATp:table1:0:effcpDescription::content']")
    WebElement baconSelect;
//    @FindBy(xpath = "//span[contains(text(),'102084')]")
    @FindBy(xpath = "//span[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:itemNumberId2:Popup1:0:Advan1:0:rstab:_ATp:table1:1:effcpDescription::content']")
    WebElement chickenSelect;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:itemNumberId2:cb1")
    WebElement clickOk;
    @FindBy(xpath = "//span[contains(text(),'Add')]")
    WebElement addingItem;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:sdi2::icon")
    WebElement shippingDetails;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:r5:0:soc1::content")
    WebElement requestType;
    @FindBy(xpath = "//input[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:r5:0:id1::content']")
    WebElement requestDate;
    @FindBy(xpath = "//input[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:r5:0:shipMethodId::content']")
    WebElement shippingMethod;
    @FindBy(xpath = "//span[@class='xrf'][contains(text(),'Save')]")
    WebElement save;
//    @FindBy(xpath = "//a[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:r5:0:id1::glyph']")
//    WebElement datePicker;
//    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:r5:0:id1::pop::dlg::cd::hs::content")
//    WebElement hour;
//    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:r5:0:id1::pop::dlg::cd::ms::content")
//    WebElement minute;
//    @FindBy(xpath = "//label[contains(text(),'AM')]")
//    WebElement amOrPm;

    public CreateOrder(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void createOrder() throws InterruptedException {
        Actions keyPress = new Actions(driver);
        Thread.sleep(5000);
//        wait.until(ExpectedConditions.elementToBeClickable(orderManagementLink));
        orderManagementLink.click();
        Thread.sleep(1000);
        orderManagement.click();
        Thread.sleep(30000);
        createOrder.click();
        Thread.sleep(30000);
        businessUnit.click();
        Thread.sleep(3000);
        //businessUnit.sendKeys(Keys.ARROW_DOWN);
        Select select = new Select(driver.findElement(By.xpath( "//select[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:soc3::content']")));
        select.selectByVisibleText("CFA Supply");
//        keyPress.sendKeys(businessUnit,Keys.ARROW_DOWN).perform();
//        Thread.sleep(2000);
//        keyPress.sendKeys(businessUnit,Keys.ARROW_DOWN).perform();
//        Thread.sleep(2000);
//        keyPress.sendKeys(businessUnit,Keys.ENTER).perform();
        Thread.sleep(3000);
        customer.click();
        Thread.sleep(7000);
        customer.sendKeys("Chapel Hill FSU");
        Thread.sleep(7000);
        orderType.click();
        Thread.sleep(7000);
        orderType.sendKeys("Hot Route Order");
        Thread.sleep(5000);
//        keyPress.sendKeys(orderType,Keys.ARROW_DOWN).perform();
//        orderType.sendKeys(Keys.ARROW_DOWN);
//        Thread.sleep(2000);
//        orderType.sendKeys(Keys.ARROW_DOWN);
//        keyPress.sendKeys(orderType,Keys.ARROW_DOWN).perform();
//        Thread.sleep(2000);
//        orderType.sendKeys(Keys.ENTER);
//        keyPress.sendKeys(orderType,Keys.ENTER).perform();
//        Thread.sleep(2000);

        lookingGlass.click();
        Thread.sleep(5000);
        itemNumber.sendKeys("100063");
        Thread.sleep(1000);
        itemSearch.click();
        Thread.sleep(5000);
        baconSelect.click();
        Thread.sleep(3000);
        clickOk.click();
        Thread.sleep(7000);
        addingItem.click();
        Thread.sleep(5000);

        lookingGlass.click();
        Thread.sleep(5000);
        itemNumber.sendKeys("102084");
        Thread.sleep(1000);
        itemSearch.click();
        Thread.sleep(5000);
        chickenSelect.click();
        Thread.sleep(3000);
        clickOk.click();
        Thread.sleep(7000);
        addingItem.click();
        Thread.sleep(5000);

        shippingDetails.click();
        requestType.click();
        keyPress.sendKeys(requestType,Keys.ARROW_UP).perform();
        Thread.sleep(1000);
        keyPress.sendKeys(requestType,Keys.ENTER).perform();
        Thread.sleep(3000);
        requestDate.clear();
        Thread.sleep(1000);
        requestDate.sendKeys("4/30/22 11:00 AM");
        Thread.sleep(1000);
        shippingMethod.click();
        Thread.sleep(3000);
        save.click();
        Thread.sleep(10000);
    }
}
