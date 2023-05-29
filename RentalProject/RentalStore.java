import java.util.ArrayList;

class RentalStore {

    ArrayList<Item> Items;
    ArrayList<Customer> customers;

    public void register(Customer customer) {
        customers.add(customer);
    }

    public void addItem(Item item) {
        Items.add(item);
    }

    public void removeItem(Item item) {
        Items.remove(item);
    }

    public ArrayList<Item> getAvailableItems() {

        ArrayList<Item> AvailableItems = new ArrayList<>(Items);

        for (Item item : Items) {
            if (item.isAvailable()) {
                AvailableItems.add(item);
            }
        }

        return AvailableItems;
        
    }

    public void rentItem(Item item, Customer customer) {

        Rental newItemRental = new Rental(item,customer,item.getId()+customer.getId());

        customer.getRentals().add(newItemRental);

        item.setAvailable(false);
            
    }

    public void returnItem(Rental rental) {

        rental.setReturnedDate();

        rental.getCustomer().getRentals().remove(rental);

        rental.getItem().setAvailable(true);
        
    }

    public Customer getCustomerById(int id) {

        for (Customer customer : customers) {
            if (customer.getId()==id) {
                return customer;
            }
        }

        System.out.println("id not found :(");
        return null;
        
    }

    public Item getItemById(int id) {

        for (Item item : Items) {
            if (item.getId()==id) {
                return item;
            }
        }

        System.out.println("id not found :(");
        return null;
        
    }

}
