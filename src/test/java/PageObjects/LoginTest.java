package PageObjects;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class LoginTest {

   @Test
    public void testAdd(){
       String str = "TestNG is working fine";
       Assert.assertEquals("TestNG is working fine", str);
   }

}
