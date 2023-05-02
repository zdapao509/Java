package com.bjpowernode.chapter.array;
/*
������Ԫ�صĲ��ң�
    ���ַ�����
        1.������ֱ���ҵ�Ϊֹ
        2.���ַ���Ч�ʸ���   binarySearch

        ���ַ����ҽ���������Ļ���֮�ϣ�

        ���ַ�����ԭ��

            10���±�0�� 23 56 89 799 4664 5615 8989 45456 565656���±�9��----�� 565656

            ��ʼ�±� 0  �����±� 9----------------�����±� ��0+9��/2=4��  ����[4]=799<565656

            ��ʼ�±� 4+1  �����±� 9--------------�����±�  ��5+9��/2=7;  ����[7]=8989<565656

            ��ʼ�±� 7+1  �����±� 9--------------�����±�  ��8+9��/2=8;  ����[8]=45456<56565

            ��ʼ�±� 8+1  �����±� 9--------------�����±�   ��9+9��/2=9��  ����[9]=565656

         ���ַ���ֹ������һֱ�۰룬ֱ���м���Ǹ�Ԫ��ǡ���Ǳ��鵽��Ԫ��

* */
public class ArraySearch {
    public static void main(String[] args) {
        int[] a={1,2,7,43,65};

        /*for (int i = 0; i < a.length; i++) {-------------����1������
            if (a[i] == 5) {
                System.out.println("65�±�Ϊ��"+i);
                return;
            }
        }
        System.out.println("ִ�е��˴���û�д���");
        return;*/

        int index=arraySearch(a,2);
        System.out.println(index==-1?"��Ԫ�ز�����":"65���±��ǣ�"+index);//��Ŀ�����
    }

    /*public static int arraySearch(int[] a, int i) {--------����
        for (int j = 0; j < a.length; j++) {
            if (a[j] == i) {
                return j;
            }
        }
        return -1;
    }*/


    /*public static int arraySearch(int[] a, int i) {--------ֱ�Ӷ����м������������ֶ��巽���ڴ�������0 1�±��������ֱ���
        int index=(a.length-1)/2;
        while(index>=0 && index<=a.length-1){//�������ķ�Χ�������Ƶ�ʱ�򣬾�˵��û���ҵ������
            if (i == a[index]) {//Ҫ�ҵ������ú��м������ȣ����ش��±�
                return index;
            } else if (i>a[index]) {//Ҫ�ҵ������м��±���ұߣ����¶��֣���ʼ�±�Ϊ �м��±�+1
                index=(index+1+a.length-1)/2;
            }else if(i<a[index]){//Ҫ�ҵ������м�������ߣ����¶��֣��յ��±� �м��±�-1
                if (index == 2) {//��һ���ĳ�����Ϊ�˱��⵱�±�Ϊ2ʱ��(2-1)/2=0��ʵ���ϵ����е�ֻʣ���±�0 1��������ʱ��Ҫ�Ӵ�Ŀ�ʼ��Ҳ���Ǵ�1���бȽ�
                    index++;
                }
                index=(index-1)/2;
            }
        }
        return -1;
    }*/

    public static int arraySearch(int[] a, int i) {//������ȷд��
        int begin=0;//������ʼ�±�
        int end=a.length-1;//��������±�

        while(begin<=end){//ѭ�������ǣ���ʼ�±��һ���ڽ����±�ǰ�棬����ʹ���

            int index=(begin+end)/2;

            if (i == a[index]) {//Ҫ�ҵ������ú��м������ȣ����ش��±�
                return index;
            } else if (i>a[index]) {//Ҫ�ҵ������м��±���ұߣ����¶��֣���ʼ�±�Ϊ �м��±�+1
                begin=index+1;
            }else if(i<a[index]){//Ҫ�ҵ������м�������ߣ����¶��֣��յ��±� �м��±�-1
                end=index-1;
            }
        }
        return -1;
    }


}
