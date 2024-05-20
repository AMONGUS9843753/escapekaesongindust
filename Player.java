import java.util.*;
public class Player extends Human{
	private int money, health,squidGames;
	private ArrayList<Item> inv;
	private Room myRoom;
	private Scanner sc;
	public Player(String name) {
		super(name);
		money=(int)(Math.random()*101)+50;
		health=100;
		inv=new ArrayList<Item>();
		myRoom=new Room("HomeRoom",0);
		sc = new Scanner(System.in);
	}
	public String playSquidGame() {
		if(myRoom.getID()==0) {
			int squidEndingChance = (int)(Math.random()*1001);
			String[] questions = {"What is our rulers first name","What is our capital",
					"Are we the only Korea (yes or no)","What year was North Korea founded",
					"Is North Cholla Province foreign territory","Is Monish a relative of Kim Il Sung",
					"What is our ice-free port in the Sea of Japan",};
			String[] answers = {"Kim","Pyongyang","Yes","1948","No","Yes","Rason",};
			int numRight=0;
			int numDone=0;
			if(squidGames>3) {
				if(squidEndingChance==57) {
					return "gotosquid";
				}
			}
			while(numRight<4 && numDone<11) {
				int q = (int)(Math.random()*questions.length);
				System.out.println(questions[q]);
				String ans=sc.next();
				if(ans.equalsIgnoreCase(answers[q])) {
					numRight++;
					System.out.println("ans right");
				} numDone++;
			}
			squidGames++;
			if(numRight>=4) {
				int prizeMon=(int)(Math.random()*2000)+600;
				money+=prizeMon;
				return super.getName() + " won Squid Game! You earned "+prizeMon + " won! Go to work tomorrow.";
			} money-=300;
			health-=6;
			return "You lost Squid Game. Go to work tomorrow.";
		} else {
			return "";
		}
	}
	public void addHealth(int amount) {
		health+=amount;
		if(health>100) {
			health=100;
		}
	}
	public int getMoney() {
		return money;
	}
	public int getHP() {
		return health;
	}
	public void transport(int locNumber) {
		myRoom.changeRoom(locNumber);
	}
	public String whereAmI() {
		return myRoom.toString();
	}
	public void attack(Human who) {

	}
	public ArrayList<Item> getInventory(){
		return inv;
	}
	public String work() {
		System.out.println("You work for Hyundai! These equations are what you need to calculate for money today");
		int numRight=0;
		for(int i=0;i<(int)(Math.random()*11)+5;i++) {
			int[] operator= {0,1,2};
			int numOne= (int)(Math.random()*101);
			int numTwo= (int)(Math.random()*101);
			int opIndex=(int)(Math.random()*3);
			if(operator[opIndex]==2) {
				System.out.println("Calculate "+numOne+" + "+numTwo);
				int ans=sc.nextInt();
				if(ans==numOne+numTwo) {
					numRight++;
				}
			}
			if(operator[opIndex]==1) {
				System.out.println("Calculate "+numOne+" - "+numTwo);
				int ans=sc.nextInt();
				if(ans==numOne-numTwo) {
					numRight++;
				}
			}
			if(operator[opIndex]==0) {
				if(numOne>10) {
					numOne=10;
				}
				if(numTwo>10) {
					numTwo=(int)(Math.random()*10)-10;
				}
				System.out.println("Calculate "+numOne+" * "+numTwo);
				int ans=sc.nextInt();
				if(ans==numOne*numTwo) {
					numRight++;
				}
			}
			
		}
		int earnings=8*numRight;
		money+=earnings;
		return super.getName() +" earned " +earnings +" won!";
	}
	public void toDo() {
		System.out.println(super.getName()+ " has " +money+" won and "+health+" HP");
		System.out.println("Inventory "+ inv.toString());
		System.out.println(myRoom.toString());
		int option=sc.nextInt();
		if(option==1){
			if(myRoom.getID==1||myRoom.getID()==2){
				transport(0);
			} else if(myRoom.getID()==3){
				transport(1);
			}
		} else if(option==2){

		} else if(option==3){

		} else if(option==4){

		} else if(option==5){

		} else {
			System.out.println("Invalid Input. Try again");
		}

		
	}
}
