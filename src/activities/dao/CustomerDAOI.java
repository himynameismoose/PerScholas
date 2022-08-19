package activities.dao;

public interface CustomerDAOI {
    enum SQL {
        GET_CUSTOMER_BY_ID("SELECT * FROM Customers WHERE customerNumber=?"),
        ADD_CUSTOMER("INSERT INTO Customers (customerNumber, customerName,contactLastName, contactFirstName,"
                + "phone, addressLine1, city, country) "
                + "VALUES (?,?,?,?,?,?,?,?)"),
        REMOVE_CUSTOMER("DELETE FROM Customers WHERE customerNumber=?");

        private final String query;

        private SQL(String s) {
            query = s;
        }

        public String getQuery() {
            return query;
        }
    }

    Customers getCustomerById(int customerNumber);
    boolean addCustomer(Customers c);
    boolean removeCustomer(int customerNumber);
}
