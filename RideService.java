import java.util.*;

public class RideService{
	private List<Ride> rideList = new ArrayList<>();
	
	public void addRide(Ride ride){
              rideList.add(ride);
	}

	public List<Ride> findMatches(Ride newRide){
		List<Ride> matches = new ArrayList<>();
	 
	 for(Ride ride : rideList ){

	 	if(ride.shareable && newRide.shareable)
	 	{
              boolean sameRoute = ride.pickup.equalsIgnoreCase(newRide.pickup) && ride.drop.equalsIgnoreCase(newRide.drop);

              boolean withinTimeWindow = Math.abs(ride.timeInMinutes - newRide.timeInMinutes) <=15;

              if( sameRoute && withinTimeWindow)
              {
              	matches.add(ride);
              }


	 	}
	 }
	 return matches;
      

	}
}