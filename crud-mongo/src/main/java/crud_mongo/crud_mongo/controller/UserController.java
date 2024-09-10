package crud_mongo.crud_mongo.controller;

import crud_mongo.crud_mongo.entity.User;
import crud_mongo.crud_mongo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getUsers () {
        List<User> users = userService.listAllUsers();
        return ResponseEntity.ok(users);
    }

    @PostMapping
    private ResponseEntity<User> saveUser(@RequestBody User user){
        User savedUser = userService.saveUser(user);
        return ResponseEntity.ok(savedUser);
    }

    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User user){
        User updatedUser = userService.saveUser(user);
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable String id){
        userService.deleteUserById(id);
        return ResponseEntity.noContent().build();
    }

}
