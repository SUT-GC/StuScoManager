package entity;

import javax.persistence.*;

@Entity
@Table(name = "TEACOURSE")
public class TeaCourse {

	@Id
	@Column(name = "TC_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "T_ID")
	private String teacher_id;
	@Column(name = "C_ID")
	private String course_id;

	public TeaCourse() {
		super();
	}

	public TeaCourse(String teacher_id, String course_id) {
		this.teacher_id = teacher_id;
		this.course_id = course_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(String teacher_id) {
		this.teacher_id = teacher_id;
	}

	public String getCourse_id() {
		return course_id;
	}

	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}

	@Override
	public String toString() {
		return "TeaCourse [id=" + id + ", teacher_id=" + teacher_id
				+ ", course_id=" + course_id + "]";
	}

}
