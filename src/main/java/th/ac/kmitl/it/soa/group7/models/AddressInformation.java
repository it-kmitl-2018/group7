package th.ac.kmitl.it.soa.group7.models;

public class AddressInformation {
	private String addressLineOne;
	private String addressLineTwo;
	private String cityName;
	private String citySubDivision;
	private String postCode;
	private String countrySubDivision;
	private String countryName;

	public String getAddressLineOne() {
		return addressLineOne;
	}

	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}

	public String getAddressLineTwo() {
		return addressLineTwo;
	}

	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCitySubDivision() {
		return citySubDivision;
	}

	public void setCitySubDivision(String citySubDivision) {
		this.citySubDivision = citySubDivision;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getCountrySubDivision() {
		return countrySubDivision;
	}

	public void setCountrySubDivision(String countrySubDivision) {
		this.countrySubDivision = countrySubDivision;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}
