package com.edlforest.Game.Utils;

import com.edlforest.Game.Agents.Agent;

import java.util.*;

public class CircularList<T> {

    private Node anchor;
    private Node top;

    public CircularList(){
        anchor = null;
        top = null;
    }

    /**
     * getTop returns the current top Node in the CircularList.
     * And mark the next Node as top.
     * @return
     */
    public Node getTop(){
        Node temp = top;
        top = top.next;
        return temp;
    }

    public void insert(T data){
        Node<T> newNode = new Node<> (data);

    }


}

class Node<T> {

    T data;
    Node next;
    Node prev;

    public Node (T data){
        this.data = data;
        next = null;
        prev = null;
    }

}