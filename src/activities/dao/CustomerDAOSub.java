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

        try {
            connect();
            ps = conn.prepareStatement(SQL.ADD_CUSTOMER.getQuery());
            ps.setInt(1, c.getCustomerNumber());
            ps.setString(2, c.getcName());
            ps.setString(3, c.getLastName());
            ps.setString(4, c.getFirstName());
            ps.setString(5, c.getPhone());
            ps.setString(6, c.getAddress());
            ps.setString(7, c.getCity());
            ps.setString(8, c.getCountry());

            rs = ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean removeCustomer(int customerNumber) {
        boolean remove = false;

        try {
            connect();
            ps = conn.prepareStatement(SQL.REMOVE_CUSTOMER.getQuery());
            ps.setInt(1, customerNumber);

            rs = ps.executeQuery();

            if (rs.next()) {
                remove = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }

        return remove;
    }
}
