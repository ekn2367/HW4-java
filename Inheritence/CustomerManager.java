package Inheritence;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class CustomerManager {
    private List<Customer> customers;

    public CustomerManager(){
        customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setId(1);
        customer.setFirstName("Engin");
        customer.setLastName("Demirog");
        customer.setEmail("engin@kodlamaio.com");
        customer.setPassword("Kodlama");
        customer.setCreatedDate(LocalDateTime.now());

        customers.add(customer);
    }

    public List<Customer> getAll(){
        return customers;
    }

    public void addCustomer(Customer customer){
        customer.setCreatedDate(LocalDateTime.now());
        customers.add(customer);
    }

    public void deleteCustomer(int id){
        Iterator<Customer> customerIterator = customers.iterator();
        while (customerIterator.hasNext()){
            Customer customer = customerIterator.next();
            if (customer.getId() == id){
                customer.setDeletedDate(LocalDateTime.now());
                customerIterator.remove();
            }
        }
    }

    public void updateCustomer(Customer customer){
        for (Customer updateCustomer:customers){
            if (updateCustomer.getId() == customer.getId()){
                updateCustomer.setUpdatedDate(LocalDateTime.now());
                updateCustomer.setId(customer.getId());
                updateCustomer.setFirstName(customer.getFirstName());
                updateCustomer.setLastName(customer.getLastName());
            }
        }


    }

    public Customer getById(int id){
        for (Customer index : customers){
            if (index.getId()==id){
                return index;
            }
        }
        return null;
    }

}
