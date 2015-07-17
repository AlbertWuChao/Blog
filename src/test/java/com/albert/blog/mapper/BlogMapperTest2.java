package com.albert.blog.mapper;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BlogMapperTest2 {
	
	private static AbstractApplicationContext ctx;
	
	@BeforeClass
	public static void beforeClass() {
		ctx = new ClassPathXmlApplicationContext("application.xml");
	}
	
	@Test
	public void test0() {
		BlogMapper blogMapper = ctx.getBean(BlogMapper.class);
		Assert.assertNotNull(blogMapper);
		System.out.println(blogMapper.selectBlog(2L));
	}
	
}
