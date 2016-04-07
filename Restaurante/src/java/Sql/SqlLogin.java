/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sql;

import Bean.BeanLogin;
import Util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Fox W8
 */
public class SqlLogin {
    List<BeanLogin> listaLogin;    
    Session session;
    Transaction tx;
    
    public List<BeanLogin> logar( String usuario){
        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();        
        String hql = "from BeanLogin as blogin where blogin.nome = :usuario ";
        Query query = session.createQuery(hql);
        query.setParameter("usuario", usuario);
        listaLogin = query.list();  
        tx.commit();
        session.close();
        return listaLogin;
    }
}
