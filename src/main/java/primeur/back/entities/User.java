package primeur.back.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private String prenom;
    private String mail;
    private String password;
    private String fonction;
    private String equipe;
    @Lob
    private byte[] photo;
    @OneToMany(mappedBy = "user")
    private List<SoftSkills> softSkills ;
    @OneToMany(mappedBy ="user")
    private List<TechSkills> techSkills ;




}
