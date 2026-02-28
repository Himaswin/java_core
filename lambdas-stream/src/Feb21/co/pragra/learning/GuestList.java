package Feb21.co.pragra.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GuestList {

    public static void main(String[] args) {


//        Stream<String> stream = Stream.generate(()->"echo");
//        stream.forEach(g-> System.out.println(g));

        List<Guest> guests = getGuests();
        Stream<Guest> stream = guests.stream();
//        stream.forEach(guest -> System.out.println(guest));
//        stream.filter(guest -> guest.getAge() > 30).forEach(guest -> System.out.println(guest));
//        stream.filter(guest -> guest.getAge() > 30).map(guest -> guest.getName()).forEach(System.out::println);
        var list = stream.filter(guest -> guest.getAge()> 30)
                .map(guest -> guest.getName())
                .collect(Collectors.toCollection(ArrayList::new));
        list.forEach(System.out::println);


        Function<Guest, String> function = g-> g.getName();
        Consumer<Guest> guestConsumer = g-> System.out.println(g);

//        List<Guest> guests = getGuests();
//        for(Guest g : guests){
//            //guestConsumer.accept(g);
//            System.out.println(function.apply(g));
//        }



    }
    public static List<Guest> getGuests(){
        Guest guest3 = new Guest("bro", 64, "46576", "abs@maail", false);
        Guest guest5 = new Guest("df", 54, "657657", "adbs@mail", true);
        Guest guest6 = new Guest("dfs", 4, "798735", "acbs@mail", false);
        Guest guest7 = new Guest("fsfa", 45, "4657", "abs@masil", true);
        Guest guest8 = new Guest("gfdg", 5, "7683", "asbs@madil", true);

        List<Guest> guests = new ArrayList<>();
        guests.add(new Guest("gfsd", 18, "4545654", "abs@mail", true));
        guests.add(new Guest("hgh", 45, "465465", "sbs@mail", false));
        guests.add(new Guest("hsf", 46, "46546", "abs@dmail", true));
        guests.add(guest3);
        guests.add(guest5);
        guests.add(guest6);
        guests.add(guest7);
        guests.add(guest8);
        return guests;
    }
}
