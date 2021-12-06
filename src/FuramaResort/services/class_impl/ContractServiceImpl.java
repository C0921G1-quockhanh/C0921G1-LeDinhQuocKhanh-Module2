package FuramaResort.services.class_impl;

import FuramaResort.models.Booking;
import FuramaResort.models.Contract;
import FuramaResort.services.interfaces.ContractService;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class ContractServiceImpl implements ContractService {
    Scanner sc = new Scanner(System.in);

    Queue<Contract> contractQueue;

    BookingServiceImpl bookingService = new BookingServiceImpl();
    Queue<Booking> bookingQueue = bookingService.changeSetToQueue();

    public static Queue<Contract> dataContract = new ArrayDeque<>();

    static {
        Contract contract1 = new Contract("CO-0001","BO-000",3000000,7000000,"C000");

        dataContract.add(contract1);
    }

    public ContractServiceImpl() {
        try {
            final String path = "E:\\C0921G1-LeDinhQuocKhanh-Module2\\src\\FuramaResort\\data\\contract.csv";
            File file = new File(path);

            if (!file.exists())
                contractQueue = dataContract;
            else {
                contractQueue = new ArrayDeque<>();
                readCSVToContract();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public BookingServiceImpl getBookingService() {
        return bookingService;
    }

    public void writeContractToCSV() {
        try {
            final String path = "E:\\C0921G1-LeDinhQuocKhanh-Module2\\src\\FuramaResort\\data\\contract.csv";
            FileWriter csvWriter = new FileWriter(path);

            for (Contract contract: contractQueue) {
                csvWriter.append(contract.getContractID());
                csvWriter.append(",");
                csvWriter.append(contract.getBookingCode());
                csvWriter.append(",");
                csvWriter.append("" + contract.getDeposit());
                csvWriter.append(",");
                csvWriter.append("" + contract.getTotalPayment());
                csvWriter.append(",");
                csvWriter.append(contract.getCustomerCode());
                csvWriter.append("\n");
            }

            csvWriter.flush();
            csvWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readCSVToContract() {
        try {
            final String path = "E:\\C0921G1-LeDinhQuocKhanh-Module2\\src\\FuramaResort\\data\\contract.csv";

            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = br.readLine();

            while (line != null) {
                String[] data = line.split(",");
                Contract contract = new Contract(data[0],data[1],Double.parseDouble(data[2]),Double.parseDouble(data[3]),data[4]);
                contractQueue.add(contract);

                line = br.readLine();
            }
            br.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void displayList() {
        System.out.printf("|%-15s|%-15s|%-15s|%-15s|%-15s|%n","Contract ID","Booking Code","Deposit","Total Payment","Customer Code");

        for (Contract contract: contractQueue) {
            System.out.printf("|%-15s|%-15s|%-15.0f|%-15.0f|%-15s|%n",contract.getContractID(),contract.getBookingCode(),
                    contract.getDeposit(),contract.getTotalPayment(),contract.getCustomerCode());
        }
    }

    @Override
    public void addNew() {
        if (bookingQueue.isEmpty())
            System.out.println("No booking to create contract!");
        else {
            System.out.println("Enter the contract ID: ");
            String contractID = sc.nextLine();

            System.out.println("Enter the booking code: ");
            String bookingCode = sc.nextLine();
            String firstBookingCode = bookingQueue.peek().getBookingCode();;

            while (!bookingCode.equals(firstBookingCode)) {
                System.out.println("Please check the booking code! Enter again: ");
                bookingCode = sc.nextLine();
            }

            System.out.println("Enter the deposit: ");
            double deposit = Double.parseDouble(sc.nextLine());

            System.out.println("Enter the total payment: ");
            double totalPayment = Double.parseDouble(sc.nextLine());

            System.out.println("Enter the customer code: ");
            String customerCode = sc.nextLine();

            Contract contract = new Contract(contractID,bookingCode,deposit,totalPayment,customerCode);
            contractQueue.add(contract);
            bookingQueue.remove();
        }
    }

    @Override
    public void edit(String nonUse) {
    }

    public void displayBookingQueue() {
        for (Booking booking: bookingQueue) {
            System.out.println(booking);
        }
    }
}
