package th.ac.kmitl.it.soa.group7.models;

public class SellerInformation {
	public String taxId;
	public String branch;
	public String nameEng;
	public String nameTh;
	public String email;
	public String telephone;
	public String fax;
	public AddressInformation addressInformation;

	public void setAddressInformation(AddressInformation addressInformation) {
		this.addressInformation = addressInformation;
	}

	public AddressInformation getAddressInformation() {
		return this.addressInformation;
	}

	public String getTaxId() {
		return taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getNameEng() {
		return nameEng;
	}

	public void setNameEng(String nameEng) {
		this.nameEng = nameEng;
	}

	public String getNameTh() {
		return nameTh;
	}

	public void setNameTh(String nameTh) {
		this.nameTh = nameTh;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

}