package com.atguigu.visitor;

public class Client {
    public static void main(String[] args) {
        Person p1 = new Teacher(5,95);
        Person p2 = new Student(1,90);
        AwardCheck awardCheck;

        CandidateList candidateList = new CandidateList();
        candidateList.addPerson(p1);
        candidateList.addPerson(p2);

        awardCheck = new ScientificAwardCheck();
        awardCheck = new ExcellenceAwardCheck();

        candidateList.accept(awardCheck);
    }
}
