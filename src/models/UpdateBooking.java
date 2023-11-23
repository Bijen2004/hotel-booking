package models;

public class UpdateBooking {
	public int bookingId;
	private String checkIn;
	private String checkOut;
	private int childrens;
	private int adults;
	private String bookingStatus;
	private int userId;
	private int roomId;
	private int roomNo;
	
	
	public UpdateBooking(int bookingId, String checkIn, String checkOut, int childrens, int adults,
			String bookingStatus) {
		this.bookingId = bookingId;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.childrens = childrens;
		this.adults = adults;
		this.bookingStatus = bookingStatus;
	}
	
	public UpdateBooking(int bookingId, String checkIn, String checkOut, int childrens, int adults,
			String bookingStatus,int roomNo) {
		this.bookingId = bookingId;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.childrens = childrens;
		this.adults = adults;
		this.bookingStatus = bookingStatus;
		this.roomNo = roomNo;
	}


	public UpdateBooking(int bookingId, String checkIn, String checkOut, int childrens, int adults,
			String bookingStatus, int userId, int roomId, int roomNo) {
		super();
		this.bookingId = bookingId;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.childrens = childrens;
		this.adults = adults;
		this.bookingStatus = bookingStatus;
		this.userId = userId;
		this.roomId = roomId;
		this.roomNo = roomNo;
	}


	public int getBookingId() {
		return bookingId;
	}


	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
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


	public int getRoomNo() {
		return roomNo;
	}


	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}


	@Override
	public String toString() {
		return "UpdateBooking [bookingId=" + bookingId + ", checkIn=" + checkIn + ", checkOut=" + checkOut
				+ ", childrens=" + childrens + ", adults=" + adults + ", bookingStatus=" + bookingStatus + ", userId="
				+ userId + ", roomId=" + roomId + ", roomNo=" + roomNo + "]";
	}
	
	
}
