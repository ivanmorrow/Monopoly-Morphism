
public class BankruptException extends Exception {
	public BankruptException(String message) {
		super(message);
	}

	//Not much going on here -- it just seemed better to have
	//a descriptive exception.    You might consider creating
	//some other exceptions like this one if you need to.
}
