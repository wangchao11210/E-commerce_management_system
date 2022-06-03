package edu.beihua.cn.controller;

import edu.beihua.cn.pojo.Goods;
import edu.beihua.cn.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author wangchao（专业bug开发）
 * @Date 2022/6/1 23:37
 * @Version 1.0
 * @Software IntelliJ IDEA
 * @PROJECT CollectionSSM
 */
@Controller
@ResponseBody
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    /**
     * 查询所有商品信息
     * @return
     */
    @RequestMapping("/listGoods")
    public List<Goods> listGoods() throws Exception{
        System.out.println("查询全商品信息方法！");
        return goodsService.listGoods();
    }

    /**
     * 根据商品编号删除商品信息
     * @param goods
     * @return
     */
    @RequestMapping("/deleteGoods")
    public int deleteGoods(Goods goods) throws Exception{
        System.out.println("根据商品编号删除商品信息！");
        return goodsService.deleteGoods(goods);
    }

    /**
     * 自动生成最高位商品编号，以此类推
     * @return
     */
    @RequestMapping("/getAutoGodsno")
    public int getAutoGodsno() throws Exception{
        System.out.println("获取最高位商品编号！");
        return goodsService.getAutoGodno();
    }

    /**
     * 查询所有商品名称
     * @return
     */
    @RequestMapping("/getGodsType")
    public List<String> getGodsType() throws Exception{
        System.out.println("获取所有商品名称方法！");
        return goodsService.getGodsType();
    }

    /**
     * 查询所有商品类型编号
     * @return
     */
    @RequestMapping("/listGodsTypeno")
    public List<Integer> listGodsTypeno() throws Exception{
        System.out.println("获取所有商品类型编号方法！");
        return goodsService.listGodsTypeno();
    }

    /**
     * 插入商品信息
     * @param goods
     * @return
     * @throws Exception
     */
    @RequestMapping("/saveGoods")
    public int saveGoods(Goods goods) throws Exception{
        System.out.println("商品信息添加方法！");
        return goodsService.saveGoods(goods);
    }
}
