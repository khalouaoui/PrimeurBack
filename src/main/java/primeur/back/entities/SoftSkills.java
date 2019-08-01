package primeur.back.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SoftSkills implements Serializable {
    @Id
    private Long idSkill ;
    private SoftEnum nomSkill ;
    private Long noteAct;

    @ManyToOne
    @JoinColumn(name = "id")
    private User user ;
   


}


