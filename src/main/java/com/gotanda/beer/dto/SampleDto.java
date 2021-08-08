package com.gotanda.beer.dto;

public class SampleDto {
	private final long id;
	private final String content;

	public SampleDto(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
