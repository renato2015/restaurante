/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Fox W8
 */
@Entity
@Table(name = "mesa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BeanMesa.findAll", query = "SELECT b FROM BeanMesa b"),
    @NamedQuery(name = "BeanMesa.findByIdMesa", query = "SELECT b FROM BeanMesa b WHERE b.idMesa = :idMesa"),
    @NamedQuery(name = "BeanMesa.findByCartao", query = "SELECT b FROM BeanMesa b WHERE b.cartao = :cartao"),
    @NamedQuery(name = "BeanMesa.findByGorjetaVlr", query = "SELECT b FROM BeanMesa b WHERE b.gorjetaVlr = :gorjetaVlr"),
    @NamedQuery(name = "BeanMesa.findByMesa", query = "SELECT b FROM BeanMesa b WHERE b.mesa = :mesa"),
    @NamedQuery(name = "BeanMesa.findByVlrTotal", query = "SELECT b FROM BeanMesa b WHERE b.vlrTotal = :vlrTotal"),
    @NamedQuery(name = "BeanMesa.findByDtAbertura", query = "SELECT b FROM BeanMesa b WHERE b.dtAbertura = :dtAbertura"),
    @NamedQuery(name = "BeanMesa.findByDtFechamento", query = "SELECT b FROM BeanMesa b WHERE b.dtFechamento = :dtFechamento")})
public class BeanMesa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_mesa")
    private Integer idMesa;
    @Column(name = "cartao")
    private Integer cartao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "gorjeta_vlr")
    private Double gorjetaVlr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mesa")
    private int mesa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vlr_total")
    private double vlrTotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dt_abertura")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAbertura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dt_fechamento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtFechamento;

    public BeanMesa() {
    }

    public BeanMesa(Integer idMesa) {
        this.idMesa = idMesa;
    }

    public BeanMesa(Integer idMesa, int mesa, double vlrTotal, Date dtAbertura, Date dtFechamento) {
        this.idMesa = idMesa;
        this.mesa = mesa;
        this.vlrTotal = vlrTotal;
        this.dtAbertura = dtAbertura;
        this.dtFechamento = dtFechamento;
    }

    public Integer getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(Integer idMesa) {
        this.idMesa = idMesa;
    }

    public Integer getCartao() {
        return cartao;
    }

    public void setCartao(Integer cartao) {
        this.cartao = cartao;
    }

    public Double getGorjetaVlr() {
        return gorjetaVlr;
    }

    public void setGorjetaVlr(Double gorjetaVlr) {
        this.gorjetaVlr = gorjetaVlr;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public double getVlrTotal() {
        return vlrTotal;
    }

    public void setVlrTotal(double vlrTotal) {
        this.vlrTotal = vlrTotal;
    }

    public Date getDtAbertura() {
        return dtAbertura;
    }

    public void setDtAbertura(Date dtAbertura) {
        this.dtAbertura = dtAbertura;
    }

    public Date getDtFechamento() {
        return dtFechamento;
    }

    public void setDtFechamento(Date dtFechamento) {
        this.dtFechamento = dtFechamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMesa != null ? idMesa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BeanMesa)) {
            return false;
        }
        BeanMesa other = (BeanMesa) object;
        if ((this.idMesa == null && other.idMesa != null) || (this.idMesa != null && !this.idMesa.equals(other.idMesa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bean.BeanMesa[ idMesa=" + idMesa + " ]";
    }
    
}
