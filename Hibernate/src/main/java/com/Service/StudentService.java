package com.Service;

import com.dao.StudentDao;
import com.entity.Student;

public class StudentService {

    private StudentDao dao = new StudentDao();

    public void insertData(String name, String city) {
        Student s = new Student(name, city);
        dao.insert(s);
    }

    public void updateData(int id, String name, String city) {
        dao.update(id, name, city);
    }

    public void deleteData(int id) {
        dao.delete(id);
    }
}

