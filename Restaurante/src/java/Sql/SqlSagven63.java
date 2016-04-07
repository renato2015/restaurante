/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sql;

import Bean.BeanSagven63;
import Util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Fox W8
 */
public class SqlSagven63 {
    List<BeanSagven63> listaLogin;
    
    public List<BeanSagven63> logar(int id) {               
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction(); 
        String hql = "from BeanSagven63 as blogin where blogin.vendedor = :usuario ";
        Query query = session.createQuery(hql);
        query.setParameter("usuario", id);
        listaLogin = query.list();        
        return listaLogin;
    }
    
}
