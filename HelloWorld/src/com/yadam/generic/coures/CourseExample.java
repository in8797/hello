package com.yadam.generic.coures;

import java.util.Arrays;

public class CourseExample {
	public static void main(String[] args) {
		Course<Person> PersonCourse = new Course<>("일반인과정", 5);
		PersonCourse.add(new Person("일반인1"));
		PersonCourse.add(new Worker("직장인1"));
		PersonCourse.add(new Student("학생1"));
		PersonCourse.add(new HighStudent("고등학생1"));

		Course<Worker> WorkerCourse = new Course<>("직장인과정", 5);
		WorkerCourse.add(new Worker("직장인2"));

		Course<Student> StudentCourse = new Course<>("학생과정", 5);
		StudentCourse.add(new Student("학생3"));
		StudentCourse.add(new HighStudent("고등학생3"));

		Course<HighStudent> highCourse = new Course<>("고등학생과정", 5);
		highCourse.add(new HighStudent("고등학생4"));
		
		registerCourse(PersonCourse);
		registerCourse(WorkerCourse);
		registerCourse(StudentCourse);
		registerCourse(highCourse);
		
		registerStudent(StudentCourse);
		registerStudent(highCourse);
		
		registerWorker(WorkerCourse);
		registerWorker(PersonCourse);
	}
	
	public static Course<? super Worker> getCourse() {
		Course<Person> coursePerson= new Course<>("일반인과정", 5);
		Course<Worker> courseWorker= new Course<>("직장인과정", 5);
		Course<Student> courseStudent= new Course<>("학생과정", 5);
		Course<HighStudent> coursehighStudent= new Course<>("고등학생과정", 5);
		
		return coursePerson;
	}
	public static void registerWorker(Course<? super Worker> course) {
		System.out.println("과정명: " + course.getName() + ", 수강생: " + Arrays.toString(course.getStudents()));
	}
	public static void registerStudent(Course<? extends Student> course) {
		System.out.println("과정명: " + course.getName() + ", 수강생: " + Arrays.toString(course.getStudents()));
	}
	public static void registerCourse(Course<?> course) { // 와일드카드는 모든걸 받겠다는 의미
		System.out.println("과정명: " + course.getName() + ", 수강생: " + Arrays.toString(course.getStudents()));
	}
}
