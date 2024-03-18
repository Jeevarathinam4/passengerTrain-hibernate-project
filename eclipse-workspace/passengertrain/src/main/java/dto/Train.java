package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Train {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int tId;
	private String tName;
	private int noOfCoaches;
	private String startingPoint;
	private String destination;
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public int getNoOfCoaches() {
		return noOfCoaches;
	}
	public void setNoOfCoaches(int noOfCoaches) {
		this.noOfCoaches = noOfCoaches;
	}
	public String getStartingPoint() {
		return startingPoint;
	}
	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "Train [tId=" + tId + ", tName=" + tName + ", noOfCoaches=" + noOfCoaches + ", startingPoint="
				+ startingPoint + ", destination=" + destination + "]";
	}
	
	
	

}
