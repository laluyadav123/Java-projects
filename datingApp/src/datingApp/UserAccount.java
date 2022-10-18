package datingApp;

import java.util.Objects;

public class UserAccount {

	private int id;
	private String Username;
	private String Password;
	private int Age;
	private String Email;
	private String PhonNumber;
	private String Gender;
	private String City;
	private String Country;
	private Interest interest;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhonNumber() {
		return PhonNumber;
	}

	public void setPhonNumber(String phonNumber) {
		PhonNumber = phonNumber;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public Interest getInterest() {
		return interest;
	}

	public void setInterest(Interest interest) {
		this.interest = interest;
	}

	@Override
	public String toString() {
		return "UserAccount [id=" + id + ", Username=" + Username + ", Password=" + Password + ", Age=" + Age
				+ ", Email=" + Email + ", PhonNumber=" + PhonNumber + ", Gender=" + Gender + ", City=" + City
				+ ", Country=" + Country + ", interest=" + interest + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserAccount other = (UserAccount) obj;
		return id == other.id;
	}

}
