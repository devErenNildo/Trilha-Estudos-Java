package eren.api.controller;

import eren.api.model.User;
import eren.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository repository;
    @GetMapping("/users")
    public List<User> getUsers(){
        return repository.findAll();
    }

    @GetMapping("/users/{username}")
    public User getOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }

    @PostMapping("/users")
    public void postUsers(@RequestBody User user){
        repository.save(user);
    }




}
