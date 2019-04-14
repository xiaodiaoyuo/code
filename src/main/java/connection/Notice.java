package connection;

import java.util.Date;

/**
 * Created by Administrator on 2019/4/14 0014.
 */
public class Notice {
    private Integer i;
    private String tittle;
    private String person;
    private Date date;

    public Notice(Integer i, String tittle, String person, Date date) {
        this.i = i;
        this.tittle = tittle;
        this.person = person;
        this.date = date;
    }

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
