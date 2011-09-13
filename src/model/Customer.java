package model;

public class Customer {
	protected String name, address="", tlf;
	
	public Customer(String name, String address, String tlf){
		this.name = name;
		this.address = address;
		this.tlf = tlf;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tlf == null) ? 0 : tlf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (tlf == null) {
			if (other.tlf != null)
				return false;
		} else if (!tlf.equals(other.tlf))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}
}
