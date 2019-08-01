package primeur.back.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import primeur.back.entities.SoftSkills;
import primeur.back.entities.User;

import java.util.List;

public interface ISoftSkills extends JpaRepository<SoftSkills,Long> {

    List<SoftSkills> findByUser(User user) ;
}
