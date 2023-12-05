package clarusway.Mentoring;

import clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class F01_Task03Ver1 extends TestBase {
     /*
~ Navigate to http://tutorialsninja.com/demo/index.php?route=common/home
~ click on Phones & PDAs
~ get the brandName of phones
~ click on add to button for all elements
~ click on black total added cart button
~ get the names of list from the cart
~ compare the names from displaying list and cart list
 */
    @Test
    public void test01 () throws Exception {
//        ~ Navigate to http://tutorialsninja.com/demo/index.php?route=common/home
        driver.navigate().to("http://tutorialsninja.com/demo/index.php?route=common/home");
//        ~ click on Phones & PDAs
        WebElement phones= driver.findElement(By.xpath("//a[.='Phones & PDAs']"));
        phones.click();
//        ~ get the brandName of phones
         brandName();
//        ~ click on add to button for all elements
        clickAllElements();
//        ~ click on black total added cart button
        WebElement cart= driver.findElement(By.xpath("//div[@id='cart']"));
        cart.click();
//        ~ get the names of list from the cart
        getNameOfCart();
//        ~ compare the names from displaying list and cart list
      compareList();


    }

    private void compareList() {
        Assert.assertTrue(brandName().containsAll(getNameOfCart()));

    }

    private List<String> getNameOfCart() {
        List<WebElement> cartList=driver.findElements(By.xpath("//td[@class='text-left']"));
        List<String> cartNameList=new ArrayList<>();
        for(int i=0; i<cartList.size(); i++) {
            cartNameList.add(cartList.get(i).getText());
        }
        return cartNameList;
    }

    public void clickAllElements() throws InterruptedException {
        List<WebElement> addToCart=driver.findElements(By.xpath("//button[@type='button']"));
        for (int i =9; i <=15 ; i+=3) {
            addToCart.get(i).click();
            Thread.sleep(2000);
        }



    }

    public List<String> brandName() {
        String urun1=driver.findElement(By.xpath("(//div[@id='content']//h4)[1]")).getText();
        String urun2=driver.findElement(By.xpath("(//div[@id='content']//h4)[2]")).getText();
        String urun3=driver.findElement(By.xpath("(//div[@id='content']//h4)[3]")).getText();

        List<String> list = new ArrayList<>();
        list.add(urun1);
        list.add(urun2);
        list.add(urun3);



        return list;
    }

}
