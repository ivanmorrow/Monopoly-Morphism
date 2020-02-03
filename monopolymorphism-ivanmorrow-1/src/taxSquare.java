public class taxSquare extends MonopolySquare {

    public taxSquare(String n){
        super(n);
    }
    @Override
    public void landOn(Player P) throws BankruptException {
        if (P.getLocation() == 8 || P.getLocation() == 24){
            System.out.println("Player landed on a tax square");
            P.add(-2);
            LooseChange.add(2);
        }
    }
}
