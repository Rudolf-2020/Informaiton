public class Counter {

    public String name;
    public int counter;


    public Counter(String n) {
        this(n, 0);
    }

    public Counter(String n, int c) {
        this.name = n;
        this.counter = c;
    }


//    методы увеличения и уменьшения счетчика на 1, с возвратом значения
    public int counterPlusOne() {
        return ++counter;
    }

    public int counterMinusOne() {
        return --counter;
    }


//    методы увеличения и уменьшения счетчика на заданное пользователем целое значение, с возвратом значения
    public int counterPlusNumber(int num) {
        return counter += num;
    }

    public  int counterMinusNumber(int num) {
        return  counter -= num;
    }

}
