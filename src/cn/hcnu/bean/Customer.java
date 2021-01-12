package cn.hcnu.bean;

import java.util.Date;
import java.util.Set;

public class Customer {

    private String id;      //乘客ID
    private String customerType;     //乘客类型（成人、儿童、婴儿）
    private String name;       //乘客姓名
    private String phone;    //电话号码
    private String cardid;  //身份证号
    private Date brithDate;   //出生日期
    private Set<Order> orderSet;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public Date getBrithDate() {
        return brithDate;
    }

    public void setBrithDate(Date brithDate) {
        this.brithDate = brithDate;
    }
}