/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "sagest12")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BeanSagest12.findAll", query = "SELECT b FROM BeanSagest12 b"),
    @NamedQuery(name = "BeanSagest12.findByIdGrupo", query = "SELECT b FROM BeanSagest12 b WHERE b.idGrupo = :idGrupo"),
    @NamedQuery(name = "BeanSagest12.findByGrupo", query = "SELECT b FROM BeanSagest12 b WHERE b.grupo = :grupo"),
    @NamedQuery(name = "BeanSagest12.findByDescricao", query = "SELECT b FROM BeanSagest12 b WHERE b.descricao = :descricao"),
    @NamedQuery(name = "BeanSagest12.findByTipoGrupo", query = "SELECT b FROM BeanSagest12 b WHERE b.tipoGrupo = :tipoGrupo"),
    @NamedQuery(name = "BeanSagest12.findByComisGrupo", query = "SELECT b FROM BeanSagest12 b WHERE b.comisGrupo = :comisGrupo"),
    @NamedQuery(name = "BeanSagest12.findByPath", query = "SELECT b FROM BeanSagest12 b WHERE b.path = :path"),
    @NamedQuery(name = "BeanSagest12.findByQuant", query = "SELECT b FROM BeanSagest12 b WHERE b.quant = :quant")})
public class BeanSagest12 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_grupo")
    private Integer idGrupo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "grupo")
    private String grupo;
    @Size(max = 40)
    @Column(name = "descricao")
    private String descricao;
    @Size(max = 3)
    @Column(name = "tipo_grupo")
    private String tipoGrupo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "comis_grupo")
    private Double comisGrupo;
    @Size(max = 255)
    @Column(name = "path")
    private String path;
    @Column(name = "quant")
    private Integer quant;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idGrupo")
    private List<BeanSagest11> beanSagest11List;

    public BeanSagest12() {
    }

    public BeanSagest12(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

    public BeanSagest12(Integer idGrupo, String grupo) {
        this.idGrupo = idGrupo;
        this.grupo = grupo;
    }

    public Integer getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipoGrupo() {
        return tipoGrupo;
    }

    public void setTipoGrupo(String tipoGrupo) {
        this.tipoGrupo = tipoGrupo;
    }

    public Double getComisGrupo() {
        return comisGrupo;
    }

    public void setComisGrupo(Double comisGrupo) {
        this.comisGrupo = comisGrupo;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getQuant() {
        return quant;
    }

    public void setQuant(Integer quant) {
        this.quant = quant;
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
        hash += (idGrupo != null ? idGrupo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BeanSagest12)) {
            return false;
        }
        BeanSagest12 other = (BeanSagest12) object;
        if ((this.idGrupo == null && other.idGrupo != null) || (this.idGrupo != null && !this.idGrupo.equals(other.idGrupo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bean.BeanSagest12[ idGrupo=" + idGrupo + " ]";
    }
    
}
