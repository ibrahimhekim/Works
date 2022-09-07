public class Player {
    public String name;
    public int id;
    public static String game;
    public static int count0 = 13;
    public static int count1 = 0;
    public static int count2 = 0;
    //statik nesne örneği alınmadan oluşturulur. Sınıf değişkenleridir
    //nesne olmadan da vardırlar.

    Player(String name, int id){
        name = this.name;
        id = this.id;
        count1 ++;
    }

    public void login(){
        count2 ++;
    }

    public void showName(){
        System.out.println(this.name);
    }

}
