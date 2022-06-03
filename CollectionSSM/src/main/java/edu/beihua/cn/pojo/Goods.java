package edu.beihua.cn.pojo;

/**
 * @Author wangchao（专业bug开发）
 * @Date 2022/6/1 22:52
 * @Version 1.0
 * @Software IntelliJ IDEA
 * @PROJECT CollectionSSM
 */
public class Goods {
    private Integer godno;      //商品编号
    private String godname;     //商品名称
    private String godtype;     //商品类型
    private String hiredate;    //生产日期
    private String pahiredate;  //过期日期
    private Integer godtypeno;  //类型编号

    public Integer getGodno() {
        return godno;
    }

    public void setGodno(Integer godno) {
        this.godno = godno;
    }

    public String getGodname() {
        return godname;
    }

    public void setGodname(String godname) {
        this.godname = godname;
    }

    public String getGodtype() {
        return godtype;
    }

    public void setGodtype(String godtype) {
        this.godtype = godtype;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public String getPahiredate() {
        return pahiredate;
    }

    public void setPahiredate(String pahiredate) {
        this.pahiredate = pahiredate;
    }

    public Integer getGodtypeno() {
        return godtypeno;
    }

    public void setGodtypeno(Integer godtypeno) {
        this.godtypeno = godtypeno;
    }

    public Goods() {
    }

    public Goods(Integer godno, String godname, String godtype, String hiredate, String pahiredate, Integer godtypeno) {
        this.godno = godno;
        this.godname = godname;
        this.godtype = godtype;
        this.hiredate = hiredate;
        this.pahiredate = pahiredate;
        this.godtypeno = godtypeno;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "godno=" + godno +
                ", godname='" + godname + '\'' +
                ", godtype='" + godtype + '\'' +
                ", hiredate='" + hiredate + '\'' +
                ", pahiredate='" + pahiredate + '\'' +
                ", godtypeno=" + godtypeno +
                '}';
    }
}
