package org.sid.catservice.Controllers;

import org.sid.catservice.entities.Post;
import org.sid.catservice.sercives.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("post")
public class PostController {
    private  final PostService postServices;

    public PostController(PostService postServices) {
        this.postServices = postServices;
    }
    @GetMapping("/all")
    public List<Post> findAll(){
        return postServices.listPosts() ;
    }
    @PostMapping("/save")

    public Post save(@RequestBody Post post){

        return postServices.save(post);  }
    @DeleteMapping("/delete/{id}")
    public  void delete (@PathVariable(name = "id") Long id){
        postServices.delete(id);
    }
}
