package AppHotel;

public class User {
  private String name;
  private String lastName;
  private String email;
  private String password;
  private String phonenumber;
  
  public User(String name, String lastName, String email, String password, String phonenumber) {
	this.name = name;
	this.lastName = lastName;
	this.email = email;
	this.password = password;
	this.phonenumber = phonenumber;
  }
  public String getName() {
	return name;
  }
  public void setName(String name) {
	this.name = name;
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
  public String getPassword() {
	return password;
  }
  public void setPassword(String password) {
	this.password = password;
  }
  public String getPhonenumber() {
	return phonenumber;
  }
  public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
  }
  public  User signUp(String name, String lastName, String email, String password, String phoneNumber) { 
  }
  public User signIn(String email, String password) {
  }
  public void recoverPasswordByEmail() {
  }
}