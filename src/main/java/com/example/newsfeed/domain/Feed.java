package com.example.newsfeed.domain;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Feed {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String content;

	@JoinColumn(name = "writer_id")
	@ManyToOne(fetch = FetchType.LAZY)
	private User writerId;

}
