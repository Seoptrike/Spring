package com.example.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.QueryVO;
import com.example.domain.ReplyVO;

@Repository
public class ReplyDAOImpl implements ReplyDAO {

	@Autowired
	SqlSession session;
	String namespace = "com.example.mapper.ReplyMapper";

	@Override
	public void insert(ReplyVO vo) {
		session.insert(namespace + ".insert", vo);
	}

	@Override
	public List<HashMap<String, Object>> list(int bid, QueryVO vo) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("bid", bid);
		map.put("start", vo.getStart());
		map.put("size", vo.getSize());

		return session.selectList(namespace + ".list", map); // 넘겨주는건 하나만 가능하기 때문에 map이라는 해쉬맵을 만들어서 거기에 넣는다
	}

	@Override
	public int total(int bid) {
		return session.selectOne(namespace + ".total", bid);
	}

	@Override
	public void delete(int rid) {
		session.delete(namespace + ".delete", rid);

	}

	@Override
	public void update(ReplyVO vo) {
		session.update(namespace + ".update", vo);

	}

	@Override
	public ReplyVO read(int rid) {
		return session.selectOne(namespace + ".read", rid);
	}

}
