package com.albert.mbt.util;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.albert.mbt.entity.Blog;
import com.albert.mbt.mapper.BlogMapper;
import com.albert.mbt.vo.BlogVo;

public class MybatisFactoryTest {

	@Test
	public void testInit() {
		SqlSession session = MybatisFactory.getSession();
		try {
			Blog blog = session.selectOne("com.albert.mbt.mapper.BlogMapper.selectBlog", 1);
			System.out.println(blog);
		} finally {
			session.close();
		}

	}

	@Test
	public void testMapper() {
		SqlSession session = MybatisFactory.getSession();
		try {
			BlogMapper mapper = session.getMapper(BlogMapper.class);
			Blog blog = mapper.selectBlog(2L);
			System.out.println(blog);
		} finally {
			session.close();
		}

	}
	
	@Test
	public void testSelectBlogByTitle() {
		SqlSession session = MybatisFactory.getSession();
		try {
			BlogMapper mapper = session.getMapper(BlogMapper.class);
			List<Blog> blogList = mapper.selectBlogByTitle("title");
			System.out.println(blogList);
		} finally {
			session.close();
		}
	}
	
	@Test
	public void testSelectBlogVoByTitle() {
		SqlSession session = MybatisFactory.getSession();
		try {
			BlogMapper mapper = session.getMapper(BlogMapper.class);
			List<BlogVo> blogList = mapper.selectBlogVoByTitle("title");
			System.out.println(blogList);
		} finally {
			session.close();
		}
	}
	
}
