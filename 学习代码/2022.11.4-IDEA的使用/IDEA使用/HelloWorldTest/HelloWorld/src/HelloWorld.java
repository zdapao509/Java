public class HelloWorld {
    private int id;
    private String name;

    public static void main(String[] args) {
        System.out.println("你好");
    }

    public HelloWorld(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public HelloWorld() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "1231323";
    }

    public void Test(){
        System.out.println("你好");

    }
}
