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
@Table(name = "sagger02")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BeanSagger02.findAll", query = "SELECT b FROM BeanSagger02 b"),
    @NamedQuery(name = "BeanSagger02.findByFilial", query = "SELECT b FROM BeanSagger02 b WHERE b.filial = :filial"),
    @NamedQuery(name = "BeanSagger02.findByMoeda", query = "SELECT b FROM BeanSagger02 b WHERE b.moeda = :moeda"),
    @NamedQuery(name = "BeanSagger02.findByCnpjFil", query = "SELECT b FROM BeanSagger02 b WHERE b.cnpjFil = :cnpjFil"),
    @NamedQuery(name = "BeanSagger02.findByRazaoSocial", query = "SELECT b FROM BeanSagger02 b WHERE b.razaoSocial = :razaoSocial"),
    @NamedQuery(name = "BeanSagger02.findByFantasia", query = "SELECT b FROM BeanSagger02 b WHERE b.fantasia = :fantasia"),
    @NamedQuery(name = "BeanSagger02.findByEndereco", query = "SELECT b FROM BeanSagger02 b WHERE b.endereco = :endereco"),
    @NamedQuery(name = "BeanSagger02.findByCompl", query = "SELECT b FROM BeanSagger02 b WHERE b.compl = :compl"),
    @NamedQuery(name = "BeanSagger02.findByNumero", query = "SELECT b FROM BeanSagger02 b WHERE b.numero = :numero"),
    @NamedQuery(name = "BeanSagger02.findByBairro", query = "SELECT b FROM BeanSagger02 b WHERE b.bairro = :bairro"),
    @NamedQuery(name = "BeanSagger02.findByCodCidade", query = "SELECT b FROM BeanSagger02 b WHERE b.codCidade = :codCidade"),
    @NamedQuery(name = "BeanSagger02.findByCep", query = "SELECT b FROM BeanSagger02 b WHERE b.cep = :cep"),
    @NamedQuery(name = "BeanSagger02.findByInscEst", query = "SELECT b FROM BeanSagger02 b WHERE b.inscEst = :inscEst"),
    @NamedQuery(name = "BeanSagger02.findByInscMun", query = "SELECT b FROM BeanSagger02 b WHERE b.inscMun = :inscMun"),
    @NamedQuery(name = "BeanSagger02.findByInscJunta", query = "SELECT b FROM BeanSagger02 b WHERE b.inscJunta = :inscJunta"),
    @NamedQuery(name = "BeanSagger02.findByDtConstituicao", query = "SELECT b FROM BeanSagger02 b WHERE b.dtConstituicao = :dtConstituicao"),
    @NamedQuery(name = "BeanSagger02.findByCnae", query = "SELECT b FROM BeanSagger02 b WHERE b.cnae = :cnae"),
    @NamedQuery(name = "BeanSagger02.findByDdd", query = "SELECT b FROM BeanSagger02 b WHERE b.ddd = :ddd"),
    @NamedQuery(name = "BeanSagger02.findByFone", query = "SELECT b FROM BeanSagger02 b WHERE b.fone = :fone"),
    @NamedQuery(name = "BeanSagger02.findByFax", query = "SELECT b FROM BeanSagger02 b WHERE b.fax = :fax"),
    @NamedQuery(name = "BeanSagger02.findByTipoInsc", query = "SELECT b FROM BeanSagger02 b WHERE b.tipoInsc = :tipoInsc"),
    @NamedQuery(name = "BeanSagger02.findByEmail", query = "SELECT b FROM BeanSagger02 b WHERE b.email = :email"),
    @NamedQuery(name = "BeanSagger02.findByCnpjContador", query = "SELECT b FROM BeanSagger02 b WHERE b.cnpjContador = :cnpjContador"),
    @NamedQuery(name = "BeanSagger02.findByIdGer02", query = "SELECT b FROM BeanSagger02 b WHERE b.idGer02 = :idGer02")})
