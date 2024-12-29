package com.datastructures.linkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList(0);
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);


        LinkedList.Node fromK = linkedList.findKthFromEnd(2);
        System.out.println(fromK.value);


    }


}
