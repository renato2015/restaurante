/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Fox W8
 */
@Entity
@Table(name = "sagven63")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BeanSagven63.findAll", query = "SELECT b FROM BeanSagven63 b"),
    @NamedQuery(name = "BeanSagven63.findByVendedor", query = "SELECT b FROM BeanSagven63 b WHERE b.vendedor = :vendedor"),
    @NamedQuery(name = "BeanSagven63.findByDsMargem", query = "SELECT b FROM BeanSagven63 b WHERE b.dsMargem = :dsMargem"),
    @NamedQuery(name = "BeanSagven63.findByDsMargemMin", query = "SELECT b FROM BeanSagven63 b WHERE b.dsMargemMin = :dsMargemMin"),
    @NamedQuery(name = "BeanSagven63.findByDsMargemMax", query = "SELECT b FROM BeanSagven63 b WHERE b.dsMargemMax = :dsMargemMax"),
    @NamedQuery(name = "BeanSagven63.findByNomeRep", query = "SELECT b FROM BeanSagven63 b WHERE b.nomeRep = :nomeRep"),
    @NamedQuery(name = "BeanSagven63.findByConselho", query = "SELECT b FROM BeanSagven63 b WHERE b.conselho = :conselho"),
    @NamedQuery(name = "BeanSagven63.findByBcoCc", query = "SELECT b FROM BeanSagven63 b WHERE b.bcoCc = :bcoCc"),
    @NamedQuery(name = "BeanSagven63.findByAgeCc", query = "SELECT b FROM BeanSagven63 b WHERE b.ageCc = :ageCc"),
    @NamedQuery(name = "BeanSagven63.findByDgAgeCc", query = "SELECT b FROM BeanSagven63 b WHERE b.dgAgeCc = :dgAgeCc"),
    @NamedQuery(name = "BeanSagven63.findByContaCorrente", query = "SELECT b FROM BeanSagven63 b WHERE b.contaCorrente = :contaCorrente"),
    @NamedQuery(name = "BeanSagven63.findByDgCcor", query = "SELECT b FROM BeanSagven63 b WHERE b.dgCcor = :dgCcor"),
    @NamedQuery(name = "BeanSagven63.findByStTransm", query = "SELECT b FROM BeanSagven63 b WHERE b.stTransm = :stTransm"),
    @NamedQuery(name = "BeanSagven63.findByStRepres", query = "SELECT b FROM BeanSagven63 b WHERE b.stRepres = :stRepres"),
    @NamedQuery(name = "BeanSagven63.findByDtCadastro", query = "SELECT b FROM BeanSagven63 b WHERE b.dtCadastro = :dtCadastro"),
    @NamedQuery(name = "BeanSagven63.findByEMail", query = "SELECT b FROM BeanSagven63 b WHERE b.eMail = :eMail"),
    @NamedQuery(name = "BeanSagven63.findByHomePage", query = "SELECT b FROM BeanSagven63 b WHERE b.homePage = :homePage"),
    @NamedQuery(name = "BeanSagven63.findByDtUltComiss", query = "SELECT b FROM BeanSagven63 b WHERE b.dtUltComiss = :dtUltComiss"),
    @NamedQuery(name = "BeanSagven63.findBySenha", query = "SELECT b FROM BeanSagven63 b WHERE b.senha = :senha"),
    @NamedQuery(name = "BeanSagven63.findByComissao", query = "SELECT b FROM BeanSagven63 b WHERE b.comissao = :comissao")})
