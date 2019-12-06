package com.atguigu.visitor;

public class ScientificAwardCheck extends AwardCheck{
    @Override
    public void visit(Teacher teacher) {
        if(teacher.getPaperAmount()>10){
            System.out.println("教师科研奖");
        }
    }

    @Override
    public void visit(Student student) {
        if(student.getPaperAmount()>2){
            System.out.println("学生科研奖");
        }
    }
}
