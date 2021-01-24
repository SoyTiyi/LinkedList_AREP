package edu.escuelaing.arep.app;

public class Node {

    public Double value;
    public Node nextNode;

    public Node(Double value){
        this.value = value;
    }

    public Node(){}

    public Double getValue(){
        return this.value;
    }

    public void setValue(Double value){
        this.value = value;
    }

    public Node getNextNode(){
        return nextNode;
    }

    public void setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }
    
}
