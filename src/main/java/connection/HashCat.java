package connection;

//import cn.imooc.Cat;
import jdk.nashorn.internal.ir.IdentNode;

import static javafx.scene.input.KeyCode.O;

/**
 * Created by Administrator on 2019/4/14 0014.
 */
public class HashCat {
    private String name;
    private Integer year;
    private String speice;

    @Override
    public String toString() {
        return "HashCat{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", speice='" + speice + '\'' +
                '}';
    }

    public HashCat(String name, Integer year, String speice) {
        this.name = name;
        this.year = year;
        this.speice = speice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }



    public void setYear(Integer year) {
        this.year = year;
    }

    public String getSpeice() {
        return speice;
    }

    public void setSpeice(String speice) {
        this.speice = speice;
    }

    @Override
    public boolean equals(Object o) {
        //判断对象是否相等，相等则返回true
      if(this==o)
          return true;
      //判断类对象
      if(o.getClass()== HashCat.class){
        HashCat cat=(HashCat) o;
        return cat.getSpeice().equals(speice)&&cat.getName().equals(name)&&cat.getYear().equals(year);

      }

      return  false;

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + year.hashCode();
        result = 31 * result + speice.hashCode();
        return result;
    }


}
