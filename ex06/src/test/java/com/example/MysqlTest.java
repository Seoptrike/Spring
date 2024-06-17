package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.dao.BBSDAO;
import com.example.dao.MessagesDAO;
import com.example.dao.ReplyDAO;
import com.example.dao.UsersDAO;

@SpringBootTest // 1번째로
public class MysqlTest {

	@Autowired
	UsersDAO dao;

	@Autowired
	BBSDAO bdao;

	@Autowired
	ReplyDAO rdao;

	@Autowired
	MessagesDAO mdao;

	@Test
	public void test() {
//		QueryVO query = new QueryVO();
//		vo.setKey("uname");
//		vo.setWord("김");
//		query.setPage(1);
//		query.setSize(5);
//		rdao.list(249, query);
//		bdao.list(vo);
//		bdao.updateViewcnt(181);
//		ReplyVO vo = new ReplyVO();
//		vo.setBid(249);
//		vo.setUid("red");
//		vo.setContent("댓글테스트");
//		rdao.insert(vo);
//		rdao.total(249);
//		MessageVO vo = new MessageVO();
//		vo.setSender("blue");
//		vo.setReceiver("red");
//		vo.setMessage("월요일 좋아");
//		mdao.insert(vo);
		mdao.listReceive("blue");
	}
}
