package edu.beihua.cn.service;

import edu.beihua.cn.pojo.Emp;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Author wangchao（专业bug开发）
 * @Date 2022/5/31 23:39
 * @Version 1.0
 * @Software IntelliJ IDEA
 * @PROJECT CollectionSSM
 */
public interface EmpService {
    /**
     * 根据编号查询员工信息
     * @param empno
     * @return
     */
    Emp getEmpById(Integer empno);

    /**
     * 查询所有员工信息
     * @return
     */
    @Select("select * from emp")
    List<Emp> listEmp();

    /**
     * 条件查询员工信息
     * @param emp
     * @return
     */
    List<Emp> ifListEmp(Emp emp);

    /**
     * 插入员工信息
     * @param emp
     * @return
     */
    int saveEmp(Emp emp);

    /**
     * 自动生成员工编号
     * @return
     */
    int getAutoEmpno() throws Exception;

    /**
     * 查询所有岗位名称
     * @return
     */
    List<String> getJobName();

    /**
     * 查询所有部门编号
     * @return
     */
    List<Integer> listDeptno();

    /**
     * 根据员工编号删除员工
     * @param emp
     * @return
     */
    int deleteEmp(Emp emp);

    /**
     * 更新修改员工信息
     * @param emp
     * @return
     */
    int updateEmp(Emp emp);
}
