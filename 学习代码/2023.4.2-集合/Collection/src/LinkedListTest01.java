/*
��������ݽṹ��

    ������ŵ㣺

        ���������ϵ�Ԫ���ڿռ��д洢���ڴ��ַ�����������������ɾԪ�ص�ʱ�򲻻��д�����Ԫ��λ�ƣ���������ɾ��Ч�ʽϸߡ�

        ���Ժ�Ŀ����У�������������ɾ������Ԫ�ص�ҵ��Ƚ϶�ʱ�򣬽���ʹ��LinkedList


    �����ȱ�㣺

        ����ͨ��˳����ʽ���㱻����Ԫ�ص��ڴ��ַ��ÿһ�β��Ҷ��Ǵ�ͷ�ڵ㿪ʼ������֪���ҵ�Ϊֹ������LinkedList���ϼ���/���ҵ�Ч�ʽϵ�


    ArrayList:�Ѽ������ӵ�����-----���ֻ�򼯺ϵ�������Ԫ�أ�ArrayList �õĸ���

    LinkedList:�������ɾ���ӵ�����

* */

import java.util.Scanner;

public class LinkedListTest01 {
    public static void main(String[] args) {
        Linked head=new Linked();
        String key=" ";
        boolean loop=true;
        Scanner s=new Scanner(System.in);

        while(loop){
            System.out.println("����ָ�");
            System.out.println("add--��ӽڵ�");
            System.out.println("out--ɾ���ڵ�");
            System.out.println("show--չʾ�ڵ���Ϣ");
            System.out.println("exit--�˳�����");
            key=s.next();
            switch(key){
                case "a":
                    System.out.println("����ڵ��");
                    int a=s.nextInt();
                    Node temp=new Node(a,null);
                    head.addNode(a);
                    break;
                case "o":
                    try{
                        System.out.println("����Ҫɾ���Ľڵ㣺");
                        int del=s.nextInt();
                        head.outNode(del);
                        System.out.println("�ڵ㣺"+del+"��ɾ��");
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

//    ��ӽڵ�ķ�����
    public void addNode(int obj){
        if(head==null){
            head=new Node(obj,null);
        }else{
            Node temp=findLastNode(head);
            temp.next=new Node(obj,null);
        }
    }

//    �õݹ鷽���жϣ���������һ���ڵ�
    private Node findLastNode(Node temp){
        if(temp.next==null){
            return temp;
        }
        return findLastNode(temp.next);//��ʵ��һ�������ڣ�Node temp=temp.next;
    }

//    �ṩ���������ɾ��������
    public void outNode(int obj) throws Exception{
        if(head==null){
            throw new Exception("����Ϊ��");
        }
        Node temp=head;
        if(temp.getObj()==obj){
            head=head.next;
        }else{
            while(true){
                if(temp.next==null){
                    System.out.println("û��ҪѰ�ҵĽڵ�");
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

//    �ṩ�����ڵ���Ϣ�ķ�����
    public void showNode() throws Exception{
        if(head==null){
            throw new Exception("����Ϊ�գ��޷�չʾ");
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
        return "�ڵ㣺"+this.obj;
    }
}