/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Fox W8
 */
@Entity
@Table(name = "sagest16")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BeanSagest16.findAll", query = "SELECT b FROM BeanSagest16 b"),
    @NamedQuery(name = "BeanSagest16.findByTpProduto", query = "SELECT b FROM BeanSagest16 b WHERE b.tpProduto = :tpProduto"),
    @NamedQuery(name = "BeanSagest16.findByDescricao", query = "SELECT b FROM BeanSagest16 b WHERE b.descricao = :descricao")})
public class BeanSagest16 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "tp_produto")
    private String tpProduto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Descricao")
    private String descricao;
    @OneToMany(mappedBy = "tpProduto")
    private List<BeanSagest11> beanSagest11List;

    public BeanSagest16() {
    }

    public BeanSagest16(String tpProduto) {
        this.tpProduto = tpProduto;
    }

    public BeanSagest16(String tpProduto, String descricao) {
        this.tpProduto = tpProduto;
        this.descricao = descricao;
    }

    public String getTpProduto() {
        return tpProduto;
    }

    public void setTpProduto(String tpProduto) {
        this.tpProduto = tpProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @XmlTransient
    public List<BeanSagest11> getBeanSagest11List() {
        return beanSagest11List;
    }

    public void setBeanSagest11List(List<BeanSagest11> beanSagest11List) {
        this.beanSagest11List = beanSagest11List;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tpProduto != null ? tpProduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BeanSagest16)) {
            return false;
        }
        BeanSagest16 other = (BeanSagest16) object;
        if ((this.tpProduto == null && other.tpProduto != null) || (this.tpProduto != null && !this.tpProduto.equals(other.tpProduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bean.BeanSagest16[ tpProduto=" + tpProduto + " ]";
    }
    
}
