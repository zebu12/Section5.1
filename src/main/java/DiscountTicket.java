public class DiscountTicket extends WebTicket{

    public static double DISCOUNT = 0.5;
    public  String type;



    public DiscountTicket(int days, String type){
        super(days);
        price *= DISCOUNT;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override

    public String toString() {
        return super.toString()+" Type: "+getType();
    }
}
