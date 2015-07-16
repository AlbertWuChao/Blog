package com.albert.blog.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

public class MybatisFactory {
	private static SqlSessionFactory sqlSessionFactory = null;
	private static Logger logger = Logger.getLogger(MybatisFactory.class);
	
	static {
		InputStream resource = null;
		try {
			resource = MybatisFactory.class.getClassLoader().getResourceAsStream("mybatis.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);
		} catch (Exception e) {
			logger.fatal("Load mybatis config xml failure!", e);
		} finally {
			if (resource != null) {
				try {
					resource.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static SqlSession getSession() {
		return sqlSessionFactory.openSession();
	}
	
}
