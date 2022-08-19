package activities.dao;

import java.sql.SQLException;

public class CustomerDAOSub extends AbstractCustomerDAO implements CustomerDAOI {

    @Override
    public Customers getCustomerById(int customerNumber) {

        Customers customer = new Customers();

        try {
            connect();
            ps = conn.prepareStatement(SQL.GET_CUSTOMER_BY_ID.getQuery());
            ps.setInt(1, customerNumber);
            rs = ps.executeQuery();

            if (rs.next()) {
                customer.setCustomerNumber(rs.getInt(1));
                customer.setcName(rs.getString(2));
                customer.setLastName(rs.getString(3));
                customer.setFirstName(rs.getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }

        return customer;
    }

    @Override
    public boolean addCustomer(Customers c) {
        return false;
    }

    @Override
    public boolean removeCustomer(int customerNumber) {
        return false;
    }
}
