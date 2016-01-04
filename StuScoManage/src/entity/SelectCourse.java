package entity;

import javax.persistence.*;

@Entity
@Table(name="STUCOURSE")
public class SelectCourse {
	@Id
	@Column(name="SC_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="S_ID")
	private String student_id;
	@Column(name="C_ID")
	private String course_id;
	@Column(name="T_ID")
	private String teacher_id;
	@Column(name="GRADE")
	private int grade;
	public SelectCourse() {
	}
	public SelectCourse(String student_id, String course_id, String teacher_id,
			int grade) {
		super();
		this.student_id = student_id;
		this.course_id = course_id;
		this.teacher_id = teacher_id;
		this.grade = grade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public String getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(String teacher_id) {
		this.teacher_id = teacher_id;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "SelectCourse [id=" + id + ", student_id=" + student_id
				+ ", course_id=" + course_id + ", teacher_id=" + teacher_id
				+ ", grade=" + grade + "]";
	}
	
}