public class BeanSagger02 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "filial")
    private int filial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "moeda")
    private int moeda;
    @Size(max = 14)
    @Column(name = "cnpj_fil")
    private String cnpjFil;
    @Size(max = 50)
    @Column(name = "razao_social")
    private String razaoSocial;
    @Size(max = 35)
    @Column(name = "fantasia")
    private String fantasia;
    @Size(max = 30)
    @Column(name = "endereco")
    private String endereco;
    @Size(max = 15)
    @Column(name = "compl")
    private String compl;
    @Size(max = 8)
    @Column(name = "numero")
    private String numero;
    @Size(max = 30)
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "cod_cidade")
    private Integer codCidade;
    @Column(name = "cep")
    private Integer cep;
    @Size(max = 16)
    @Column(name = "insc_est")
    private String inscEst;
    @Size(max = 10)
    @Column(name = "insc_mun")
    private String inscMun;
    @Size(max = 16)
    @Column(name = "insc_junta")
    private String inscJunta;
    @Column(name = "dt_constituicao")
    @Temporal(TemporalType.DATE)
    private Date dtConstituicao;
    @Size(max = 8)
    @Column(name = "cnae")
    private String cnae;
    @Column(name = "ddd")
    private Integer ddd;
    @Size(max = 10)
    @Column(name = "fone")
    private String fone;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Formato de telefone/fax inválido, deve ser xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 10)
    @Column(name = "fax")
    private String fax;
    @Column(name = "tipo_insc")
    private Integer tipoInsc;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="E-mail inválido")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 40)
    @Column(name = "email")
    private String email;
    @Size(max = 14)
    @Column(name = "cnpj_contador")
    private String cnpjContador;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ger02")
    private Integer idGer02;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idGer02")
    private List<BeanSagest11> beanSagest11List;
    @JoinColumn(name = "empresa", referencedColumnName = "empresa")
    @ManyToOne(optional = false)
    private BeanSagger01 empresa;

    public BeanSagger02() {
    }

    public BeanSagger02(Integer idGer02) {
        this.idGer02 = idGer02;
    }

    public BeanSagger02(Integer idGer02, int filial, int moeda) {
        this.idGer02 = idGer02;
        this.filial = filial;
        this.moeda = moeda;
    }

    public int getFilial() {
        return filial;
    }

    public void setFilial(int filial) {
        this.filial = filial;
    }

    public int getMoeda() {
        return moeda;
    }

    public void setMoeda(int moeda) {
        this.moeda = moeda;
    }

    public String getCnpjFil() {
        return cnpjFil;
    }

    public void setCnpjFil(String cnpjFil) {
        this.cnpjFil = cnpjFil;
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

    public Integer getCodCidade() {
        return codCidade;
    }

    public void setCodCidade(Integer codCidade) {
        this.codCidade = codCidade;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
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

    public String getCnae() {
        return cnae;
    }

    public void setCnae(String cnae) {
        this.cnae = cnae;
    }

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Integer getTipoInsc() {
        return tipoInsc;
    }

    public void setTipoInsc(Integer tipoInsc) {
        this.tipoInsc = tipoInsc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnpjContador() {
        return cnpjContador;
    }

    public void setCnpjContador(String cnpjContador) {
        this.cnpjContador = cnpjContador;
    }

    public Integer getIdGer02() {
        return idGer02;
    }

    public void setIdGer02(Integer idGer02) {
        this.idGer02 = idGer02;
    }

    @XmlTransient
    public List<BeanSagest11> getBeanSagest11List() {
        return beanSagest11List;
    }

    public void setBeanSagest11List(List<BeanSagest11> beanSagest11List) {
        this.beanSagest11List = beanSagest11List;
    }

    public BeanSagger01 getEmpresa() {
        return empresa;
    }

    public void setEmpresa(BeanSagger01 empresa) {
        this.empresa = empresa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGer02 != null ? idGer02.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BeanSagger02)) {
            return false;
        }
        BeanSagger02 other = (BeanSagger02) object;
        if ((this.idGer02 == null && other.idGer02 != null) || (this.idGer02 != null && !this.idGer02.equals(other.idGer02))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bean.BeanSagger02[ idGer02=" + idGer02 + " ]";
    }
    
}
