package Q4;

public class Main {
    public static void main(String[] args) {
        TrainTicket[] trainTickets = new TrainTicket[3];
        
        try {
            trainTickets[0] = new RegularTicket("Alice", 100.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }


        try {
            trainTickets[1] = new StudentTicket("Bob", 100.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            trainTickets[2] = new RegularTicket("Fail",-100.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        for(TrainTicket trainTicket : trainTickets){
            try {
                if (trainTickets != null) {

                    System.out.println(trainTicket.toString());
                }

            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("The program already calculate all tickets");

            }
            
        }

    }
}
