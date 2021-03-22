package main.java.structural.filter;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.List;

public class OrCriteria implements Criteria {


    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meeCriteria(List<Person> personList) {
        List<Person> firstCriteriaItems = criteria.meeCriteria(personList);
        List<Person> otherCriteriaItems = otherCriteria.meeCriteria(personList);

        for (Person person : otherCriteriaItems) {
            if(!firstCriteriaItems.contains(person)){
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}