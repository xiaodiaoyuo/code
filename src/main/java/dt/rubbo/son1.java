package dt.rubbo;

/**
 * Created by Administrator on 2018/6/19 0019.
 */
public class son1 extends father{
    public son1(){
        System.out.println("i am son");
    }
    public String tools;
    public long fenshu;

    public String getTools() {
        return tools;
    }

    public void setTools(String tools) {
        this.tools = tools;
    }

    public long getFenshu() {
        return fenshu;
    }

    public void setFenshu(long fenshu) {
        this.fenshu = fenshu;
    }

}
