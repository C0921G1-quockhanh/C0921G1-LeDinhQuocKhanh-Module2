package final_exam.services;

import final_exam.models.Phone;

public interface PhoneServices {
    public void addPhone(String phoneType);
    public Phone deletePhone(int phoneID);
    public void searchPhone(int phoneID);
    public void displayPhoneList();
}
