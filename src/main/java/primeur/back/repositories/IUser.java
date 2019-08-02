package primeur.back.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import primeur.back.entities.User;

import java.util.List;

public interface IUser extends JpaRepository<User,Long> {
     List<User> findByNom(String Nom) ;

}
