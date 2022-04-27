
public class ChangePassword {
	private int ID;
private String User;
private String pass;
public ChangePassword(int iD, String user, String pass) {
	super();
	ID = iD;
	User = user;
	this.pass = pass;
}
public ChangePassword() {}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getUser() {
	return User;
}
public void setUser(String user) {
	User = user;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}


}
