import java.util.*;


public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        RideService rideService = new RideService();
        while(true)
        {
            System.out.println("\n===== Smart Cab Pooling System ===");
            System.out.println("\n1.Request a Ride");
            System.out.println("2.Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            if(choice == 1)
            {
            	System.out.println("Enter a pick up Location:");
            	String pickup = sc.nextLine();
            	System.out.println("\nEnter a drop Location:");
            	String drop = sc.nextLine();
            	System.out.println("\nEnter Pickup Time(HH:MM):");
            	String time = sc.nextLine();
            	int minutes = convertToMinutes(time);
            	System.out.println("\nWilling to Share(yes/no):");
            	boolean shareable = sc.nextLine().trim().equalsIgnoreCase("yes");

            	Ride newRide = new Ride(pickup , drop,minutes,shareable);
            	List<Ride> matches = rideService.findMatches(newRide);
            	if(matches.isEmpty())
            		{
            			System.out.println("No Match Found");
            		}
            		else
            		{
            			System.out.println("Match Found");
            		}
            		for(Ride r : matches)
            		{
            			System.out.println("->"+r.pickup+" to "+r.drop+" at "+r.getFormattedTime());

            		}

            rideService.addRide(newRide);
            }
            
            



        
        else if(choice == 2)
        {
        	System.out.println("Thank You!");
        	break;
        }
        else
        {
        	System.out.println("Invalid Choice");
        }
     
     }
       sc.close();
	
	}
    public static int convertToMinutes(String time)
    {
    	String[] parts = time.split(":");
    	int hour = Integer.parseInt(parts[0]);
    	int min = Integer.parseInt(parts[1]);
    	return hour*60+min;
    }



}