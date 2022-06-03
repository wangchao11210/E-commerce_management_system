package edu.beihua.cn.mapper;

import edu.beihua.cn.pojo.Emp;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Author wangchao（专业bug开发）
 * @Date 2022/5/31 23:35
 * @Version 1.0
 * @Software IntelliJ IDEA
 * @PROJECT CollectionSSM
 */
public interface EmpMapper {
    /**
     * 根据编号查询员工信息
     * @param empno
     * @return
     */
    @Select(" select * from emp where empno=#{empno} ")
    Emp getEmpById(Integer empno);

    /**
     * 查询所有员工信息
     * @return
     */
    @Select(" select * from emp ")
    List<Emp> listEmp();

    /**
     * 条件查询员工信息
     * @param emp
     * @return
     */
    @Select(" SELECT * FROM emp where empno = #{empno} or ename = #{ename}")
    List<Emp> ifListEmp(Emp emp);

    /**
     * 插入员工信息
     * @param emp
     * @return
     */
    @Insert(" insert into emp(empno,ename,job,sal,deptno,hiredate) " +
            "values (#{empno},#{ename},#{job},#{sal},#{deptno},#{hiredate}) ")
    int saveEmp(Emp emp);

    /**
     * 自动生成员工编号
     * @return
     */
    @Select(" select max(empno) from emp ")
    int getAutoEmpno();

    /**
     * 查询所有岗位名称
     * @return
     */
    @Select(" select distinct job from emp where job is not null ")
    List<String> getJobName();

    /**
     * 查询所有部门编号
     * @return
     */
    @Select(" select distinct deptno from emp where deptno is not null ")
    List<Integer> listDeptno();

    /**
     * 根据员工编号删除员工
     * @param emp
     * @return
     */
    @Delete(" delete from emp where empno=#{empno} ")
    int deleteEmp(Emp emp);

    /**
     * 更新修改员工信息
     * @param emp
     * @return
     */
    @Update(" update emp set ename=#{ename},job=#{job}," +
            "sal=#{sal},deptno=#{deptno},hiredate=#{hiredate} where empno=#{empno} ")
    int updateEmp(Emp emp);
}
