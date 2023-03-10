package com.harveey.userapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harveey.userapi.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
