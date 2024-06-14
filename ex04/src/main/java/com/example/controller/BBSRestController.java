package com.example.controller;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.BBSDAO;
import com.example.domain.BBSVO;
import com.example.domain.QueryVO;

@RestController
@RequestMapping("/bbs")
public class BBSRestController {
	@Autowired
	BBSDAO dao;
	SqlSession session;

	@GetMapping("/list.json") // test /bbs/list.json?key=uid&word=red&page=1&size=3
	public HashMap<String, Object> list(QueryVO vo) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("documents", dao.list(vo));
		map.put("total", dao.total(vo));
		return map;
	}

	@GetMapping("/{bid}")
	public BBSVO read(@PathVariable("bid") int bid) {
		return dao.read(bid);
	}

	@PostMapping("/delete/{bid}")
	public void delete(@PathVariable("bid") int bid) {
		dao.delete(bid);
	}

	@PostMapping("/update")
	public void update(BBSVO vo) {
		dao.update(vo);
	}

	@PostMapping("/insert")
	public void insert(BBSVO vo) {
		dao.insert(vo);
	}
}
