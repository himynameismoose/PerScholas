package activities.dao;

import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeDAOSub extends AbstractEmployeeDAO implements EmployeeDAOI {

    @Override
    public ArrayList<Employees> getEmployeesWithOfficeCodes(String officeCode1, String officeCode2, String officeCode3) {
        ArrayList<Employees> employeeList = new ArrayList<>();

        try {
            connect();
            ps = conn.prepareStatement(SQL.ALL_EMPLOYEES_OFFICE_CODE.getQuery());

            ps.setString(1, officeCode1);
            ps.setString(2, officeCode2);
            ps.setString(3, officeCode3);

            rs = ps.executeQuery();

            while (rs.next()) {
                Employees employee = new Employees();
                employee.setEmployeeNumber(rs.getInt(1));
                employee.setLastName(rs.getString(2));
                employee.setFirstName(rs.getString(3));
                employee.setExtension(rs.getString(4));
                employee.setEmail(rs.getString(5));
                employee.setOfficeCode(rs.getString(6));
                employee.setReportsTo(rs.getInt(7));
                employee.setJobTitle(rs.getString(8));

                employeeList.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employeeList;
    }

    @Override
    public Employees updateEmployeeExtNo(String extension, String officeCode) {

        Employees employee;

        try {
            connect();
            ps = conn.prepareStatement(SQL.UPDATE_EMPLOYEE_EXT_NO.getQuery());

            ps.setString(1, extension);
            ps.setString(2, officeCode);
            rs = ps.executeQuery();

//            employee = new Employees(
//                    rs.getInt(1),
//                    rs.getString(2),
//                    rs.getString(3),
//                    );

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public ArrayList<Employees> getEmployeesLessThan(int length) {
        return null;
    }
}
