package com.servicefactory;

import com.service.IStudentService;
import com.service.StudentServiceImpl;

public class StudentServiceFactory {
	// make constuctor private to avoid object creation
	private StudentServiceFactory() {

	}

	private static IStudentService studentService = null;

	public static IStudentService getStudentService() {

		// singleton pattern code
		if (studentService == null) {
			studentService = new StudentServiceImpl();
		}
		return studentService;
	}
}
