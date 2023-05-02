package com.bjpowernode.chapter.array;
/*
Ϊĳ���Ƶ�д���򣬾Ƶ����ϵͳ��ģ�ⶩ�����˷�����ӡ���з���״̬�ȹ���

    1.��ϵͳ���û��ǣ��Ƶ�ǰ̨
    2.�Ƶ�ʹ��һ����ά������ģ�⣬��Room[][] rooms;��
    3���Ƶ���ÿһ������Ӧ����һ��java����Room
    4.ÿһ������roomӦ���У������š��������͡������Ƿ����
    5.ϵͳӦ�ö����ṩ�Ĺ��ܣ�
        ����Ԥ�����䣺�û����뷿���š�����
        �����˷����û����뷿���ţ��˷�
        ���Բ�ѯ�����״̬���û�����ĳ��ָ��Ӧ�ÿ��Բ�ѯ���з����״̬


     �鿴һ��������Ժͷ�����ctrl+F12
* */
public class homeWork20 {
    public static void main(String[] args) {

        Room room=new Room(101,"���˼�",true);//�����������

        System.out.println(room);//�����������õ�ʱ���Զ����ö����toString����

        Room room2=new Room(101,"˫�˼�",true);//�����������

        System.out.println(room.equals(room2));//�Ƚ����䷿���Ƿ�����һ��

        hotel htl=new hotel();//�����Ƶ꣬����Ĭ�ϳ�ʼ���ķ�ʽ

        System.out.println(htl.getRooms()[1][2]);//����ĳһ��������Ϣ������getRooms������
                                                // getRoom[][]�������������ڱ����õ�ʱ�򣬻��Զ�����������õ�toString����,
                                                // ���������Room���͵ģ���Ϊrooms�����������Ƕ�ά���飬ÿһ��Ԫ�ض�Ӧһ��Room�͵�����
                                                //        �����[102+˫�˼�+���У���ס]
        htl.allRoom();//����¥�������з������Ϣ

        System.out.println("*****************************************");

        hotel htls=new hotel(new Room[6][7]);//�����Ƶ꣬���ö�̬��ʼֵ�ķ�ʽ���Լ�����¥�ߺ�ÿ�㷿���

        htls.allRoom();//����ÿ����Ϣ��[0+null+�ѱ�ռ��]

        htls.orderRoom(207);//������207��

        htls.allRoom();

        System.out.println("****************************\n\n\n");

        System.out.println(htls.relax(207));//�鿴207�����ǲ��ǿյ�

        htls.orderRoom(207);//�ٴ�Ԥ�������ַ����Ѷ�

        htls.disOrderRoom(207);//�˷�207

        htls.disOrderRoom(205);//���Է��䱾���ǿյģ��˷�

        System.out.println("*******************************\n\n\n");

        htls.orderRoom(101);
        htls.orderRoom(203);
        htls.orderRoom(305);
        System.out.println("*******************************\n");
        htls.displayRelaxRoom();//��ʾ�շ���



    }
}
class Room{
    private int numRoom;
    /*����ı�ţ�
    1¥��101 102 103
    2¥��201 202 203.....
    * */
    private String typeRoom;
    /*���������
    ��׼�� ���� ��ͳ�׷�
    * */
    private boolean kongXian;
    /*����״̬��
    true��ʾ����
    false��ʾ���ܱ�Ԥ��
    * */

    public Room() {
    }

    public Room(int numRoom, String typeRoom, Boolean kongXian){
        this.numRoom=numRoom;
        this.typeRoom=typeRoom;
        this.kongXian=kongXian;
    }

    public int getNumRoom() {
        return numRoom;
    }

    public void setNumRoom(int numRoom) {
        this.numRoom = numRoom;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public boolean getKongXian() {//ע�⣺IDEA���߶���boolean���͵ı������ɵ�get�������ǣ�isXXXX�������㲻ϲ���Ļ��������޸ĳ�getXXXX������
        return kongXian;
    }

    public void setKongXian(boolean kongXian) {
        this.kongXian = kongXian;
    }

//    equals������д-----equals���������ж����������Ƿ���ȣ�
//    ���������Ҫ�Լ�������Ҫ��Object������������ڴ��ַ�Ƿ���ȵķ�ʽ---------д�����ʱ��һ��Ҫע�⣬equals������д
//    ����Ϊ����������ô��ȣ����ܴ���һ�����䣻�������Ȼ�����������
    public boolean equals(Object obj) {
        if(obj==null||!(obj instanceof Room)) return false;
        if(this==obj) return true;
        Room roomobj=(Room)obj;
        return this.numRoom==roomobj.getNumRoom()&&this.typeRoom.equals(roomobj.getTypeRoom());
    }

//    toString������д---toString �������ǽ�����ת�����ַ�����ʽ��Ҳ���Ƕ��������ת�����ַ�������ôת�����Լ���������Ҫ�������
//    ԭ���ĸ���Object�����toString�����������õ��ڴ��ַ��������Ҫ�ĳ��Լ�Ҫ�����ľ�����Ϣ

    @Override
    public String toString() {
//        return "[101+���˼�+����]";
//        return "["+this.numRoom+"+"+this.typeRoom+"+"+this.kongXian+"]";//[101+���˼�+true]
        return "["+this.numRoom+"+"+this.typeRoom+"+"+(this.kongXian? "���У���ס":"�ѱ�ռ��")+"]";
        //����������Ŀ������������жϣ��ܷ��㣬ע����Ŀ�������д��
    }
}

class hotel{//�����Ƶ�ǰ̨���󣬾Ƶ�����һ����ά���飬��ά����ķ�ʽģ�����
    private Room[][] rooms;

