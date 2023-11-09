package com.greedy.level04.advanced.model.comparator;

import java.util.Comparator;

import com.greedy.level04.advanced.model.dto.BoardDTO;

public class DescBoardNo implements Comparator<BoardDTO>{

	@Override
	public int compare(BoardDTO b1, BoardDTO b2) {
		
		return b2.getBoardNo()- b1.getBoardNo();
	}
	
	
}
