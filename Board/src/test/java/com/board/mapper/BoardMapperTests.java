package com.board.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.board.domain.BoardDTO;

@SpringBootTest
class BoardMapperTests {

	@Autowired
	private BoardMapper boardMapper;

	@Test
	public void testOfInsert() {
		BoardDTO params = new BoardDTO();
		params.setTitle("게시글 제목 테스트1");
		params.setContent("게시글 내용 테스트2");
		params.setWriter("테스트계정1");

		int result = boardMapper.insertBoard(params);
		
		System.out.println("결과는 " + result + "입니다.");
	}
}
