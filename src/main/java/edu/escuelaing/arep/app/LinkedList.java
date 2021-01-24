package edu.escuelaing.arep.app;

public class LinkedList {
    public Node first;
    public Node last;

    public void add(Double value) {
        Node newNode = new Node(value);
        if (first == null) {
            first = newNode;
        } else {
            if (last == null) {
                first.setNextNode(newNode);
                last = newNode;
            } else {
                last.setNextNode(newNode);
                last = newNode;
            }
        }
    }

    public Double getSumOfValues() {
        Double result = 0.0;
        if (first != null) {
            result += first.getValue();
            if (!first.getNextNode().equals(null)) {
                Node next = first.getNextNode();
                while (next != null) {
                    result += next.getValue();
                    next = next.getNextNode();
                }
            }
            return result;
        }
        return result;
    }

    public int size() {
        int result = 0;
        if (first != null) {
            result++;
            Node next = first.getNextNode();
            while (next != null) {
                result++;
                next = next.getNextNode();
            }
        }
        return result;
    }

    public Double get(int index) {
        if (first != null) {
            if (index == 0) {
                return first.getValue();
            } else {
                int i = 0;
                Node next = first.getNextNode();
                Double value = null;
                while (i != index) {
                    i++;
                    value = next.getValue();
                    next = next.getNextNode();
                }
                return value;
            }
        } else {
            return null;
        }
    }

}
