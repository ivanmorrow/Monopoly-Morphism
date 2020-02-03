import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;


public class properties extends MonopolySquare {
    private String color;
    private int price;
    private static Map<String, String> map = new HashMap<String, String>();
    private ArrayList<properties> playerProps;
    private Player owner;
    private boolean isMonopoly;


    public properties(String n, int p){
        super(n);
    }

    public properties(String n, String color){
        super(n);
        map.put("Purple", "1");
        map.put("White", "2");
        map.put("Magenta", "2");
        map.put("Orange", "3");
        map.put("Red", "3");
        map.put("Yellow", "4");
        map.put("Green", "4");
        map.put("Blue", "5");
        this.color = color;
        this.price = Integer.parseInt(map.get(this.color));
        this.owner = new Player("NULL");
        this.isMonopoly = false;
        playerProps = new ArrayList<properties>();
    }

    public Boolean isOwned(){
        if(owner.toString().equals("NULL")){
            return false;
        }
        else{
            return true;
        }
    }
    public boolean isMonopoly(){return isMonopoly;}

    public void setMonopoly(boolean monopoly){isMonopoly = monopoly;}

    public Player getOwner(){ return owner; }

    public void setOwner(Player owner){ this.owner = owner;}

    public String getColor(){return color;}


    @Override
    public void landOn(Player P) throws BankruptException {
        if(owner.toString().equals("NULL")){
            try{
                playerProps = P.getProperties();
                for(int i=0;i<playerProps.size();i++){
                    if(playerProps.get(i).getColor().equals(color)){
                        isMonopoly = true;
                        P.setMonopoly(playerProps.get(i));
                    }
                }
                P.pay(price);
                System.out.println("It is not owned; "+P.toString()+" purchased "+name+" for $"+price);
                if(isMonopoly){
                    System.out.println("The player now owns a monopoly on the "+color+" squares!");
                }
                P.addProperty(this);
                owner = P;
            }
            catch(BankruptException e){
                System.out.println("You are not able to purchase this property because it would make you go bankrupt");
            }
        }
        else if (owner!=P){


            if(isMonopoly){
                System.out.println(owner.toString()+" has a monopoly on this property. You must pay $"+price*2);
                P.pay(price*2, owner);
            }
            else{
                System.out.println(owner.toString()+" already owns this property. "+P.toString()+ " must pay $"+price);
                P.pay(price, owner);
            }

        }
        else{
            System.out.println(P.toString()+" already owns this property");
        }
    }

}
