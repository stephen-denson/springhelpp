package ecommerce.controller;

import ecommerce.entiity.User;
import ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/addUser")
    public User addNUser(@RequestBody User user){
        return service.saveUser(user);
    }

    @GetMapping("/getUsers")
    public List<User> getUsers(){
        return service.getUsers();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return service.deleteUser(id);
    }

    @GetMapping("/getUserRole/{id}")
    public String getUserRole(@PathVariable String name){
        return service.getUserRole(name);
    }

    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable int id){
        return service.getUserById(id);
    }

    @GetMapping("/getUserByName/{name}")
    public User getUserById(@PathVariable String name){
        return service.getUserByName(name);
    }
}
