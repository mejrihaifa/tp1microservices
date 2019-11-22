package tn.rnu.isetch.tp1spring.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(unique = true)
    private Long code;
    @NotNull
    private String designation;
    @NotNull
    private int prixHT;
    @NotNull
    private float TVA;

   /* public Article(@NotNull Long code, @NotNull String designation, @NotNull int prixHT, @NotNull float TVA) {
        this.code = code;
        this.designation = designation;
        this.prixHT = prixHT;
        this.TVA = TVA;
    }
*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
