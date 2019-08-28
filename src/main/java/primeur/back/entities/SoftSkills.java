package primeur.back.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator= ObjectIdGenerators.IntSequenceGenerator.class)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class SoftSkills implements Serializable {
    @Id
    @GeneratedValue
    private Long idSkill ;
    private String nomSkill ;
    private Long noteAct;
    private Long noteFuture ;

    @ManyToOne
    @JoinColumn(name = "id")
    private User user ;

    public void setIdSkill(Long idSkill) {
        this.idSkill = idSkill;
    }

    public void setNomSkill(String nomSkill) {
        this.nomSkill = nomSkill;
    }

    public void setNoteAct(Long noteAct) {
        this.noteAct = noteAct;
    }

    public void setNoteFuture(Long noteFuture) {
        this.noteFuture = noteFuture;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getIdSkill() {
        return idSkill;
    }

    public String getNomSkill() {
        return nomSkill;
    }

    public Long getNoteAct() {
        return noteAct;
    }

    public Long getNoteFuture() {
        return noteFuture;
    }

    public User getUser() {
        return user;
    }
}


