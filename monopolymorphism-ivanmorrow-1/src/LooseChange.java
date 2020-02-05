public class LooseChange {

	static int balance;

	public LooseChange(){

		balance = 0;
	}

	static void add(int n){
		balance += n;
	}

	static int collect(){
		int pay = balance;
		balance = 0;
		return pay;
	}

}
