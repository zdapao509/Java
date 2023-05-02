/*
链表的数据结构：

    链表的优点：

        由于链表上的元素在空间中存储上内存地址不连续，所以随机增删元素的时候不会有大量的元素位移，因此随机增删的效率较高。

        在以后的开发中，如果遇到随机增删集合中元素的业务比较多时候，建议使用LinkedList


    链表的缺点：

        不能通过顺序表达式计算被查找元素的内存地址，每一次查找都是从头节点开始遍历，知道找到为止，所以LinkedList集合检索/查找的效率较低


    ArrayList:把检索发挥到极致-----如果只向集合的最后添加元素，ArrayList 用的更多

    LinkedList:把随机增删发挥到极致

* */

import java.util.Scanner;

public class LinkedListTest01 {
    public static void main(String[] args) {
        Linked head=new Linked();
        String key=" ";
        boolean loop=true;
        Scanner s=new Scanner(System.in);

        while(loop){
            System.out.println("输入指令：");
            System.out.println("add--添加节点");
            System.out.println("out--删除节点");
            System.out.println("show--展示节点信息");
            System.out.println("exit--退出程序");
            key=s.next();
            switch(key){
                case "a":
                    System.out.println("输入节点号");
                    int a=s.nextInt();
                    Node temp=new Node(a,null);
                    head.addNode(a);
                    break;
                case "o":
                    try{
                        System.out.println("输入要删除的节点：");
                        int del=s.nextInt();
                        head.outNode(del);
                        System.out.println("节点："+del+"已删除");
                        break;
                    }catch(Exception e){
                        e.printStackTrace();
                        System.out.println(e.getMessage());
                        break;
                    }
                case "s":
                    try{
                        head.showNode();
                        break;
                    }catch(Exception e){
                        e.printStackTrace();
                        System.out.println(e.getMessage());
                        break;
                    }
                case "e":
                    s.close();
                    loop=false;
                    break;
                default:
                    break;
            }
        }

    }
}

class Linked{
    Node head;

//    添加节点的方法：
    public void addNode(int obj){
        if(head==null){
            head=new Node(obj,null);
        }else{
            Node temp=findLastNode(head);
            temp.next=new Node(obj,null);
        }
    }

//    用递归方法判断：链表的最后一个节点
    private Node findLastNode(Node temp){
        if(temp.next==null){
            return temp;
        }
        return findLastNode(temp.next);//其实这一步就是在：Node temp=temp.next;
    }

//    提供单向链表的删除方法：
    public void outNode(int obj) throws Exception{
        if(head==null){
            throw new Exception("链表为空");
        }
        Node temp=head;
        if(temp.getObj()==obj){
            head=head.next;
        }else{
            while(true){
                if(temp.next==null){
                    System.out.println("没有要寻找的节点");
                    break;
                }else if(temp.next.getObj()!=obj){
                    temp=temp.next;
                }else{
                    temp.next=temp.next.next;
                    break;
                }
            }
        }

    }

//    提供遍历节点信息的方法：
    public void showNode() throws Exception{
        if(head==null){
            throw new Exception("链表为空，无法展示");
        }
        Node temp=head;
        while(true){
            if(temp==null){
                break;
            }
            System.out.println(temp);
            temp=temp.next;
        }
    }
}

class Node{
    private int obj;
    public int getObj(){
        return this.obj;
    }
    Node next;
    public Node(){}
    public Node(int obj,Node next){
        this.obj=obj;
        this.next=next;
    }

    public String toString(){
        return "节点："+this.obj;
    }
}