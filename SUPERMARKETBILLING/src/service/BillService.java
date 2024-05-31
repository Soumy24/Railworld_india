package service;

import models.Bill;
import Dao.BillDao;

import java.util.List;

public class BillService {
    private BillDao billDao = new BillDao();

    public List<Bill> getAllBills() {
        return billDao.getAllBills();
    }

    public Bill getBillById(int id) {
        return billDao.getBillById(id);
    }

    public void addBill(Bill bill) {
        billDao.addBill(bill);
    }

    public void updateBill(Bill bill) {
        billDao.updateBill(bill);
    }
    public void deleteBill(int id) {
        billDao.deleteBill(id);
    }
}