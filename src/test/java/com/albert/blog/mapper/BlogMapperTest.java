package com.albert.blog.mapper;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.albert.blog.entity.Blog;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
@Transactional
public class BlogMapperTest {

	@Resource(name = "blogMapper")
	private BlogMapper blogMapper;

	@Test
	public void test() {
		Blog blog = blogMapper.selectBlog(1L);
		System.out.println(blog);
	}

}
