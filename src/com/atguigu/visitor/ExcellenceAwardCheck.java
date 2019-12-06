package com.atguigu.visitor;

public class ExcellenceAwardCheck extends AwardCheck {
    @Override
    public void visit(Teacher teacher) {
        if(teacher.getFeedbackScore()>=90){
            System.out.println("教师成绩优秀奖");
        }
    }

    @Override
    public void visit(Student student) {
        if(student.getScore()>=90){
            System.out.println("学生成绩优秀奖");
        }
    }
}
