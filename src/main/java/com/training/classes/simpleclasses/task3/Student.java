package com.training.classes.simpleclasses.task3;

import java.util.List;

// 3. �������� ����� � ������ Student, ���������� ����:������� � ��������, ����� ������, ������������ (������ �� ���� ���������). 
//�������� ������ �� ������ ��������� ������ ����. 
//�������� ����������� ������ ������� � ������� ����� ���������, ������� ������, ������ ������ 9 ��� 10.
public class Student {
	private String secondName;
	private int groupId;
	private int[] performance = new int[5];

	public Student(String secondName, int groupId, int[] performance) {
		super();
		this.secondName = secondName;
		this.groupId = groupId;
		this.performance = performance;
	}

	private int getGroupId() {
		return groupId;
	}

	private int[] getPerformance() {
		return performance;
	}

	private String getSecondName() {
		return secondName;
	}

	public static void printStrudentsWithHighPerformance(List<Student> students) {
		for (Student student : students) {
			if (isStundentWithHighPerformance(student)) {
				System.out.println(
						"��� ��������:" + student.getSecondName() + "\n�����  ������: " + student.getGroupId());
			}
		}
	}

	private static boolean isStundentWithHighPerformance(Student student) {
		for (int i = 0; i < student.getPerformance().length; i++) {
			if (student.getPerformance()[i] < 9) {
				return false;
			}
		}
		return true;
	}

}
