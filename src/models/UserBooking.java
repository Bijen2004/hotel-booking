package models;

public class UserBooking {
	private static String checkIn;
	private static String checkOut;
	private static int childrens;
	private static int adults;
	private static String bookingStatus;
	private static int userId;
	private static int roomId;
	
	public UserBooking(String checkIn, String checkOut, int childrens, int adults, String bookingStatus, int userId,
			int roomId) {
		super();
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.childrens = childrens;
		this.adults = adults;
		this.bookingStatus = bookingStatus;
		this.userId = userId;
		this.roomId = roomId;
	}
	
	public UserBooking() {
		this.checkIn = "";
		this.checkOut = "";
		this.childrens = 0;
		this.adults = 0;
		this.bookingStatus="";
		this.userId = 0;
		this.roomId = 0;
	}





	public String getCheckIn() {
		return checkIn;
	}


	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}


	public String getCheckOut() {
		return checkOut;
	}


	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}


	public int getChildrens() {
		return childrens;
	}


	public void setChildrens(int childrens) {
		this.childrens = childrens;
	}


	public int getAdults() {
		return adults;
	}


	public void setAdults(int adults) {
		this.adults = adults;
	}


	public String getBookingStatus() {
		return bookingStatus;
	}


	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public int getRoomId() {
		return roomId;
	}


	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}


	@Override
	public String toString() {
		return "UserBooking [checkIn=" + checkIn + ", checkOut=" + checkOut + ", childrens=" + childrens + ", adults="
				+ adults + ", bookingStatus=" + bookingStatus + ", userId=" + userId + ", roomId=" + roomId + "]";
	}

	
}
