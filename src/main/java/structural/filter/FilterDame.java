package main.java.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterDame {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        //采用 接口对象指向 具体filter 的方式 ，依赖抽象，不依赖具象
        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFamale();

        //这里写错一些单词，据看菜鸟设计模式
//    Criteria singleMale = new AndCriteria(single, male);
//    Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meeCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meeCriteria(persons));

//    System.out.println("\nSingle Males: ");
//    printPersons(singleMale.meetCriteria(persons));
//
//    System.out.println("\nSingle Or Females: ");
//    printPersons(singleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    + ", Gender : " + person.getGender()
                    + ", Marital Status : " + person.getMaritalStatus()
                    + " ]");
        }
    }
}