/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.reatil.sessionfactory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author sushil
 */
public class SessionFactoryUtil {
    private static SessionFactory sessionFactory;
    static {
try{
Configuration configuration=new Configuration();
sessionFactory=configuration.configure().buildSessionFactory();

}catch(Exception e)
{
e.printStackTrace();
}
    }
public static SessionFactory getSessionFactory(){
return sessionFactory;
}

}
