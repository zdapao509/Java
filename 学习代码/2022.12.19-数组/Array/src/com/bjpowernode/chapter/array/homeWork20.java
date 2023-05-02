package com.bjpowernode.chapter.array;
/*
为某个酒店写程序，酒店管理系统，模拟订房、退房、打印所有房间状态等功能

    1.该系统的用户是：酒店前台
    2.酒店使用一个二维数组来模拟，“Room[][] rooms;”
    3，酒店中每一个房间应该是一个java对象，Room
    4.每一个房间room应该有：房间编号、房间类型、房间是否空闲
    5.系统应该对外提供的功能：
        可以预定房间：用户输入房间编号、订房
        可以退房：用户输入房间编号，退房
        可以查询房间的状态，用户输入某个指令应该可以查询所有房间的状态


     查看一个类的属性和方法：ctrl+F12
* */
public class homeWork20 {
    public static void main(String[] args) {

        Room room=new Room(101,"单人间",true);//创建房间对象

        System.out.println(room);//输出对象的引用的时候，自动调用对象的toString方法

        Room room2=new Room(101,"双人间",true);//创建房间对象

        System.out.println(room.equals(room2));//比较两间房子是否属于一间

        hotel htl=new hotel();//创建酒店，采用默认初始化的方式

        System.out.println(htl.getRooms()[1][2]);//访问某一个房间信息，调用getRooms方法，
                                                // getRoom[][]这里面存的引用在被调用的时候，会自动调用这个引用的toString方法,
                                                // 这个引用是Room类型的，因为rooms对象里面存的是二维数组，每一个元素对应一个Room型的引用
                                                //        输出：[102+双人间+空闲：可住]
        htl.allRoom();//遍历楼里面所有房间的信息

        System.out.println("*****************************************");

        hotel htls=new hotel(new Room[6][7]);//创建酒店，采用动态初始值的方式，自己定义楼高和每层房间号

        htls.allRoom();//遍历每层信息：[0+null+已被占用]

        htls.orderRoom(207);//订房间207号

        htls.allRoom();

        System.out.println("****************************\n\n\n");

        System.out.println(htls.relax(207));//查看207房间是不是空的

        htls.orderRoom(207);//再次预订，发现房间已定

        htls.disOrderRoom(207);//退房207

        htls.disOrderRoom(205);//测试房间本来是空的，退房

        System.out.println("*******************************\n\n\n");

        htls.orderRoom(101);
        htls.orderRoom(203);
        htls.orderRoom(305);
        System.out.println("*******************************\n");
        htls.displayRelaxRoom();//显示空房间



    }
}
class Room{
    private int numRoom;
    /*房间的编号，
    1楼：101 102 103
    2楼：201 202 203.....
    * */
    private String typeRoom;
    /*房间的类型
    标准间 单间 总统套房
    * */
    private boolean kongXian;
    /*房间状态：
    true表示空闲
    false表示不能被预定
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

    public boolean getKongXian() {//注意：IDEA工具对于boolean类型的变量生成的get方法名是：isXXXX（）；你不喜欢的话，可以修改成getXXXX（）；
        return kongXian;
    }

    public void setKongXian(boolean kongXian) {
        this.kongXian = kongXian;
    }

//    equals方法重写-----equals方法用来判断两个对象是否相等；
//    这个规则需要自己定，不要用Object祖宗类里面的内存地址是否相等的方式---------写代码的时候，一定要注意，equals方法重写
//    你认为两个房间怎么相等，才能代表一个房间；房间号相等或者其他规则
    public boolean equals(Object obj) {
        if(obj==null||!(obj instanceof Room)) return false;
        if(this==obj) return true;
        Room roomobj=(Room)obj;
        return this.numRoom==roomobj.getNumRoom()&&this.typeRoom.equals(roomobj.getTypeRoom());
    }

//    toString方法重写---toString 方法就是将对象转换成字符串形式，也就是对象的引用转换成字符串。怎么转都是自己定，但是要求简单明了
//    原来的父类Object里面的toString方法返回引用的内存地址，但是我要改成自己要看到的具体信息

    @Override
    public String toString() {
//        return "[101+单人间+空闲]";
//        return "["+this.numRoom+"+"+this.typeRoom+"+"+this.kongXian+"]";//[101+单人间+true]
        return "["+this.numRoom+"+"+this.typeRoom+"+"+(this.kongXian? "空闲：可住":"已被占用")+"]";
        //这里用了三目运算符，进行判断，很方便，注意三目运算符的写法
    }
}

class hotel{//创建酒店前台对象，酒店中有一个二维数组，二维数组的方式模拟大厦
    private Room[][] rooms;

    public Room[][] getRooms() {
        return rooms;
    }

    public void setRooms(Room[][] rooms) {
        this.rooms = rooms;
    }

    public hotel() {//通过构造方法去 盖楼 ，              一共多少层，每层房间类型，每层多少个房间---------可以先写死，然后再考虑动态性
        rooms=new Room[3][10];//三层楼，每层10个房间

//        创建30个房间，放到数组中：也就是实例化Room对象30次，用二维数组遍历的方式实现：
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                rooms[i][j]=new Room();//这种生成的方式，房间号，房间类型这些，都赋了默认值。

//                用更复杂的方式初始化房间号和房间类型，不采用默认值
                //定义每层房间类型
                String typeRoom;
                if(i==0){
                    typeRoom="单人间";
                } else if (i==1) {
                    typeRoom="双人间";
                }else {
                    typeRoom="总统间";
                }
                rooms[i][j]=new Room(((i+1)*100+j+1),typeRoom,true);//这种定义方式，直接给每个房间的房间号，房间类型都进行了默认初始化，
                                                                            // 并且，默认他空闲
            }
        }

    }

    public hotel(Room[][] rooms){//通过有参数构造方式盖楼，这个时候的楼层数和每层的房间数等等这些属性，都是动态的，可以自己定义这个楼有几层，有几个房间
        this.rooms=rooms;
//        初始化每个房间
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {

                String typeRoom;
                if(i==0){
                    typeRoom="单人间";
                } else if (i<=4) {
                    typeRoom="双人间";
                }else {
                    typeRoom="总统间";
                }
                rooms[i][j]=new Room(((i+1)*100+j+1),typeRoom,true);//这种定义方式，直接给每个房间的房间号，房间类型都进行了默认初始化，
                // 并且，默认他空闲
            }
        }

        System.out.println("最大房间号码："+(this.rooms.length*100+this.rooms[this.rooms.length-1].length));
    }

    public void allRoom(){//遍历所有房间信息
        for (int i = 0; i < rooms.length ; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.print(rooms[i][j]+"  ");//rooms[i][j]数组里面存的是Room类型的引用，调用这个引用的时候，默认调用引用的toString方法
            }
            System.out.println("\n");
        }

    }

    public boolean relax(int numRoom){//判断房间是否空闲
        if(numRoom<101||(numRoom/100)>(this.rooms.length)||(numRoom%100)>(rooms[rooms.length-1].length)){
            System.out.println("房间信息有误");
            return false;
        }
        if(this.rooms[numRoom/100-1][numRoom%100-1].getKongXian()) return true;
        return false;
    }

    public void orderRoom(int numRoom){//提供订房方法，将房间的状态信息修改为false
//        if(numRoom<101||numRoom>(this.rooms.length*100+rooms[rooms.length-1].length)){//这样的判断是错的，要从层数开始判断，层数小于最大层数；
//                                                                                          每一层的房间数也不能超

        if(numRoom<101||(numRoom/100)>(this.rooms.length)||(numRoom%100)>(rooms[rooms.length-1].length)){
            System.out.println("房间信息有误");
            return ;
        }
        if(this.relax(numRoom)){//如果房间是空，可以订房
            this.rooms[numRoom/100-1][numRoom%100-1].setKongXian(false);
            System.out.println(numRoom+"号订房成功");
        }else{//如果房间是满的，无法赋值
            System.out.println("房间已经被预定，无法预订");
        }


    }

    public void disOrderRoom(int numRoom){//提供退房方法
        if (numRoom<101||(numRoom/100)>(this.rooms.length)||(numRoom%100)>(rooms[rooms.length-1].length)) {
            System.out.println("房间信息有误");
            return ;
        }
        if(!this.relax(numRoom)){//如果房间是满的，可以退房
            this.rooms[numRoom/100-1][numRoom%100-1].setKongXian(true);
            System.out.println(numRoom+"号退房成功");
        }else{
            System.out.println("房间是空的，无法退房");
        }

    }

    public void displayRelaxRoom(){//显示空房子信息
        for (int i = 0; i < this.rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if(rooms[i][j].getKongXian()){//如果空闲就显示
                    System.out.print((i+1)+"楼："+rooms[i][j]+"    ");
                }
            }
            System.out.println("\n");
        }
    }
}
