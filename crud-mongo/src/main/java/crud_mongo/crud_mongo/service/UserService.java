package crud_mongo.crud_mongo.service;

import crud_mongo.crud_mongo.entity.User;
import crud_mongo.crud_mongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> listAllUsers() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }


    public void deleteUserById(String id){
        userRepository.deleteById(id);
    }
}
