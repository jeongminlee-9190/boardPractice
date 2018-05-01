package com.service;

import java.util.List;

import org.apache.ibatis.type.Alias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.BoardDAO;
import com.dto.BoardDTO;

@Service
public class BoardService {
	@Autowired
	BoardDAO dao;
	
	public List<BoardDTO> boardList1() {
		return dao.boardList1();
	}
}
