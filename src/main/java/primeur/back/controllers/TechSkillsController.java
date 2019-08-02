/*package primeur.back.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import primeur.back.entities.User;
import primeur.back.repositories.ITechSkills;
import primeur.back.repositories.IUser;

@RestController
public class TechSkillsController {

    @Autowired
    private ITechSkills techSkillsRepository ;
    @Autowired
    private IUser user ;

    public ResponseEntity findAll() {
         return ResponseEntity.ok(techSkillsRepository.findAll()) ;
    }
    @GetMapping("/{idSkill}")
    public ResponseEntity<User> findById(@PathVariable Long idSkill) {


    }
}
*/