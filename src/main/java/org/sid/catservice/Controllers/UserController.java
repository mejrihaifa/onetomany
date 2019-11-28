package org.sid.catservice.Controllers;

import org.sid.catservice.entities.User;
import org.sid.catservice.sercives.UserServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    private  final UserServices userServices;

    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }
    @GetMapping("/all")
    public List<User> findAll(){
        return userServices.listUsers() ;
    }
    @PostMapping("/save")
    public User save(@RequestBody User user){ return userServices.save(user);  }


}
