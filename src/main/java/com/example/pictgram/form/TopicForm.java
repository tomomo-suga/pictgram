package com.example.pictgram.form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;

import com.example.pictgram.validation.constraints.ImageByte;
import com.example.pictgram.validation.constraints.ImageNotEmpty;

import lombok.Data;

@Data
public class TopicForm {

	private Long id;

	private Long userId;

	@ImageNotEmpty
	@ImageByte(max = 2000000)
	private MultipartFile image;

	private String imateData;

	private String path;

	@NotEmpty
	@Size(max = 1000)
	private String description;

	private UserForm user;

}