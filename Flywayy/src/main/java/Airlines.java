
public class Airlines {

	private int ID;
	private String nameA;
	private  String Discription;
	public Airlines(int iD, String nameA, String discription) {
		ID = iD;
		this.nameA = nameA;
		Discription = discription;
	}
	public Airlines() {}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNameA() {
		return nameA;
	}
	public void setNameA(String nameA) {
		this.nameA = nameA;
	}
	public String getDiscription() {
		return Discription;
	}
	public void setDiscription(String discription) {
		Discription = discription;
	}
	
}
