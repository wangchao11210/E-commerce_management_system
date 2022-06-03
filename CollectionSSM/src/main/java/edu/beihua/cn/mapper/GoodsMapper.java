package edu.beihua.cn.mapper;

import edu.beihua.cn.pojo.Emp;
import edu.beihua.cn.pojo.Goods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author wangchao（专业bug开发）
 * @Date 2022/6/1 22:56
 * @Version 1.0
 * @Software IntelliJ IDEA
 * @PROJECT CollectionSSM
 */
public interface GoodsMapper {
    /**
     * 查询所有商品信息
     * @return
     */
    @Select(" select * from goods ")
    List<Goods> listGoods();

    /**
     * 根据商品编号删除商品
     * @param goods
     * @return
     */
    @Delete(" delete from goods where godno=#{godno} ")
    int deleteGoods(Goods goods);

    /**
     * 查询所有商品名称
     * @return
     */
    @Select(" select distinct godtype from goods where godtype is not null ")
    List<String> getGodsType();

    /**
     * 查询所有商品类型编号
     * @return
     */
    @Select(" select distinct godtypeno from goods where godtypeno is not null ")
    List<Integer> listGodsTypeno();

    /**
     * 自动生成最高位商品编号，以此类推
     * @return
     */
    @Select(" select max(godno) from goods ")
    int getAutoGodno();

    /**
     * 插入商品信息
     * @param goods
     * @return
     */
    @Insert(" insert into goods(godno,godname,godtype,hiredate,pahiredate,godtypeno) " +
            "values (#{godno},#{godname},#{godtype},#{hiredate},#{pahiredate},#{godtypeno}) ")
    int saveGoods(Goods goods);
}
