package com.example.reporteriabusqueda;

public class Reporte {
    private String NU_DOC;
    private String CO_GRU;
    private String DE_ASU;
    private String ES_DOC_EMI;
    private String CO_USE_CRE;
    private String CO_USE_MOD;
    private String DE_DOC_SIG;
    private String FE_EMI;
    private String NU_DIA_ATE;


    public String getNU_DOC() {
        return NU_DOC;
    }

    public void setNU_DOC(String NU_DOC) {
        this.NU_DOC = NU_DOC;
    }

    public String getCO_GRU() {
        return CO_GRU;
    }

    public void setCO_GRU(String CO_GRU) {
        this.CO_GRU = CO_GRU;
    }

    public String getDE_ASU() {
        return DE_ASU;
    }

    public void setDE_ASU(String DE_ASU) {
        this.DE_ASU = DE_ASU;
    }

    public String getES_DOC_EMI() {
        return ES_DOC_EMI;
    }

    public void setES_DOC_EMI(String ES_DOC_EMI) {
        this.ES_DOC_EMI = ES_DOC_EMI;
    }

    public String getCO_USE_CRE() {
        return CO_USE_CRE;
    }

    public void setCO_USE_CRE(String CO_USE_CRE) {
        this.CO_USE_CRE = CO_USE_CRE;
    }

    public String getCO_USE_MOD() {
        return CO_USE_MOD;
    }

    public void setCO_USE_MOD(String CO_USE_MOD) {
        this.CO_USE_MOD = CO_USE_MOD;
    }

    public String getDE_DOC_SIG() {
        return DE_DOC_SIG;
    }

    public void setDE_DOC_SIG(String DE_DOC_SIG) {
        this.DE_DOC_SIG = DE_DOC_SIG;
    }

    public String getFE_EMI() {
        return FE_EMI;
    }

    public void setFE_EMI(String FE_EMI) {
        this.FE_EMI = FE_EMI;
    }

    public String getNU_DIA_ATE() {
        return NU_DIA_ATE;
    }

    public void setNU_DIA_ATE(String NU_DIA_ATE) {
        this.NU_DIA_ATE = NU_DIA_ATE;
    }

    @Override
    public String toString() {
        return "{" +
                "NU_DOC:'" + NU_DOC + '\'' +
                ", CO_GRU:'" + CO_GRU + '\'' +
                ", DE_ASU:'" + DE_ASU + '\'' +
                ", ES_DOC_EMI:'" + ES_DOC_EMI + '\'' +
                ", CO_USE_CRE:'" + CO_USE_CRE + '\'' +
                ", CO_USE_MOD:'" + CO_USE_MOD + '\'' +
                ", DE_DOC_SIG:'" + DE_DOC_SIG + '\'' +
                ", FE_EMI:'" + FE_EMI + '\'' +
                ", NU_DIA_ATE:'" + NU_DIA_ATE + '\'' +
                '}';
    }
}
