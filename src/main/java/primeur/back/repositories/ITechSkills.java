package primeur.back.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import primeur.back.entities.TechSkills;
import primeur.back.entities.User;

import java.util.List;

public interface ITechSkills extends JpaRepository<TechSkills,Long> {
    List<TechSkills> findByUser(User user) ;


}
