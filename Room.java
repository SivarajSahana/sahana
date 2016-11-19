public class Room {
	 private int roomNumber;
	   private String roomType;
	   private double roomprice;
	  
	 
	   
	   
	public Room(int roomNumber, String roomType, double roomprice) {
		super();
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.roomprice = roomprice;
		
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public void setRoomprice(double roomprice) {
		this.roomprice = roomprice;
	}

	
	public int getRoomNumber() {
		return roomNumber;
	}

	public String getRoomType() {
		return roomType;
	}

	public double getRoomprice() {
		return roomprice;
	}


	public Room() {
		
	}
}
