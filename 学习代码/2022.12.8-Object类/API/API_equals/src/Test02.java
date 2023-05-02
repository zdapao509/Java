//�ж��û������ֺͼ�ͥסַ�Ƿ���ͬ

//��δ�����Ҫ˵����equals��������дһ��Ҫ���ף�����д�Ĳ���Ҫȫ����д����������ıȽ�һ��������==�жϣ�Ҫ��equals�жϡ�

public class Test02 {
    public static void main(String[] args) {
        User a1=new User("����",new Address("����","��Žֵ�","012000"));
        User a2=new User("����",new Address("����","��Žֵ�","012000"));
        System.out.println(a1.equals(a2));//true
    }
}

class User{
    String name;//�����nameʵ���ϱ����Ҳ��һ���ڴ��ַ����һ���ַ���������ڴ��ַ
    Address addr;

    public User(){}

    public User(String name,Address addr){
        this.name=name;
        this.addr=addr;
    }

    public String toString(){
        return this.name+"�ĵ�ַ��"+this.addr.city+this.addr.street+this.addr.zipcode;
    }

    //��дequals��������д���򣺵�һ���û����û����ͼ�ͥסַ����ͬ��ʱ�򣬱�ʾͬһ�û���-------�������д����Ϊ��Ҫ����User�����User����ıȽϣ�
    // �����Address������û����дequals����-----------this.addr.city.equals(user.addr.city)��һ��ֱ��String���͵�city���Բ�������equals�����Ƚ�
    //�����equals�жϵ���User�����User �����Ƿ���ȡ�
//    public boolean equals(Object obj){
//        if (obj==null||!(obj instanceof User)) return false;
//        if (this==obj) return true;
//        User user=(User)obj;
//        return this.name.equals(user.name)&&this.addr.city.equals(user.addr.city)&&this.addr.street.equals(this.addr.street)&&this.addr.zipcode.equals(user.addr.zipcode);
//    }


    public boolean equals(Object obj){//�����equals��User��equals����
        if (obj==null||!(obj instanceof User)) return false;
        if (this==obj) return true;
        User user=(User)obj;//�������Ϊ�ڴ��ַ�仯�ˣ����ǻ���ָ����ڴ��е�User����-------���߿�����Ϊ���ڴ��ַû�䣬ֻ�����ڵ��������ͱ���
        return this.name.equals(user.name)&&this.addr.equals(user.addr);

        //ע�����������д��Ϊʲô�ᱨ����Ϊ�����equals����ʵ���ϵ��õ��ǣ�Address�������equals������
        // ��ʱ�����Address�������equals�������Ǽ̳е���Object��ķ������ǻ��ǱȽϵ�������������ڴ��ַ�Ƿ���ȣ��õ���==��������equals������
        //����Ҫʹ����һ���﷨ͨ���������Address�������equals����һ��Ҫ��д��
        //ע�⣺equals������д��ʱ��Ҫ����һ�㣬Ҫ����Ҫ�жϵĲ��ֶ�д��д��


        // return this.name.equals(user.name)&&this.addr.equals(user.addr);

        // ������仰��
        // ǰ���this.name.equals(user.name)�е�equals������this.name�����equals������Ҳ����String��equals������
        //����this.addr.equals(user.addr)�е�equals������Address�е�equals����������equals��������Դ�ǲ�ͬ�ġ�
    }

}

class Address{
    String city;
    String street;
    String zipcode;

    public Address(){}

    public Address(String city,String street,String zipcode){
        this.city=city;
        this.street=street;
        this.zipcode=zipcode;
    }

    public boolean equals(Object obj){//����������ڵ�������ǣ�equals������д��ʱ��Ҫ���ף������ĸ��࣬һ��Ҫ��ȫ��д
        if (obj==null||!(obj instanceof Address)) return false;
        if (this==obj) return true;
        Address addr =(Address)obj;
        return this.city.equals(addr.city) &&this.street.equals(addr.street)&&this.zipcode.equals(addr.zipcode);
        //ע������һ������ͻ�������� this.city==addr.city  ���жϷ��������Ǵ���ģ��ַ������ж�һ��Ҫ��equals��������Ȼ����д�˰���û�����ˡ�
    }
}
