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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Fox W8
 */
@Entity
@Table(name = "sagrec60")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BeanSagrec60.findAll", query = "SELECT b FROM BeanSagrec60 b"),
    @NamedQuery(name = "BeanSagrec60.findByCnpjForcli", query = "SELECT b FROM BeanSagrec60 b WHERE b.cnpjForcli = :cnpjForcli"),
    @NamedQuery(name = "BeanSagrec60.findByIdRec60", query = "SELECT b FROM BeanSagrec60 b WHERE b.idRec60 = :idRec60"),
    @NamedQuery(name = "BeanSagrec60.findByCodCidade", query = "SELECT b FROM BeanSagrec60 b WHERE b.codCidade = :codCidade"),
    @NamedQuery(name = "BeanSagrec60.findByRazaoSocial", query = "SELECT b FROM BeanSagrec60 b WHERE b.razaoSocial = :razaoSocial"),
    @NamedQuery(name = "BeanSagrec60.findByFantasia", query = "SELECT b FROM BeanSagrec60 b WHERE b.fantasia = :fantasia"),
    @NamedQuery(name = "BeanSagrec60.findByEndereco", query = "SELECT b FROM BeanSagrec60 b WHERE b.endereco = :endereco"),
    @NamedQuery(name = "BeanSagrec60.findByCompl", query = "SELECT b FROM BeanSagrec60 b WHERE b.compl = :compl"),
    @NamedQuery(name = "BeanSagrec60.findByNumero", query = "SELECT b FROM BeanSagrec60 b WHERE b.numero = :numero"),
    @NamedQuery(name = "BeanSagrec60.findByBairro", query = "SELECT b FROM BeanSagrec60 b WHERE b.bairro = :bairro"),
    @NamedQuery(name = "BeanSagrec60.findByCep", query = "SELECT b FROM BeanSagrec60 b WHERE b.cep = :cep"),
    @NamedQuery(name = "BeanSagrec60.findByDddFone", query = "SELECT b FROM BeanSagrec60 b WHERE b.dddFone = :dddFone"),
    @NamedQuery(name = "BeanSagrec60.findByNumFone", query = "SELECT b FROM BeanSagrec60 b WHERE b.numFone = :numFone"),
    @NamedQuery(name = "BeanSagrec60.findByDddFax", query = "SELECT b FROM BeanSagrec60 b WHERE b.dddFax = :dddFax"),
    @NamedQuery(name = "BeanSagrec60.findByNumFax", query = "SELECT b FROM BeanSagrec60 b WHERE b.numFax = :numFax"),
    @NamedQuery(name = "BeanSagrec60.findByDddCelular", query = "SELECT b FROM BeanSagrec60 b WHERE b.dddCelular = :dddCelular"),
    @NamedQuery(name = "BeanSagrec60.findByNumCelular", query = "SELECT b FROM BeanSagrec60 b WHERE b.numCelular = :numCelular"),
    @NamedQuery(name = "BeanSagrec60.findByInscEst", query = "SELECT b FROM BeanSagrec60 b WHERE b.inscEst = :inscEst"),
    @NamedQuery(name = "BeanSagrec60.findByInscMun", query = "SELECT b FROM BeanSagrec60 b WHERE b.inscMun = :inscMun"),
    @NamedQuery(name = "BeanSagrec60.findByInscJunta", query = "SELECT b FROM BeanSagrec60 b WHERE b.inscJunta = :inscJunta"),
    @NamedQuery(name = "BeanSagrec60.findByDtConstituicao", query = "SELECT b FROM BeanSagrec60 b WHERE b.dtConstituicao = :dtConstituicao"),
    @NamedQuery(name = "BeanSagrec60.findByInscConsRegional", query = "SELECT b FROM BeanSagrec60 b WHERE b.inscConsRegional = :inscConsRegional"),
    @NamedQuery(name = "BeanSagrec60.findByTipoInsc", query = "SELECT b FROM BeanSagrec60 b WHERE b.tipoInsc = :tipoInsc"),
    @NamedQuery(name = "BeanSagrec60.findByHomePage", query = "SELECT b FROM BeanSagrec60 b WHERE b.homePage = :homePage"),
    @NamedQuery(name = "BeanSagrec60.findByEmail", query = "SELECT b FROM BeanSagrec60 b WHERE b.email = :email"),
    @NamedQuery(name = "BeanSagrec60.findByStTransp", query = "SELECT b FROM BeanSagrec60 b WHERE b.stTransp = :stTransp"),
    @NamedQuery(name = "BeanSagrec60.findByStForn", query = "SELECT b FROM BeanSagrec60 b WHERE b.stForn = :stForn"),
    @NamedQuery(name = "BeanSagrec60.findByStClie", query = "SELECT b FROM BeanSagrec60 b WHERE b.stClie = :stClie"),
    @NamedQuery(name = "BeanSagrec60.findByTare", query = "SELECT b FROM BeanSagrec60 b WHERE b.tare = :tare"),
    @NamedQuery(name = "BeanSagrec60.findByPercTare", query = "SELECT b FROM BeanSagrec60 b WHERE b.percTare = :percTare"),
    @NamedQuery(name = "BeanSagrec60.findByCodFiscal", query = "SELECT b FROM BeanSagrec60 b WHERE b.codFiscal = :codFiscal"),
    @NamedQuery(name = "BeanSagrec60.findByStEndereco", query = "SELECT b FROM BeanSagrec60 b WHERE b.stEndereco = :stEndereco"),
    @NamedQuery(name = "BeanSagrec60.findBySuframa", query = "SELECT b FROM BeanSagrec60 b WHERE b.suframa = :suframa"),
    @NamedQuery(name = "BeanSagrec60.findByCodOld", query = "SELECT b FROM BeanSagrec60 b WHERE b.codOld = :codOld"),
    @NamedQuery(name = "BeanSagrec60.findByEmailNfe", query = "SELECT b FROM BeanSagrec60 b WHERE b.emailNfe = :emailNfe"),
    @NamedQuery(name = "BeanSagrec60.findByCodPais", query = "SELECT b FROM BeanSagrec60 b WHERE b.codPais = :codPais")})
