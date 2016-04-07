/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Fox W8
 */
@Entity
@Table(name = "itens_mesa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BeanItensMesa.findAll", query = "SELECT b FROM BeanItensMesa b"),
    @NamedQuery(name = "BeanItensMesa.findByIdItem", query = "SELECT b FROM BeanItensMesa b WHERE b.idItem = :idItem"),
    @NamedQuery(name = "BeanItensMesa.findByQuant", query = "SELECT b FROM BeanItensMesa b WHERE b.quant = :quant"),
    @NamedQuery(name = "BeanItensMesa.findByStItem", query = "SELECT b FROM BeanItensMesa b WHERE b.stItem = :stItem")})
public class BeanItensMesa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_item")
    private Integer idItem;
    @Column(name = "quant")
    private Integer quant;
    @Column(name = "st_item")
    private Character stItem;
    @JoinColumn(name = "id_produto", referencedColumnName = "id_produto")
    @ManyToOne
    private BeanSagest11 idProduto;
    @JoinColumn(name = "vendedor", referencedColumnName = "vendedor")
    @ManyToOne(optional = false)
    private BeanSagven63 vendedor;
    @JoinColumn(name = "id_mesa", referencedColumnName = "id_mesa")
    @ManyToOne
    private BeanMesa idMesa;

    public BeanItensMesa() {
    }

    public BeanItensMesa(Integer idItem) {
        this.idItem = idItem;
    }

    public Integer getIdItem() {
        return idItem;
    }

    public void setIdItem(Integer idItem) {
        this.idItem = idItem;
    }

    public Integer getQuant() {
        return quant;
    }

    public void setQuant(Integer quant) {
        this.quant = quant;
    }

    public Character getStItem() {
        return stItem;
    }

    public void setStItem(Character stItem) {
        this.stItem = stItem;
    }

    public BeanSagest11 getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(BeanSagest11 idProduto) {
        this.idProduto = idProduto;
    }

    public BeanSagven63 getVendedor() {
        return vendedor;
    }

    public void setVendedor(BeanSagven63 vendedor) {
        this.vendedor = vendedor;
    }

    public BeanMesa getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(BeanMesa idMesa) {
        this.idMesa = idMesa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idItem != null ? idItem.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BeanItensMesa)) {
            return false;
        }
        BeanItensMesa other = (BeanItensMesa) object;
        if ((this.idItem == null && other.idItem != null) || (this.idItem != null && !this.idItem.equals(other.idItem))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bean.BeanItensMesa[ idItem=" + idItem + " ]";
    }
    
}
