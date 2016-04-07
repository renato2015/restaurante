/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sql;

import Bean.BeanPedido;
import Bean.BeanSagest11;
import Bean.BeanSagest13;
import Util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Fox W8
 */
public class SqlProduto {

    private Session session;
    private Transaction transaction;
    private List<BeanSagest11> list;
    private List<BeanSagest11> listProd;
    private BeanSagest13 listVlrVenda = new BeanSagest13();
    private List<BeanPedido> listPed = new ArrayList<>();

    public SqlProduto() {
        listPed = new ArrayList<>();
        list = new ArrayList<>();
    }
    
    
    
    public List<BeanPedido> listar(int idGrupo) {        
        if(list.isEmpty()){
            listPed = new ArrayList<>();
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            String hql = "SELECT * FROM sagest11 s where id_grupo = :idGrupo";
            Query query = session.createSQLQuery(hql).addEntity(BeanSagest11.class);
            query.setParameter("idGrupo", idGrupo);
            list = query.list();
            for (int i = 0; i < list.size(); i++) {
                BeanPedido bPed = new BeanPedido();
                bPed.setDescricao(list.get(i).getDescricao());            
                bPed.setIdProduto(list.get(i).getIdProduto());
                bPed.setVlUnit(listaVlrVenda(list.get(i).getIdProduto()));
                listPed.add(bPed);
            }            
        }
        return listPed;
    }
    
    public double listaVlrVenda(int idProduto){
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        String hql = "from BeanSagest13 where id_produto = :idproduto ";
        Query query = session.createQuery(hql);
        query.setParameter("idproduto", idProduto);
        listVlrVenda = (BeanSagest13) query.uniqueResult();
        transaction.commit();
        session.close();
        return listVlrVenda.getVlrVenda();        
    }
    
    public List<BeanSagest11> listarProd(int codProd) {
        if(listProd.isEmpty()){
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            String hql = "from BeanSagest11 where  produto = :codProd";
            Query query = session.createQuery(hql);
            query.setParameter("codProd" , codProd);
            listProd = query.list();
        }
        
        return listProd;
    }
}
