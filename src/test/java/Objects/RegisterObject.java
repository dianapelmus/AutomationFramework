package Objects;

import java.util.HashMap;

public class RegisterObject {
    private String FirstName;
    private String LastName;
    private String Address;
    private String EmailAddress;
    private String Phone;
    private String Year;
    private String Month;
    private String Day;
    private String LanguagesOptions;
    private String Country;
    private String Skills;
    private String NewPassword;
    private String ConfirmPassword;

    public RegisterObject (HashMap<String,String> testData){
        prepareData(testData);
    }

    public void prepareData(HashMap<String ,String> testData){
        for (String Key : testData.keySet()){
            switch (Key){
                case "FirstName":
                    setFirstName(testData.get(Key));
                    break;
                case "LastName":
                    setLastName(testData.get(Key));
                    break;
                case "Address":
                    setAddress(testData.get(Key));
                    break;
                case "EmailAddress":
                    setEmailAddress(testData.get(Key));
                    break;
                case "Phone":
                    setPhone(testData.get(Key));
                    break;
                case "Year":
                    setYear(testData.get(Key));
                    break;
                case "Month":
                    setMonth(testData.get(Key));
                    break;
                case "Day":
                    setDay(testData.get(Key));
                    break;
                case "LanguagesOptions":
                    setLanguagesOptions(testData.get(Key));
                    break;
                case "Country":
                    setCountry(testData.get(Key));
                    break;
                case "Skills":
                    setSkills(testData.get(Key));
                    break;
                case "NewPassword":
                    setNewPassword(testData.get(Key));
                    break;
                case "ConfirmPassword":
                    setConfirmPassword(testData.get(Key));
                    break;
            }
        }
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String email) {
        EmailAddress = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String month) {
        Month = month;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        Day = day;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getSkills() {
        return Skills;
    }

    public void setSkills(String skills) {
        Skills = skills;
    }

    public String getNewPassword() {
        return NewPassword;
    }

    public void setNewPassword(String password) {
        NewPassword = password;
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        ConfirmPassword = confirmPassword;
    }

    public String getLanguagesOptions() {
        return LanguagesOptions;
    }

    public void setLanguagesOptions(String languagesOptions) {
        LanguagesOptions = languagesOptions;
    }
}
