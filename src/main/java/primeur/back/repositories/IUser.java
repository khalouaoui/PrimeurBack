package primeur.back.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import primeur.back.entities.User;

public interface IUser extends JpaRepository<User,Long> {

}
