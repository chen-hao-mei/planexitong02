package cn.hcnu.bean;

import java.util.Set;

public class Order {
    private String id;
    private float jpjg;   //机票价格
    private float airPortTax;   //机场税
    private float ryf;  //燃油费
    private float hkzgx;    //航空综合险
    private float jpgtx;    //机票退改险
    private float yhq;    //优惠券
    private float hszj;     //含税总价
    private Set<Customer> customerSet;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getJpjg() {
        return jpjg;
    }

    public void setJpjg(float jpjg) {
        this.jpjg = jpjg;
    }

    public float getAirPortTax() {
        return airPortTax;
    }

    public void setAirPortTax(float airPortTax) {
        this.airPortTax = airPortTax;
    }

    public float getRyf() {
        return ryf;
    }

    public void setRyf(float ryf) {
        this.ryf = ryf;
    }

    public float getHkzgx() {
        return hkzgx;
    }

    public void setHkzgx(float hkzgx) {
        this.hkzgx = hkzgx;
    }

    public float getJpgtx() {
        return jpgtx;
    }

    public void setJpgtx(float jpgtx) {
        this.jpgtx = jpgtx;
    }

    public float getYhq() {
        return yhq;
    }

    public void setYhq(float yhq) {
        this.yhq = yhq;
    }

    public float getHszj() {
        return hszj;
    }

    public void setHszj(float hszj) {
        this.hszj = hszj;
    }

    public Set<Customer> getCustomerset() {
        return customerSet;
    }

    public void setCustomerset(Set<Customer> customerset) {
        this.customerSet = customerset;
    }
}
