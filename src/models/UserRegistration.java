package models;

public class UserRegistration {
	private String firstName;
	private String lastName;
	private String email;
	private int phoneNumber;
	private String country;
	private String city;
	private int zipCode;
	private String gender;
	private int age;
	private String userName;
	private String password;
	private String creditCard;
	private String customerType;
	
	public UserRegistration(String firstName, String lastName, String email, int phoneNumber, String country,
			String city, int zipCode, String gender, int age, String userName, String password, String creditCard,
			String customerType) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.country = country;
		this.city = city;
		this.zipCode = zipCode;
		this.gender = gender;
		this.age = age;
		this.userName = userName;
		this.password = password;
		this.creditCard = creditCard;
		this.customerType = customerType;
	}
	
	public UserRegistration() {
		this.firstName = "";
		this.lastName = "";
		this.email = "";
		this.phoneNumber = 0;
		this.country = "";
		this.city = "";
		this.zipCode = 0;
		this.gender = "";
		this.age = 0;
		this.userName = "";
		this.password = "";
		this.creditCard = "";
		this.customerType = "";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	@Override
	public String toString() {
		return "UserRegistration [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", country=" + country + ", city=" + city + ", zipCode=" + zipCode
				+ ", gender=" + gender + ", age=" + age + ", userName=" + userName + ", password=" + password
				+ ", creditCard=" + creditCard + ", customerType=" + customerType + "]";
	}
	

	
}
