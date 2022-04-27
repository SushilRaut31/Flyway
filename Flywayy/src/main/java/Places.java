
public class Places {
private int ID;
private String name;
private String description;
private  String From;
private String Destination;
public Places(int iD, String name, String description, String from, String destination) {
	super();
	ID = iD;
	this.name = name;
	this.description = description;
	From = from;
	Destination = destination;
}
public Places () {}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getFrom() {
	return From;
}
public void setFrom(String from) {
	From = from;
}
public String getDestination() {
	return Destination;
}
public void setDestination(String destination) {
	Destination = destination;
}

}
