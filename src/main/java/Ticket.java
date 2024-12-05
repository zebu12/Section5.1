public class Ticket {
    private int serialNumber = 0;
    public static int counter = 0;
    public int price = 0;

    public Ticket() {

        serialNumber = counter++;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Ticket:[" +
                "serial#" + serialNumber +
                ", price:" + getPrice() +
                ']';
    }
}
