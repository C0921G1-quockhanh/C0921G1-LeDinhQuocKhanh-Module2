package FuramaResort.utils;

import FuramaResort.models.Booking;

import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {
    @Override
    public int compare(Booking b1,Booking b2) {
        String[] startB1 = b1.getStartDay().split("/");
        int startDayB1 = Integer.parseInt(startB1[0]);
        int startMonthB1 = Integer.parseInt(startB1[1]);
        int startYearB1 = Integer.parseInt(startB1[2]);

        String[] startB2 = b2.getStartDay().split("/");
        int startDayB2 = Integer.parseInt(startB2[0]);
        int startMonthB2 = Integer.parseInt(startB2[1]);
        int startYearB2 = Integer.parseInt(startB2[2]);

        String[] endB1 = b1.getEndDay().split("/");
        int endDayB1 = Integer.parseInt(endB1[0]);
        int endMonthB1 = Integer.parseInt(endB1[1]);
        int endYearB1 = Integer.parseInt(endB1[2]);

        String[] endB2 = b2.getEndDay().split("/");
        int endDayB2 = Integer.parseInt(endB2[0]);
        int endMonthB2 = Integer.parseInt(endB2[1]);
        int endYearB2 = Integer.parseInt(endB2[2]);

        if (startYearB1 > startYearB2)
            return 1;
        else if (startYearB1 < startYearB2)
            return -1;

        if (startMonthB1 > startMonthB2)
            return 1;
        else if (startMonthB1 < startMonthB2)
            return -1;

        if (startDayB1 > startDayB2)
            return 1;
        else if (startDayB1 < startDayB2)
            return -1;

        if (endYearB1 > endDayB2)
            return 1;
        else if (endYearB1 < endYearB2)
            return -1;

        if (endMonthB1 > endMonthB2)
            return 1;
        else if (endMonthB1 < endMonthB2)
            return -1;

        if (endDayB1 > endDayB2)
            return 1;
        else if (endDayB1 < endDayB2)
            return -1;
        return 0;
    }
}
