package com.devsuperior.dslearnbds.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_content")
public class Content extends Lesson{
	private static final long serialVersionUID = 1L;

	private String textContent;
	private String videoUri;
	
	public Content() {
	}

	public Content(Long id, String title, Integer position, Section section, String textContet, String videoUri) {
		super(id, title, position, section);
		this.textContent = textContet;
		this.videoUri = videoUri;
	}

	public String getTextContet() {
		return textContent;
	}

	public void setTextContet(String textContet) {
		this.textContent = textContet;
	}

	public String getVideoUri() {
		return videoUri;
	}

	public void setVideoUri(String videoUri) {
		this.videoUri = videoUri;
	}
}
