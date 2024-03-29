package com.project.QuestApp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.QuestApp.entities.Comment;
import com.project.QuestApp.services.CommentService;

@RestController
@RequestMapping("/comments")
public class CommentController {

	private CommentService commentService;
	public CommentController(CommentService commentService) {
		this.commentService=commentService;
	}
	
	@GetMapping
	public List<Comment> getAllComments(@RequestParam Optional<Long> userId,
			@RequestParam Optional<Long> postId){
		return commentService.getAllCommentsWithParam(userId,postId);
	}
	
}