public class BeanSagrec60 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "cnpj_forcli")
    private String cnpjForcli;
    @Basic(optional = false)
    @Column(name = "id_rec60")
    private int idRec60;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_cidade")
    private int codCidade;
    @Size(max = 100)
    @Column(name = "razao_social")
    private String razaoSocial;
    @Size(max = 100)
    @Column(name = "fantasia")
    private String fantasia;
    @Size(max = 100)
    @Column(name = "endereco")
    private String endereco;
    @Size(max = 30)
    @Column(name = "compl")
    private String compl;
    @Size(max = 10)
    @Column(name = "numero")
    private String numero;
    @Size(max = 35)
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "cep")
    private Integer cep;
    @Column(name = "ddd_fone")
    private Integer dddFone;
    @Column(name = "num_fone")
    private Integer numFone;
    @Column(name = "ddd_fax")
    private Integer dddFax;
    @Column(name = "num_fax")
    private Integer numFax;
    @Column(name = "ddd_celular")
    private Integer dddCelular;
    @Column(name = "num_celular")
    private Integer numCelular;
    @Size(max = 16)
    @Column(name = "insc_est")
    private String inscEst;
    @Size(max = 16)
    @Column(name = "insc_mun")
    private String inscMun;
    @Size(max = 16)
    @Column(name = "insc_junta")
    private String inscJunta;
    @Column(name = "dt_constituicao")
    @Temporal(TemporalType.DATE)
    private Date dtConstituicao;
    @Size(max = 16)
    @Column(name = "insc_cons_regional")
    private String inscConsRegional;
    @Column(name = "tipo_insc")
    private Integer tipoInsc;
    @Size(max = 35)
    @Column(name = "home_page")
    private String homePage;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="E-mail inválido")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 150)
    @Column(name = "email")
    private String email;
    @Size(max = 1)
    @Column(name = "st_transp")
    private String stTransp;
    @Size(max = 1)
    @Column(name = "st_forn")
    private String stForn;
    @Size(max = 1)
    @Column(name = "st_clie")
    private String stClie;
    @Size(max = 1)
    @Column(name = "tare")
    private String tare;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "perc_tare")
    private Double percTare;
    @Size(max = 15)
    @Column(name = "cod_fiscal")
    private String codFiscal;
    @Column(name = "st_endereco")
    private Character stEndereco;
    @Size(max = 20)
    @Column(name = "suframa")
    private String suframa;
    @Column(name = "cod_old")
    private Integer codOld;
    @Size(max = 150)
    @Column(name = "email_nfe")
    private String emailNfe;
    @Column(name = "cod_pais")
    private Integer codPais;
    @JoinColumn(name = "id_rec30", referencedColumnName = "id_rec30")
    @ManyToOne(optional = false)
    private BeanSagrec30 idRec30;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cnpjForcli")
    private List<BeanSagven63> beanSagven63List;

    public BeanSagrec60() {
    }

    public BeanSagrec60(String cnpjForcli) {
        this.cnpjForcli = cnpjForcli;
    }

    public BeanSagrec60(String cnpjForcli, int idRec60, int codCidade) {
        this.cnpjForcli = cnpjForcli;
        this.idRec60 = idRec60;
        this.codCidade = codCidade;
    }

    public String getCnpjForcli() {
        return cnpjForcli;
    }

    public void setCnpjForcli(String cnpjForcli) {
        this.cnpjForcli = cnpjForcli;
    }

    public int getIdRec60() {
        return idRec60;
    }

    public void setIdRec60(int idRec60) {
        this.idRec60 = idRec60;
    }

    public int getCodCidade() {
        return codCidade;
    }

    public void setCodCidade(int codCidade) {
        this.codCidade = codCidade;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCompl() {
        return compl;
    }

    public void setCompl(String compl) {
        this.compl = compl;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public Integer getDddFone() {
        return dddFone;
    }

    public void setDddFone(Integer dddFone) {
        this.dddFone = dddFone;
    }

    public Integer getNumFone() {
        return numFone;
    }

    public void setNumFone(Integer numFone) {
        this.numFone = numFone;
    }

    public Integer getDddFax() {
        return dddFax;
    }

    public void setDddFax(Integer dddFax) {
        this.dddFax = dddFax;
    }

    public Integer getNumFax() {
        return numFax;
    }

    public void setNumFax(Integer numFax) {
        this.numFax = numFax;
    }

    public Integer getDddCelular() {
        return dddCelular;
    }

    public void setDddCelular(Integer dddCelular) {
        this.dddCelular = dddCelular;
    }

    public Integer getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(Integer numCelular) {
        this.numCelular = numCelular;
    }

    public String getInscEst() {
        return inscEst;
    }

    public void setInscEst(String inscEst) {
        this.inscEst = inscEst;
    }

    public String getInscMun() {
        return inscMun;
    }

    public void setInscMun(String inscMun) {
        this.inscMun = inscMun;
    }

    public String getInscJunta() {
        return inscJunta;
    }

    public void setInscJunta(String inscJunta) {
        this.inscJunta = inscJunta;
    }

    public Date getDtConstituicao() {
        return dtConstituicao;
    }

    public void setDtConstituicao(Date dtConstituicao) {
        this.dtConstituicao = dtConstituicao;
    }

    public String getInscConsRegional() {
        return inscConsRegional;
    }

    public void setInscConsRegional(String inscConsRegional) {
        this.inscConsRegional = inscConsRegional;
    }

    public Integer getTipoInsc() {
        return tipoInsc;
    }

    public void setTipoInsc(Integer tipoInsc) {
        this.tipoInsc = tipoInsc;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStTransp() {
        return stTransp;
    }

    public void setStTransp(String stTransp) {
        this.stTransp = stTransp;
    }

    public String getStForn() {
        return stForn;
    }

    public void setStForn(String stForn) {
        this.stForn = stForn;
    }

    public String getStClie() {
        return stClie;
    }

    public void setStClie(String stClie) {
        this.stClie = stClie;
    }

    public String getTare() {
        return tare;
    }

    public void setTare(String tare) {
        this.tare = tare;
    }

    public Double getPercTare() {
        return percTare;
    }

    public void setPercTare(Double percTare) {
        this.percTare = percTare;
    }

    public String getCodFiscal() {
        return codFiscal;
    }

    public void setCodFiscal(String codFiscal) {
        this.codFiscal = codFiscal;
    }

    public Character getStEndereco() {
        return stEndereco;
    }

    public void setStEndereco(Character stEndereco) {
        this.stEndereco = stEndereco;
    }

    public String getSuframa() {
        return suframa;
    }

    public void setSuframa(String suframa) {
        this.suframa = suframa;
    }

    public Integer getCodOld() {
        return codOld;
    }

    public void setCodOld(Integer codOld) {
        this.codOld = codOld;
    }

    public String getEmailNfe() {
        return emailNfe;
    }

    public void setEmailNfe(String emailNfe) {
        this.emailNfe = emailNfe;
    }

    public Integer getCodPais() {
        return codPais;
    }

    public void setCodPais(Integer codPais) {
        this.codPais = codPais;
    }

    public BeanSagrec30 getIdRec30() {
        return idRec30;
    }

    public void setIdRec30(BeanSagrec30 idRec30) {
        this.idRec30 = idRec30;
    }

    @XmlTransient
    public List<BeanSagven63> getBeanSagven63List() {
        return beanSagven63List;
    }

    public void setBeanSagven63List(List<BeanSagven63> beanSagven63List) {
        this.beanSagven63List = beanSagven63List;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cnpjForcli != null ? cnpjForcli.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BeanSagrec60)) {
            return false;
        }
        BeanSagrec60 other = (BeanSagrec60) object;
        if ((this.cnpjForcli == null && other.cnpjForcli != null) || (this.cnpjForcli != null && !this.cnpjForcli.equals(other.cnpjForcli))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bean.BeanSagrec60[ cnpjForcli=" + cnpjForcli + " ]";
    }
    
}
