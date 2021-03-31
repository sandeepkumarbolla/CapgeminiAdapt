package io.sandeep.restassign;

public class User {



	private String idString;
	private String passString;
	public User(String idString, String passString) {
		super();
		this.idString = idString;
		this.passString = passString;
	}
	public String getIdString() {
		return idString;
	}
	public String getPassString() {
		return passString;
	}
	public void setIdString(String idString) {
		this.idString = idString;
	}
	public void setPassString(String passString) {
		this.passString = passString;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (idString == null) {
			if (other.idString != null)
				return false;
		} else if (!idString.equals(other.idString))
			return false;
		if (passString == null) {
			if (other.passString != null)
				return false;
		} else if (!passString.equals(other.passString))
			return false;
		return true;
	}
	

}