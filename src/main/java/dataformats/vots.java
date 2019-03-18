package dataformats;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "data",
        "idEleccions",
        "idMesa",
        "idUser",
        "processat",
        "refActa",
        "municipi",
        "codProv",
        "totalVots",
        "votsBlancs",
        "votsNuls",
        "votsCiudadanos",
        "vostComuns",
        "vostERC",
        "vostJxCAT",
        "vostPACMA",
        "vostPP",
        "vostPSOE",
        "vostVox"
})
public class vots implements Serializable {
    @JsonProperty("data")
    private String data;
    @JsonProperty("idEleccions")
    private String idEleccions;
    @JsonProperty("idMesa")
    private String idMesa;
    @JsonProperty("idUser")
    private String idUser;
    @JsonProperty("processat")
    private boolean processat;
    @JsonProperty("refActa")
    private String refActa;
    @JsonProperty("municipi")
    private String municipi;
    @JsonProperty("codProv")
    private String codProv;
    @JsonProperty("totalVots")
    private Integer totalVots;
    @JsonProperty("votsBlancs")
    private Integer votsBlancs;
    @JsonProperty("votsNuls")
    private Integer votsNuls;
    @JsonProperty("votsCiudadanos")
    private Integer votsCiudadanos;
    @JsonProperty("vostComuns")
    private Integer vostComuns;
    @JsonProperty("vostERC")
    private Integer vostERC;
    @JsonProperty("vostJxCAT")
    private Integer vostJxCAT;
    @JsonProperty("vostPACMA")
    private Integer vostPACMA;
    @JsonProperty("vostPP")
    private Integer vostPP;
    @JsonProperty("vostPSOE")
    private Integer vostPSOE;
    @JsonProperty("vostVox")
    private Integer vostVox;

    @JsonProperty("data")
    public String getdata() { return data; }
    @JsonProperty("data")
    public void setdata(String data) { this.data = data; }

    @JsonProperty("idEleccions")
    public String getidEleccions() { return idEleccions; }
    @JsonProperty("idEleccions")
    public void setidEleccions(String idEleccions) { this.idEleccions = idEleccions; }

    @JsonProperty("idMesa")
    public String getidMesa() { return idMesa; }
    @JsonProperty("idMesa")
    public void setidMesa(String idMesa) { this.idMesa = idMesa; }

    @JsonProperty("idUser")
    public String getidUser() { return idUser; }
    @JsonProperty("idUser")
    public void setidUser(String idUser) { this.idUser = idUser; }

    @JsonProperty("processat")
    public boolean getprocessat() { return processat; }
    @JsonProperty("processat")
    public void setprocessat(boolean processat) { this.processat = processat; }

    @JsonProperty("refActa")
    public String getrefActa() { return refActa; }
    @JsonProperty("refActa")
    public void setrefActa(String refActa) { this.refActa = refActa; }

    @JsonProperty("municipi")
    public String getmunicipi() { return municipi; }
    @JsonProperty("municipi")
    public void setmunicipi(String municipi) { this.municipi = municipi; }

    @JsonProperty("codProv")
    public String getcodProv() { return codProv; }
    @JsonProperty("codProv")
    public void setcodProv(String codProv) { this.codProv = codProv; }

    @JsonProperty("totalVots")
    public Integer gettotalVots() { return totalVots; }
    @JsonProperty("totalVots")
    public void settotalVots(Integer totalVots) { this.totalVots = totalVots; }

    @JsonProperty("votsBlancs")
    public Integer getvotsBlancs() { return votsBlancs; }
    @JsonProperty("votsBlancs")
    public void setvotsBlancs(Integer votsBlancs) { this.votsBlancs = votsBlancs; }

    @JsonProperty("votsNuls")
    public Integer getvotsNuls() { return votsNuls; }
    @JsonProperty("votsNuls")
    public void setvotsNuls(Integer votsNuls) { this.votsNuls = votsNuls; }

    @JsonProperty("votsCiudadanos")
    public Integer getvotsCiudadanos() { return votsCiudadanos; }
    @JsonProperty("votsCiudadanos")
    public void setvotsCiudadanos(Integer votsCiudadanos) { this.votsCiudadanos = votsCiudadanos; }

    @JsonProperty("vostComuns")
    public Integer getvostComuns() { return vostComuns; }
    @JsonProperty("vostComuns")
    public void setvostComuns(Integer vostComuns) { this.vostComuns = vostComuns; }

    @JsonProperty("vostERC")
    public Integer getvostERC() { return vostERC; }
    @JsonProperty("vostERC")
    public void setvostERC(Integer vostERC) { this.vostERC = vostERC; }

    @JsonProperty("vostJxCAT")
    public Integer getvostJxCAT() { return vostJxCAT; }
    @JsonProperty("vostJxCAT")
    public void setvostJxCAT(Integer vostJxCAT) { this.vostJxCAT = vostJxCAT; }

    @JsonProperty("vostPACMA")
    public Integer getvostPACMA() { return vostPACMA; }
    @JsonProperty("vostPACMA")
    public void setvostPACMA(Integer vostPACMA) { this.vostPACMA = vostPACMA; }

    @JsonProperty("vostPP")
    public Integer getvostPP() { return vostPP; }
    @JsonProperty("vostPP")
    public void setvostPP(Integer vostPP) { this.vostPP = vostPP; }

    @JsonProperty("vostPSOE")
    public Integer getvostPSOE() { return vostPSOE; }
    @JsonProperty("vostPSOE")
    public void setvostPSOE(Integer vostPSOE) { this.vostPSOE = vostPSOE; }

    @JsonProperty("vostVox")
    public Integer getvostVox() { return vostVox; }
    @JsonProperty("vostVox")
    public void setvostVox(Integer vostVox) { this.vostVox = vostVox; }

}