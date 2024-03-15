import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalTestRunner extends  Setup {
    @Test(priority = 1,description = "Verify successful mathematical operation")
    public void doSeries(){
        CalScreen calScreen = new CalScreen(driver);
        int actualResult = Integer.parseInt(calScreen.calculateSeries("100/10*5-10+60"));
        int expectedResult = 100;
        Assert.assertEquals(actualResult,expectedResult);

    }
}
