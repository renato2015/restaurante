/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "sagest14")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BeanSagest14.findAll", query = "SELECT b FROM BeanSagest14 b"),
    @NamedQuery(name = "BeanSagest14.findByTbCalculo", query = "SELECT b FROM BeanSagest14 b WHERE b.tbCalculo = :tbCalculo"),
    @NamedQuery(name = "BeanSagest14.findByDescricao", query = "SELECT b FROM BeanSagest14 b WHERE b.descricao = :descricao"),
    @NamedQuery(name = "BeanSagest14.findByCtSomaIpi", query = "SELECT b FROM BeanSagest14 b WHERE b.ctSomaIpi = :ctSomaIpi"),
    @NamedQuery(name = "BeanSagest14.findByCtSomaIcm", query = "SELECT b FROM BeanSagest14 b WHERE b.ctSomaIcm = :ctSomaIcm"),
    @NamedQuery(name = "BeanSagest14.findByCtSomaFrt", query = "SELECT b FROM BeanSagest14 b WHERE b.ctSomaFrt = :ctSomaFrt"),
    @NamedQuery(name = "BeanSagest14.findByCtSomaSeguro", query = "SELECT b FROM BeanSagest14 b WHERE b.ctSomaSeguro = :ctSomaSeguro"),
    @NamedQuery(name = "BeanSagest14.findByCtSomaOutros", query = "SELECT b FROM BeanSagest14 b WHERE b.ctSomaOutros = :ctSomaOutros"),
    @NamedQuery(name = "BeanSagest14.findByCtSomaCpmf", query = "SELECT b FROM BeanSagest14 b WHERE b.ctSomaCpmf = :ctSomaCpmf"),
    @NamedQuery(name = "BeanSagest14.findByCtDimiIcm", query = "SELECT b FROM BeanSagest14 b WHERE b.ctDimiIcm = :ctDimiIcm"),
    @NamedQuery(name = "BeanSagest14.findByCtDimiPis", query = "SELECT b FROM BeanSagest14 b WHERE b.ctDimiPis = :ctDimiPis"),
    @NamedQuery(name = "BeanSagest14.findByCtDimiCofins", query = "SELECT b FROM BeanSagest14 b WHERE b.ctDimiCofins = :ctDimiCofins"),
    @NamedQuery(name = "BeanSagest14.findByVdSomaIcm", query = "SELECT b FROM BeanSagest14 b WHERE b.vdSomaIcm = :vdSomaIcm"),
    @NamedQuery(name = "BeanSagest14.findByVdSomaPis", query = "SELECT b FROM BeanSagest14 b WHERE b.vdSomaPis = :vdSomaPis"),
    @NamedQuery(name = "BeanSagest14.findByVdSomaIpi", query = "SELECT b FROM BeanSagest14 b WHERE b.vdSomaIpi = :vdSomaIpi"),
    @NamedQuery(name = "BeanSagest14.findByVdSomaCofins", query = "SELECT b FROM BeanSagest14 b WHERE b.vdSomaCofins = :vdSomaCofins"),
    @NamedQuery(name = "BeanSagest14.findByVdSomaFrete", query = "SELECT b FROM BeanSagest14 b WHERE b.vdSomaFrete = :vdSomaFrete"),
    @NamedQuery(name = "BeanSagest14.findByVdSomaDespesa", query = "SELECT b FROM BeanSagest14 b WHERE b.vdSomaDespesa = :vdSomaDespesa"),
    @NamedQuery(name = "BeanSagest14.findByVdSomaOutros", query = "SELECT b FROM BeanSagest14 b WHERE b.vdSomaOutros = :vdSomaOutros"),
    @NamedQuery(name = "BeanSagest14.findByCtDimiOutros", query = "SELECT b FROM BeanSagest14 b WHERE b.ctDimiOutros = :ctDimiOutros"),
    @NamedQuery(name = "BeanSagest14.findByVdPercIcms", query = "SELECT b FROM BeanSagest14 b WHERE b.vdPercIcms = :vdPercIcms"),
    @NamedQuery(name = "BeanSagest14.findByVdPercPis", query = "SELECT b FROM BeanSagest14 b WHERE b.vdPercPis = :vdPercPis"),
    @NamedQuery(name = "BeanSagest14.findByVdPercCofins", query = "SELECT b FROM BeanSagest14 b WHERE b.vdPercCofins = :vdPercCofins"),
    @NamedQuery(name = "BeanSagest14.findByVdPercFrete", query = "SELECT b FROM BeanSagest14 b WHERE b.vdPercFrete = :vdPercFrete"),
    @NamedQuery(name = "BeanSagest14.findByVdPercDesp", query = "SELECT b FROM BeanSagest14 b WHERE b.vdPercDesp = :vdPercDesp"),
    @NamedQuery(name = "BeanSagest14.findByVdPercIrpj", query = "SELECT b FROM BeanSagest14 b WHERE b.vdPercIrpj = :vdPercIrpj"),
    @NamedQuery(name = "BeanSagest14.findByMargem", query = "SELECT b FROM BeanSagest14 b WHERE b.margem = :margem"),
    @NamedQuery(name = "BeanSagest14.findByPercCssl", query = "SELECT b FROM BeanSagest14 b WHERE b.percCssl = :percCssl"),
    @NamedQuery(name = "BeanSagest14.findByPercIssqn", query = "SELECT b FROM BeanSagest14 b WHERE b.percIssqn = :percIssqn")})
