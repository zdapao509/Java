/*
* �붨��һ����ͨ���ߣ�vehicle���ࣺ
* ���������ԣ�
*   �ٶ�speed
*   ���size
* �����з�����
*   �ƶ�move����
*   �����ٶ�setSpeed(int speed)
*   ����speedUp();
*   ����speedDown()��
*
* ����ڲ�����Vehicle��ʵ����һ����ͨ���ߵĶ��󣬲�ͨ������������ʼ��speed�Լ�sizeֵ����ӡ����
* ������üӼ��ٵķ������ٶȽ����޸ġ�
* */
public class HomeWork {
    //ʵ������
    private int speed;
    private int size;
    //setter��getter����
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    //�в������췽��
    public HomeWork(int speed, int size) {
        this.speed = speed;
        this.size = size;
        System.out.println("��ʼ��speed:"+speed+";��ʼ��size��"+size);
    }
    //�޲������췽��
    public HomeWork() {
    }

    //���ٷ���
    public void speedUp(int speedup){
        System.out.println("��ʱ�ٶȣ�"+(this.speed+speedup));
        setSpeed(this.speed+speedup);
        //return this.speed+speedup
        //����ķ���ֵ��һ��this.speed��speedup�ĺͣ��������ﲢû�иı�speed���Ա����ֵ��Ҫ�ı�
        //speed��ֵ����Ҫ����setSpeed����������ֱ����������this.speed=this.speed+speedup;
    }


    //���ٷ���
    public void speedDown(int speeddown){
        System.out.println("��ʱ�ٶȣ�"+(this.speed-speeddown));
        this.speed=this.getSpeed()-speeddown;
    }

    //��������ʵ��������
    public static void main(String[] args) {
        HomeWork a=new HomeWork(100,20000);
        a.speedUp(20);
        System.out.println("��ǰ�ٶȣ�"+a.getSpeed());
        a.speedDown(30);
        System.out.println("��ǰ�ٶȣ�"+a.getSpeed());
        HomeWork a1=new HomeWork();
        a1.setSpeed(120);
        System.out.println("��ʱʱ�٣�"+a1.getSpeed());
        a1.speedUp(20);
    }
}
