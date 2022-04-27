
public class flights {
private int ID;
private String fromto;
private String departure;
private String airline;
private int Ticket;

public flights() {}
public flights(int iD, String fromto, String departure, String airline, int ticket) {
	
	ID = iD;
	this.fromto = fromto;
	this.departure = departure;
	this.airline = airline;
	Ticket = ticket;
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getFromto() {
	return fromto;
}
public void setFromto(String fromto) {
	this.fromto = fromto;
}
public String getDeparture() {
	return departure;
}
public void setDeparture(String departure) {
	this.departure = departure;
}
public String getAirline() {
	return airline;
}
public void setAirline(String airline) {
	this.airline = airline;
}
public int getTicket() {
	return Ticket;
}
public void setTicket(int ticket) {
	Ticket = ticket;
}


}
