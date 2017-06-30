package davelistpac;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Rooms {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(unique = true)
	@Size(min=2, max=30)
	private String fullname;
	
	@NotNull
	private int roomNumbers;
	
	private String streetAddress; 
	private String city;
	
	@Size(max=2)
	private String state;
	
	private int price;
	private String cable;
	private String wifi;
	private String privateBathroom;
	
	private String rules;
	private String rented;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getRules() {
		return rules;
	}
	public void setRules(String rules) {
		this.rules = rules;
	}
	public String getCable() {
		return cable;
	}
	public void setCable(String cable) {
		this.cable = cable;
	}
	public String getWifi() {
		return wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public String getPrivateBathroom() {
		return privateBathroom;
	}
	public void setPrivateBathroom(String privateBathroom) {
		this.privateBathroom = privateBathroom;
	}
	public String getRented() {
		return rented;
	}
	public void setIsRented(String rented) {
		this.rented = rented;
	}
	public int getRoomNumbers() {
		return roomNumbers;
	}
	public void setRoomNumbers(int roomNumbers) {
		this.roomNumbers = roomNumbers;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
	
	
	
