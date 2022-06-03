package edu.beihua.cn.controller;

import edu.beihua.cn.pojo.Emp;
import edu.beihua.cn.pojo.User;
import edu.beihua.cn.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.RegEx;
import java.util.List;

/**
 * @Author wangchao（专业bug开发）
 * @Date 2022/5/31 23:41
 * @Version 1.0
 * @Software IntelliJ IDEA
 * @PROJECT CollectionSSM
 */
@Controller
@ResponseBody
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    /**
     * 通过员工编号查询员工信息
     * @param empno
     * @return
     */
    @RequestMapping("/getEmpById")
    public Emp getEmpById(Integer empno) throws Exception{
        System.out.println("通过员工编号查询员工信息方法！");
        return empService.getEmpById(empno);
    }

    /**
     * 查询所有员工信息
     * @return
     */
    @RequestMapping("/listEmp")
    public List<Emp> listEmp() throws Exception{
        System.out.println("查询全员工信息方法！");
        return empService.listEmp();
    }

    /**
     * 条件查询员工信息方法
     * @param emp
     * @return
     * @throws Exception
     */
    @RequestMapping("/ifListEmp")
    public List<Emp> ifListEmp(Emp emp) throws Exception{
        System.out.println("条件查询员工信息方法！");
        return empService.ifListEmp(emp);
    }

    /**
     * 插入员工信息
     * @param emp
     * @return
     * @throws Exception
     */
    @RequestMapping("/saveEmp")
    public int saveEmp(Emp emp) throws Exception{
        System.out.println("插入员工信息方法！");
        return empService.saveEmp(emp);
    }

    /**
     * 自动生成员工编号
     * @return
     * @throws Exception
     */
    @RequestMapping("/getAutoEmpno")
    public int getAutoEmpno() throws Exception{
        System.out.println("获取自动生成员工编号方法！");
        return empService.getAutoEmpno();
    }

    /**
     * 查询所有岗位名称
     * @return
     */
    @RequestMapping("/getJobName")
    public List<String> getJobName(){
        System.out.println("获取所有岗位名称方法！");
        return empService.getJobName();
    }

    /**
     * 查询所有部门编号
     * @return
     */
    @RequestMapping("/listDeptno")
    public List<Integer> listDeptno(){
        System.out.println("获取所有部门编号方法！");
        return empService.listDeptno();
    }

    /**
     * 根据员工编号删除员工
     * @param emp
     * @return
     */
    @RequestMapping("/deleteEmp")
    public int deleteEmp(Emp emp){
        return empService.deleteEmp(emp);
    }

    /**
     * 更新修改员工信息
     * @param emp
     * @return
     */
    @RequestMapping("/updateEmp")
    public int updateEmp(Emp emp){
        return empService.updateEmp(emp);
    }
}
