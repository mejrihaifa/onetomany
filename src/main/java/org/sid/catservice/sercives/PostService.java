package org.sid.catservice.sercives;

import org.sid.catservice.dao.PostRepository;
import org.sid.catservice.entities.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository   ;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }


    public List<Post> listPosts(){return postRepository.findAll();}
    public Post update(Long id, Post p){
        p.setId(id);
        return postRepository.save(p);
    }
    public Post save( Post p){
        return postRepository.save(p);
    }

    public void delete(Long id){
        postRepository.deleteById(id);
    }
}
