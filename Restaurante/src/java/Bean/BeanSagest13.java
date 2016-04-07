/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Fox W8
 */
@Entity
@Table(name = "sagest13")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BeanSagest13.findAll", query = "SELECT b FROM BeanSagest13 b"),
    @NamedQuery(name = "BeanSagest13.findByIdEst13", query = "SELECT b FROM BeanSagest13 b WHERE b.idEst13 = :idEst13"),
    @NamedQuery(name = "BeanSagest13.findByEstoque", query = "SELECT b FROM BeanSagest13 b WHERE b.estoque = :estoque"),
    @NamedQuery(name = "BeanSagest13.findByVlrUltCusto", query = "SELECT b FROM BeanSagest13 b WHERE b.vlrUltCusto = :vlrUltCusto"),
    @NamedQuery(name = "BeanSagest13.findByEntradaMes", query = "SELECT b FROM BeanSagest13 b WHERE b.entradaMes = :entradaMes"),
    @NamedQuery(name = "BeanSagest13.findBySaidaMes", query = "SELECT b FROM BeanSagest13 b WHERE b.saidaMes = :saidaMes"),
    @NamedQuery(name = "BeanSagest13.findByDtUltEntrada", query = "SELECT b FROM BeanSagest13 b WHERE b.dtUltEntrada = :dtUltEntrada"),
    @NamedQuery(name = "BeanSagest13.findByDtUltSaida", query = "SELECT b FROM BeanSagest13 b WHERE b.dtUltSaida = :dtUltSaida"),
    @NamedQuery(name = "BeanSagest13.findByVlrVenda", query = "SELECT b FROM BeanSagest13 b WHERE b.vlrVenda = :vlrVenda"),
    @NamedQuery(name = "BeanSagest13.findByVlrReposicao", query = "SELECT b FROM BeanSagest13 b WHERE b.vlrReposicao = :vlrReposicao"),
    @NamedQuery(name = "BeanSagest13.findByEstAnt", query = "SELECT b FROM BeanSagest13 b WHERE b.estAnt = :estAnt"),
    @NamedQuery(name = "BeanSagest13.findByQtdUltEnt", query = "SELECT b FROM BeanSagest13 b WHERE b.qtdUltEnt = :qtdUltEnt"),
    @NamedQuery(name = "BeanSagest13.findByQtdUltSai", query = "SELECT b FROM BeanSagest13 b WHERE b.qtdUltSai = :qtdUltSai"),
    @NamedQuery(name = "BeanSagest13.findByCustoMedio", query = "SELECT b FROM BeanSagest13 b WHERE b.custoMedio = :custoMedio"),
    @NamedQuery(name = "BeanSagest13.findByUltimoFrete", query = "SELECT b FROM BeanSagest13 b WHERE b.ultimoFrete = :ultimoFrete"),
    @NamedQuery(name = "BeanSagest13.findByIpi", query = "SELECT b FROM BeanSagest13 b WHERE b.ipi = :ipi"),
    @NamedQuery(name = "BeanSagest13.findByAnoAtu", query = "SELECT b FROM BeanSagest13 b WHERE b.anoAtu = :anoAtu"),
    @NamedQuery(name = "BeanSagest13.findByMesAtu", query = "SELECT b FROM BeanSagest13 b WHERE b.mesAtu = :mesAtu"),
    @NamedQuery(name = "BeanSagest13.findByMargemLucro", query = "SELECT b FROM BeanSagest13 b WHERE b.margemLucro = :margemLucro"),
    @NamedQuery(name = "BeanSagest13.findByAnterior", query = "SELECT b FROM BeanSagest13 b WHERE b.anterior = :anterior"),
    @NamedQuery(name = "BeanSagest13.findByArredPrVenda", query = "SELECT b FROM BeanSagest13 b WHERE b.arredPrVenda = :arredPrVenda"),
    @NamedQuery(name = "BeanSagest13.findByEstoqueMinimo", query = "SELECT b FROM BeanSagest13 b WHERE b.estoqueMinimo = :estoqueMinimo"),
    @NamedQuery(name = "BeanSagest13.findByPadraoProdHh", query = "SELECT b FROM BeanSagest13 b WHERE b.padraoProdHh = :padraoProdHh"),
    @NamedQuery(name = "BeanSagest13.findByTempoPadrao", query = "SELECT b FROM BeanSagest13 b WHERE b.tempoPadrao = :tempoPadrao"),
    @NamedQuery(name = "BeanSagest13.findByCustoFormula", query = "SELECT b FROM BeanSagest13 b WHERE b.custoFormula = :custoFormula"),
    @NamedQuery(name = "BeanSagest13.findByPvProvisorio", query = "SELECT b FROM BeanSagest13 b WHERE b.pvProvisorio = :pvProvisorio"),
    @NamedQuery(name = "BeanSagest13.findByReservado", query = "SELECT b FROM BeanSagest13 b WHERE b.reservado = :reservado"),
    @NamedQuery(name = "BeanSagest13.findByCustoMedioBruto", query = "SELECT b FROM BeanSagest13 b WHERE b.custoMedioBruto = :custoMedioBruto"),
    @NamedQuery(name = "BeanSagest13.findByBsSubTrib", query = "SELECT b FROM BeanSagest13 b WHERE b.bsSubTrib = :bsSubTrib"),
    @NamedQuery(name = "BeanSagest13.findByVlSubTrib", query = "SELECT b FROM BeanSagest13 b WHERE b.vlSubTrib = :vlSubTrib"),
    @NamedQuery(name = "BeanSagest13.findByPcSubTrib", query = "SELECT b FROM BeanSagest13 b WHERE b.pcSubTrib = :pcSubTrib"),
    @NamedQuery(name = "BeanSagest13.findByFormulado", query = "SELECT b FROM BeanSagest13 b WHERE b.formulado = :formulado"),
    @NamedQuery(name = "BeanSagest13.findByCustoLiq", query = "SELECT b FROM BeanSagest13 b WHERE b.custoLiq = :custoLiq"),
    @NamedQuery(name = "BeanSagest13.findByUltimoIpi", query = "SELECT b FROM BeanSagest13 b WHERE b.ultimoIpi = :ultimoIpi"),
    @NamedQuery(name = "BeanSagest13.findByImpImport", query = "SELECT b FROM BeanSagest13 b WHERE b.impImport = :impImport"),
    @NamedQuery(name = "BeanSagest13.findByPvDesc1", query = "SELECT b FROM BeanSagest13 b WHERE b.pvDesc1 = :pvDesc1"),
    @NamedQuery(name = "BeanSagest13.findByPvDesc2", query = "SELECT b FROM BeanSagest13 b WHERE b.pvDesc2 = :pvDesc2"),
    @NamedQuery(name = "BeanSagest13.findByPvDesc3", query = "SELECT b FROM BeanSagest13 b WHERE b.pvDesc3 = :pvDesc3"),
    @NamedQuery(name = "BeanSagest13.findByPvDesc4", query = "SELECT b FROM BeanSagest13 b WHERE b.pvDesc4 = :pvDesc4"),
    @NamedQuery(name = "BeanSagest13.findByMolde", query = "SELECT b FROM BeanSagest13 b WHERE b.molde = :molde"),
    @NamedQuery(name = "BeanSagest13.findByPrograma", query = "SELECT b FROM BeanSagest13 b WHERE b.programa = :programa"),
    @NamedQuery(name = "BeanSagest13.findByPathImagem", query = "SELECT b FROM BeanSagest13 b WHERE b.pathImagem = :pathImagem"),
    @NamedQuery(name = "BeanSagest13.findByMdCusto", query = "SELECT b FROM BeanSagest13 b WHERE b.mdCusto = :mdCusto"),
    @NamedQuery(name = "BeanSagest13.findByMoeda", query = "SELECT b FROM BeanSagest13 b WHERE b.moeda = :moeda")})
