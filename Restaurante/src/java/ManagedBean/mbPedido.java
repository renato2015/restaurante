package ManagedBean;

import Bean.BeanCadMesa;
import Bean.BeanItensMesa;
import Bean.BeanLogin;
import Bean.BeanMesa;
import Bean.BeanPedido;
import Bean.BeanSagest11;
import Bean.BeanSagven63;
import Sql.SqlPedido;
import Util.Mensagem;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Fox W8
 */
@ManagedBean
@SessionScoped
public class mbPedido implements Serializable {

    private List<BeanPedido> listaPedido = new ArrayList();
    private List<BeanItensMesa> listaItensMesa = new ArrayList<>();
    private BeanPedido bPedido = new BeanPedido();
    BeanCadMesa bCadMesa = new BeanCadMesa();
    SqlPedido sPed = new SqlPedido();
    Mensagem msg = new Mensagem();
    private String mesa ="";
    private Double TotalPedido = 0.0;

    public String finalizar() {
        return "finalizar.xhtml?faces-redirect=true";
    }

    public String voltarPedido() {
        return "pedido.xhtml?faces-redirect=true";
    }

    public void finalizarPedido(int vendedor) {
        if (!mesa.equals("")) {
            if (!listaPedido.isEmpty()) {
                double total = 0;
                BeanMesa bMesa = new BeanMesa();
                BeanSagven63 bVen63 = new BeanSagven63();
                bVen63.setVendedor(vendedor);
                BeanItensMesa bItens = new BeanItensMesa();
                BeanLogin bLogin = new BeanLogin();
                bCadMesa.setMesa(Integer.valueOf(mesa));
                bMesa.setMesa(Integer.valueOf(mesa));
                for (int i = 0; i < listaPedido.size(); i++) {
                    total = total + (listaPedido.get(i).getQuant() * listaPedido.get(i).getVlUnit());
                }
                bMesa.setVlrTotal(total);
                bMesa.setGorjetaVlr(0.0);
                //Data do Sistema
                Date dtAbertura = new java.sql.Date(System.currentTimeMillis());
                Date dtFechamento = new java.sql.Date(System.currentTimeMillis());
                bMesa.setDtAbertura(dtAbertura);
                bMesa.setDtFechamento(dtFechamento);
                try {
                    sPed.gravarPedido(bMesa);
                    BeanSagest11 bProduto = new BeanSagest11();
                    for (int i = 0; i < listaPedido.size(); i++) {
                        bProduto.setIdProduto(listaPedido.get(i).getIdProduto());
                        bItens.setIdProduto(bProduto);
                        bItens.setVendedor(bVen63);
                        bItens.setQuant(listaPedido.get(i).getQuant());
                        bItens.setStItem('A');
                        bItens.setIdMesa(bMesa);
                        sPed.gravarItensPed(bItens);
                    }
                    FacesContext context = FacesContext.getCurrentInstance();
                    context.addMessage(null, new FacesMessage("", "Pedido Gravado com sucesso"));
                    limparPed();
                } catch (Exception e) {
                    msg.erro("Erro ao gravar pedido!\n" + e.getMessage());
                }
            } else {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage(null, new FacesMessage("", "Nenhum produto foi selecionado!\nVerifique!"));
            }
        } else {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage("", "Informe a mesa por favor"));
        }
    }

    
    public String cancelarPedido() {
        return "cancelarPed.xhtml?faces-redirect=true";
    }
    
    public String listaPedidos() {
        return "finalizar.xhtml?faces-redirect=true";
    }

    public void limparPed() {
        mesa = "";
        TotalPedido = 0.0;
        listaPedido = new ArrayList<>();
    }

    public void pesqMesa() {
        String mesa1;
        mesa1 = sPed.pesqMesa(mesa);
        if (mesa1.equals("10000")) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage("", "Mesa não encontrada!\nVerifique!"));
            mesa = "";
        }
    }
    
    public List<BeanItensMesa> pesqPed(int codVendedor){
        listaItensMesa = new ArrayList<>();
        if(!mesa.equals("")){
            listaItensMesa = sPed.pesqPedido(codVendedor,mesa);
            if(listaItensMesa.isEmpty() || listaItensMesa.equals(null)){
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage(null, new FacesMessage("", "Não há pedidos para esta mesa!\nVerifique!"));
            }
        }
        return listaItensMesa;
    }
    
    public void atualizarPed(BeanItensMesa bItens){        
        bItens.setStItem('C');
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("", "Pedido cancelado com sucesso!"));
        try {
            sPed.atualizarItensPed(bItens);
        } catch (Exception e) {
            context.addMessage(null, new FacesMessage("","Erro ao atualizar pedido."+e.getMessage()));
        }
    }

    public BeanPedido getbPedido() {
        return bPedido;
    }

    public void setbPedido(BeanPedido bPedido) {
        this.bPedido = bPedido;
    }

    public List<BeanPedido> getListaPedido() {
        return listaPedido;
    }

    public List<BeanPedido> getPedido(BeanPedido bPed) {
        bPed.setDescricao(bPed.getDescricao());
        bPed.setVlUnit(bPed.getVlUnit());
        bPed.setQuant(bPed.getQuant());
        bPed.setVlTotal(bPed.getVlUnit() * bPed.getQuant());
        TotalPedido = bPed.getVlTotal() + TotalPedido;
        return listaPedido;
    }

    public void setListaPedido(List<BeanPedido> listaPedido) {
        this.listaPedido = listaPedido;
    }

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public Double getTotalPedido() {
        return TotalPedido;
    }

    public void setTotalPedido(Double TotalPedido) {
        this.TotalPedido = TotalPedido;
    }

}
