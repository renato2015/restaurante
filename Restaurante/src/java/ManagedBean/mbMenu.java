/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBean;

import Bean.BeanPedido;
import Bean.BeanSagest11;
import Bean.BeanSagest12;
import Sql.SqlMenu;
import Sql.SqlProduto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

/**
 *
 * @author Fox W8
 */
@ManagedBean
public class mbMenu implements Serializable{

    private MenuModel menuModel;

    private List<BeanSagest12> listEst12;
    private List<BeanSagest11> listEst11;
    private BeanPedido listPedido;
    private List<BeanPedido> listPed = new ArrayList<>();

    public mbMenu() {
        //listPed = new ArrayList<>();   
    }
    
    BeanPedido bPed = new BeanPedido();
       
    SqlMenu sEst12 = new SqlMenu();
    SqlProduto sProduto = new SqlProduto();
    
    public MenuModel geraMenu() {
        if (menuModel == null) {
            DefaultSubMenu submenu;

            DefaultMenuItem item;
            menuModel = new DefaultMenuModel();
            submenu = new DefaultSubMenu("Categoria");
            item = new DefaultMenuItem();
            listEst12 = sEst12.listar();
            for (int i = 0; i < listEst12.size(); i++) {
                submenu.addElement(item);
                item = new DefaultMenuItem();
                menuModel.addElement(item);
                submenu.setStyle("font-size : 12px; ");
                item.setValue(listEst12.get(i).getDescricao());
                item.setOutcome(listEst12.get(i).getPath());
                item.setAjax(true);
                item.setCommand("#{mbMenu.produto("+listEst12.get(i).getIdGrupo()+")}");
//                item.setParam("grupoId", 1);
            }            
        }
        return menuModel;
    }    

    public MenuModel getMenuModel() {
        menuModel = geraMenu();
        return menuModel;
    }
    
    //Consulta Produto
    public List<BeanPedido> produto(int idGrupo ){                
        if(listPed.isEmpty()){
            listPed =  sProduto.listar(idGrupo);              
        }
        return listPed;                
    }

    public List<BeanSagest11> getListEst11() {        
        return listEst11;
    }

      public String finalizar(){
       return "finalizar.xhtml?faces-redirect=true";
   }
    
   public String remover(){
       return "pedido.xhtml?faces-redirect=true";
   }

    public List<BeanPedido> getListPed() {        
        return listPed;
    }
    
    
    
    
    
}
