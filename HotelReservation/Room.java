package HotelReservation;

public class Room {
	private int roomNo;
	private String roomType;
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
	public String displayRoomDetails() {
		return "\nRoom no :"+getRoomNo()+"\nRoom type : "+getRoomType();
	}
}
