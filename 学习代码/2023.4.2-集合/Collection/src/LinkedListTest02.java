import java.util.LinkedList;
import java.util.List;

/*
LinkedList���ϵײ�Ҳ�����±��

ע�⣺ArrayList֮���Լ���Ч�ʱȽϸߣ�����Ϊ�ײ����鷢�ӵ����ã�������Ϊ�±��ԭ��

linkedList�������±꣬����ʵ�ʼ���������ĳ��Ԫ�ص�ʱ��Ч�ʱȽϵͣ���Ϊֻ�ܴ�ͷ�ڵ㿪ʼ��һ��һ���ı���

LinkedList�����г�ʼ��������û��

    ������������û���κ�Ԫ�أ�first��last���ö���null��������LinkedList����ArrayList��д���벻��Ҫ���������һ�����ϣ���Ϊ������ӿڱ�̣����÷������ǽӿ��еķ���

LinkedList������˫�����������������ݽṹ��˵�������ɾЧ�ʸߣ�����Ч�ʽϵ͡������е�Ԫ���ڿռ�洢�ϣ��ڴ��ַ������
* */
public class LinkedListTest02 {
    public static void main(String[] args) {
        List list =new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        List list2=new LinkedList();//��ʾ�ײ���õ��� ˫������

        list2.add("123");
        list2.add("465");
        list2.add("798");

        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
    }
}
