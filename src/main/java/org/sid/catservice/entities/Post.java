package org.sid.catservice.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor @ToString
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String title ;
    private String body ;
    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnoreProperties("posts")
    //@ManyToMany
    /*@JoinTable (
            name ="user_post" ,
            joinColumns = @JoinColumn(name= "post_id") ,
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    @JsonIgnoreProperties("posts")*/
    private List<User> users ;
}
