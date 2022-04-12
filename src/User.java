public class User {
	
	private String name;
	private String secondName;
	private String phone;
	private String number;
	private String gender;
	private String city;
	private String hometown;
	private String civilStatus;
	private String workplace;
	private String email;
	
	public User() {
		
	}

	public User(String name, String secondName, String phone, String number, String gender, String city,
			String hometown, String civilStatus, String workplace, String email) {
		super();
		this.name = name;
		this.secondName = secondName;
		this.phone = phone;
		this.number = number;
		this.gender = gender;
		this.city = city;
		this.hometown = hometown;
		this.civilStatus = civilStatus;
		this.workplace = workplace;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public String getCivilStatus() {
		return civilStatus;
	}

	public void setCivilStatus(String civilStatus) {
		this.civilStatus = civilStatus;
	}

	public String getWorkplace() {
		return workplace;
	}

	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
