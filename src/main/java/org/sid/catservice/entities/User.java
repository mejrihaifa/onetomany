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
@AllArgsConstructor
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id ;
   @OneToMany(mappedBy = "user")
   /* @ManyToMany
    @JoinTable (
        name ="user_post" ,
            joinColumns = @JoinColumn(name= "user_id") ,
            inverseJoinColumns = @JoinColumn(name = "post_id")
    )*/
    @JsonIgnoreProperties("users")
    private List<Post> posts ;
    private String nom ;
    private String lastName ;
    private String email ;

 }
