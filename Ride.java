public class Ride{
 
  String pickup;
  String drop;
  int timeInMinutes;
  boolean shareable;
  
  public Ride(String pickup,String drop,int timeInMinutes,boolean shareable)
  {
  	this.pickup = pickup;
  	this.drop = drop;
  	this.timeInMinutes = timeInMinutes;
  	this.shareable = shareable;
  }
  public String getFormattedTime(){
  	int hour = timeInMinutes/60;
  	int min = timeInMinutes%60;
  	return String.format("%02d:%02d",hour,min);
  }

}