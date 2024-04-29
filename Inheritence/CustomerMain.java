package Inheritence;

import java.util.List;

public class CustomerMain   {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        List<Customer> customersh = customerManager.getAll();

        Customer customer = new Customer();
        customer.setId(2);
        customer.setFirstName("Muhammed");
        customer.setLastName("İnan");
        customer.setEmail("muhammed@etiya.com");
        customer.setPassword("Programlama");

        customerManager.addCustomer(customer);

        System.out.println("Müşteri adı ve soyadı: " + customer.getFirstName() + " " +  customer.getLastName()
                + "\n" + "Email: " + customer.getEmail() + " Şifre: "  + customer.getPassword());


        System.out.println("-------------");
        System.out.println("Update: ");

        Customer customer1 = new Customer();
        customer1.setId(2);
        customer1.setFirstName("Yagız");
        customer1.setLastName("Delibas");
        customer1.setEmail("yagız@etiya.com");
        customer1.setPassword("Programlama");

        customerManager.updateCustomer(customer1);

        System.out.println("Müşteri adı ve soyadı: " + customer1.getFirstName() + " " +  customer1.getLastName()
                + "\n" + "Email: " + customer1.getEmail() + " Şifre: "  + customer1.getPassword());


        System.out.println("------------------------");
        System.out.println("Delete:");
        customerManager.deleteCustomer(2);
        for (Customer customer2:customersh){
            System.out.println("Müşteri adı ve soyadı: " + customer2.getFirstName() + " " +  customer2.getLastName()
                    + "\n" + "Email: " + customer2.getEmail() + " Şifre: "  + customer2.getPassword());
        }

    }
}
