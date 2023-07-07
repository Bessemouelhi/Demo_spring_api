package com.bessem.demospringapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bessem.demospringapi.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>
{
    User findFirstByEmail(String email);
}
