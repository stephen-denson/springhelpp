package ecommerce.service;

import ecommerce.entiity.User;
import ecommerce.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository repository;

    public List<User> getUsers(){
        return repository.findAll();
    }

    public User getUserById(int id){
        return repository.findById(id).orElse(null);
    }

    public User saveUser(User user){
        return repository.save(user);
    }

    public User getUserByName(String name){
        return repository.findByName(name);
    }

    public String getUserRole(String name){
        return repository.findByName(name).getRole();
    }

    public String deleteUser(int id){
        repository.deleteById(id);
        return "User deleted";
    }


}
