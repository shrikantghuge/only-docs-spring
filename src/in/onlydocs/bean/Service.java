package in.onlydocs.bean;

import java.util.List;

public class Service {

	String id;
	String price;
	String duration;
	String name;
	List<FormFields> formFields;
	List<Document> documents;

	public List<FormFields> getFormFields() {
		return formFields;
	}

	public void setFormFields(List<FormFields> formFields) {
		this.formFields = formFields;
	}

	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Service [id=" + id + ", price=" + price + ", duration=" + duration + ", name=" + name + ", formFields="
				+ formFields + ", documents=" + documents + "]";
	}

}
