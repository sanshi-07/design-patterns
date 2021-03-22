package main.java.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFamale implements Criteria {

    @Override
    public  List<Person> meeCriteria(List<Person> personList) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : personList) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
