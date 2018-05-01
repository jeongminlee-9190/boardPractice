package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dto.BoardDTO;
import com.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	BoardService service;
	
	@RequestMapping("/boardList1")
	public String boardList1(HttpSession session) {
		List<BoardDTO> list= service.boardList1();
		session.setAttribute("boardList1",list);
		System.out.println(list);
		return "boardList1";
	}
	
	
}
