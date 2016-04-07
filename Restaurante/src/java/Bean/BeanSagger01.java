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
@Table(name = "sagger01")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BeanSagger01.findAll", query = "SELECT b FROM BeanSagger01 b"),
    @NamedQuery(name = "BeanSagger01.findByEmpresa", query = "SELECT b FROM BeanSagger01 b WHERE b.empresa = :empresa"),
    @NamedQuery(name = "BeanSagger01.findByRazao", query = "SELECT b FROM BeanSagger01 b WHERE b.razao = :razao"),
    @NamedQuery(name = "BeanSagger01.findByFantasia", query = "SELECT b FROM BeanSagger01 b WHERE b.fantasia = :fantasia"),
    @NamedQuery(name = "BeanSagger01.findByEndereco", query = "SELECT b FROM BeanSagger01 b WHERE b.endereco = :endereco"),
    @NamedQuery(name = "BeanSagger01.findByBairro", query = "SELECT b FROM BeanSagger01 b WHERE b.bairro = :bairro"),
    @NamedQuery(name = "BeanSagger01.findByNumero", query = "SELECT b FROM BeanSagger01 b WHERE b.numero = :numero"),
    @NamedQuery(name = "BeanSagger01.findByCompl", query = "SELECT b FROM BeanSagger01 b WHERE b.compl = :compl"),
    @NamedQuery(name = "BeanSagger01.findByReserva2", query = "SELECT b FROM BeanSagger01 b WHERE b.reserva2 = :reserva2"),
    @NamedQuery(name = "BeanSagger01.findByCep", query = "SELECT b FROM BeanSagger01 b WHERE b.cep = :cep"),
    @NamedQuery(name = "BeanSagger01.findByDdd", query = "SELECT b FROM BeanSagger01 b WHERE b.ddd = :ddd"),
    @NamedQuery(name = "BeanSagger01.findByTelefone", query = "SELECT b FROM BeanSagger01 b WHERE b.telefone = :telefone"),
    @NamedQuery(name = "BeanSagger01.findByFax", query = "SELECT b FROM BeanSagger01 b WHERE b.fax = :fax"),
    @NamedQuery(name = "BeanSagger01.findByTipoInsc", query = "SELECT b FROM BeanSagger01 b WHERE b.tipoInsc = :tipoInsc"),
    @NamedQuery(name = "BeanSagger01.findByCnpj", query = "SELECT b FROM BeanSagger01 b WHERE b.cnpj = :cnpj"),
    @NamedQuery(name = "BeanSagger01.findByEMail", query = "SELECT b FROM BeanSagger01 b WHERE b.eMail = :eMail"),
    @NamedQuery(name = "BeanSagger01.findByHomePage", query = "SELECT b FROM BeanSagger01 b WHERE b.homePage = :homePage"),
    @NamedQuery(name = "BeanSagger01.findByCodCidade", query = "SELECT b FROM BeanSagger01 b WHERE b.codCidade = :codCidade"),
    @NamedQuery(name = "BeanSagger01.findByContador", query = "SELECT b FROM BeanSagger01 b WHERE b.contador = :contador"),
    @NamedQuery(name = "BeanSagger01.findByCrcContador", query = "SELECT b FROM BeanSagger01 b WHERE b.crcContador = :crcContador"),
    @NamedQuery(name = "BeanSagger01.findByNrCtaCli", query = "SELECT b FROM BeanSagger01 b WHERE b.nrCtaCli = :nrCtaCli"),
    @NamedQuery(name = "BeanSagger01.findByNrCtaFor", query = "SELECT b FROM BeanSagger01 b WHERE b.nrCtaFor = :nrCtaFor"),
    @NamedQuery(name = "BeanSagger01.findByTamContaCtb", query = "SELECT b FROM BeanSagger01 b WHERE b.tamContaCtb = :tamContaCtb")})
public class BeanSagger01 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "empresa")
    private Integer empresa;
    @Size(max = 40)
    @Column(name = "razao")
    private String razao;
    @Size(max = 40)
    @Column(name = "fantasia")
    private String fantasia;
    @Size(max = 30)
    @Column(name = "endereco")
    private String endereco;
    @Size(max = 25)
    @Column(name = "bairro")
    private String bairro;
    @Size(max = 10)
    @Column(name = "numero")
    private String numero;
    @Size(max = 20)
    @Column(name = "compl")
    private String compl;
    @Size(max = 2)
    @Column(name = "reserva_2")
    private String reserva2;
    @Size(max = 10)
    @Column(name = "cep")
    private String cep;
    @Column(name = "ddd")
    private Integer ddd;
    @Size(max = 10)
    @Column(name = "telefone")
    private String telefone;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Formato de telefone/fax inválido, deve ser xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 10)
    @Column(name = "fax")
    private String fax;
    @Column(name = "tipo_insc")
    private Integer tipoInsc;
    @Size(max = 14)
    @Column(name = "cnpj")
    private String cnpj;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="E-mail inválido")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 35)
    @Column(name = "e_mail")
    private String eMail;
    @Size(max = 35)
    @Column(name = "home_page")
    private String homePage;
    @Column(name = "cod_cidade")
    private Integer codCidade;
    @Size(max = 35)
    @Column(name = "contador")
    private String contador;
    @Size(max = 20)
    @Column(name = "crc_contador")
    private String crcContador;
    @Column(name = "nr_cta_cli")
    private Integer nrCtaCli;
    @Column(name = "nr_cta_for")
    private Integer nrCtaFor;
    @Column(name = "tam_conta_ctb")
    private Integer tamContaCtb;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresa")
    private List<BeanSagger02> beanSagger02List;

    public BeanSagger01() {
    }

    public BeanSagger01(Integer empresa) {
        this.empresa = empresa;
    }

    public Integer getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Integer empresa) {
        this.empresa = empresa;
    }

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
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

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCompl() {
        return compl;
    }

    public void setCompl(String compl) {
        this.compl = compl;
    }

    public String getReserva2() {
        return reserva2;
    }

    public void setReserva2(String reserva2) {
        this.reserva2 = reserva2;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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

    public Integer getCodCidade() {
        return codCidade;
    }

    public void setCodCidade(Integer codCidade) {
        this.codCidade = codCidade;
    }

    public String getContador() {
        return contador;
    }

    public void setContador(String contador) {
        this.contador = contador;
    }

    public String getCrcContador() {
        return crcContador;
    }

    public void setCrcContador(String crcContador) {
        this.crcContador = crcContador;
    }

    public Integer getNrCtaCli() {
        return nrCtaCli;
    }

    public void setNrCtaCli(Integer nrCtaCli) {
        this.nrCtaCli = nrCtaCli;
    }

    public Integer getNrCtaFor() {
        return nrCtaFor;
    }

    public void setNrCtaFor(Integer nrCtaFor) {
        this.nrCtaFor = nrCtaFor;
    }

    public Integer getTamContaCtb() {
        return tamContaCtb;
    }

    public void setTamContaCtb(Integer tamContaCtb) {
        this.tamContaCtb = tamContaCtb;
    }

    @XmlTransient
    public List<BeanSagger02> getBeanSagger02List() {
        return beanSagger02List;
    }

    public void setBeanSagger02List(List<BeanSagger02> beanSagger02List) {
        this.beanSagger02List = beanSagger02List;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empresa != null ? empresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BeanSagger01)) {
            return false;
        }
        BeanSagger01 other = (BeanSagger01) object;
        if ((this.empresa == null && other.empresa != null) || (this.empresa != null && !this.empresa.equals(other.empresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bean.BeanSagger01[ empresa=" + empresa + " ]";
    }
    
}
