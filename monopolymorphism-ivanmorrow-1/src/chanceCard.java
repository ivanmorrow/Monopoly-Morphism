public abstract class chanceCard {
    protected String name;

    public chanceCard(String n){this.name = n;}

    public abstract void action(Player p);
}
