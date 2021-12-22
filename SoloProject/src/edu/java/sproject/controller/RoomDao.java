package edu.java.sproject.controller;

import java.util.List;

import edu.java.sproject.dto.RoomDto;

public interface RoomDao {

	int createRoom(RoomDto dto);
	int roomNum();
	List<RoomDto> showTable();
	
}
