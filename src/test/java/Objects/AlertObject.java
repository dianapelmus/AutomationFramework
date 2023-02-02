package Objects;

import java.util.HashMap;

public class AlertObject {
    private String AlertValue;

    public AlertObject (HashMap<String,String> testData){
        prepareData(testData);
    }

    public void prepareData(HashMap<String ,String> testData){
        for (String Key : testData.keySet()){
            switch (Key){
                case "AlertValue":
                    setAlertValue(testData.get(Key));
                    break;
            }
        }
    }
    public String getAlertValue() {
        return AlertValue;
    }
    public void setAlertValue(String alertValue) {
        AlertValue = alertValue;
    }
}
