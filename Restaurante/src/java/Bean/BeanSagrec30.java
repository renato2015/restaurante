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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Fox W8
 */
@Entity
@Table(name = "sagrec30")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BeanSagrec30.findAll", query = "SELECT b FROM BeanSagrec30 b"),
    @NamedQuery(name = "BeanSagrec30.findByIdRec30", query = "SELECT b FROM BeanSagrec30 b WHERE b.idRec30 = :idRec30"),
    @NamedQuery(name = "BeanSagrec30.findByDescricao", query = "SELECT b FROM BeanSagrec30 b WHERE b.descricao = :descricao"),
    @NamedQuery(name = "BeanSagrec30.findByDec582503", query = "SELECT b FROM BeanSagrec30 b WHERE b.dec582503 = :dec582503"),
    @NamedQuery(name = "BeanSagrec30.findByMensagem", query = "SELECT b FROM BeanSagrec30 b WHERE b.mensagem = :mensagem"),
    @NamedQuery(name = "BeanSagrec30.findByTipo", query = "SELECT b FROM BeanSagrec30 b WHERE b.tipo = :tipo")})
public class BeanSagrec30 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_rec30")
    private Integer idRec30;
    @Size(max = 30)
    @Column(name = "descricao")
    private String descricao;
    @Size(max = 1)
    @Column(name = "dec_5825_03")
    private String dec582503;
    @Size(max = 60)
    @Column(name = "mensagem")
    private String mensagem;
    @Size(max = 2)
    @Column(name = "tipo")
    private String tipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRec30")
    private List<BeanSagrec60> beanSagrec60List;

    public BeanSagrec30() {
    }

    public BeanSagrec30(Integer idRec30) {
        this.idRec30 = idRec30;
    }

    public Integer getIdRec30() {
        return idRec30;
    }

    public void setIdRec30(Integer idRec30) {
        this.idRec30 = idRec30;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDec582503() {
        return dec582503;
    }

    public void setDec582503(String dec582503) {
        this.dec582503 = dec582503;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @XmlTransient
    public List<BeanSagrec60> getBeanSagrec60List() {
        return beanSagrec60List;
    }

    public void setBeanSagrec60List(List<BeanSagrec60> beanSagrec60List) {
        this.beanSagrec60List = beanSagrec60List;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRec30 != null ? idRec30.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BeanSagrec30)) {
            return false;
        }
        BeanSagrec30 other = (BeanSagrec30) object;
        if ((this.idRec30 == null && other.idRec30 != null) || (this.idRec30 != null && !this.idRec30.equals(other.idRec30))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bean.BeanSagrec30[ idRec30=" + idRec30 + " ]";
    }
    
}
