package com.ozmen.junit.Assertions;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @Test
    public void getStudentsTest() {

        // Arrange
        StudentService studentService = new StudentService();
        Student student = new Student(1, "Yavuz");

        // Act
        List<Student> listOfStudents = studentService.getStudents();
        studentService.addStudent(student);

        boolean actualResult = listOfStudents.isEmpty();

        // Assert
        assertTrue(actualResult);
        // assertTrue(() -> actualResult);
        // assertTrue(actualResult, "List of students is empty!");
        // assertTrue(() -> actualResult, "List of students is empty!");
        // assertTrue(actualResult, () -> "List of students is empty!");

//        assertTrue(() -> actualResult, () -> "List of students is empty!");
    }

    @Test
    public void getStudentsTestUsingAssertFalse() {

        // Arrange
        StudentService studentService = new StudentService();
        Student student = new Student(2, "Mamoste");


        // Act
        List<Student> listOfStudents = studentService.getStudents();
        studentService.addStudent(student);

        boolean actualResult = listOfStudents.isEmpty();

// assertFalse(actualResult);
        assertFalse(() -> actualResult, () -> "List of students is empty!");

    }

    @Test
    void getStudentByIdTestUsingAssertNull() {
        // Arrange
        StudentService studentService = new StudentService();
        Student student = new Student(3, "Renas");
        studentService.addStudent(student);

        // Act (
        Student actualObject = studentService.getStudentById(3);

        // Assert (kontrol) →
//        assertNull(actualObject);
//        assertNull(actualObject, "ID bulunamadığı için sonuç null olmalı");
        assertNull(actualObject, () -> "\"ID bulunamadığı için sonuç null olmalı\"");
    }

    @Test
    void getStudentByIdTestUsingAssertNotNull() {
        // Arrange
        StudentService studentService = new StudentService();
        Student student = new Student(3, "Renas");
        studentService.addStudent(student);

        // Act →
        Student actualObject = studentService.getStudentById(3);

        // Assert →
//        assertNotNull(actualObject);
//        assertNotNull(actualObject, "Bu ID bulunduğu için sonuç null olmamalı");
        assertNotNull(actualObject, () -> "Bu ID bulunduğu için sonuç null olmamalı");
    }

    @Test
    public void getStudentByIdTestUsingAssertEquals() {

        // Arran ge
        StudentService studentService = new StudentService();
        Student student = new Student(10, "Yavuz");
        studentService.addStudent(student);

        // ACt
        Student actualObject = studentService.getStudentById(10);

        // assert

        // assertEquals(10, actualObject.getId());
//        assertEquals("Yavuz", actualObject.getName());
//        assertEquals(student, actualObject);
//        assertEquals(10, actualObject.getId(), "Student id is not egual");
          assertEquals(10, actualObject.getId(),() ->  "Student id is not egual");




    }


}