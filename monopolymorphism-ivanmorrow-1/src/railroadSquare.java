public class railroadSquare extends MonopolySquare {
    public railroadSquare(String n){
        super(n);
    }
    @Override
    public void landOn(Player P) throws BankruptException {
        if (P.getLocation() == 5 || P.getLocation() == 13 || P.getLocation() == 21 || P.getLocation() == 29) {
            System.out.println("Player landed on a railroad square");
            System.out.println("Player gets to roll again");
            P.setLocation(P.getLocation() + P.move());
        }
    }
}
