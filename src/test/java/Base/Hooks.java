package Base;

import PropertiesFile.PropertiesUtility;
import org.junit.Before;

import java.util.HashMap;

public class Hooks extends BaseTest {
    public HashMap<String,String> testData;
    @Before
    public void prepareEnvironment(){
        String className = this.getClass().getSimpleName();
        PropertiesUtility propertiesUtility = new PropertiesUtility(className);
        testData = propertiesUtility.getAllKeyValues();

    }
}
