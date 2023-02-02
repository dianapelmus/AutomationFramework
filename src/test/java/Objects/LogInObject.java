package Objects;

import java.util.HashMap;

public class LogInObject {
    private String SignInTitle;
    private String Email;
    private String Password;
    private String Message;

    public LogInObject (HashMap<String,String> testData){
        prepareData(testData);
    }

    public void prepareData(HashMap<String ,String> testData){
        for (String Key : testData.keySet()){
            switch (Key){
                case "SignInTitle":
                    setSignInTitle(testData.get(Key));
                    break;
                case "Email":
                    setEmail(testData.get(Key));
                    break;
                case "Password":
                    setPassword(testData.get(Key));
                    break;
                case "Message":
                    setMessage(testData.get(Key));
                    break;
            }
        }
    }

    public String getSignInTitle() {
        return SignInTitle;
    }

    public void setSignInTitle(String signInTitle) {
        SignInTitle = signInTitle;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