public class BeanSagven63 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "vendedor")
    private Integer vendedor;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ds_margem")
    private Double dsMargem;
    @Column(name = "ds_margem_min")
    private Double dsMargemMin;
    @Column(name = "ds_margem_max")
    private Double dsMargemMax;
    @Size(max = 30)
    @Column(name = "nome_rep")
    private String nomeRep;
    @Size(max = 10)
    @Column(name = "conselho")
    private String conselho;
    @Column(name = "bco_cc")
    private Integer bcoCc;
    @Column(name = "age_cc")
    private Integer ageCc;
    @Column(name = "dg_age_cc")
    private Integer dgAgeCc;
    @Column(name = "conta_corrente")
    private Integer contaCorrente;
    @Column(name = "dg_ccor")
    private Integer dgCcor;
    @Column(name = "st_transm")
    private Character stTransm;
    @Column(name = "st_repres")
    private Character stRepres;
    @Column(name = "dt_cadastro")
    @Temporal(TemporalType.DATE)
    private Date dtCadastro;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="E-mail inválido")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 65)
    @Column(name = "e_mail")
    private String eMail;
    @Size(max = 65)
    @Column(name = "home_page")
    private String homePage;
    @Lob
    @Size(max = 65535)
    @Column(name = "observacao")
    private String observacao;
    @Column(name = "dt_ult_comiss")
    @Temporal(TemporalType.DATE)
    private Date dtUltComiss;
    @Lob
    @Size(max = 65535)
    @Column(name = "obs_tab")
    private String obsTab;
    @Size(max = 10)
    @Column(name = "senha")
    private String senha;
    @Column(name = "comissao")
    private Double comissao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vendedor")
    private List<BeanItensMesa> beanItensMesaList;
    @JoinColumn(name = "cnpj_forcli", referencedColumnName = "cnpj_forcli")
    @ManyToOne(optional = false)
    private BeanSagrec60 cnpjForcli;

    public BeanSagven63() {
    }

    public BeanSagven63(Integer vendedor) {
        this.vendedor = vendedor;
    }

    public Integer getVendedor() {
        return vendedor;
    }

    public void setVendedor(Integer vendedor) {
        this.vendedor = vendedor;
    }

    public Double getDsMargem() {
        return dsMargem;
    }

    public void setDsMargem(Double dsMargem) {
        this.dsMargem = dsMargem;
    }

    public Double getDsMargemMin() {
        return dsMargemMin;
    }

    public void setDsMargemMin(Double dsMargemMin) {
        this.dsMargemMin = dsMargemMin;
    }

    public Double getDsMargemMax() {
        return dsMargemMax;
    }

    public void setDsMargemMax(Double dsMargemMax) {
        this.dsMargemMax = dsMargemMax;
    }

    public String getNomeRep() {
        return nomeRep;
    }

    public void setNomeRep(String nomeRep) {
        this.nomeRep = nomeRep;
    }

    public String getConselho() {
        return conselho;
    }

    public void setConselho(String conselho) {
        this.conselho = conselho;
    }

    public Integer getBcoCc() {
        return bcoCc;
    }

    public void setBcoCc(Integer bcoCc) {
        this.bcoCc = bcoCc;
    }

    public Integer getAgeCc() {
        return ageCc;
    }

    public void setAgeCc(Integer ageCc) {
        this.ageCc = ageCc;
    }

    public Integer getDgAgeCc() {
        return dgAgeCc;
    }

    public void setDgAgeCc(Integer dgAgeCc) {
        this.dgAgeCc = dgAgeCc;
    }

    public Integer getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(Integer contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public Integer getDgCcor() {
        return dgCcor;
    }

    public void setDgCcor(Integer dgCcor) {
        this.dgCcor = dgCcor;
    }

    public Character getStTransm() {
        return stTransm;
    }

    public void setStTransm(Character stTransm) {
        this.stTransm = stTransm;
    }

    public Character getStRepres() {
        return stRepres;
    }

    public void setStRepres(Character stRepres) {
        this.stRepres = stRepres;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Date getDtUltComiss() {
        return dtUltComiss;
    }

    public void setDtUltComiss(Date dtUltComiss) {
        this.dtUltComiss = dtUltComiss;
    }

    public String getObsTab() {
        return obsTab;
    }

    public void setObsTab(String obsTab) {
        this.obsTab = obsTab;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    @XmlTransient
    public List<BeanItensMesa> getBeanItensMesaList() {
        return beanItensMesaList;
    }

    public void setBeanItensMesaList(List<BeanItensMesa> beanItensMesaList) {
        this.beanItensMesaList = beanItensMesaList;
    }

    public BeanSagrec60 getCnpjForcli() {
        return cnpjForcli;
    }

    public void setCnpjForcli(BeanSagrec60 cnpjForcli) {
        this.cnpjForcli = cnpjForcli;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vendedor != null ? vendedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BeanSagven63)) {
            return false;
        }
        BeanSagven63 other = (BeanSagven63) object;
        if ((this.vendedor == null && other.vendedor != null) || (this.vendedor != null && !this.vendedor.equals(other.vendedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bean.BeanSagven63[ vendedor=" + vendedor + " ]";
    }
    
}
