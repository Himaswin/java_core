package Feb21.co.pragra.learning;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class GuestList {

    public static void main(String[] args) {

        List<Guest> guests = getGuests();
        List<Double> list = Arrays.asList(9.2, 23.2, 65.66);
        double collect = list.stream().collect(Collectors.averagingDouble(Double::doubleValue));
//        System.out.println(collect);

        List<Integer> list1 = Arrays.asList(2,3,46,6);
        double val = list1.stream().collect(Collectors.averagingInt(Integer::intValue));
//        System.out.println(val);

        LinkedList<Integer> collect2 = guests.stream().map(Guest::getAge).collect(Collectors.collectingAndThen(Collectors.toList(), LinkedList::new));

        List<Guest> collect1 = guests.stream().collect(Collectors.filtering(Guest::isVegetarian, Collectors.toList()));
//        System.out.println(collect1);


        Map<Boolean, List<Guest>> collect3 = guests.stream().collect(Collectors.groupingBy(Guest::isVegetarian));
//        System.out.println(collect3);

        Map<Boolean, Long> collect4 = guests.stream().collect(Collectors.groupingBy(Guest::isVegetarian, Collectors.counting()));
//        System.out.println(collect4);

        Map<String, Long> collect5 = guests.stream().collect(Collectors.groupingBy(g -> g.isVegetarian() ? "vegetarian" : "Non-vegetarian", Collectors.counting()));
//        System.out.println(collect5);

        //to return specific datatype like Treemap instead of map
        TreeMap<String, Long> collect6 = guests.stream().collect(Collectors.groupingBy(g -> g.isVegetarian() ? "vegetarian" : "Non-vegetarian", TreeMap::new, Collectors.counting()));
//        System.out.println(collect6);

        String collect7 = guests.stream().map(Guest::getName).collect(Collectors.joining("-|-"));
        System.out.println(collect7);



//        Stream<String> stream = Stream.generate(()->"echo");
//        stream.forEach(g-> System.out.println(g));





        Stream<Guest> stream = guests.stream();
//        stream.forEach(guest -> System.out.println(guest));
//        stream.filter(guest -> guest.getAge() > 30).forEach(guest -> System.out.println(guest));
//        stream.filter(guest -> guest.getAge() > 30).map(guest -> guest.getName()).forEach(System.out::println);
//        var list = stream.filter(guest -> guest.getAge()> 30)
//                .map(guest -> guest.getName())
//                .collect(Collectors.toCollection(ArrayList::new));
//        list.forEach(System.out::println);

            //all match
//        boolean b = guests.stream().allMatch(g -> g.isVegetarian() == true);
//        System.out.println(b);
        boolean b1 = guests.stream().anyMatch(g -> g.isVegetarian() == true);
//        System.out.println(b1);
//        guests.forEach(System.out::println);
        long count = guests.stream().filter(Guest::isVegetarian).count();
         List<String> names = guests.stream().map(Guest::getName).collect(Collectors.toList());
//        System.out.println(names);


        Function<Guest, String> function = g-> g.getName();
//        Consumer<Guest> guestConsumer = g-> System.out.println(g);

//        List<Guest> guests = getGuests();
//        for(Guest g : guests){
//            //guestConsumer.accept(g);
//            System.out.println(function.apply(g));
//        }



    }
    public static List<Guest> getGuests(){
        Guest guest3 = new Guest("Hari", 64, "46576", "hari@maail", false);
        Guest guest5 = new Guest("suresh", 54, "657657", "sures@mail", true);
        Guest guest6 = new Guest("ramesh", 4, "798735", "rames@mail", false);
        Guest guest7 = new Guest("john", 45, "4657", "john@masil", true);
        Guest guest8 = new Guest("dev", 5, "7683", "dev@madil", true);

        List<Guest> guests = new ArrayList<>();
        guests.add(new Guest("lok", 18, "4545654", "lok@mail", true));
        guests.add(new Guest("krish", 45, "465465", "krish@mail", false));
        guests.add(new Guest("chen", 46, "46546", "chen@dmail", true));
        guests.add(guest3);
        guests.add(guest5);
        guests.add(guest6);
        guests.add(guest7);
        guests.add(guest8);
        return guests;
    }
}