public class BeanSagest13 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_est13")
    private Integer idEst13;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "estoque")
    private Double estoque;
    @Column(name = "vlr_ult_custo")
    private Double vlrUltCusto;
    @Column(name = "entrada_mes")
    private Double entradaMes;
    @Column(name = "saida_mes")
    private Double saidaMes;
    @Column(name = "dt_ult_entrada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtUltEntrada;
    @Column(name = "dt_ult_saida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtUltSaida;
    @Column(name = "vlr_venda")
    private Double vlrVenda;
    @Column(name = "vlr_reposicao")
    private Double vlrReposicao;
    @Column(name = "est_ant")
    private Double estAnt;
    @Column(name = "qtd_ult_ent")
    private Double qtdUltEnt;
    @Column(name = "qtd_ult_sai")
    private Double qtdUltSai;
    @Column(name = "custo_medio")
    private Double custoMedio;
    @Column(name = "ultimo_frete")
    private Double ultimoFrete;
    @Column(name = "ipi")
    private Double ipi;
    @Column(name = "ano_atu")
    private Integer anoAtu;
    @Column(name = "mes_atu")
    private Integer mesAtu;
    @Column(name = "margem_lucro")
    private Double margemLucro;
    @Column(name = "anterior")
    private Double anterior;
    @Column(name = "arred_pr_venda")
    private Integer arredPrVenda;
    @Column(name = "estoque_minimo")
    private Double estoqueMinimo;
    @Lob
    @Size(max = 65535)
    @Column(name = "obs")
    private String obs;
    @Column(name = "padrao_prod_hh")
    private Double padraoProdHh;
    @Column(name = "tempo_padrao")
    private Integer tempoPadrao;
    @Column(name = "custo_formula")
    private Double custoFormula;
    @Column(name = "pv_provisorio")
    private Double pvProvisorio;
    @Column(name = "reservado")
    private Double reservado;
    @Column(name = "custo_medio_bruto")
    private Double custoMedioBruto;
    @Column(name = "bs_sub_trib")
    private Double bsSubTrib;
    @Column(name = "vl_sub_trib")
    private Double vlSubTrib;
    @Column(name = "pc_sub_trib")
    private Double pcSubTrib;
    @Size(max = 1)
    @Column(name = "formulado")
    private String formulado;
    @Column(name = "custo_liq")
    private Double custoLiq;
    @Column(name = "ultimo_ipi")
    private Double ultimoIpi;
    @Column(name = "imp_import")
    private BigDecimal impImport;
    @Column(name = "pv_desc1")
    private BigDecimal pvDesc1;
    @Column(name = "pv_desc2")
    private BigDecimal pvDesc2;
    @Column(name = "pv_desc3")
    private BigDecimal pvDesc3;
    @Column(name = "pv_desc4")
    private BigDecimal pvDesc4;
    @Column(name = "molde")
    private Integer molde;
    @Column(name = "programa")
    private Integer programa;
    @Size(max = 100)
    @Column(name = "path_imagem")
    private String pathImagem;
    @Column(name = "md_custo")
    private BigDecimal mdCusto;
    @Column(name = "moeda")
    private Integer moeda;
    @JoinColumn(name = "id_produto", referencedColumnName = "id_produto")
    @ManyToOne
    private BeanSagest11 idProduto;

    public BeanSagest13() {
    }

    public BeanSagest13(Integer idEst13) {
        this.idEst13 = idEst13;
    }

    public Integer getIdEst13() {
        return idEst13;
    }

    public void setIdEst13(Integer idEst13) {
        this.idEst13 = idEst13;
    }

    public Double getEstoque() {
        return estoque;
    }

    public void setEstoque(Double estoque) {
        this.estoque = estoque;
    }

    public Double getVlrUltCusto() {
        return vlrUltCusto;
    }

    public void setVlrUltCusto(Double vlrUltCusto) {
        this.vlrUltCusto = vlrUltCusto;
    }

    public Double getEntradaMes() {
        return entradaMes;
    }

    public void setEntradaMes(Double entradaMes) {
        this.entradaMes = entradaMes;
    }

    public Double getSaidaMes() {
        return saidaMes;
    }

    public void setSaidaMes(Double saidaMes) {
        this.saidaMes = saidaMes;
    }

    public Date getDtUltEntrada() {
        return dtUltEntrada;
    }

    public void setDtUltEntrada(Date dtUltEntrada) {
        this.dtUltEntrada = dtUltEntrada;
    }

    public Date getDtUltSaida() {
        return dtUltSaida;
    }

    public void setDtUltSaida(Date dtUltSaida) {
        this.dtUltSaida = dtUltSaida;
    }

    public Double getVlrVenda() {
        return vlrVenda;
    }

    public void setVlrVenda(Double vlrVenda) {
        this.vlrVenda = vlrVenda;
    }

    public Double getVlrReposicao() {
        return vlrReposicao;
    }

    public void setVlrReposicao(Double vlrReposicao) {
        this.vlrReposicao = vlrReposicao;
    }

    public Double getEstAnt() {
        return estAnt;
    }

    public void setEstAnt(Double estAnt) {
        this.estAnt = estAnt;
    }

    public Double getQtdUltEnt() {
        return qtdUltEnt;
    }

    public void setQtdUltEnt(Double qtdUltEnt) {
        this.qtdUltEnt = qtdUltEnt;
    }

    public Double getQtdUltSai() {
        return qtdUltSai;
    }

    public void setQtdUltSai(Double qtdUltSai) {
        this.qtdUltSai = qtdUltSai;
    }

    public Double getCustoMedio() {
        return custoMedio;
    }

    public void setCustoMedio(Double custoMedio) {
        this.custoMedio = custoMedio;
    }

    public Double getUltimoFrete() {
        return ultimoFrete;
    }

    public void setUltimoFrete(Double ultimoFrete) {
        this.ultimoFrete = ultimoFrete;
    }

    public Double getIpi() {
        return ipi;
    }

    public void setIpi(Double ipi) {
        this.ipi = ipi;
    }

    public Integer getAnoAtu() {
        return anoAtu;
    }

    public void setAnoAtu(Integer anoAtu) {
        this.anoAtu = anoAtu;
    }

    public Integer getMesAtu() {
        return mesAtu;
    }

    public void setMesAtu(Integer mesAtu) {
        this.mesAtu = mesAtu;
    }

    public Double getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(Double margemLucro) {
        this.margemLucro = margemLucro;
    }

    public Double getAnterior() {
        return anterior;
    }

    public void setAnterior(Double anterior) {
        this.anterior = anterior;
    }

    public Integer getArredPrVenda() {
        return arredPrVenda;
    }

    public void setArredPrVenda(Integer arredPrVenda) {
        this.arredPrVenda = arredPrVenda;
    }

    public Double getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(Double estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Double getPadraoProdHh() {
        return padraoProdHh;
    }

    public void setPadraoProdHh(Double padraoProdHh) {
        this.padraoProdHh = padraoProdHh;
    }

    public Integer getTempoPadrao() {
        return tempoPadrao;
    }

    public void setTempoPadrao(Integer tempoPadrao) {
        this.tempoPadrao = tempoPadrao;
    }

    public Double getCustoFormula() {
        return custoFormula;
    }

    public void setCustoFormula(Double custoFormula) {
        this.custoFormula = custoFormula;
    }

    public Double getPvProvisorio() {
        return pvProvisorio;
    }

    public void setPvProvisorio(Double pvProvisorio) {
        this.pvProvisorio = pvProvisorio;
    }

    public Double getReservado() {
        return reservado;
    }

    public void setReservado(Double reservado) {
        this.reservado = reservado;
    }

    public Double getCustoMedioBruto() {
        return custoMedioBruto;
    }

    public void setCustoMedioBruto(Double custoMedioBruto) {
        this.custoMedioBruto = custoMedioBruto;
    }

    public Double getBsSubTrib() {
        return bsSubTrib;
    }

    public void setBsSubTrib(Double bsSubTrib) {
        this.bsSubTrib = bsSubTrib;
    }

    public Double getVlSubTrib() {
        return vlSubTrib;
    }

    public void setVlSubTrib(Double vlSubTrib) {
        this.vlSubTrib = vlSubTrib;
    }

    public Double getPcSubTrib() {
        return pcSubTrib;
    }

    public void setPcSubTrib(Double pcSubTrib) {
        this.pcSubTrib = pcSubTrib;
    }

    public String getFormulado() {
        return formulado;
    }

    public void setFormulado(String formulado) {
        this.formulado = formulado;
    }

    public Double getCustoLiq() {
        return custoLiq;
    }

    public void setCustoLiq(Double custoLiq) {
        this.custoLiq = custoLiq;
    }

    public Double getUltimoIpi() {
        return ultimoIpi;
    }

    public void setUltimoIpi(Double ultimoIpi) {
        this.ultimoIpi = ultimoIpi;
    }

    public BigDecimal getImpImport() {
        return impImport;
    }

    public void setImpImport(BigDecimal impImport) {
        this.impImport = impImport;
    }

    public BigDecimal getPvDesc1() {
        return pvDesc1;
    }

    public void setPvDesc1(BigDecimal pvDesc1) {
        this.pvDesc1 = pvDesc1;
    }

    public BigDecimal getPvDesc2() {
        return pvDesc2;
    }

    public void setPvDesc2(BigDecimal pvDesc2) {
        this.pvDesc2 = pvDesc2;
    }

    public BigDecimal getPvDesc3() {
        return pvDesc3;
    }

    public void setPvDesc3(BigDecimal pvDesc3) {
        this.pvDesc3 = pvDesc3;
    }

    public BigDecimal getPvDesc4() {
        return pvDesc4;
    }

    public void setPvDesc4(BigDecimal pvDesc4) {
        this.pvDesc4 = pvDesc4;
    }

    public Integer getMolde() {
        return molde;
    }

    public void setMolde(Integer molde) {
        this.molde = molde;
    }

    public Integer getPrograma() {
        return programa;
    }

    public void setPrograma(Integer programa) {
        this.programa = programa;
    }

    public String getPathImagem() {
        return pathImagem;
    }

    public void setPathImagem(String pathImagem) {
        this.pathImagem = pathImagem;
    }

    public BigDecimal getMdCusto() {
        return mdCusto;
    }

    public void setMdCusto(BigDecimal mdCusto) {
        this.mdCusto = mdCusto;
    }

    public Integer getMoeda() {
        return moeda;
    }

    public void setMoeda(Integer moeda) {
        this.moeda = moeda;
    }

    public BeanSagest11 getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(BeanSagest11 idProduto) {
        this.idProduto = idProduto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEst13 != null ? idEst13.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BeanSagest13)) {
            return false;
        }
        BeanSagest13 other = (BeanSagest13) object;
        if ((this.idEst13 == null && other.idEst13 != null) || (this.idEst13 != null && !this.idEst13.equals(other.idEst13))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bean.BeanSagest13[ idEst13=" + idEst13 + " ]";
    }
    
}
