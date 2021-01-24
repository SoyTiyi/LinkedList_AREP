package edu.escuelaing.arep.app;

/**
 * Hello world!
 *
 */
class App {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(12.0); list.add(15.0); list.add(13.0);
        System.out.println(list.getSumOfValues()+ " Suma de valores");
        System.out.println(list.get(0)+ " get first value");
        System.out.println(list.size());
        System.out.println(list.get(1)+ " get index equals to one");
        System.out.println(list.get(2)+ " get index equals to two");
    }
}