public class BeanSagest14 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tb_calculo")
    private Integer tbCalculo;
    @Size(max = 30)
    @Column(name = "descricao")
    private String descricao;
    @Size(max = 1)
    @Column(name = "ct_soma_ipi")
    private String ctSomaIpi;
    @Size(max = 1)
    @Column(name = "ct_soma_icm")
    private String ctSomaIcm;
    @Size(max = 1)
    @Column(name = "ct_soma_frt")
    private String ctSomaFrt;
    @Size(max = 1)
    @Column(name = "ct_soma_seguro")
    private String ctSomaSeguro;
    @Size(max = 1)
    @Column(name = "ct_soma_outros")
    private String ctSomaOutros;
    @Size(max = 1)
    @Column(name = "ct_soma_cpmf")
    private String ctSomaCpmf;
    @Size(max = 1)
    @Column(name = "ct_dimi_icm")
    private String ctDimiIcm;
    @Size(max = 1)
    @Column(name = "ct_dimi_pis")
    private String ctDimiPis;
    @Size(max = 1)
    @Column(name = "ct_dimi_cofins")
    private String ctDimiCofins;
    @Size(max = 1)
    @Column(name = "vd_soma_icm")
    private String vdSomaIcm;
    @Size(max = 1)
    @Column(name = "vd_soma_pis")
    private String vdSomaPis;
    @Size(max = 1)
    @Column(name = "vd_soma_ipi")
    private String vdSomaIpi;
    @Size(max = 1)
    @Column(name = "vd_soma_cofins")
    private String vdSomaCofins;
    @Size(max = 1)
    @Column(name = "vd_soma_frete")
    private String vdSomaFrete;
    @Size(max = 1)
    @Column(name = "vd_soma_despesa")
    private String vdSomaDespesa;
    @Size(max = 1)
    @Column(name = "vd_soma_outros")
    private String vdSomaOutros;
    @Size(max = 1)
    @Column(name = "ct_dimi_outros")
    private String ctDimiOutros;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "vd_perc_icms")
    private Double vdPercIcms;
    @Column(name = "vd_perc_pis")
    private Double vdPercPis;
    @Column(name = "vd_perc_cofins")
    private Double vdPercCofins;
    @Column(name = "vd_perc_frete")
    private Double vdPercFrete;
    @Column(name = "vd_perc_desp")
    private Double vdPercDesp;
    @Column(name = "vd_perc_irpj")
    private Double vdPercIrpj;
    @Column(name = "margem")
    private Double margem;
    @Column(name = "perc_cssl")
    private Double percCssl;
    @Lob
    @Size(max = 65535)
    @Column(name = "obs")
    private String obs;
    @Column(name = "perc_issqn")
    private BigDecimal percIssqn;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbCalculo")
    private List<BeanSagest11> beanSagest11List;

    public BeanSagest14() {
    }

    public BeanSagest14(Integer tbCalculo) {
        this.tbCalculo = tbCalculo;
    }

    public Integer getTbCalculo() {
        return tbCalculo;
    }

    public void setTbCalculo(Integer tbCalculo) {
        this.tbCalculo = tbCalculo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCtSomaIpi() {
        return ctSomaIpi;
    }

    public void setCtSomaIpi(String ctSomaIpi) {
        this.ctSomaIpi = ctSomaIpi;
    }

    public String getCtSomaIcm() {
        return ctSomaIcm;
    }

    public void setCtSomaIcm(String ctSomaIcm) {
        this.ctSomaIcm = ctSomaIcm;
    }

    public String getCtSomaFrt() {
        return ctSomaFrt;
    }

    public void setCtSomaFrt(String ctSomaFrt) {
        this.ctSomaFrt = ctSomaFrt;
    }

    public String getCtSomaSeguro() {
        return ctSomaSeguro;
    }

    public void setCtSomaSeguro(String ctSomaSeguro) {
        this.ctSomaSeguro = ctSomaSeguro;
    }

    public String getCtSomaOutros() {
        return ctSomaOutros;
    }

    public void setCtSomaOutros(String ctSomaOutros) {
        this.ctSomaOutros = ctSomaOutros;
    }

    public String getCtSomaCpmf() {
        return ctSomaCpmf;
    }

    public void setCtSomaCpmf(String ctSomaCpmf) {
        this.ctSomaCpmf = ctSomaCpmf;
    }

    public String getCtDimiIcm() {
        return ctDimiIcm;
    }

    public void setCtDimiIcm(String ctDimiIcm) {
        this.ctDimiIcm = ctDimiIcm;
    }

    public String getCtDimiPis() {
        return ctDimiPis;
    }

    public void setCtDimiPis(String ctDimiPis) {
        this.ctDimiPis = ctDimiPis;
    }

    public String getCtDimiCofins() {
        return ctDimiCofins;
    }

    public void setCtDimiCofins(String ctDimiCofins) {
        this.ctDimiCofins = ctDimiCofins;
    }

    public String getVdSomaIcm() {
        return vdSomaIcm;
    }

    public void setVdSomaIcm(String vdSomaIcm) {
        this.vdSomaIcm = vdSomaIcm;
    }

    public String getVdSomaPis() {
        return vdSomaPis;
    }

    public void setVdSomaPis(String vdSomaPis) {
        this.vdSomaPis = vdSomaPis;
    }

    public String getVdSomaIpi() {
        return vdSomaIpi;
    }

    public void setVdSomaIpi(String vdSomaIpi) {
        this.vdSomaIpi = vdSomaIpi;
    }

    public String getVdSomaCofins() {
        return vdSomaCofins;
    }

    public void setVdSomaCofins(String vdSomaCofins) {
        this.vdSomaCofins = vdSomaCofins;
    }

    public String getVdSomaFrete() {
        return vdSomaFrete;
    }

    public void setVdSomaFrete(String vdSomaFrete) {
        this.vdSomaFrete = vdSomaFrete;
    }

    public String getVdSomaDespesa() {
        return vdSomaDespesa;
    }

    public void setVdSomaDespesa(String vdSomaDespesa) {
        this.vdSomaDespesa = vdSomaDespesa;
    }

    public String getVdSomaOutros() {
        return vdSomaOutros;
    }

    public void setVdSomaOutros(String vdSomaOutros) {
        this.vdSomaOutros = vdSomaOutros;
    }

    public String getCtDimiOutros() {
        return ctDimiOutros;
    }

    public void setCtDimiOutros(String ctDimiOutros) {
        this.ctDimiOutros = ctDimiOutros;
    }

    public Double getVdPercIcms() {
        return vdPercIcms;
    }

    public void setVdPercIcms(Double vdPercIcms) {
        this.vdPercIcms = vdPercIcms;
    }

    public Double getVdPercPis() {
        return vdPercPis;
    }

    public void setVdPercPis(Double vdPercPis) {
        this.vdPercPis = vdPercPis;
    }

    public Double getVdPercCofins() {
        return vdPercCofins;
    }

    public void setVdPercCofins(Double vdPercCofins) {
        this.vdPercCofins = vdPercCofins;
    }

    public Double getVdPercFrete() {
        return vdPercFrete;
    }

    public void setVdPercFrete(Double vdPercFrete) {
        this.vdPercFrete = vdPercFrete;
    }

    public Double getVdPercDesp() {
        return vdPercDesp;
    }

    public void setVdPercDesp(Double vdPercDesp) {
        this.vdPercDesp = vdPercDesp;
    }

    public Double getVdPercIrpj() {
        return vdPercIrpj;
    }

    public void setVdPercIrpj(Double vdPercIrpj) {
        this.vdPercIrpj = vdPercIrpj;
    }

    public Double getMargem() {
        return margem;
    }

    public void setMargem(Double margem) {
        this.margem = margem;
    }

    public Double getPercCssl() {
        return percCssl;
    }

    public void setPercCssl(Double percCssl) {
        this.percCssl = percCssl;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public BigDecimal getPercIssqn() {
        return percIssqn;
    }

    public void setPercIssqn(BigDecimal percIssqn) {
        this.percIssqn = percIssqn;
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
        hash += (tbCalculo != null ? tbCalculo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BeanSagest14)) {
            return false;
        }
        BeanSagest14 other = (BeanSagest14) object;
        if ((this.tbCalculo == null && other.tbCalculo != null) || (this.tbCalculo != null && !this.tbCalculo.equals(other.tbCalculo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bean.BeanSagest14[ tbCalculo=" + tbCalculo + " ]";
    }
    
}
