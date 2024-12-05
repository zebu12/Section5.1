public class CounterTicket extends Ticket {

    public static int COUNTER_TICKET_PRICE = 50;

    public CounterTicket() {
    }

    @Override
    public int getPrice() {
        return COUNTER_TICKET_PRICE;
    }
}
