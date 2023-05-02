/*
�ص㣺 **�κ�һ���ӿڶ���һ�������ߺ�ʵ���ߣ�������

����Ľӿ��ǣ�FoodMenu{}

�ӿڵĵ������ǣ�Customer{}

�ӿڵ�ʵ�����ǣ�ChinaCooker{}  AmericaCooker{}

���Գ���JieKouTest05 {}

���ýӿ�ʵ�ֽ���ϣ�����ǽӿڵ� ʵ���� �� ������ ֮������

Ҳ���ǣ�Customer{} �;���ĳ�ʦ ChinaCooker{}  AmericaCooker{} ֮������

�������д���Ŀ֮��Ŀ�����һ�㶼�ǽ���Ŀ�����һ��ģ��һ��ģ��ģ�ģ���ģ��֮��ͨ���ӿ���ʵ���νӣ�������϶ȡ�

���Լ������౻����Ϊ���Ե�ʱ�򣬺ͳ����int String�����͵���������ͬ���ǣ���Щint String����ֻ�ܸ�ֵ��Ȼ���޷���ʹ�ã�
���Լ�������������������ȻҲ�Ǹ�ֵ�����ڴ��е��ڴ��ַ�������ǻ�����ʹ�������������ķ����������»��ж��������ԡ�������
* */

public class JieKouTest05 {
    public static void main(String[] args) {
        Customer cc=new Customer(new AmericaCooker());
        // �����ִ�й��̣�Customer�����ʵ����֮�󣬽����в������죻���в������췽���У����ö�̬�����ýӿڸ�����и����͵�����ָ�������͵Ķ���
        // ��Customer������ʵ��cc֮����FoodMenu�����ھ����в������췽��֮������ֵ��ָ����Ƕ��ڴ��е�AmericaCooker()��Ķ���
        // ��ô������cc.getFoodMenu().xihongshiChaoJiDan()�ķ�ʽ����ʵ�ֹ˿�ѡ��������ʦ�����й���ʦ����������������������̡�
        cc.getFoodMenu().xihongshiChaoJiDan();
        cc.order();

    }
}


interface FoodMenu{//�ӿ�-�˵��������
    void xihongshiChaoJiDan();
    void yuXiangRouSi();
}

//--------------------------------------------------------------------------------------------------------------------------

class Customer{
    //�˿������в˵�
    //Customer has a FoodMenu!  �˿���һ���˵�
    //��ס���Ժ��ǿ�����has a �������ģ�ͳһ�����Եķ�ʽ���ڣ�
    //ʵ������������

    private FoodMenu foodMenu;//ע�⣺���ﲢû�д�������ֻ��һ�����ԣ�һ�����ã�һ��������������
    // ----------��������̣�������϶ȣ�������չ����----����ϰ�ߣ�����˽�л�

    //������������ַ�ʽд���ͱ�ʾд���ˣ������ˣ�û�пɲ�Σ�---------�˿�Ҫ�Է���ʱ��ֱ���ҳ�ʦ˵�ˣ��������ò˵�������������
    //ChinaCooker cc;//�вͳ�ʦ
    //AmericaCooker ac;//���ͳ�ʦ

    public Customer(){}//�޲������췽��

    public Customer(FoodMenu foodMenu) {//�в������췽��
        this.foodMenu = foodMenu;
    }

    //setter��getter
    public void setFoodMenu(FoodMenu foodMenu){
        this.foodMenu=foodMenu;
    }
    public FoodMenu getFoodMenu(){
        return foodMenu;
    }

    //дһ����˷���
    public void order(){
        //���õ��˵����ܵ��
        //����get�����ò˵�
        //FoodMenu fm=this.getFoodMenu();

        //Ҳ���Բ�����get��������Ϊ�ڱ�����˽�е������ǿ��Է��ʵ�
        this.foodMenu.xihongshiChaoJiDan();//foodMenuָ��Ķ�����������ʦ�����й���ʦ��ÿ�����������������ַ���
        // ����������������������������˿
        foodMenu.yuXiangRouSi();

    }

}


//--------------------------------------------------------------------------------------------------------------------------
/*
Cat is a Animal,��������is a �ı�ʾ����������Ϊ�̳У�
Customer has a FoodMenu;��������has a �Ķ����������Ե���ʽ���ڣ�
*/
//--------------------------------------------------------------------------------------------------------------------------


//�вͳ�ʦ��ʵ�ֲ˵��ϵĲˣ���ʦ�ǽӿڵ�ʵ����
class ChinaCooker implements FoodMenu{
    @Override
    public void xihongshiChaoJiDan() {
        System.out.println("�вͳ�ʦ-������������");
    }

    @Override
    public void yuXiangRouSi() {
        System.out.println("�вͳ�ʦ-������˿");
    }
}

//���ͳ�ʦ��ʵ�ֲ˵��ϵĲˣ� ��ʦ�ǽӿڵ�ʵ����
class AmericaCooker implements FoodMenu{
    @Override
    public void xihongshiChaoJiDan() {
        System.out.println("���ͳ�ʦ--������������");
    }

    @Override
    public void yuXiangRouSi() {
        System.out.println("���ͳ�ʦ--������˿");
    }
}



//--------------------------------------------------------------------------------------------------------------------------
//���µ������δ�����Ϊ��˵�����Լ��������������Ϊ���ԣ��������������������ͣ�

// ���磺Address addr;    addr����Ƕ��ڴ��еĶ����ַ������ͨ��new����ķ�ʽ��������ֵ

/*
class Address{
    String city;
    String street;
    String zipcode;
}

class User{
    int id;
    String name;
    Address addr;

    public static void main(String[] args){
        //Address addr;�ֲ�����
        //addr=new Address();
        //Ҳ����д�����µĸ�ʽ��
        //Address addr=new Address();

        User u=new User();
        u.id=100;
        u.name="����";
        u.addr=new Address();

        System.out.println(u.addr.city);//null
        System.out.println(u.addr.street);//null
        System.out.println(u.addr.zipcode);//null
    }
}
* */

/*
�Լ���
Myself has a Friend;

class Myself{
    //����������Ӧ����һ�����Ѷ���ĵ绰���룻
    //�绰�������һ�����Ŷ�����ڴ��ַ����ϵ������ѵ�ʱ�򣬴�绰
    //f��һ�����á�f��Ĭ��ֵnull,��null��ʾ����û������

    Friend f;

    public Myself(){}

    //ͨ�����췽���ܲ��ܸ���һ�����Ѷ���

    public Myself(Friend f){
        this.f=f;
    }

    public static void main(String[] args){
        //�������Ѷ���
        Friend f=new Friend();//���Ѷ�������
        //�����Լ�����
        Myself m=new Myself();
        //�����Ѷ������ϵ��ʽ��ֵ�����Լ������ѵ���ϵ��ʽ
        m.f=f;

        //���߿���ֱ�ӹ��췽����
        Myself m2=new Myself(f);
    }
}

�����ࣺ
class Friend {}
* */

//--------------------------------------------------------------------------------------------------------------------------