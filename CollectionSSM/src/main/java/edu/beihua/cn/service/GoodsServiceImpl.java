package edu.beihua.cn.service;

import edu.beihua.cn.mapper.GoodsMapper;
import edu.beihua.cn.pojo.Emp;
import edu.beihua.cn.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wangchao（专业bug开发）
 * @Date 2022/6/1 23:36
 * @Version 1.0
 * @Software IntelliJ IDEA
 * @PROJECT CollectionSSM
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> listGoods() {
        return goodsMapper.listGoods();
    }

    @Override
    public int deleteGoods(Goods goods) {
        return goodsMapper.deleteGoods(goods);
    }

    @Override
    public List<String> getGodsType() {
        return goodsMapper.getGodsType();
    }

    @Override
    public List<Integer> listGodsTypeno() {
        return goodsMapper.listGodsTypeno();
    }

    @Override
    public int getAutoGodno() {
        return goodsMapper.getAutoGodno();
    }

    @Override
    public int saveGoods(Goods goods) {
        return goodsMapper.saveGoods(goods);
    }

}
