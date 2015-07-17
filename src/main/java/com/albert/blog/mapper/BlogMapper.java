package com.albert.blog.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.albert.blog.entity.Blog;
import com.albert.blog.vo.BlogVo;

@Repository("bloaMapper")
public interface BlogMapper {
	
	Blog selectBlog(Long id);
	
	List<Blog> selectBlogByTitle(String title);
	
	List<BlogVo> selectBlogVoByTitle(String title);
	
	@Select("select * from Blog where id = #{id}")
	Blog get(Long id);
	
}
