package com.albert.blog.vo;

public class BlogVo {
	private String title;
	private String context;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	@Override
	public String toString() {
		return "BlogVo [title=" + title + ", context=" + context + "]";
	}
}
