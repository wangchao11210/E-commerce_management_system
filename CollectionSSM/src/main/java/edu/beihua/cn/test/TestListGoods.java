package edu.beihua.cn.test;

import edu.beihua.cn.pojo.Goods;
import edu.beihua.cn.service.GoodsServiceImpl;
import edu.beihua.cn.service.UserServiceImpl;

/**
 * @Author wangchao（专业bug开发）
 * @Date 2022/6/1 23:55
 * @Version 1.0
 * @Software IntelliJ IDEA
 * @PROJECT CollectionSSM
 */
public class TestListGoods {
    public static void main(String[] args) {
        GoodsServiceImpl goodsService = null;
        Goods goods = (Goods) goodsService.listGoods();
        System.out.println(goods);
    }
}
