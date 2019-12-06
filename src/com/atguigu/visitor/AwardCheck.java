package com.atguigu.visitor;

public abstract class AwardCheck {
    public abstract void visit(Teacher teacher);
    public abstract void visit(Student student);
}
