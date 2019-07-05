package janeswift.spa.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table (name="entries")

public class SpaEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "entry_id")
    private Integer id;


    @NotEmpty
    private String name;

    @NotEmpty
    private String treatment;

    public SpaEntry() {


        public Integer getId () {
            return id;
        }


        public void setId (Integer id){
            this.id = id;
        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public String getTreatment () {
            return treatment;
        }

        public void setTreatment (String treatment){
            this.treatment = treatment;
        }
    }
}
