package com.albert.blog.mapper;

import java.util.List;

import com.albert.blog.entity.Blog;
import com.albert.blog.vo.BlogVo;

public interface BlogMapper {
	
	Blog selectBlog(Long id);
	
	List<Blog> selectBlogByTitle(String title);
	
	List<BlogVo> selectBlogVoByTitle(String title);
	
}
