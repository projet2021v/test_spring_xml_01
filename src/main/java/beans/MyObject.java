package beans;

import java.util.List;

public class MyObject {
	private Integer id;
	private String name;
	private MyObject parentObj;
	private List<String> keywords;
	
	public MyObject() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyObject getParentObj() {
		return parentObj;
	}

	public void setParentObj(MyObject parent) {
		this.parentObj = parent;
	}

	public List<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MyObject [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
}
