import org.testng.annotations.Test;


public class UsageStudent {

    public static void main(String[] args) {
        Student xiaoming =new Student();
        xiaoming.setAge(12);
        xiaoming.getId("020608116");
        xiaoming.setName("聂晓珍");

        System.out.println(xiaoming.getAge());

        simply  simplytest=new simply();
        System.out.println("============="+simplytest.sum(23,34));
        System.out.println("============="+simplytest.sum(12.33f,12.33f));
        System.out.println("============="+simplytest.sum(23.76,34.21));





    }

    @Test
    public  void queryBanksTest(){
        String cardNoPlain = "6214921201533954";
        System.out.println("2212222");
    }



}
