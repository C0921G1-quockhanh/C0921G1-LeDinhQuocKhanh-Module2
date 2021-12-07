package final_exam.services;

import final_exam.models.AuthenticPhone;
import final_exam.models.HandPhone;
import final_exam.models.Phone;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneManager implements PhoneServices {
    Scanner sc = new Scanner(System.in);

    ValidData validData = new ValidData();

    List<Phone> phones;

    public static List<Phone> dataPhone = new ArrayList<>();

    static {
        Phone phone1 = new AuthenticPhone(1,"Nokia-001",5000000,2,"Nokia",100,"National");
        Phone phone2 = new HandPhone(2,"Apple-13",25000000,5,"Apple","USA","Repaired");

        dataPhone.add(phone1);
        dataPhone.add(phone2);
    }

    public PhoneManager() {
        try {
            final String authenticPath = "E:\\C0921G1-LeDinhQuocKhanh-Module2\\src\\final_exam\\data\\authentic_mobiles.csv";
            final String handPath = "E:\\C0921G1-LeDinhQuocKhanh-Module2\\src\\final_exam\\data\\hand_mobiles.csv";

            File authenticFile = new File(authenticPath);
            File handFile = new File(handPath);

            if (!authenticFile.exists() || !handFile.exists())
                phones = dataPhone;
            else {
                phones = new ArrayList<>();
                readCSVToAuthenticPhone();
                readCSVToHandPhone();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeAuthenticPhoneToCSV() {
        try {
            final String path = "E:\\C0921G1-LeDinhQuocKhanh-Module2\\src\\final_exam\\data\\authentic_mobiles.csv";
            FileWriter csvWriter = new FileWriter(path);

            for (Phone phone: phones) {
                if (phone instanceof AuthenticPhone) {
                    csvWriter.append("" + phone.getPhoneID());
                    csvWriter.append(",");
                    csvWriter.append(phone.getPhoneName());
                    csvWriter.append(",");
                    csvWriter.append("" + phone.getPrice());
                    csvWriter.append(",");
                    csvWriter.append("" + phone.getQuantity());
                    csvWriter.append(",");
                    csvWriter.append(phone.getManufacturer());
                    csvWriter.append(",");
                    csvWriter.append("" + ((AuthenticPhone) phone).getWarrantyPeriod());
                    csvWriter.append(",");
                    csvWriter.append(((AuthenticPhone) phone).getWarrantyZone());
                    csvWriter.append("\n");
                }
            }

            csvWriter.flush();
            csvWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readCSVToAuthenticPhone() {
        try {
            final String path = "E:\\C0921G1-LeDinhQuocKhanh-Module2\\src\\final_exam\\data\\authentic_mobiles.csv";

            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = br.readLine();

            while (line != null) {
                String[] data = line.split(",");
                Phone authenticPhone = new AuthenticPhone(Integer.parseInt(data[0]),data[1],Double.parseDouble(data[2]),
                        Integer.parseInt(data[3]),data[4],Integer.parseInt(data[5]),data[6]);
                phones.add(authenticPhone);

                line = br.readLine();
            }
            br.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeHandPhoneToCSV() {
        try {
            final String path = "E:\\C0921G1-LeDinhQuocKhanh-Module2\\src\\final_exam\\data\\hand_mobiles.csv";
            FileWriter csvWriter = new FileWriter(path);

            for (Phone phone: phones) {
                if (phone instanceof HandPhone) {
                    csvWriter.append("" + phone.getPhoneID());
                    csvWriter.append(",");
                    csvWriter.append(phone.getPhoneName());
                    csvWriter.append(",");
                    csvWriter.append("" + phone.getPrice());
                    csvWriter.append(",");
                    csvWriter.append("" + phone.getQuantity());
                    csvWriter.append(",");
                    csvWriter.append(phone.getManufacturer());
                    csvWriter.append(",");
                    csvWriter.append(((HandPhone) phone).getCountry());
                    csvWriter.append(",");
                    csvWriter.append(((HandPhone) phone).getRepairStatus());
                    csvWriter.append("\n");
                }
            }

            csvWriter.flush();
            csvWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readCSVToHandPhone() {
        try {
            final String path = "E:\\C0921G1-LeDinhQuocKhanh-Module2\\src\\final_exam\\data\\hand_mobiles.csv";

            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = br.readLine();

            while (line != null) {
                String[] data = line.split(",");
                Phone handPhone = new HandPhone(Integer.parseInt(data[0]),data[1],Double.parseDouble(data[2]),Integer.parseInt(data[3]),
                        data[4],data[5],data[6]);
                phones.add(handPhone);

                line = br.readLine();
            }
            br.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addPhone(String phoneType) {
        int phoneID = phones.size() + 1;

        System.out.println("Enter the phone name: ");
        String phoneName = sc.nextLine();

        System.out.println("Enter the phone price: ");
        double price = Double.parseDouble(sc.nextLine());
        price = validData.validPrice(price);

        System.out.println("Enter the quantity: ");
        int quantity = Integer.parseInt(sc.nextLine());
        quantity = validData.validQuantity(quantity);

        System.out.println("Enter the manufacturer: ");
        String manufacturer = sc.nextLine();

        switch (phoneType) {
            case "AuthenticPhone":
                System.out.println("Enter the warranty period: ");
                int warrantyPeriod = Integer.parseInt(sc.nextLine());
                warrantyPeriod = validData.validWarrantyPeriod(warrantyPeriod);

                System.out.println("Enter the warranty zone: ");
                String warrantyZone = sc.nextLine();
                warrantyZone = validData.validWarrantyZone(warrantyZone);

                Phone authenticPhone = new AuthenticPhone(phoneID,phoneName,price,quantity,manufacturer,warrantyPeriod,warrantyZone);
                phones.add(authenticPhone);
                break;

            case "HandPhone":
                System.out.println("Enter the country: ");
                String country = sc.nextLine();
                country = validData.validCountry(country);

                System.out.println("Enter the repair status: ");
                String repairStatus = sc.nextLine();
                repairStatus = validData.validRepairStatus(repairStatus);

                Phone handPhone = new HandPhone(phoneID,phoneName,price,quantity,manufacturer,country,repairStatus);
                phones.add(handPhone);
                break;

            default:
                System.out.println("Please check the phone type!");
        }
    }

    @Override
    public Phone deletePhone(int phoneID) {
        boolean checkPhone = false;
        int index = 0;

        for (int i = 0; i < phones.size(); i++) {
            Phone phone = phones.get(i);
            int ID = phone.getPhoneID();

            if (phoneID == ID) {
                checkPhone = true;
                index = i;
                break;
            }
        }

        if (checkPhone)
            return phones.remove(index);
        else
            return null;
    }

    @Override
    public void searchPhone(int phoneID) {
        Phone phone = get(phoneID);

        while (phone == null) {
            System.out.println("Please check the phone ID! Enter again: ");
            phoneID = Integer.parseInt(sc.nextLine());
            phone = get(phoneID);
        }

        System.out.println(phone);
    }

    @Override
    public void displayPhoneList() {
        for (Phone phone: phones) {
            System.out.println(phone);
        }
    }

    public Phone get(int phoneID) {
        boolean checkPhone = false;
        int index = 0;

        for (int i = 0; i < phones.size(); i++) {
            Phone phone = phones.get(i);
            int ID = phone.getPhoneID();

            if (phoneID == ID) {
                checkPhone = true;
                index = i;
                break;
            }
        }

        if (checkPhone)
            return phones.get(index);
        else
            return null;
    }
}
