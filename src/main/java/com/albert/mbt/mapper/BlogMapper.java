package com.albert.mbt.mapper;

import java.util.List;

import com.albert.mbt.entity.Blog;
import com.albert.mbt.vo.BlogVo;

public interface BlogMapper {
	
	Blog selectBlog(Long id);
	
	List<Blog> selectBlogByTitle(String title);
	
	List<BlogVo> selectBlogVoByTitle(String title);
	
}
