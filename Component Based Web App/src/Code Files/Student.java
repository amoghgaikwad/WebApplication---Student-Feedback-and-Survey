package homework3;

import javax.faces.bean.ManagedBean;

@ManagedBean

public class Student {
	

    private String firstName;
    private String lastName;
    private String telephone;
    private String address;
    private String zip;
    private String city;
    private String state;
    private String email;
    private String knowAbout;
    private String likelihood;
    private String date;
    private String startDate;
    private String raffle;
    private String comments;
       	    
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
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}	
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
	public String getKnowAbout() {
		return knowAbout;
	}
	public void setKnowAbout(String knowAbout) {
		this.knowAbout = knowAbout;
	}
	public String getLikelihood() {
		return likelihood;
	}
	public void setLikelihood(String likelihood) {
		this.likelihood = likelihood;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}	
	
	public String getComments() {
	   return comments;
	}
    public void setComments(String comments) {
	        this.comments = comments;
    }    
    public String getRaffle() {
        return raffle;
    }
    public void setRaffle(String raffle) {
        this.raffle = raffle;
    }


}
