
import java.util.*;
public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        char canContinue='y';
        int choice;
        ArrayList<Booking> bookings = new ArrayList<>();
        int BookingCounter =0;
        ArrayList<Screen> screens = new ArrayList<>();
        int ScreenCounter =0;

        screens.add(new Screen("Screen14PM"));
        screens.add(new Screen("Screen18PM"));
        screens.add(new Screen("Screen24PM"));
        screens.add(new Screen("Screen28PM"));
        screens.add(new Screen("Screen34PM"));

        System.out.println("__________________________________________________________");
        System.out.println("Welcome to Zoho Shows!");
        System.out.println("__________________________________________________________");

        while(canContinue == 'y') {
            System.out.println("Choose an option from the menu and indicate your option wth the the corresponding index");
            System.out.println("1.New Booking\n2.Cancel a Booking\n3.Booking Summary\n4.Overall Summary\n5.Show All Bookings");
            choice = sc.nextInt();
            switch(choice){
                case 1:{
                    int screenChoice;
                    System.out.println("Enter Number of seats required: ");
                    int noOfSeats = sc.nextInt();
                    System.out.println("Choose Booking option");
                    int i=1;
                    for(Screen s : screens) {
                        s.showAvailableSeats(i);
                        i+=2;
                    }
                    System.out.println();

                    screenChoice = sc.nextInt();
                    System.out.println("Enter discount coupon if you have any else enter 00: ");
                    sc.nextLine();
                    String disc = sc.nextLine();

                    System.out.println();
                    bookings.add(new Booking());
                    switch(screenChoice){
                        case 1:{
                            int k;
                            for(k=0;k<screens.size();k++){
                                if(screens.get(k).ScreenTimeId.equals("Screen14PM"))
                                    break;
                            }
                            if(bookings.get(BookingCounter).bookSeat(BookingCounter,noOfSeats,"Screen14PM", disc,0,screens.get(k))) {
                                System.out.println("Seats Booked successfully");
                                bookings.get(BookingCounter).printBookingDetails();
                                BookingCounter++;
                            }
                            else {
                                System.out.println("Booking Request currently not available");
                                bookings.remove(bookings.size()-1);
                            }
                            break;
                        }
                        case 2:{
                            int k;
                            for(k=0;k<screens.size();k++){
                                if(screens.get(k).ScreenTimeId.equals("Screen14PM"))
                                    break;
                            }
                            if(bookings.get(BookingCounter).bookSeat(BookingCounter,noOfSeats,"Screen14PM", disc,1,screens.get(k))){
                                System.out.println("Seats Booked successfully");
                                bookings.get(BookingCounter).printBookingDetails();
                                BookingCounter++;
                            }
                            else if(bookings.get(BookingCounter).bookSeat(BookingCounter,noOfSeats,"Screen14PM", disc,2,screens.get(k))){
                                System.out.println("Seats Booked successfully");
                                bookings.get(BookingCounter).printBookingDetails();
                                BookingCounter++;
                            }
                            else{
                                System.out.println("Booking Request currently not available");
                                bookings.remove(bookings.size()-1);
                            }
                            break;
                        }
                        case 3:{
                            int k;
                            for(k=0;k<screens.size();k++){
                                if(screens.get(k).ScreenTimeId.equals("Screen18PM"))
                                    break;
                            }
                            if(bookings.get(BookingCounter).bookSeat(BookingCounter,noOfSeats,"Screen18PM", disc,0,screens.get(k))){
                                System.out.println("Seats Booked successfully");
                                bookings.get(BookingCounter).printBookingDetails();
                                BookingCounter++;
                            }
                            else{
                                System.out.println("Booking Request currently not available");
                                bookings.remove(bookings.size()-1);
                            }
                            break;
                        }
                        case 4:{
                            int k;
                            for(k=0;k<screens.size();k++){
                                if(screens.get(k).ScreenTimeId.equals("Screen18PM"))
                                    break;
                            }
                            if(bookings.get(BookingCounter).bookSeat(BookingCounter,noOfSeats,"Screen18PM", disc,1,screens.get(k))){
                                System.out.println("Seats Booked successfully");
                                bookings.get(BookingCounter).printBookingDetails();
                                BookingCounter++;
                            }
                            else if(bookings.get(BookingCounter).bookSeat(BookingCounter,noOfSeats,"Screen18PM", disc,2,screens.get(k))){
                                System.out.println("Seats Booked successfully");
                                bookings.get(BookingCounter).printBookingDetails();
                                BookingCounter++;
                            }
                            else{
                                System.out.println("Booking Request currently not available");
                                bookings.remove(bookings.size()-1);
                            }
                            break;
                        }
                        case 5:{
                            int k;
                            for(k=0;k<screens.size();k++){
                                if(screens.get(k).ScreenTimeId.equals("Screen24PM"))
                                    break;
                            }
                            if(bookings.get(BookingCounter).bookSeat(BookingCounter,noOfSeats,"Screen24PM", disc,0,screens.get(k))){
                                System.out.println("Seats Booked successfully");
                                bookings.get(BookingCounter).printBookingDetails();
                                BookingCounter++;
                            }
                            else{
                                System.out.println("Booking Request currently not available");
                                bookings.remove(bookings.size()-1);
                            }
                            break;
                        }
                        case 6:{
                            int k;
                            for(k=0;k<screens.size();k++){
                                if(screens.get(k).ScreenTimeId.equals( "Screen24PM"))
                                    break;
                            }
                            if(bookings.get(BookingCounter).bookSeat(BookingCounter,noOfSeats,"Screen24PM", disc,1,screens.get(k))){
                                System.out.println("Seats Booked successfully");
                                bookings.get(BookingCounter).printBookingDetails();
                                BookingCounter++;
                            }
                            else if(bookings.get(BookingCounter).bookSeat(BookingCounter,noOfSeats,"Screen24PM", disc,2,screens.get(k))){
                                System.out.println("Seats Booked successfully");
                                bookings.get(BookingCounter).printBookingDetails();
                                BookingCounter++;
                            }
                            else{
                                System.out.println("Booking Request currently not available");
                                bookings.remove(bookings.size()-1);
                            }
                            break;
                        }
                        case 7:{
                            int k;
                            for(k=0;k<screens.size();k++){
                                if(screens.get(k).ScreenTimeId .equals("Screen28PM"))
                                    break;
                            }
                            if(bookings.get(BookingCounter).bookSeat(BookingCounter,noOfSeats,"Screen28PM", disc,0,screens.get(k))){
                                System.out.println("Seats Booked successfully");
                                bookings.get(BookingCounter).printBookingDetails();
                                BookingCounter++;
                            }
                            else{
                                System.out.println("Booking Request currently not available");
                                bookings.remove(bookings.size()-1);
                            }
                            break;
                        }
                        case 8: {
                            int k;
                            for(k=0;k<screens.size();k++){
                                if(screens.get(k).ScreenTimeId.equals("Screen28PM"))
                                    break;
                            }
                            if(bookings.get(BookingCounter).bookSeat(BookingCounter,noOfSeats,"Screen28PM", disc,1,screens.get(k))){
                                System.out.println("Seats Booked successfully");
                                bookings.get(BookingCounter).printBookingDetails();
                                BookingCounter++;
                            }
                            else if(bookings.get(BookingCounter).bookSeat(BookingCounter,noOfSeats,"Screen28PM", disc,2,screens.get(k))){
                                System.out.println("Seats Booked successfully");
                                bookings.get(BookingCounter).printBookingDetails();
                                BookingCounter++;
                            }
                            else{
                                System.out.println("Booking Request currently not available");
                                bookings.remove(bookings.size()-1);
                            }
                            break;
                        }
                        case 9: {
                            int k;
                            for(k=0;k<screens.size();k++){
                                if(screens.get(k).ScreenTimeId.equals("Screen34PM"))
                                    break;
                            }
                            if(bookings.get(BookingCounter).bookSeat(BookingCounter,noOfSeats,"Screen34PM", disc,1,screens.get(k))){
                                System.out.println("Seats Booked successfully");
                                bookings.get(BookingCounter).printBookingDetails();
                                BookingCounter++;
                            }
                            else if(bookings.get(BookingCounter).bookSeat(BookingCounter,noOfSeats,"Screen34PM", disc,2,screens.get(k))){
                                System.out.println("Seats Booked successfully");
                                bookings.get(BookingCounter).printBookingDetails();
                                BookingCounter++;
                            }
                            else{
                                System.out.println("Booking Request currently not available");
                                bookings.remove(bookings.size()-1);
                            }
                            break;
                        }
                        case 10: {
                            int k;
                            for(k=0;k<screens.size();k++){
                                if(screens.get(k).ScreenTimeId.equals("Screen38PM"))
                                    break;
                            }
                            if(bookings.get(BookingCounter).bookSeat(BookingCounter,noOfSeats,"Screen38PM", disc,1,screens.get(k))){
                                System.out.println("Seats Booked successfully");
                                bookings.get(BookingCounter).printBookingDetails();
                                BookingCounter++;
                            }
                            else if(bookings.get(BookingCounter).bookSeat(BookingCounter,noOfSeats,"Screen38PM", disc,2,screens.get(k))){
                                System.out.println("Seats Booked successfully");
                                bookings.get(BookingCounter).printBookingDetails();
                                BookingCounter++;
                            }
                            else{
                                System.out.println("Booking Request currently not available");
                                bookings.remove(bookings.size()-1);
                            }
                            break;
                        }
                        default:{
                            System.out.println("Enter a Valid choice!");
                        }
                    }
                    break;
                }
                case 2:{
                    System.out.println("Enter BookId to cancel Booking");
                    int id = sc.nextInt();
                    if(id >= bookings.size()) {
                        System.out.println("Invalid Booking ID");
                        break;
                    }
                    int k;
                    for(k=0;k<screens.size();k++){
                        if(screens.get(k).ScreenTimeId.equals(bookings.get(id).ScreenTime))
                            break;
                    }
                    sc.nextLine();
                    bookings.get(id).cancelBooking(screens.get(k));
                    System.out.println("Tickets Cancelled. Refund Details");

                    break;
                }
                case 3:{
                    System.out.println("Enter the booking Id to view the Booking summary: ");
                    int ind = sc.nextInt();
                    sc.nextLine();
                    if(ind >= bookings.size()) {
                        System.out.println("Invalid Booking ID");
                        break;
                    }
                    for (Booking booking : bookings) {
                        if(booking.BookingId == ind)
                        booking.printBookingDetails();
                    }
                    System.out.println("-------------------------------------------------");
                    break;
                }
                case 4:{
                    System.out.println("-------------------------------------------------");
                    System.out.println("Overall summary: ");
                    for (Screen s: screens) {
                        s.printScreenDetails();
                    }
                    System.out.println("-------------------------------------------------");
                    sc.nextLine();
                    break;
                }
                case 5: {
                    System.out.println("All bookings Summary");
                    sc.nextLine();
                    for (Booking b : bookings) {
                        b.printBookingDetails();
                        System.out.println("----------------------------------------------------");
                    }
                    break;
                }

            }

                System.out.println("Do you want to continue? ");
                canContinue = sc.nextLine().charAt(0);
//

        }



    }
}
