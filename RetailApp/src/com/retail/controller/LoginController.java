/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.retail.controller;

import com.reatil.VO.Customer;
import com.reatil.sessionfactory.SessionFactoryUtil;
import com.retail.DAO.LoginDAO;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author sushil
 */
public class LoginController {

    Session session=null;
    Transaction transaction=null;

    /**
     * Method to validate Login Credentials.
     * @param username
     * @param password
     * @return
     */
    public boolean validateLogin(String username, String password)
    {
    LoginDAO loginDAO= new LoginDAO();
    List customerList=loginDAO.fetchFromKey(new Customer(), "userName", username);
    if(customerList==null || customerList.size()< 1){
        return false;
        }
    else{
    Customer customer=(Customer)customerList.get(0);
//if(customer==null){
//    return false;
//}
//else{
    if(customerList.size()>0 && password.equals(customer.getPassword() ))
    {
    return true;
    } else{
     return false;
   // return true;
}
        }
        }
    }

