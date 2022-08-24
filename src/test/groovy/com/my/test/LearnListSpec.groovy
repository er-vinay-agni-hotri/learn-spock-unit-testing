package com.my.test

import spock.lang.Specification;
class LearnListSpec extends Specification {

    def "test a list data removal"() {
        given: ""
        def list = inputList;
        when: "we delete data from list"
        list.removeAll(removeList);

        then:"we get  size of the list"
        list.size() == expectSize


        where:
        inputList               | removeList            | expectSize
        ["l1","l2","l3","l4"]   | ["l1","l2","l3","l4"] | 0
        ["l1","l2","l3","l4"]   | ["l1","l2","l3"]      | 1
        ["l1","l2","l3","l4"]   | ["l3","l4"]           | 2
        ["l1","l2","l3","l4"]   | ["l1"]                | 3
        ["l1","l2","l3","l4"]   | []                    | 4


    }
}
