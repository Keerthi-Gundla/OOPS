package com.basics.oop;

import java.util.*;
class College{
    private String name;
    private List<Teacher> teachers;

    public College(String name,List<Teacher> t){
        this.teachers =t;
        this.name=name;
    }
    public List<Teacher> getTeachers()
    {
        return teachers;
    }
}

class Teacher{
    private String name;
    private String subject;
    public Teacher(String name, String sub){
        this.name=name;
        this.subject=sub;

    }
    public String toString(){
        return "Teacher : "+ name+"  subject : "+subject;
    }
}
public class Aggregation {
    public static void main(String args[]){
        Teacher t1=new Teacher("john","java");
        Teacher t2=new Teacher("roy", "python");
        List<Teacher> teachers=new ArrayList<Teacher>();
        teachers.add(t1);
        teachers.add(t2);
        College c=new College("mycollege",teachers);
        List<Teacher> result =c.getTeachers();
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }

    }
}
