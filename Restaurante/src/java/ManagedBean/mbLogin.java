/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBean;

import Bean.BeanLogin;
import Bean.BeanSagven63;
import Sql.SqlLogin;
import Sql.SqlSagven63;
import Util.HibernateUtil;
import Util.Mensagem;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Fox W8
 */
@ManagedBean
public class mbLogin extends BeanLogin{        
    Mensagem msg = new Mensagem();
    SqlLogin sLogin = new SqlLogin();
    SqlSagven63 sLoginVen63 = new SqlSagven63();
    List<BeanLogin> listaLogin;
    List<BeanSagven63> login;

    public mbLogin() {        
    }
            
    public String login(BeanLogin bLogin){
        login = sLoginVen63.logar(bLogin.getId());
        for(int i=0; i < login.size(); i++){
            if(login.get(i).getVendedor() == bLogin.getId() && login.get(i).getSenha().equals(bLogin.getSenha())){
                HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
                bLogin.setNome(login.get(0).getNomeRep());                
                httpSession.setAttribute("usuario", bLogin.getNome());                
                return "produtos/pedido.xhtml?faces-redirect=true";
            }   
        }
        msg.erro("Usuário e/ou senhas incorretos!\\nVerifique!!");
        return null;
    }        
    
    public String encerrarSessao(){
        HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        httpSession.removeAttribute("usuario");
        httpSession.invalidate();
        return "/index.xhtml?faces-redirect=true";
    }
}
