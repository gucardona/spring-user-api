package gucar.springapi.controller;

import gucar.springapi.model.User;
import gucar.springapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/api" )
public class UserController {
    private final UserRepository userRepository;

    @Autowired
    public UserController( UserRepository userRepository ) {
        this.userRepository = userRepository;
    }

    @GetMapping( "/users" )
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping( "/users/name/{name}" )
    public List<User> findUsersByName( @PathVariable String name ) {
        return userRepository.findByName( name );
    }

    @GetMapping( "/users/username/{username}" )
    public User findUsersByUsername( @PathVariable String username ) {
        return userRepository.findByUsername( username );
    }

    @GetMapping( "/users/email/{email}" )
    public User findUserByEmail( @PathVariable String email ) {
        return userRepository.findByEmail( email );
    }

    @GetMapping( "/users/{id}" )
    public User findUserById( @PathVariable Long id ) {
        return userRepository.findById( id ).get();
    }

    @PostMapping( "/user" )
    public void addUser( User user ) {
        userRepository.save( user );
    }

    @DeleteMapping( "/users/id/{id}" )
    public void deleteUserById( @PathVariable Long id ) {
        userRepository.deleteById( id );
    }
}
