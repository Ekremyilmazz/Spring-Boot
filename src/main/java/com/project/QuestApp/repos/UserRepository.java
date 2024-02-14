package com.project.QuestApp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.QuestApp.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
