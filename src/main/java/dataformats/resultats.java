package dataformats;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ",")
public class resultats {
    @DataField(pos = 1)
    private String idmesa;
    @DataField(pos = 2)
    private String codimesa;
    @DataField(pos = 3)
    private String mesatancada;
    @DataField(pos = 4)
    private String comarca;
    @DataField(pos = 5)
    private Integer vnuls = 0;
    @DataField(pos = 6)
    private Integer vblancs = 0;
    @DataField(pos = 7)
    private Integer verc = 0;
    @DataField(pos = 8)
    private Integer vjxc = 0;
    @DataField(pos = 9)
    private Integer vcup = 0;
    @DataField(pos = 10)
    private Integer vpsc = 0;
    @DataField(pos = 11)
    private Integer vcs = 0;
    @DataField(pos = 12)
    private Integer vppc = 0;
    @DataField(pos = 13)
    private Integer vcom = 0;
    @DataField(pos = 14)
    private Integer vpacma = 0;
    @DataField(pos = 15)
    private Integer vdialeg = 0;
    @DataField(pos = 16)
    private Integer vpumjust = 0;
    @DataField(pos = 17)
    private Integer vrecortes = 0;
    @DataField(pos = 18)
    private Integer vfamilia = 0;
    @DataField(pos = 19)
    private Integer vdn = 0;
    @DataField(pos = 20)
    private Integer vpfiv = 0;
    @DataField(pos = 21)
    private Integer vconver = 0;
    @DataField(pos = 22)
    private Integer vunidos = 0;
    @DataField(pos = 23)
    private Integer vcilus = 0;
    @DataField(pos = 24)
    private Integer cens = 0;
    @DataField(pos = 25)
    private String acta;
    @DataField(pos = 26)
    private String hihavots;
    @DataField(pos = 27)
    private String hihaacta;
    @DataField(pos = 28)
    private String origen;
    @DataField(pos = 29)
    private String datetime;
    @DataField(pos = 30)
    private String user;
    @DataField(pos = 31)
    private String nobody;
    @DataField(pos = 32)
    private String nobody2;

    public String getidmesa() {
        return idmesa;
    }

    public void setidmesa(String idmesa) {
        this.idmesa = idmesa;
    }

    public String getcodimesa() {
        return codimesa;
    }

    public void setcodimesa(String codimesa) {
        this.codimesa = codimesa;
    }

    public String getmesatancada() {
        return mesatancada;
    }

    public void setmesatancada(String mesatancada) {
        this.mesatancada = mesatancada;
    }

    public String getcomarca() {
        return comarca;
    }

    public void setcomarca(String comarca) {
        this.comarca = comarca;
    }

    public Integer getvnuls() {
        if(vnuls == null){
            return 0;
        }
        return vnuls;
    }

    public void setvnuls(Integer vnuls) {
        this.vnuls = vnuls;
    }

    public Integer getvblancs() {
        if(vblancs == null){
            return 0;
        }
        return vblancs;
    }

    public void setvblancs(Integer vblancs) {
        this.vblancs = vblancs;
    }

    public Integer getverc() {
        if(verc == null){
            return 0;
        }
        return verc;
    }

    public void setverc(Integer verc) {
        this.verc = verc;
    }

    public Integer getvjxc() {
        if(vjxc == null){
            return 0;
        }
        return vjxc;
    }

    public void setvjxc(Integer vjxc) {
        this.vjxc = vjxc;
    }

    public Integer getvcup() {
        if(vcup == null){
            return 0;
        }
        return vcup;
    }

    public void setvcup(Integer vcup) {
        this.vcup = vcup;
    }

    public Integer getvpsc() {
        if(vpsc == null){
            return 0;
        }
        return vpsc;
    }

    public void setvpsc(Integer vpsc) {
        this.vpsc = vpsc;
    }

    public Integer getvcs() {
        if(vcs == null){
            return 0;
        }
        return vcs;
    }

    public void setvcs(Integer vcs) {
        this.vcs = vcs;
    }

    public Integer getvppc() {
        if(vppc == null){
            return 0;
        }
        return vppc;
    }

    public void setvppc(Integer vppc) {
        this.vppc = vppc;
    }

    public Integer getvcom() {
        if(vcom == null){
            return 0;
        }
        return vcom;
    }

    public void setvcom(Integer vcom) {
        this.vcom = vcom;
    }

    public Integer getvpacma() {
        if(vpacma == null){
            return 0;
        }
        return vpacma;
    }

    public void setvpacma(Integer vpacma) {
        this.vpacma = vpacma;
    }

    public Integer getvdialeg() {
        if(vdialeg == null){
            return 0;
        }
        return vdialeg;
    }

    public void setvdialeg(Integer vdialeg) {
        this.vdialeg = vdialeg;
    }

    public Integer getvpumjust() {
        if(vpumjust == null){
            return 0;
        }
        return vpumjust;
    }

    public void setvpumjust(Integer vpumjust) {
        this.vpumjust = vpumjust;
    }

    public Integer getvrecortes() {
        if(vrecortes == null){
            return 0;
        }
        return vrecortes;
    }

    public void setvrecortes(Integer vrecortes) {
        this.vrecortes = vrecortes;
    }

    public Integer getvfamilia() {
        if(vfamilia == null){
            return 0;
        }
        return vfamilia;
    }

    public void setvfamilia(Integer vfamilia) {
        this.vfamilia = vfamilia;
    }

    public Integer getvdn() {
        if(vdn == null){
            return 0;
        }
        return vdn;
    }

    public void setvdn(Integer vdn) {
        this.vdn = vdn;
    }

    public Integer getvpfiv() {
        if(vpfiv == null){
            return 0;
        }
        return vpfiv;
    }

    public void setvpfiv(Integer vpfiv) {
        this.vpfiv = vpfiv;
    }

    public Integer getvconver() {
        if(vconver == null){
            return 0;
        }
        return vconver;
    }

    public void setvconver(Integer vconver) {
        this.vconver = vconver;
    }

    public Integer getvunidos() {
        if(vunidos == null){
            return 0;
        }
        return vunidos;
    }

    public void setvunidos(Integer vunidos) {
        this.vunidos = vunidos;
    }

    public Integer getvcilus() {
        if(vcilus == null){
            return 0;
        }
        return vcilus;
    }

    public void setvcilus(Integer vcilus) {
        this.vcilus = vcilus;
    }

    public Integer getcens() {
        if(cens == null){
            return 0;
        }
        return cens;
    }

    public void setcens(Integer cens) {
        this.cens = cens;
    }

    public String getacta() {
        return acta;
    }

    public void setacta(String acta) {
        this.acta = acta;
    }

    public String gethihavots() {
        return hihavots;
    }

    public void sethihavots(String hihavots) {
        this.hihavots = hihavots;
    }

    public String gethihaacta() {
        return hihaacta;
    }

    public void sethihaacta(String hihaacta) {
        this.hihaacta = hihaacta;
    }

    public String getorigen() {
        return origen;
    }

    public void setorigen(String origen) {
        this.origen = origen;
    }

    public String getdatetime() {
        return datetime;
    }

    public void setdatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getuser() {
        return user;
    }

    public void setuser(String user) {
        this.user = user;
    }
/*
    public String getnobody() {
        return nobody;
    }

    public void setnobody(String nobody) {
        this.nobody = nobody;
    }*/
}
