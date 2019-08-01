package primeur.back.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import primeur.back.entities.SoftSkills;
import primeur.back.entities.User;
import primeur.back.repositories.ISoftSkills;
import primeur.back.repositories.IUser;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("/soft")
public class SoftSkillsController {
    @Autowired
    private ISoftSkills softSkillsRepository ;
    @Autowired
    private IUser userRepository ;
    @GetMapping("/")
    public ResponseEntity findAll() {
        return ResponseEntity.ok(softSkillsRepository.findAll()) ;
    }
    @PostMapping("/")
    public ResponseEntity createSoftSkill(@RequestBody SoftSkills softSkills) {
        if (softSkills == null) {
            return ResponseEntity.badRequest().body(null);
        }
        SoftSkills soft = softSkillsRepository.save(softSkills);
        return ResponseEntity.ok(soft);
    }
    @GetMapping("/all/{id}")
    public ResponseEntity findAllUserSkills(@PathVariable Long id) {
        if (id == null) {
            return ResponseEntity.badRequest().body("Cannot find skill with null user");
        }
        User user=userRepository.getOne(id) ;
        //User user = userRepository.getOne(id);
        if (user == null) {
            return ResponseEntity.notFound().build();
        }
        List<SoftSkills> userSkill = softSkillsRepository.findByUser(user);
        return ResponseEntity.ok(userSkill) ;
    }

}
