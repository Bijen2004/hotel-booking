package models;

public class HotelRoomModel {
private int roomNo;
private String roomType;
private String roomStatus;

public HotelRoomModel(int roomNo, String roomType, String roomStatus) {
	super();
	this.roomNo = roomNo;
	this.roomType = roomType;
	this.roomStatus = roomStatus;
}

public HotelRoomModel(int roomNo) {
	super();
	this.roomNo = roomNo;
}

public int getRoomNo() {
	return roomNo;
}

public void setRoomNo(int roomNo) {
	this.roomNo = roomNo;
}

public String getRoomType() {
	return roomType;
}

public void setRoomType(String roomType) {
	this.roomType = roomType;
}

public String getRoomStatus() {
	return roomStatus;
}

public void setRoomStatus(String roomStatus) {
	this.roomStatus = roomStatus;
}

@Override
public String toString() {
	return "HotelRoomModel [roomNo=" + roomNo + ", roomType=" + roomType + ", roomStatus=" + roomStatus + "]";
}


}
