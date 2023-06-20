package Models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class student {
    String name;
    List<Integer> grades = new ArrayList();

    public student() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getGrades() {
        return this.grades;
    }

    public void setGrades(int voto) {
        this.grades.add(voto);
    }

    public int getAverageGrade() {
        int s = this.grades.size();
        int i = 0;

        int a;
        for(Iterator var3 = this.grades.iterator(); var3.hasNext(); i += a) {
            a = (Integer)var3.next();
        }

        int media = i / s;
        return media;
    }
}