/*
CSE 17
David Brewster
DCB316
Homework 2 	DEADLINE: September 7th, 2014
Program Discription; Stop Watch And Math Test
*/
public class 
public class StopWatch {
	public boolean running;
	public int startTime;
	public int timedMS;
	
	public quizStart(){
		startTime = System.currentTimeMillis;
		timedMs = 0;
		running = false;
	}
	/* Main method that starts the user interface
	*/
	public static void main(String [] args) {
		quizStart programStart = New quizStart();
		userInterface();
	}
	/* Asks the user for their name and starts the quiz
	*/
	public static void userInterface(){
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter your name:  ");
		String userName = console.next(); 		
	}
	/* creates a quiz for the user*/
	public static int quiz(){
		
	}
	/*checks to see how much time has passed since the start
	*/
	public static int getElapsedTime(){
	
	}
	
}