    public Room[][] getRooms() {
        return rooms;
    }

    public void setRooms(Room[][] rooms) {
        this.rooms = rooms;
    }

    public hotel() {//ͨ�����췽��ȥ ��¥ ��              һ�����ٲ㣬ÿ�㷿�����ͣ�ÿ����ٸ�����---------������д����Ȼ���ٿ��Ƕ�̬��
        rooms=new Room[3][10];//����¥��ÿ��10������

//        ����30�����䣬�ŵ������У�Ҳ����ʵ����Room����30�Σ��ö�ά��������ķ�ʽʵ�֣�
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                rooms[i][j]=new Room();//�������ɵķ�ʽ������ţ�����������Щ��������Ĭ��ֵ��

//                �ø����ӵķ�ʽ��ʼ������źͷ������ͣ�������Ĭ��ֵ
                //����ÿ�㷿������
                String typeRoom;
                if(i==0){
                    typeRoom="���˼�";
                } else if (i==1) {
                    typeRoom="˫�˼�";
                }else {
                    typeRoom="��ͳ��";
                }
                rooms[i][j]=new Room(((i+1)*100+j+1),typeRoom,true);//���ֶ��巽ʽ��ֱ�Ӹ�ÿ������ķ���ţ��������Ͷ�������Ĭ�ϳ�ʼ����
                                                                            // ���ң�Ĭ��������
            }
        }

    }

    public hotel(Room[][] rooms){//ͨ���в������췽ʽ��¥�����ʱ���¥������ÿ��ķ������ȵ���Щ���ԣ����Ƕ�̬�ģ������Լ��������¥�м��㣬�м�������
        this.rooms=rooms;
//        ��ʼ��ÿ������
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {

                String typeRoom;
                if(i==0){
                    typeRoom="���˼�";
                } else if (i<=4) {
                    typeRoom="˫�˼�";
                }else {
                    typeRoom="��ͳ��";
                }
                rooms[i][j]=new Room(((i+1)*100+j+1),typeRoom,true);//���ֶ��巽ʽ��ֱ�Ӹ�ÿ������ķ���ţ��������Ͷ�������Ĭ�ϳ�ʼ����
                // ���ң�Ĭ��������
            }
        }

        System.out.println("��󷿼���룺"+(this.rooms.length*100+this.rooms[this.rooms.length-1].length));
    }

    public void allRoom(){//�������з�����Ϣ
        for (int i = 0; i < rooms.length ; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.print(rooms[i][j]+"  ");//rooms[i][j]������������Room���͵����ã�����������õ�ʱ��Ĭ�ϵ������õ�toString����
            }
            System.out.println("\n");
        }

    }

    public boolean relax(int numRoom){//�жϷ����Ƿ����
        if(numRoom<101||(numRoom/100)>(this.rooms.length)||(numRoom%100)>(rooms[rooms.length-1].length)){
            System.out.println("������Ϣ����");
            return false;
        }
        if(this.rooms[numRoom/100-1][numRoom%100-1].getKongXian()) return true;
        return false;
    }

    public void orderRoom(int numRoom){//�ṩ�����������������״̬��Ϣ�޸�Ϊfalse
//        if(numRoom<101||numRoom>(this.rooms.length*100+rooms[rooms.length-1].length)){//�������ж��Ǵ�ģ�Ҫ�Ӳ�����ʼ�жϣ�����С����������
//                                                                                          ÿһ��ķ�����Ҳ���ܳ�

        if(numRoom<101||(numRoom/100)>(this.rooms.length)||(numRoom%100)>(rooms[rooms.length-1].length)){
            System.out.println("������Ϣ����");
            return ;
        }
        if(this.relax(numRoom)){//��������ǿգ����Զ���
            this.rooms[numRoom/100-1][numRoom%100-1].setKongXian(false);
            System.out.println(numRoom+"�Ŷ����ɹ�");
        }else{//������������ģ��޷���ֵ
            System.out.println("�����Ѿ���Ԥ�����޷�Ԥ��");
        }


    }

    public void disOrderRoom(int numRoom){//�ṩ�˷�����
        if (numRoom<101||(numRoom/100)>(this.rooms.length)||(numRoom%100)>(rooms[rooms.length-1].length)) {
            System.out.println("������Ϣ����");
            return ;
        }
        if(!this.relax(numRoom)){//������������ģ������˷�
            this.rooms[numRoom/100-1][numRoom%100-1].setKongXian(true);
            System.out.println(numRoom+"���˷��ɹ�");
        }else{
            System.out.println("�����ǿյģ��޷��˷�");
        }

    }

    public void displayRelaxRoom(){//��ʾ�շ�����Ϣ
        for (int i = 0; i < this.rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if(rooms[i][j].getKongXian()){//������о���ʾ
                    System.out.print((i+1)+"¥��"+rooms[i][j]+"    ");
                }
            }
            System.out.println("\n");
        }
    }
}
