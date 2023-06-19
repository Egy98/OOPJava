package Models;

import java.util.ArrayList;
import java.util.List;

public class student {
    String name;

    List<Integer> grades = new ArrayList<>();

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Integer> getGrades()
    {
        return grades;
    }

    public void setGrades(int voto)
    {
        grades.add(voto);
    }

    public int getAverageGrade ()
    {
        int s = grades.size();
        int i = 0;
        for (int a : grades)
        {
            i += a;
        }
        int media = (int) i/s;
        return media;
    }
}
