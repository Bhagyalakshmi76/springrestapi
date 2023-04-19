package com.restapicrud.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapicrud.model.User;



public interface AppRepo extends JpaRepository<User,Integer> {

}
