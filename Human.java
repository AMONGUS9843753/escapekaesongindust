public class Human {
	private String myName;
	private boolean isDead;
	public Human(String pName) {
		myName=pName;
		isDead=false;
	}
	public String kill() {
		if(isDead) {
			return myName+" is already dead. Kill someone else";
		} isDead=true;
		int wallet=(int)(Math.random()*82)+1;
		return "You have killed " +myName + ". You earned "+ wallet+" won! Spare the lives of your fellow people.";
	}
	public String getName() {
		return myName;
	}
}
