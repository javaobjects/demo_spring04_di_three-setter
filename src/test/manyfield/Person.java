package test.manyfield;

import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Person {

	private Integer id;
	private String name;
	private Date birthday;
	private String[] phone;
	private URL boke;
	
	private List<String> hobby;
	private Map<String,Integer> scores;
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
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String[] getPhone() {
		return phone;
	}
	public void setPhone(String[] phone) {
		this.phone = phone;
	}
	public URL getBoke() {
		return boke;
	}
	public void setBoke(URL boke) {
		this.boke = boke;
	}
	public List<String> getHobby() {
		return hobby;
	}
	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}
	public Map<String, Integer> getScores() {
		return scores;
	}
	public void setScores(Map<String, Integer> scores) {
		this.scores = scores;
	}
	
}
