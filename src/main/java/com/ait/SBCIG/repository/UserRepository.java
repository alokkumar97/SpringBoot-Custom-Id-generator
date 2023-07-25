package com.ait.SBCIG.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ait.SBCIG.model.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Serializable> {

}
