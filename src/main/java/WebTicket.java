public class WebTicket extends Ticket {

    public static int WEB_TICKET_PRICE = 30;
    public static int WEB_TICKET_LT_WEEK_PRICE = 40;

    public WebTicket(int days) {

        if (days >= 7){
            price = WEB_TICKET_PRICE;
        }
        else {
            price = WEB_TICKET_LT_WEEK_PRICE;
        }
    }
}
