package org.sid.catservice.sercives;

import org.sid.catservice.dao.UserRepository;
import org.sid.catservice.entities.User;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserServices {
    private final UserRepository userReository ;

    public UserServices(UserRepository userReository) {
        this.userReository = userReository;
    }

   // @GetMapping(value = "/listUsers" )
    public List<User> listUsers(){
        return userReository.findAll();
    }
  //  @GetMapping(value = "/listUsers/{id}" )
    public User listUsers(Long id){
        return userReository.findById(id).get();
    }
   // @PutMapping(value = "/listUsers/{id}" )
    public User update( Long id,  User p){
        p.setId(id);
        return userReository.save(p);
    }
   // @PostMapping(value = "/listProduits" )
    public User save( User p)
    {

        return userReository.save(p);
    }

   // @DeleteMapping(value = "/listProduits/{id}" )
    public void delete(Long id){
        userReository.deleteById(id);
    }
}
