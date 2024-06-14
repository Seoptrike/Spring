package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.dao.BBSDAO;
import com.example.dao.UsersDAO;

@SpringBootTest // 1번째로
public class MysqlTest {

	@Autowired
	UsersDAO dao;

	@Autowired
	BBSDAO bdao;

	@Test
	public void test() {
//		QueryVO vo = new QueryVO();
//		vo.setKey("uname");
//		vo.setWord("김");
//		vo.setPage(1);
//		vo.setSize(5);
//		bdao.list(vo);
		bdao.read(1);
	}
}
