package me.dio.apirest_cloud.domain.model;

import jakarta.persistence.*;

@Entity(name="tb_cloud")
public class Cloud {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String type;

    @OneToOne
    private Altitude atitude;
    @Column(unique = true)
    private String acronym;
    private String formation;
    private String associatedClimate;
    private String appearance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Altitude getAltitude() {
        return atitude;
    }

    public void setAltitude(Altitude atitude) {
        this.atitude = atitude;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    public String getAssociatedClimate() {
        return associatedClimate;
    }

    public void setAssociatedClimate(String associatedClimate) {
        this.associatedClimate = associatedClimate;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }
}
