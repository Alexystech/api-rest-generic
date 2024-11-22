package com.welldex.apirestwelldex.repository;

import com.welldex.apirestwelldex.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query(value = "SELECT USR FROM users AS USR WHERE USR.username = :username")
    User findUserByUsername(@Param("username") String username);
}
