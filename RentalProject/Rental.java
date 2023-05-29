import java.util.Date;

class Rental {

    private Item item;
    private Customer customer;
    private Date rentalDate;
    private Date returnedDate;
    private int id;

    public Rental(Item item,Customer customer,int id) {
        this.item = item;
        this.customer = customer;
        this.rentalDate = new Date();
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public Item getItem() {
        return item;
    }
    public Customer getCustomer() {
        return customer;
    }
    public Date getRentalDate() {
        return rentalDate;
    }
    public Date getReturnedDate() {
        return returnedDate;
    }
    public void setReturnedDate() {
        this.returnedDate = new Date();
    }
    
}
