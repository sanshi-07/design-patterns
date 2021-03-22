package main.java.structural.filter;

import java.util.List;

public class AndCriteria implements Criteria {


    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meeCriteria(List<Person> personList) {
        List<Person> firstCriteriaPersons = criteria.meeCriteria(personList);
        return otherCriteria.meeCriteria(firstCriteriaPersons);
    }
}