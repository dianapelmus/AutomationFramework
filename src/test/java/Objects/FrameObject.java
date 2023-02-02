package Objects;

import java.util.HashMap;

public class FrameObject {
    private String SingleFrame;
    private String MultipleFrame;

    public void prepareData(HashMap<String ,String> testData){
        for (String Key : testData.keySet()){
            switch (Key){
                case "SingleFrame":
                    setSingleFrame(testData.get(Key));
                    break;
                case "MultipleFrame":
                    setMultipleFrame(testData.get(Key));
                    break;
            }
        }
    }
    public FrameObject (HashMap<String,String> testData){
        prepareData(testData);
    }

    public String getSingleFrame() {
        return SingleFrame;
    }

    public void setSingleFrame(String singleFrame) {
        SingleFrame = singleFrame;
    }

    public String getMultipleFrame() {
        return MultipleFrame;
    }

    public void setMultipleFrame(String multipleFrame) {
        MultipleFrame = multipleFrame;
    }
}
