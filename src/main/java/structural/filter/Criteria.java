package main.java.structural.filter;

import java.util.List;

public interface Criteria {

    /**
     * 这里就是过滤接口，具体过滤器只需要实现本接口，完成过滤
     * @param personList
     * @return
     */
    List<Person> meeCriteria(List<Person> personList);
}
