/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
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
@Table(name = "sagest11")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BeanSagest11.findAll", query = "SELECT b FROM BeanSagest11 b"),
    @NamedQuery(name = "BeanSagest11.findByIdProduto", query = "SELECT b FROM BeanSagest11 b WHERE b.idProduto = :idProduto"),
    @NamedQuery(name = "BeanSagest11.findByCentroCusto", query = "SELECT b FROM BeanSagest11 b WHERE b.centroCusto = :centroCusto"),
    @NamedQuery(name = "BeanSagest11.findByFilial", query = "SELECT b FROM BeanSagest11 b WHERE b.filial = :filial"),
    @NamedQuery(name = "BeanSagest11.findByEmpresa", query = "SELECT b FROM BeanSagest11 b WHERE b.empresa = :empresa"),
    @NamedQuery(name = "BeanSagest11.findByProduto", query = "SELECT b FROM BeanSagest11 b WHERE b.produto = :produto"),
    @NamedQuery(name = "BeanSagest11.findByDescricao", query = "SELECT b FROM BeanSagest11 b WHERE b.descricao = :descricao"),
    @NamedQuery(name = "BeanSagest11.findByClassFiscal", query = "SELECT b FROM BeanSagest11 b WHERE b.classFiscal = :classFiscal"),
    @NamedQuery(name = "BeanSagest11.findByUnidade", query = "SELECT b FROM BeanSagest11 b WHERE b.unidade = :unidade"),
    @NamedQuery(name = "BeanSagest11.findByCst", query = "SELECT b FROM BeanSagest11 b WHERE b.cst = :cst"),
    @NamedQuery(name = "BeanSagest11.findByComprimento", query = "SELECT b FROM BeanSagest11 b WHERE b.comprimento = :comprimento"),
    @NamedQuery(name = "BeanSagest11.findByLargura", query = "SELECT b FROM BeanSagest11 b WHERE b.largura = :largura"),
    @NamedQuery(name = "BeanSagest11.findByAltura", query = "SELECT b FROM BeanSagest11 b WHERE b.altura = :altura"),
    @NamedQuery(name = "BeanSagest11.findByVolumeCub", query = "SELECT b FROM BeanSagest11 b WHERE b.volumeCub = :volumeCub"),
    @NamedQuery(name = "BeanSagest11.findByArea", query = "SELECT b FROM BeanSagest11 b WHERE b.area = :area"),
    @NamedQuery(name = "BeanSagest11.findByPesoBruto", query = "SELECT b FROM BeanSagest11 b WHERE b.pesoBruto = :pesoBruto"),
    @NamedQuery(name = "BeanSagest11.findByPesoLiquido", query = "SELECT b FROM BeanSagest11 b WHERE b.pesoLiquido = :pesoLiquido"),
    @NamedQuery(name = "BeanSagest11.findByEan13", query = "SELECT b FROM BeanSagest11 b WHERE b.ean13 = :ean13"),
    @NamedQuery(name = "BeanSagest11.findByGrupo", query = "SELECT b FROM BeanSagest11 b WHERE b.grupo = :grupo"),
    @NamedQuery(name = "BeanSagest11.findByStGarantia", query = "SELECT b FROM BeanSagest11 b WHERE b.stGarantia = :stGarantia"),
    @NamedQuery(name = "BeanSagest11.findByGarantiaMeses", query = "SELECT b FROM BeanSagest11 b WHERE b.garantiaMeses = :garantiaMeses"),
    @NamedQuery(name = "BeanSagest11.findByDtCadastro", query = "SELECT b FROM BeanSagest11 b WHERE b.dtCadastro = :dtCadastro"),
    @NamedQuery(name = "BeanSagest11.findByStProduto", query = "SELECT b FROM BeanSagest11 b WHERE b.stProduto = :stProduto"),
    @NamedQuery(name = "BeanSagest11.findByStTransm", query = "SELECT b FROM BeanSagest11 b WHERE b.stTransm = :stTransm"),
    @NamedQuery(name = "BeanSagest11.findByDtTransm", query = "SELECT b FROM BeanSagest11 b WHERE b.dtTransm = :dtTransm"),
    @NamedQuery(name = "BeanSagest11.findByUnidadeCompra", query = "SELECT b FROM BeanSagest11 b WHERE b.unidadeCompra = :unidadeCompra"),
    @NamedQuery(name = "BeanSagest11.findByFatorConversao", query = "SELECT b FROM BeanSagest11 b WHERE b.fatorConversao = :fatorConversao"),
    @NamedQuery(name = "BeanSagest11.findByIcms", query = "SELECT b FROM BeanSagest11 b WHERE b.icms = :icms"),
    @NamedQuery(name = "BeanSagest11.findByEmbalagem", query = "SELECT b FROM BeanSagest11 b WHERE b.embalagem = :embalagem"),
    @NamedQuery(name = "BeanSagest11.findByIntTmp", query = "SELECT b FROM BeanSagest11 b WHERE b.intTmp = :intTmp"),
    @NamedQuery(name = "BeanSagest11.findByFormulado", query = "SELECT b FROM BeanSagest11 b WHERE b.formulado = :formulado"),
    @NamedQuery(name = "BeanSagest11.findByRevenda", query = "SELECT b FROM BeanSagest11 b WHERE b.revenda = :revenda"),
    @NamedQuery(name = "BeanSagest11.findBySitTribIcms", query = "SELECT b FROM BeanSagest11 b WHERE b.sitTribIcms = :sitTribIcms"),
    @NamedQuery(name = "BeanSagest11.findByOrigem", query = "SELECT b FROM BeanSagest11 b WHERE b.origem = :origem"),
    @NamedQuery(name = "BeanSagest11.findByIsento", query = "SELECT b FROM BeanSagest11 b WHERE b.isento = :isento"),
    @NamedQuery(name = "BeanSagest11.findByCodForn", query = "SELECT b FROM BeanSagest11 b WHERE b.codForn = :codForn"),
    @NamedQuery(name = "BeanSagest11.findByServico", query = "SELECT b FROM BeanSagest11 b WHERE b.servico = :servico"),
    @NamedQuery(name = "BeanSagest11.findByEndEst", query = "SELECT b FROM BeanSagest11 b WHERE b.endEst = :endEst"),
    @NamedQuery(name = "BeanSagest11.findByIcmsFora", query = "SELECT b FROM BeanSagest11 b WHERE b.icmsFora = :icmsFora")})
