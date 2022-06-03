package edu.beihua.cn.service;

import edu.beihua.cn.pojo.Emp;
import edu.beihua.cn.pojo.Goods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author wangchao（专业bug开发）
 * @Date 2022/6/1 23:36
 * @Version 1.0
 * @Software IntelliJ IDEA
 * @PROJECT CollectionSSM
 */
public interface GoodsService {
    /**
     * 查询所有商品信息
     * @return
     */
    List<Goods> listGoods();

    /**
     * 根据商品编号删除商品
     * @param goods
     * @return
     */
    int deleteGoods(Goods goods);

    /**
     * 查询所有岗位名称
     * @return
     */
    List<String> getGodsType();

    /**
     * 查询所有商品类型编号
     * @return
     */
    List<Integer> listGodsTypeno();

    /**
     * 自动生成最高位商品编号，以此类推
     * @return
     */
    int getAutoGodno();

    /**
     * 插入商品信息
     * @param goods
     * @return
     */
    int saveGoods(Goods goods);
}
