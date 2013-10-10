/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package retailapp;

import com.reatil.VO.Customer;
import com.reatil.sessionfactory.SessionFactoryUtil;
import com.retail.view.LoginFrame;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author sushil
 */
public class Main {


    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
//        Session session=null;
//    Transaction transaction=null;
//        session=SessionFactoryUtil.getSessionFactory().openSession();
//    transaction=session.beginTransaction();
//    Customer customer = new Customer();
//    customer.setCustomerName("Sushil");
//    customer.setDateOfBirth(new Date());
//    customer.setUserName("Sushil");
//    customer.setPassword("Tilak");
//    customer.setContactNo("7738088331");
//    System.out.println(customer.getCustomerName());
//    session.save(customer);
//    transaction.commit();
    new LoginFrame().setVisible(true);
    }

}
