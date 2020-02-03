public abstract class MonopolySquare {
	protected String name;

    public MonopolySquare(String n){

		name = n;
	}

	@Override
	public String toString() {

        return name;
	}

	public abstract void landOn(Player P) throws BankruptException;

    public String getName(){return name;}
	//Note 1:   this method is abstract.   We are going to defer
	//implementation to the next generation (the classes that extend
	// this class).    Since there are abstract methods in this class,
	// you cannot instantiate it.... you cannot have a generic MonopolySquare
	// Observe that the class is also declared as 'abstract'

	//Note 2:   The designation, "Throws BankruptException" means that
	//it is *possible* for this function to throw that Exception
	// you have to figure out when it does as you implement this function
}