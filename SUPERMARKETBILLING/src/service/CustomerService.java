package service;

import models.Customer;
import Dao.CustomerDao;

import java.util.List;

public class CustomerService {
    private CustomerDao customerDao = new CustomerDao();

    public List<Customer> getAllCustomers() {
        return customerDao.getAllCustomers();
    }

    public Customer getCustomerById(int id) {
        return customerDao.getCustomerById(id);
    }

    public void addCustomer(Customer customer) {
        customerDao.addCustomer(customer);
    }

    public void updateCustomer(Customer customer) {
        customerDao.updateCustomer(customer);
    }

    public void deleteCustomer(int id) {
        customerDao.deleteCustomer(id);
    }

    public void addCustomer(int id, String name) {
    }
}