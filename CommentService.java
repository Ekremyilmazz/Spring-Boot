package com.project.QuestApp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.QuestApp.entities.Comment;
import com.project.QuestApp.repos.CommentRepository;

@Service
public class CommentService {

	private CommentRepository commentRepository;

	public CommentService(CommentRepository commentRepository) {
		this.commentRepository = commentRepository;
	}

	public List<Comment> getAllCommentsWithParam(Optional<Long> userId, Optional<Long> postId) {
		// TODO Auto-generated method stub
		return null;
	}



	

	
}
