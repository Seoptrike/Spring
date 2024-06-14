package com.example.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ReplyVO extends BBSVO {
	private int rid;
	private int bid;
	private String uid;
	private int rating;

	@JsonFormat(pattern = "yyyy년 MM월dd일 HH:mm:ss", timezone = "Asia/Seoul")
	private Date regDate;

	private String content;

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "ReplyVO [rid=" + rid + ", bid=" + bid + ", uid=" + uid + ", rating=" + rating + ", regDate=" + regDate
				+ ", content=" + content + ", getPhoto()=" + getPhoto() + ", getUname()=" + getUname() + "]";
	}

}
