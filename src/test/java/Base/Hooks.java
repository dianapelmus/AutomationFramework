package Base;

import PropertiesFile.PropertiesUtility;
import org.junit.After;
import org.junit.Before;

import java.util.HashMap;

public class Hooks extends BaseTest {
    public HashMap<String,String> testData;
    @Before
    public void prepareEnvironment(){
        setUp();
        String className = this.getClass().getSimpleName();
        PropertiesUtility propertiesUtility = new PropertiesUtility(className);
        testData = propertiesUtility.getAllKeyValues();
    }
    @After
    public void clearEnvironment (){
        driver.quit();
    }
}
