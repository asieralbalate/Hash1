

import java.util.*;

public class Hash1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(7);
        set.add(5);
        set.add(3);
        set.add(4);
        set.add(5);
        String[] array = {"hola", "adios", "halo", "ciao"};
        printDuplicates("hola", "adios", "hello", "bye", "hola");

    }

    public static Set<Integer> increment(Set<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        Set<Integer> newSet = new HashSet<>();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            newSet.add(i + 1);
        }
        return newSet;
    }

    public static void printUnique(String... array) {
        List<String> list = Arrays.asList(array);
        Set<String> set = new HashSet<>(list);
        System.out.println(set);
    }

    /*public static void printDuplicates(String...array){
        List<String> list = Arrays.asList(array);
        Set<String> set = new HashSet<>(list);
        Set<String> duplicatesSet;
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            list.remove(iterator.next());
        }
        duplicatesSet = new HashSet<>(list);
        System.out.println(duplicatesSet);
    }*/
    public static void printDuplicates(String... array) {
        List<String> list = new ArrayList<>(Arrays.asList(array));
        Set<String> set = new HashSet<>(list);
        for (String s : set) {
            list.remove(s);
        }
        Set<String> result = new HashSet<>(list);
        System.out.println(result);
    }

    public static <T> void printIntersection(Set<T> set1, Set<T> set2) {
        Set<T> interSet = new HashSet<T>(set1);
        interSet.retainAll(set2);
        System.out.println(set1);
    }
}

