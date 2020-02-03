public class restRoom extends MonopolySquare {

    public restRoom(String n){
        super(n);
    }
    @Override
    public void landOn(Player P) throws BankruptException {
        System.out.println("Player landed on a restroom square");
    }
}
