package primeur.back.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public enum SoftEnum {
    Empathy("Empathy"),
    Communication("Communication"),
    Teamwork("Teamwork"),
    Approachability("Approachability"),
    Patience("Patience"),
    Open_mindedness("Open_mindedness"),
    Problem_solving("Problem_solving"),
    Accountability("Accountability"),
    Creativity("Creativity"),
    Time_management("Time_management"),
    Learning_capacity("Learning_capacity");
    @Id
    private String nomSkill ;

    public String getNomSkill() {
        return nomSkill;
    }

    public void setNomSkill(String nomSkill) {
        this.nomSkill = nomSkill;
    }

    SoftEnum(String nom) {
        this.nomSkill=nom ;
    }
}


