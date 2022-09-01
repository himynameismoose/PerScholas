package activities.dao;

import java.util.ArrayList;

public interface EmployeeDAOI {

    public static final String GETOFFICECODE1 = "Select * from employees Where officecode in (?,?,?)";
    public static final String UPDATEEXTNO = "UPDATE employees SET extension = ? WHERE officecode = ? ";
    public static final String LASTNAMELESSTHAN5 = "Select * from employees WHERE Length(lastName) < ?";

    enum SQL {
        // Get employees in certain office codes
        ALL_EMPLOYEES_OFFICE_CODE(GETOFFICECODE1),
        // Update employee extension numbers
        UPDATE_EMPLOYEE_EXT_NO(UPDATEEXTNO),
        // Get employees with last name less than a certain length
        EMPLOYEE_LAST_LESS_THAN(LASTNAMELESSTHAN5);

        private final String query; // enum constant to hold query

        // enum constructor
        private SQL(String s) {
            query = s;
        }

        public String getQuery() { // output query
            return query;
        }
    }

    // Method headers that relate to the enums:
    // Returns a list of employees with the specified office codes:
    public ArrayList<Employees> getEmployeesWithOfficeCodes(String officeCode1, String officeCode2, String officeCode3);

    // Returns the updated employee:
    Employees updateEmployeeExtNo(String extension, String officeCode);

    // Return employees with last name less than a certain length
    ArrayList<Employees> getEmployeesLessThan(int length);
}
