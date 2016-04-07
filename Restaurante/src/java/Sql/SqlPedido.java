package Sql;

import Bean.BeanCadMesa;
import Bean.BeanItensMesa;
import Bean.BeanMesa;
import Bean.BeanSagven63;
import Util.HibernateUtil;
import Util.Mensagem;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Fox W8
 */
public class SqlPedido {

    BeanCadMesa bCadMesa = new BeanCadMesa();
    BeanMesa bMesa = new BeanMesa();
    List<BeanMesa> listaMesa = new ArrayList<>();
    BeanSagven63 bVend = new BeanSagven63();
    List<BeanItensMesa> lstItensMesa = new ArrayList<>();
    Mensagem msg = new Mensagem();
    Transaction tx;

    public void gravarPedido(BeanMesa bMesa) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        session.save(bMesa);
        tx.commit();
        session.close();
    }

    public void gravarItensPed(BeanItensMesa bItens) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        session.save(bItens);
        tx.commit();
        session.close();
    }

    public void atualizarItensPed(BeanItensMesa bItens) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        session.update(bItens);
        tx.commit();
        session.close();
    }

    public String pesqMesa(String mesa) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        String hql = "from BeanCadMesa where mesa = :mesa";
        Query query = session.createQuery(hql);
        query.setParameter("mesa", Integer.parseInt(mesa));
        bCadMesa = (BeanCadMesa) query.uniqueResult();
        if (bCadMesa == null) {
            mesa = "10000";
        } else {
            mesa = String.valueOf(bCadMesa.getMesa());
        }
        session.close();
        return mesa;
    }

    public List<BeanItensMesa> pesqPedido(int codVendedor, String mesa) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        //bCadMesa = pesqMesaCancela(mesa);
        bVend.setVendedor(codVendedor);
        String hql = "select m.mesa,im.vendedor,im.id_produto,im.quant from itens_mesa as im "
                + "inner join mesa as m on(im.id_mesa = m.id_mesa)"
                + "where m.mesa = "+mesa+" and st_item = 'A'";
        Query query = session.createSQLQuery(hql);
//        query.setParameter("mesa", mesa);
        lstItensMesa = query.list();       
        session.close();
        return lstItensMesa;
    }

    public BeanCadMesa pesqMesaCancela(String Mesa) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        String hql = "from BeanCadMesa where mesa = :Mesa";
        Query query = session.createQuery(hql).setParameter("Mesa", Mesa);
        return (BeanCadMesa) query.uniqueResult();
    }

    public BeanSagven63 pesqVendedor(int codVendedor) {
        BeanSagven63 bVendedor = new BeanSagven63();
        Session session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        String hql = "from BeanSagven63 where vendedor = :vendedor";
        Query query = session.createQuery(hql).setParameter("vendedor", codVendedor);
        bVendedor = (BeanSagven63) query.uniqueResult();
        return bVendedor;
    }

}
