package Feb21.co.pragra.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Functional {
    public static void main(String[] args) {

    }
    public List<Integer> doubling(List<Integer> nums){
       return nums.stream().map(n->n*2).collect(Collectors.toList());
//        Stream<Integer> stream = nums.stream();
//        List<Integer> res = new ArrayList<Integer>();
//        stream.map(n->n*2).collect(Collectors.toCollection(res));
//        return res;
    }
}
