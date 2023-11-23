package models;

public class RoomModels {

	private String roomType;
	private int roomPrice;
	private String roomAvailability;
	private int roomId;
	
	public RoomModels() {
		
		this.roomType = "";
		this.roomPrice = 0;
		this.roomAvailability = "";
		this.roomId = 0;
	}

	public RoomModels(String roomType, int roomPrice, String roomAvailability, int roomId) {
		super();
		this.roomType = roomType;
		this.roomPrice = roomPrice;
		this.roomAvailability = roomAvailability;
		this.roomId = roomId;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(int roomPrice) {
		this.roomPrice = roomPrice;
	}

	public String getRoomAvailability() {
		return roomAvailability;
	}

	public void setRoomAvailability(String roomAvailability) {
		this.roomAvailability = roomAvailability;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	@Override
	public String toString() {
		return "RoomModels [roomType=" + roomType + ", roomPrice=" + roomPrice + ", roomAvailability="
				+ roomAvailability + ", roomId=" + roomId + "]";
	}
	
	
	
	
}
