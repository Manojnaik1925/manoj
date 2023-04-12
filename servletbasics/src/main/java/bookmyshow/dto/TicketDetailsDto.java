package bookmyshow.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TicketDetailsDto {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
private int id;
	private String moviename;
	private String theatername;
	private String lang;
	private String seatno;
	private int no_of_ticket;
	private double cost;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getTheatername() {
		return theatername;
	}
	public void setTheatername(String theatername) {
		this.theatername = theatername;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getSeatno() {
		return seatno;
	}
	public void setSeatno(String seatno) {
		this.seatno = seatno;
	}
	public int getNo_of_ticket() {
		return no_of_ticket;
	}
	public void setNo_of_ticket(int no_of_ticket) {
		this.no_of_ticket = no_of_ticket;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
}
