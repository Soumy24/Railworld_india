package Service;

import Dao.EmployeeDao;
import Models.Employee;

import java.sql.SQLException;
import java.util.List;

public class EmployeeService {
    private EmployeeDao employeeDao;

    public EmployeeService() {

        employeeDao = new EmployeeDao();
    }

    public void addEmployee(Employee employee) throws SQLException {
        employeeDao.addEmployee(employee);
    }
    public Employee getEmployeeById(int id) throws SQLException {
        return employeeDao.getEmployeeById(id);
    }

    public List<Employee> getAllEmployees() throws SQLException {
        return employeeDao .getAllEmployees();
    }

    public void updateEmployee(Employee employee) throws SQLException {
        employeeDao .updateEmployee(employee);
    }

    public void deleteEmployee(int id) throws SQLException {
        employeeDao .deleteEmployee(id);
    }
}