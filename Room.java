public class Room {
	private String myName;
	private int roomID;
	public Room(String name,int ID) {
		myName=name;
		roomID=ID;
	}
	public String getName() {
		return myName;
	}
	public int getID() {
		return roomID;
	}
	public void changeRoom(int ID) {
		if(ID>3) {
			System.out.println("Invalid Room. Please try an ID from 0-2");
		}
		if(ID==roomID) {
			System.out.println("This is the same room.");
		}
		if(ID==0) {
			myName="Home";
			roomID=ID;
		}
		if(ID==1) {
			myName="FamilyMart";
			roomID=ID;
		}
		if(ID==2) {
			myName="Factory";
			roomID=ID;
		}
		if(ID==3) {
			myName="Panmun Train station";
			roomID=ID;
		}
	}
	public String toString() {
		if(roomID==0) 
			return "PLACES TO GO: Factory, FamilyMart \nACTIVITIES TO DO: Squid Game, sleep";
		if(roomID==1)
			return "PLACES TO GO: Home, Panmun \nACTIVITIES TO DO: Buy, Rob, Kill Storeowner";
		if(roomID==2) {
			return "PLACES TO GO: Home, FamilyMart \nACTIVITIES TO DO: Work, Skip Work";
		}
		if(roomID==3) {
			return "PLACES TO GO: FamilyMart \nACTIVITIES TO DO: tbd";
		}
		else {
			return "There appears to be a bug! Contact the developers (Nikhil, Arun, or Kudzi) and have them fix this!";
		}
	}

}
