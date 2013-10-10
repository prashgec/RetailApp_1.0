/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.retail.DAO;

import com.reatil.sessionfactory.SessionFactoryUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author sushil
 */
public class BaseDAO {
public BaseDAO(){}
public boolean save(Object obj){
Transaction trancation=null;
Session session=SessionFactoryUtil.getSessionFactory().openSession();
try{
trancation=session.beginTransaction();
session.save(obj);
trancation.commit();
return true;
}catch(RuntimeException e){

    if(trancation !=null )//&& trancation.isActive())
 try{
        trancation.rollback();
    }catch(HibernateException eh){
        eh.printStackTrace();
    }
    }
return false;
}
public boolean update(Object obj){
Transaction trancation=null;
Session session=SessionFactoryUtil.getSessionFactory().openSession();
try{
trancation=session.beginTransaction();
session.update(obj);
trancation.commit();
return true;
}catch(RuntimeException e){

    if(trancation !=null )//&& trancation.isActive())
 try{
        trancation.rollback();
    }catch(HibernateException eh){
        eh.printStackTrace();
    }
    }
return false;
}
public boolean delete(Object obj){
Transaction trancation=null;
Session session=SessionFactoryUtil.getSessionFactory().openSession();
try{
trancation=session.beginTransaction();
session.delete(obj);
trancation.commit();
return true;
}catch(RuntimeException e){

    if(trancation !=null )//&& trancation.isActive())
 try{
        trancation.rollback();
    }catch(HibernateException eh){
        eh.printStackTrace();
    }
    }
return false;
    }

/**
 * Return list of objects of given key and key value
 * @param object
 * @param key
 * @param keyValue
 * @return
 */
public List fetchFromKey(Object object, String key, String keyValue){
Transaction trancation=null;
Session session=SessionFactoryUtil.getSessionFactory().openSession();
Criteria criteria=session.createCriteria(object.getClass());
criteria.add(Restrictions.eq(key, keyValue));
return criteria.list();
}
}
