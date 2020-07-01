package in.onlydocs.bean;

import java.util.Map;

public class FormFields {

	String id;
	String name;
	String label;
	String type;
	Map<String, String> options;
	int sequence;
	boolean isMandatory;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Map<String, String> getOptions() {
		return options;
	}

	public void setOptions(Map<String, String> options) {
		this.options = options;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public boolean isMandatory() {
		return isMandatory;
	}

	public void setMandatory(boolean isMandatory) {
		this.isMandatory = isMandatory;
	}

	@Override
	public String toString() {
		return "FormFields [id=" + id + ", name=" + name + ", label=" + label + ", type=" + type + ", options="
				+ options + ", sequence=" + sequence + ", isMandatory=" + isMandatory + "]";
	}

}
