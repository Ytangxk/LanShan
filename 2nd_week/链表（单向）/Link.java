package cn.Ytangxk.javase.collection.List;

import java.util.Objects;

public class Link {
    //头节点
    private Node header;

    private int size = 0;

    public int size() {
        return size;
    }

    //增
    public void add(Object data) {
        //创建一个新的节点对象
        //让之前的单链表末尾节点next指向新节点对象
        //这时候头节点也是尾节点
        if (null == header) {
            header = new Node(data, null);
        } else {
            //头节点已有，不为空
            //找出末尾节点，让末尾节点的next指向新节点
            Node currentLastNode = findLast(header);
            currentLastNode.next = new Node(data, null);

        }
        size++;
    }

    /*
     * 查找最后一个节点
     * */
    private Node findLast(Node node) {
        while (node.next != null) {
            node = node.next;
        }
        return node;
    }


    //删
    public void remove(Object data) throws removeException {
        if (data == header.element) {
            header = header.next;
        } else {
            Node beforeNode = new Node();
            beforeNode = header;
            while (beforeNode.next.element != data) {
                beforeNode = beforeNode.next;
                if (beforeNode.next == null) {
                    throw new removeException();
                }
            }

            beforeNode.next = beforeNode.next.next;
        }
        size--;
    }

    //改
    public void modify(Object newData, Object oldData) throws modifyException {
        Node n = new Node();
        n = header;
        while (n.element != oldData) {
            n = n.next;
            if (n.next == null) {
                throw new modifyException();
            }
        }

        n.element = newData;
    }

    //查
    public int findIndex(Object data) {
        Node n = header;
        int index = 0;
        while (n.element != data) {
            n = n.next;
            index++;
        }
        return index;
    }

    //遍历
    public void it() {
        Node n = new Node();
        n = header;
        while (n.next != null) {
            System.out.println(n.element);
            n = n.next;
        }
        System.out.println(n.element);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Link link = (Link) o;
        return size == link.size &&
                Objects.equals(header, link.header);
    }
}
