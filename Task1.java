import java.util.ArrayDeque;

/*1 Пусть дан LinkedList с несколькими элементами. 
Реализуйте метод, который вернет “перевернутый” список. */

public class Task1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> list = new ArrayDeque<>();
        int count = 5;
        for (int i = 0; i < count; i++) {
            int rand = (int) (Math.random() * (100 - 1));
            list.addFirst(rand);
        }
        System.out.println(list);

    }

    public static ArrayDeque<Integer> ReversList(int count, ArrayDeque<Integer> list) {

        ArrayDeque<Integer> reversedList = new ArrayDeque<>();

        for (int i = 0; i < count; i++) {
            reversedList.addFirst(list.getFirst());
            list.removeFirst();
        }
        return reversedList;
    }
}