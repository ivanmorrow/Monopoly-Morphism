public class LooseChange {

	static int balance;

	public LooseChange(){

		balance = 0;
	}

	/*Add some methods here*/
	// This is how my brother always cheated -- snitching money from the
	// loose change.   I'm not bitter.

	static void add(int n){
		balance += n;
	}

	static int collect(){
		int pay = balance;
		balance = 0;
		return pay;
	}

}