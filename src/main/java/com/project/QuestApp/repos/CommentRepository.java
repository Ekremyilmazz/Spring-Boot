package com.project.QuestApp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.QuestApp.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
