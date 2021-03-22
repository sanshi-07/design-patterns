package main.java.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {


    /**
     * 这里是 单个filter 的使用，也可以多个filter一起用，例如andCriteria、orCriteria
     * @param personList
     * @return
     */
    @Override
    public List<Person> meeCriteria(List<Person> personList) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : personList) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
