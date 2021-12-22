package edu.java.sproject.dto;

public class RoomDto {

	private int roomNum;
	private String title;
	private String userName;
	
	public RoomDto() {
		// TODO Auto-generated constructor stub
	}

	public RoomDto(int roomNum, String title, String userName) {
		super();
		this.roomNum = roomNum;
		this.title = title;
		this.userName = userName;
	}

	public int getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "RoomDto [roomNum=" + roomNum + ", title=" + title + ", userName=" + userName + "]";
	}
	
	
	
	
}
