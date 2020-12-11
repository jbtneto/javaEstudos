package br.neto.spring02.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.neto.spring02.dao.UserDao;
import br.neto.spring02.model.User;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")

public class UserController {

    @Autowired // Injecao de dependencia
    private UserDao dao;

    @GetMapping("/all")
    public List<User> listarTodos() {
        List<User> lista = (List<User>) dao.findAll();

        return lista;
    }

    @GetMapping("/id/{id}") // {Nome da variavel}
    public ResponseEntity<User> BuscaPorId(@PathVariable int id) { // int id - nome precisa ser igual ao declarado no
                                                                   // GETMAPPING
        User user = dao.findById(id).orElse(null);

        if (user != null) {
            user.setPassword("******");
            return ResponseEntity.ok(user); // ok = 200
            
        }
        return ResponseEntity.notFound().build(); // // not found 404
    }

    @PostMapping("/new")
    public ResponseEntity<User> novoUsuario(@RequestBody User user){
        User newUser = dao.save(user);
        return ResponseEntity.ok(newUser);

    } 

    /*
     * @GetMapping("/name/{name}") // {Nome da variavel} public ResponseEntity<User>
     * BuscaPorId(@PathVariable String name){ // int id - nome precisa ser igual ao
     * declarado no GETMAPPING User user = dao.f(name).orElse(null);
     * 
     * if(user != null){ return ResponseEntity.ok(user); // ok = 200 } return
     * ResponseEntity.notFound().build(); // // not found 404
     * 
     * 
     * }
     */
}
