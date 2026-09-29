package com.infinity.user.ms_user.repository;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import com.infinity.user.ms_user.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository <UserEntity,String>{

}
