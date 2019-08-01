package primeur.back.controllers;




import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import primeur.back.entities.User;
import primeur.back.repositories.IUser;

import java.util.ArrayList;
import java.util.List;


@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUser userRepositroy ;
    @GetMapping("/")
    public ResponseEntity findAll() {
        return ResponseEntity.ok(userRepositroy.findAll()) ;

    }
    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable(name="id") Long id) {
        if (id == null) {
            return ResponseEntity.badRequest().body("null");
        }
        User user = userRepositroy.getOne(id);
        if (user == null) {
            return ResponseEntity.notFound().build();
        }
        List list=new ArrayList<>() ;
        list.add("id " + user.getId()) ;
        list.add("nom " + user.getNom()) ;
        list.add("prenom " + user.getPrenom()) ;
        list.add("equipe " + user.getEquipe()) ;
        list.add("fonction " + user.getFonction()) ;
        return ResponseEntity.ok(list) ;


    }
    @PostMapping("/")
    public ResponseEntity createUser(@RequestBody User user) {
        if (user==null) {
            return ResponseEntity.badRequest().body(null ) ;
        }
        User createdUser=userRepositroy.save(user) ;
        return ResponseEntity.ok(createdUser) ;
    }

}
