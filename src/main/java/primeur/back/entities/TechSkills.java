package primeur.back.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TechSkills {

        @Id
        @GeneratedValue
        private Long idSkill ;
        private String nomSkill ;
        private String Categorie ;
        private String noteAct ;
        @ManyToOne
        @JoinColumn(name="id")
        private User user ;



    }





