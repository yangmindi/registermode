package com.atguigu.visitor;

public class Student implements Person{
    private int paperAmount;
    private double score;

    public int getPaperAmount() {
        return paperAmount;
    }

    public void setPaperAmount(int paperAmount) {
        this.paperAmount = paperAmount;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(int paperAmount, double score) {
        this.paperAmount = paperAmount;
        this.score = score;
    }

    @Override
    public void accept(AwardCheck check) {
        check.visit(this);
    }
}
