/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sql;

import Bean.BeanSagest11;
import Bean.BeanSagest12;
import Util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Fox W8
 */
public class SqlMenu {

    private Session session;
    private Transaction transaction;
    private List<BeanSagest12> list;
    private List<BeanSagest11> listProd;

    public List<BeanSagest12> listar() {
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        String hql = "from BeanSagest12 where grupo > 1999 and quant = 0";
        Query query = session.createQuery(hql);
        list = query.list();
        transaction.commit();
        session.close();
        return list;
    }

    public List<BeanSagest11> listarProd(int codProd) {
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        String hql = "from BeanSagest11 where produto = :prod";
        Query query = session.createQuery(hql);
        query.setParameter("prod", codProd);
        listProd = query.list();
        transaction.commit();
        session.close();
        return listProd;
    }

}
