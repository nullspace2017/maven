package cn.itcast.maven.domain;

@SuppressWarnings("serial")
public class Person implements java.io.Serializable{

	private Integer id;	 
	private String name; 
	
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
	
	
}
