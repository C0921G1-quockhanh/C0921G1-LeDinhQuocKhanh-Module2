package FuramaResort.services.class_impl;

import FuramaResort.models.Booking;
import FuramaResort.models.Facility;
import FuramaResort.services.interfaces.BookingService;
import FuramaResort.utils.BookingComparator;

import java.io.*;
import java.util.*;

public class BookingServiceImpl implements BookingService {
    Scanner sc = new Scanner(System.in);

    Set<Booking> bookings;

    FacilityServiceImpl facilityService = new FacilityServiceImpl();

    public static Set<Booking> dataBooking = new TreeSet<>(new BookingComparator());

    static {
        Booking booking1 = new Booking("BO-001","05/12/2021","12/12/2021",
                "C004","SVVL-0002","Villa");
        Booking booking2 = new Booking("BO-002","25/12/2021","25/01/2022",
                "C002","SVHO-0001","House");
        Booking booking3 = new Booking("BO-003","20/11/2021","20/12/2021",
                "C001","SVRO-0002","Room");
        Booking booking4 = new Booking("BO-004","20/12/2021","25/12/2021",
                "C003","SVVL-0003","Villa");

        dataBooking.add(booking1);
        dataBooking.add(booking2);
        dataBooking.add(booking3);
        dataBooking.add(booking4);
    }

    public BookingServiceImpl() {
        try {
            final String path = "E:\\C0921G1-LeDinhQuocKhanh-Module2\\src\\FuramaResort\\data\\booking.csv";
            File file = new File(path);

            if (!file.exists())
                bookings = dataBooking;
            else {
                bookings = new TreeSet<>(new BookingComparator());
                readCSVToBooking();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public FacilityServiceImpl getFacilityService() {
        return facilityService;
    }

    public void writeBookingToCSV() {
        try {
            final String path = "E:\\C0921G1-LeDinhQuocKhanh-Module2\\src\\FuramaResort\\data\\booking.csv";
            FileWriter csvWriter = new FileWriter(path);

            for (Booking booking: bookings) {
                csvWriter.append(booking.getBookingCode());
                csvWriter.append(",");
                csvWriter.append(booking.getStartDay());
                csvWriter.append(",");
                csvWriter.append(booking.getEndDay());
                csvWriter.append(",");
                csvWriter.append(booking.getCustomerCode());
                csvWriter.append(",");
                csvWriter.append(booking.getNameService());
                csvWriter.append(",");
                csvWriter.append(booking.getTypeOfService());
                csvWriter.append("\n");
            }

            csvWriter.flush();
            csvWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readCSVToBooking() {
        try {
            final String path = "E:\\C0921G1-LeDinhQuocKhanh-Module2\\src\\FuramaResort\\data\\booking.csv";

            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = br.readLine();

            while (line != null) {
                String[] data = line.split(",");
                Booking booking = new Booking(data[0],data[1],data[2],data[3],data[4],data[5]);
                bookings.add(booking);

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
        System.out.printf("|%-20s|%-15s|%-15s|%-15s|%-15s|%-20s|%n","Booking Code","Start Day","End Day",
                "Customer Code","Name Service","Type of Service");

        for (Booking booking: bookings) {
            System.out.printf("|%-20s|%-15s|%-15s|%-15s|%-15s|%-20s|%n",booking.getBookingCode(),booking.getStartDay(),booking.getEndDay(),
                    booking.getCustomerCode(),booking.getNameService(),booking.getTypeOfService());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Enter the booking code: ");
        String bookingCode = sc.nextLine();

        System.out.println("Enter the start day: ");
        String startDay = sc.nextLine();

        System.out.println("Enter the end day: ");
        String endDay = sc.nextLine();

        System.out.println("Enter the customer code: ");
        String customerCode = sc.nextLine();

        System.out.println("Enter the name service: ");
        String nameService = sc.nextLine();

        System.out.println("Enter the type of service: ");
        String typeOfService = sc.nextLine();

        Booking checkedBooking = new Booking(bookingCode,startDay,endDay,customerCode,nameService,typeOfService);

        boolean nonExist = true;

        for (Booking booking: bookings) {
            if (checkedBooking.hashCode() == booking.hashCode()) {
                nonExist = false;
                break;
            }
        }

        if (nonExist) {
                String[] checkedEndTime = endDay.split("/");
                int checkedEndMonth = Integer.parseInt(checkedEndTime[1]);

                boolean existedNameService = false;
                Booking selectedBooking = null;

                for (Booking booking: bookings) {
                    if (nameService.equals(booking.getNameService())) {
                        existedNameService = true;
                        selectedBooking = booking;
                        break;
                    }
                }

                Facility facility = facilityService.get(nameService);
                Map<Facility,Integer> facilities = facilityService.getFacilities();
                int numOfUse = facilities.get(facility);

                if (existedNameService) {
                    String[] endTime = selectedBooking.getEndDay().split("/");
                    int endMonth = Integer.parseInt(endTime[1]);

                    if (checkedEndMonth == endMonth) {
                        if (numOfUse < 5) {
                            bookings.add(checkedBooking);
                            numOfUse++;
                        } else {
                            System.out.println("This facility is in maintenance! Hope you choose other options!");
                        }
                    } else {
                        bookings.add(checkedBooking);
                        numOfUse = 1;
                    }
                } else {
                    bookings.add(checkedBooking);
                    numOfUse = 1;
                }

                facilities.replace(facility,numOfUse);
        } else
            System.out.println("This booking is existed! Please try again!");
    }

    @Override
    public void edit(String nonUse){
    }

    public Queue<Booking> changeSetToQueue() {
        return new ArrayDeque<>(bookings);
    }
}
