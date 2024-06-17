package com.example.dao;

import java.util.List;

import com.example.domain.MessageVO;

public interface MessagesDAO {
	public void insert(MessageVO vo);

	public MessageVO readSend(int mid);

	public MessageVO readReceive(int mid);

	public void updateReadDate(int mid);

	public List<MessageVO> listSend(String sender);

	public List<MessageVO> listReceive(String receiver);
}
