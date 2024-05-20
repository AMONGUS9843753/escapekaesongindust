public class Item {
	private String myName;
	private int myHealthBenefit;
	private boolean isEscapeeAgent;
	public Item(String name,int healthBenefit,boolean escapee) {
		myName=name;
		myHealthBenefit=healthBenefit;
		isEscapeeAgent=escapee;
	}
	public void useItem() {
		
	}
	public String toString(){
		if(!isEscapeeAgent)
			return myName + " gives " + myHealthBenefit +" HP!";
		return "Use this to Escape.";
	}
	
}
