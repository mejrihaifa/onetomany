package org.sid.catservice.dao;

import org.sid.catservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    public User findById(@Param("mc") String des);
}
