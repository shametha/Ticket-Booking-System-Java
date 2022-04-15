import java.lang.reflect.Array;
import java.util.ArrayList;

public class Screen {
    int rows=4;
    int columns=5;
    public String ScreenTimeId;
    private int[][] Seatavailable;
    private int Collection;

    Screen(String ScreenTimeId){
        this.ScreenTimeId = ScreenTimeId;
        Seatavailable = new int[rows][columns];
        Collection =0;
    }
    void updateSeats(ArrayList<Integer> seat){
        int counter=1;
        for(int i=0;i<rows;i++)
            for(int j=0;j<columns;j++){
                if(seat.contains(counter))
                    Seatavailable[i][j]=0;
            }
    }
    void printScreenDetails(){
        System.out.println("-------------------------------------------------");
        System.out.println(ScreenTimeId.substring(0,7)+" - "+ScreenTimeId.substring(7,ScreenTimeId.length()));
        System.out.println("Seats Available: ");
        int counter=1;
        for(int i=0;i<rows;i++)
            for(int j=0;j<columns;j++){
                if (Seatavailable[i][j]==0)
                    System.out.print(counter+" ");
                counter++;
            }
        System.out.println("\nIncome: Rs."+Collection);
    }
    void updateCollection(int netCost){
        Collection+= netCost;
    }
    ArrayList<Integer> checkAvailability(String ScreenTime, int SeatClass, int noOfSeats){
        ArrayList<Integer> seats = new ArrayList<>();
        int count=0;
        for(int i=0;i<columns;i++){
            if(count>noOfSeats)
                break;
            if(Seatavailable[SeatClass][i]==0) {
                count++;
                seats.add(SeatClass*5+i+1);
            }
        }
        if(count<noOfSeats)
            return new ArrayList<>();
        else
            return seats;
    }
    void bookScreenSeats(String ScreenTime, int SeatClass, int noOfSeats) {
        int count=0;
        for (int i = 0; i <columns; i++) {
            if (count >= noOfSeats)
                break;
            if (Seatavailable[SeatClass][i] == 0) {
                count++;
                Seatavailable[SeatClass][i]=1;
            }
        }
    }
    void showAvailableSeats(int index){
        System.out.println();
        System.out.print(index+". "+ScreenTimeId.substring(0,7)+" "+ScreenTimeId.substring(7,ScreenTimeId.length()));
        int count=0;
        for(int i=0;i<columns;i++){
            if(Seatavailable[0][i]==0)
                count++;
        }
        System.out.println(" - First Class "+count);

        System.out.print((index+1)+". "+ScreenTimeId.substring(0,7)+" "+ScreenTimeId.substring(7,ScreenTimeId.length()));
        count=0;
        for(int i=0;i<5;i++){
            if(Seatavailable[1][i]==0)
                count++;
            if(Seatavailable[2][i]==0)
                count++;
        }
        System.out.print(" - Second Class "+count);
    }

}
