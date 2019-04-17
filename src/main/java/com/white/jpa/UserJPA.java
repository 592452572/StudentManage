package com.white.jpa;


import com.white.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

public interface UserJPA extends Serializable, JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {

}
