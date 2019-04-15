package cn.imooc;




import org.json.JSONArray;
import org.json.JSONObject;

public class PersonTest {
    public static String CreateJson()
    {
        JSONObject my_json=new JSONObject();
        my_json.put("class", "二年级");
        my_json.put("total", 2);

        System.out.println("my_json--------"+my_json.toString());

        JSONArray members=new JSONArray();
        //第一个同学
        JSONObject member1=new JSONObject();
        member1.put("name", "李小红");
        member1.put("age", 18);
        member1.put("score", 95);
        members.put(member1);
        //第二个同学
        JSONObject member2=new JSONObject();
        member2.put("name", "王尼玛");
        member2.put("age", 28);
        member2.put("score", 85);
        members.put(member2);
        my_json.put("members", members);


        return my_json.toString();
    }



    public static void main(String[] args) {
        //解析Json--传入Json字符串
        JSONObject my_json=new JSONObject(CreateJson());
        int total=my_json.getInt("total");
        System.out.println("总数为："+total);

        String class_name=my_json.getString("class");
        System.out.println("班级为："+class_name);

        JSONArray members=my_json.getJSONArray("members");
        for(int i=0;i<members.length();i++)
        {
            JSONObject member=(JSONObject)members.get(i);
            System.out.println("姓名："+member.getString("name")+" 年龄："+member.getInt("age")
                    +" 成绩："+member.getInt("score"));
        }

    }
}