public class BeanSagest11 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_produto")
    private Integer idProduto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "centro_custo")
    private int centroCusto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "filial")
    private int filial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "empresa")
    private int empresa;
    @Size(max = 9)
    @Column(name = "produto")
    private String produto;
    @Size(max = 70)
    @Column(name = "descricao")
    private String descricao;
    @Size(max = 12)
    @Column(name = "class_fiscal")
    private String classFiscal;
    @Size(max = 3)
    @Column(name = "unidade")
    private String unidade;
    @Size(max = 4)
    @Column(name = "cst")
    private String cst;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "comprimento")
    private Double comprimento;
    @Column(name = "largura")
    private Double largura;
    @Column(name = "altura")
    private Double altura;
    @Column(name = "volume_cub")
    private Double volumeCub;
    @Column(name = "area")
    private Double area;
    @Column(name = "peso_bruto")
    private Double pesoBruto;
    @Column(name = "peso_liquido")
    private Double pesoLiquido;
    @Size(max = 13)
    @Column(name = "ean_13")
    private String ean13;
    @Size(max = 4)
    @Column(name = "grupo")
    private String grupo;
    @Size(max = 1)
    @Column(name = "st_garantia")
    private String stGarantia;
    @Column(name = "garantia_meses")
    private Integer garantiaMeses;
    @Column(name = "dt_cadastro")
    @Temporal(TemporalType.DATE)
    private Date dtCadastro;
    @Column(name = "st_produto")
    private Integer stProduto;
    @Size(max = 1)
    @Column(name = "st_transm")
    private String stTransm;
    @Column(name = "dt_transm")
    @Temporal(TemporalType.DATE)
    private Date dtTransm;
    @Size(max = 3)
    @Column(name = "unidade_compra")
    private String unidadeCompra;
    @Column(name = "fator_conversao")
    private Double fatorConversao;
    @Column(name = "icms")
    private Double icms;
    @Size(max = 10)
    @Column(name = "embalagem")
    private String embalagem;
    @Column(name = "int_tmp")
    private Integer intTmp;
    @Column(name = "formulado")
    private Character formulado;
    @Column(name = "revenda")
    private Character revenda;
    @Size(max = 2)
    @Column(name = "sit_trib_icms")
    private String sitTribIcms;
    @Size(max = 1)
    @Column(name = "origem")
    private String origem;
    @Column(name = "isento")
    private Character isento;
    @Size(max = 16)
    @Column(name = "cod_forn")
    private String codForn;
    @Column(name = "servico")
    private Character servico;
    @Size(max = 45)
    @Column(name = "end_est")
    private String endEst;
    @Column(name = "icms_fora")
    private BigDecimal icmsFora;
    @JoinColumn(name = "tb_calculo", referencedColumnName = "tb_calculo")
    @ManyToOne(optional = false)
    private BeanSagest14 tbCalculo;
    @JoinColumn(name = "id_grupo", referencedColumnName = "id_grupo")
    @ManyToOne(optional = false)
    private BeanSagest12 idGrupo;
    @JoinColumn(name = "id_ger02", referencedColumnName = "id_ger02")
    @ManyToOne(optional = false)
    private BeanSagger02 idGer02;
    @JoinColumn(name = "tp_produto", referencedColumnName = "tp_produto")
    @ManyToOne
    private BeanSagest16 tpProduto;
    @OneToMany(mappedBy = "idProduto")
    private List<BeanSagest13> beanSagest13List;
    @OneToMany(mappedBy = "idProduto")
    private List<BeanItensMesa> beanItensMesaList;

    public BeanSagest11() {
    }

    public BeanSagest11(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public BeanSagest11(Integer idProduto, int centroCusto, int filial, int empresa) {
        this.idProduto = idProduto;
        this.centroCusto = centroCusto;
        this.filial = filial;
        this.empresa = empresa;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public int getCentroCusto() {
        return centroCusto;
    }

    public void setCentroCusto(int centroCusto) {
        this.centroCusto = centroCusto;
    }

    public int getFilial() {
        return filial;
    }

    public void setFilial(int filial) {
        this.filial = filial;
    }

    public int getEmpresa() {
        return empresa;
    }

    public void setEmpresa(int empresa) {
        this.empresa = empresa;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getClassFiscal() {
        return classFiscal;
    }

    public void setClassFiscal(String classFiscal) {
        this.classFiscal = classFiscal;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getCst() {
        return cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getVolumeCub() {
        return volumeCub;
    }

    public void setVolumeCub(Double volumeCub) {
        this.volumeCub = volumeCub;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(Double pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public Double getPesoLiquido() {
        return pesoLiquido;
    }

    public void setPesoLiquido(Double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }

    public String getEan13() {
        return ean13;
    }

    public void setEan13(String ean13) {
        this.ean13 = ean13;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getStGarantia() {
        return stGarantia;
    }

    public void setStGarantia(String stGarantia) {
        this.stGarantia = stGarantia;
    }

    public Integer getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(Integer garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public Integer getStProduto() {
        return stProduto;
    }

    public void setStProduto(Integer stProduto) {
        this.stProduto = stProduto;
    }

    public String getStTransm() {
        return stTransm;
    }

    public void setStTransm(String stTransm) {
        this.stTransm = stTransm;
    }

    public Date getDtTransm() {
        return dtTransm;
    }

    public void setDtTransm(Date dtTransm) {
        this.dtTransm = dtTransm;
    }

    public String getUnidadeCompra() {
        return unidadeCompra;
    }

    public void setUnidadeCompra(String unidadeCompra) {
        this.unidadeCompra = unidadeCompra;
    }

    public Double getFatorConversao() {
        return fatorConversao;
    }

    public void setFatorConversao(Double fatorConversao) {
        this.fatorConversao = fatorConversao;
    }

    public Double getIcms() {
        return icms;
    }

    public void setIcms(Double icms) {
        this.icms = icms;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }

    public Integer getIntTmp() {
        return intTmp;
    }

    public void setIntTmp(Integer intTmp) {
        this.intTmp = intTmp;
    }

    public Character getFormulado() {
        return formulado;
    }

    public void setFormulado(Character formulado) {
        this.formulado = formulado;
    }

    public Character getRevenda() {
        return revenda;
    }

    public void setRevenda(Character revenda) {
        this.revenda = revenda;
    }

    public String getSitTribIcms() {
        return sitTribIcms;
    }

    public void setSitTribIcms(String sitTribIcms) {
        this.sitTribIcms = sitTribIcms;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public Character getIsento() {
        return isento;
    }

    public void setIsento(Character isento) {
        this.isento = isento;
    }

    public String getCodForn() {
        return codForn;
    }

    public void setCodForn(String codForn) {
        this.codForn = codForn;
    }

    public Character getServico() {
        return servico;
    }

    public void setServico(Character servico) {
        this.servico = servico;
    }

    public String getEndEst() {
        return endEst;
    }

    public void setEndEst(String endEst) {
        this.endEst = endEst;
    }

    public BigDecimal getIcmsFora() {
        return icmsFora;
    }

    public void setIcmsFora(BigDecimal icmsFora) {
        this.icmsFora = icmsFora;
    }

    public BeanSagest14 getTbCalculo() {
        return tbCalculo;
    }

    public void setTbCalculo(BeanSagest14 tbCalculo) {
        this.tbCalculo = tbCalculo;
    }

    public BeanSagest12 getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(BeanSagest12 idGrupo) {
        this.idGrupo = idGrupo;
    }

    public BeanSagger02 getIdGer02() {
        return idGer02;
    }

    public void setIdGer02(BeanSagger02 idGer02) {
        this.idGer02 = idGer02;
    }

    public BeanSagest16 getTpProduto() {
        return tpProduto;
    }

    public void setTpProduto(BeanSagest16 tpProduto) {
        this.tpProduto = tpProduto;
    }

    @XmlTransient
    public List<BeanSagest13> getBeanSagest13List() {
        return beanSagest13List;
    }

    public void setBeanSagest13List(List<BeanSagest13> beanSagest13List) {
        this.beanSagest13List = beanSagest13List;
    }

    @XmlTransient
    public List<BeanItensMesa> getBeanItensMesaList() {
        return beanItensMesaList;
    }

    public void setBeanItensMesaList(List<BeanItensMesa> beanItensMesaList) {
        this.beanItensMesaList = beanItensMesaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProduto != null ? idProduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BeanSagest11)) {
            return false;
        }
        BeanSagest11 other = (BeanSagest11) object;
        if ((this.idProduto == null && other.idProduto != null) || (this.idProduto != null && !this.idProduto.equals(other.idProduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bean.BeanSagest11[ idProduto=" + idProduto + " ]";
    }
    
}
