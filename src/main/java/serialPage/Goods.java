package serialPage;

import java.io.Serializable;

/**
 * Created by jany.nie on 2018/10/18.
 */
public class Goods implements Serializable{
    private String goodsId;
    private  String goodsName;

    public Goods(String goodsId, String goodsName, double price) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.price = price;
    }

    private double price;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString(){
        return "商品信息[编号："+this.getGoodsId()+",名称:"+this.getGoodsName()+",价格:"+this.getPrice();
    }
}
