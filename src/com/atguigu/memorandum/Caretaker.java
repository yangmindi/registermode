package com.atguigu.memorandum;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
//    private Memento memento;
    private List<Memento> list = new ArrayList<>();
    public Memento getMemento(Integer num) {
        return list.get(num);
    }

    public void setMemento(Memento memento) {
        list.add(memento);
    }
}
