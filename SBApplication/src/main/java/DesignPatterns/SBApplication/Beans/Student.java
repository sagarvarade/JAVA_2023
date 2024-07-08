package DesignPatterns.SBApplication.Beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String fatherName;
	private String surName;
	private String clazz;
	private String standard;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "wardrobe_id", referencedColumnName = "id")
	private WardRobe wardRobe;

	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Course> courses = new HashSet<>();

	/*
	@ManyToMany
    @JoinTable(
        name = "student_hobby",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "hobby_id")
    )
    private Set<Hobby> hobbies = new HashSet<>();
	*/
	
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

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public WardRobe getWardRobe() {
		return wardRobe;
	}

	public void setWardRobe(WardRobe wardRobe) {
		this.wardRobe = wardRobe;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
/*
	public Set<Hobby> getHobbies() {
		return hobbies;
	}

	public void setHobbies(Set<Hobby> hobbies) {
		this.hobbies = hobbies;
	}
*/
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fatherName=" + fatherName + ", surName=" + surName
				+ ", clazz=" + clazz + ", standard=" + standard + ", wardRobe=" + wardRobe + ", courses=" + courses
				+ ", hobbies=]";
	}

}