package com.white.jpa;

import com.white.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface UserJPA extends Serializable, JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {

}
