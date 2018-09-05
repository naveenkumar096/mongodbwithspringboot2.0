package com.example.spring.boot.dao.entity;

import com.example.spring.boot.dao.entity.common.BaseEntity;
import lombok.Data;

import org.hibernate.validator.constraints.LuhnCheck;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "blog")

public class Blog extends BaseEntity {

    @TextIndexed
    private String title;

    private String content;

    @Indexed
    private String author;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
    
    
}
