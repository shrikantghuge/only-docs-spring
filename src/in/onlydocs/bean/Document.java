package in.onlydocs.bean;

public class Document {
	
	String id;
	String name;
	String content;
	
	
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "Document [id=" + id + ", name=" + name + ", content=" + content + "]";
	}

}
