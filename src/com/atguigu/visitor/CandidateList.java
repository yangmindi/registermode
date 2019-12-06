package com.atguigu.visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class CandidateList {
    private ArrayList<Person> list = new ArrayList();

    public void accept(AwardCheck awardCheck){
        Iterator i = list.iterator();
        while(i.hasNext()){
            ((Person)i.next()).accept(awardCheck);
        }
    }

    public void addPerson(Person person){
        list.add(person);
    }

    public void removePerson(Person person){
        list.remove(person);
    }
}
