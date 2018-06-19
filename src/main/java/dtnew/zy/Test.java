package dtnew.zy;

/**
 * Created by Administrator on 2018/6/19 0019.
 */
public class Test {
    public static void main(String[] args) {
        Animal[] AnimalColl=new Animal[5];
        int tmp;

        for (int i = 0; i < AnimalColl.length; i++) {
            tmp=(int)(Math.random()*2);
            System.out.println("tmp=========="+tmp);
            switch(tmp){
                case 0:{
                    AnimalColl[i]=new Cat("cat");
                    break;
                }
                case 1:{
                    AnimalColl[i]=new Dog("dog");
                    break;
                }
                case 2:{
                    AnimalColl[i]=new Sheep("sheep");
                    break;

                }
            }

        }

        for(Animal qqx:AnimalColl){
           qqx.cry();
        }





    }

}
