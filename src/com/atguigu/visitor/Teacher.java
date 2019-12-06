package com.atguigu.visitor;

public class Teacher implements Person{
    private int paperAmount;
    private double feedbackScore;

    public int getPaperAmount() {
        return paperAmount;
    }

    public Teacher(int paperAmount, double feedbackScore) {
        this.paperAmount = paperAmount;
        this.feedbackScore = feedbackScore;
    }

    public void setPaperAmount(int paperAmount) {
        this.paperAmount = paperAmount;
    }

    public double getFeedbackScore() {
        return feedbackScore;
    }

    public void setFeedbackScore(double feedbackScore) {
        this.feedbackScore = feedbackScore;
    }

    @Override
    public void accept(AwardCheck check) {
        check.visit(this);
    }
}
