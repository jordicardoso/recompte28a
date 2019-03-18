package dataformats;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ";")
public class meses {
    @DataField(pos = 1)
    private String idmesa;
    @DataField(pos = 2)
    private String codimesa;
    @DataField(pos = 3)
    private String codprov;
    @DataField(pos = 4)
    private String codilocal;
    @DataField(pos = 5)
    private String municipi;
    @DataField(pos = 6)
    private String comarca;
    @DataField(pos = 7)
    private String g35;
    @DataField(pos = 8)
    private String codimunicipi;
    @DataField(pos = 9)
    private String districte;
    @DataField(pos = 10)
    private String seccio;
    @DataField(pos = 11)
    private String subseccio;
    @DataField(pos = 12)
    private String mesa;
    @DataField(pos = 13)
    private String lletrainici;
    @DataField(pos = 14)
    private String lletrafi;
    @DataField(pos = 15)
    private String codilocalorigen;
    @DataField(pos = 16)
    private String codilocal2;
    @DataField(pos = 17)
    private String localelectoraladreca;
    @DataField(pos = 18)
    private String localelectoral;
    @DataField(pos = 19)
    private String adreca;
    @DataField(pos = 20)
    private String idmesamesescola;

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

    public String getcodprov() {
        return codprov;
    }

    public void setcodprov(String codprov) {
        this.codprov = codprov;
    }

    public String getcodilocal() {
        return codilocal;
    }

    public void setcodilocal(String codilocal) {
        this.codilocal = codilocal;
    }

    public String getmunicipi() {
        return municipi;
    }

    public void setmunicipi(String municipi) {
        this.municipi = municipi;
    }

    public String getcomarca() {
        return comarca;
    }

    public void setcomarca(String comarca) {
        this.comarca = comarca;
    }

    public String getg35() {
        return g35;
    }

    public void setg35(String g35) {
        this.g35 = g35;
    }

    public String getcodimunicipi() {
        return codimunicipi;
    }

    public void setcodimunicipi(String codimunicipi) {
        this.codimunicipi = codimunicipi;
    }

    public String getdistricte() {
        return districte;
    }

    public void setdistricte(String districte) {
        this.districte = districte;
    }

    public String getseccio() {
        return seccio;
    }

    public void setseccio(String seccio) {
        this.seccio = seccio;
    }

    public String getsubseccio() {
        return subseccio;
    }

    public void setsubseccio(String subseccio) {
        this.subseccio = subseccio;
    }

    public String getmesa() {
        return mesa;
    }

    public void setmesa(String mesa) {
        this.mesa = mesa;
    }

    public String getlletrainici() {
        return lletrainici;
    }

    public void setlletrainici(String lletrainici) {
        this.lletrainici = lletrainici;
    }

    public String getlletrafi() {
        return lletrafi;
    }

    public void setlletrafi(String lletrafi) {
        this.lletrafi = lletrafi;
    }

    public String getcodilocalorigen() {
        return codilocalorigen;
    }

    public void setcodilocalorigen(String codilocalorigen) {
        this.codilocalorigen = codilocalorigen;
    }

    public String getcodilocal2() {
        return codilocal2;
    }

    public void setcodilocal2(String codilocal2) {
        this.codilocal2 = codilocal2;
    }

    public String getlocalelectoraladreca() {
        return localelectoraladreca;
    }

    public void setlocalelectoraladreca(String localelectoraladreca) {
        this.localelectoraladreca = localelectoraladreca;
    }

    public String getlocalelectoral() {
        return localelectoral;
    }

    public void setlocalelectoral(String localelectoral) {
        this.localelectoral = localelectoral;
    }

    public String getadreca() {
        return adreca;
    }

    public void setadreca(String adreca) {
        this.adreca = adreca;
    }

    public String getidmesamesescola() {
        return idmesamesescola;
    }

    public void setidmesamesescola(String idmesamesescola) {
        this.idmesamesescola = idmesamesescola;
    }
}
