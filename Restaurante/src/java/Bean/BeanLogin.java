/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Util.HibernateUtil;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Fox W8
 */
@ManagedBean(name = "bLogin")
@SessionScoped
@Entity
@Table(name = "login")
public class BeanLogin implements Serializable{         
    public BeanLogin() {
        //Session session = HibernateUtil.getSessionFactory().openSession();
        //Transaction tx = session.beginTransaction();   
    }        
    
    @Id    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;    
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
}
