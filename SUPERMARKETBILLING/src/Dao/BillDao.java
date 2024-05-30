package Dao;


import models.Bill;
import DBUtil.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BillDao {
    public List<Bill> getAllBills() {
        List<Bill> bills = new ArrayList<>();
        String query = "SELECT * FROM bills";
        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                Bill bill = new Bill();
                bill.setId(resultSet.getInt("id"));
                bill.setCustomerId(resultSet.getInt("customer_id"));
                bill.setTotalAmount(resultSet.getDouble("total_amount"));
                bill.setDate(resultSet.getString("date"));
                bills.add(bill);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bills;
    }

    public Bill getBillById(int id) {
        Bill bill = null;
        String query = "SELECT * FROM bills WHERE id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                bill = new Bill();
                bill.setId(resultSet.getInt("id"));
                bill.setCustomerId(resultSet.getInt("customer_id"));
                bill.setTotalAmount(resultSet.getDouble("total_amount"));
                bill.setDate(resultSet.getString("date"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bill;
    }

    public void addBill(Bill bill) {
        String query = "INSERT INTO bills (customer_id, total_amount, date) VALUES (?, ?, ?)";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, bill.getCustomerId());
            preparedStatement.setDouble(2, bill.getTotalAmount());
            preparedStatement.setString(3, bill.getDate());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateBill(Bill bill) {
        String query = "UPDATE bills SET customer_id = ?, total_amount = ?, date = ? WHERE id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, bill.getCustomerId());
            preparedStatement.setDouble(2, bill.getTotalAmount());
            preparedStatement.setString(3, bill.getDate());
            preparedStatement.setInt(4, bill.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteBill(int id) {
        String query = "DELETE FROM bills WHERE id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}