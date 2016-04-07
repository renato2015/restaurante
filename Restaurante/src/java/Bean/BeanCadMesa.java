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
@Table(name = "cad_mesa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BeanCadMesa.findAll", query = "SELECT b FROM BeanCadMesa b"),
    @NamedQuery(name = "BeanCadMesa.findByMesa", query = "SELECT b FROM BeanCadMesa b WHERE b.mesa = :mesa"),
    @NamedQuery(name = "BeanCadMesa.findByFila", query = "SELECT b FROM BeanCadMesa b WHERE b.fila = :fila"),
    @NamedQuery(name = "BeanCadMesa.findByLocal", query = "SELECT b FROM BeanCadMesa b WHERE b.local = :local")})
public class BeanCadMesa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "mesa")
    private Integer mesa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fila")
    private int fila;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "local")
    private String local;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mesa")
    private List<BeanMesa> beanMesaList;

    public BeanCadMesa() {
    }

    public BeanCadMesa(Integer mesa) {
        this.mesa = mesa;
    }

    public BeanCadMesa(Integer mesa, int fila, String local) {
        this.mesa = mesa;
        this.fila = fila;
        this.local = local;
    }

    public Integer getMesa() {
        return mesa;
    }

    public void setMesa(Integer mesa) {
        this.mesa = mesa;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @XmlTransient
    public List<BeanMesa> getBeanMesaList() {
        return beanMesaList;
    }

    public void setBeanMesaList(List<BeanMesa> beanMesaList) {
        this.beanMesaList = beanMesaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mesa != null ? mesa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BeanCadMesa)) {
            return false;
        }
        BeanCadMesa other = (BeanCadMesa) object;
        if ((this.mesa == null && other.mesa != null) || (this.mesa != null && !this.mesa.equals(other.mesa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bean.BeanCadMesa[ mesa=" + mesa + " ]";
    }
    
}
