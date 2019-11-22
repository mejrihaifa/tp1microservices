package tn.rnu.isetch.tp1spring.dto;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class ArticleDto implements Serializable {
    private Long code;
    private String designation;
    private int prixHT;
    private float TVA;
    private float prixTTC;

    public ArticleDto(Long code, String designation, int prixHT, float TVA, float prixTTC) {
        this.code = code;
        this.designation = designation;
        this.prixHT = prixHT;
        this.TVA = TVA;
        this.prixTTC = prixTTC;
    }

    public ArticleDto() {
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(int prixHT) {
        this.prixHT = prixHT;
    }

    public float getTVA() {
        return TVA;
    }

    public void setTVA(float TVA) {
        this.TVA = TVA;
    }

    public float getPrixTTC() {
        return this.prixHT*1 + TVA;
    }

    public void setPrixTTC(float prixTTC) {
        this.prixTTC = prixTTC;
    }
}
