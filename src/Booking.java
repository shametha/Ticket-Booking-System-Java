import java.awt.print.Book;
import java.util.*;
public class Booking {
   public int BookingId;
    private ArrayList<Integer> seatAlloted;
    public String ScreenTime;
    private int RawCost;
    private String Discount;
    private int NetCost;
    private String status;

    static int calculateRawCost(int noOfSeats,int SeatClass){
        if(SeatClass ==0)
            return 120*noOfSeats;
        else
            return 100*noOfSeats;
    }

    static int calculateDiscount(int RawCost, String Disc){
        if(Disc.charAt(1)=='0')
            return 0;
        else if(Disc.charAt(1)=='1')
            return (int)(RawCost*0.1);
        else if(Disc.charAt(1)=='2')
            return (int)(RawCost * 0.2);
        else
            return (int)(RawCost * 0.3);
    }

    boolean bookSeat(int BookId, int noOfSeats, String ScreenTime1, String Disc,int SeatClass,Screen screenId){
        seatAlloted = screenId.checkAvailability(ScreenTime1,SeatClass,noOfSeats);
        if(seatAlloted.size()!=0){
            BookingId =  BookId;
            ScreenTime = ScreenTime1;
            Discount = Disc;
            RawCost = calculateRawCost(noOfSeats,SeatClass);
            NetCost = RawCost-calculateDiscount(RawCost,Disc);

            status = "Seats Booked";
            screenId.bookScreenSeats(ScreenTime1,SeatClass,noOfSeats);
            screenId.updateCollection(NetCost);
            return true;
        }
        else{
            seatAlloted = new ArrayList<>();
            return false;
        }
    }
    void cancelBooking(Screen screenId){
        screenId.updateCollection((-1*NetCost));
        status = "Cancelled";
        System.out.println("Booking Id: "+BookingId);
        System.out.println("Ticket Cost:"+NetCost);
        System.out.println("Cancellation charge"+(NetCost*0.1));
        System.out.println("Refund Amount: "+(NetCost-(NetCost*0.1)));
        screenId.updateCollection((int)(NetCost*0.1));
        NetCost=0;
        screenId.updateSeats(seatAlloted);
        seatAlloted= new ArrayList<>();
    }

    void printBookingDetails(){
        System.out.println("Booking Id: "+BookingId);
        System.out.println("Time : "+ScreenTime.substring(7,ScreenTime.length()));
        if(status.equals("Seats Booked")) {
            System.out.print("Seats Alloted:");
            for(int i:seatAlloted)
                System.out.print(i+" ");
            System.out.println("\nScreen : "+ScreenTime.substring(0,7));
            System.out.println("Raw Cost : " + RawCost);
            System.out.println("Discount : " + (RawCost - NetCost));
            System.out.println("Net cost : " + NetCost);
        }
        else{
            System.out.println("Ticket Cancelled");
        }

    }
}
