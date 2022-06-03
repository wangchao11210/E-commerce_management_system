package edu.beihua.cn.service;

import edu.beihua.cn.mapper.EmpMapper;
import edu.beihua.cn.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wangchao（专业bug开发）
 * @Date 2022/5/31 23:39
 * @Version 1.0
 * @Software IntelliJ IDEA
 * @PROJECT CollectionSSM
 */
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public Emp getEmpById(Integer empno) {
        return empMapper.getEmpById(empno);
    }

    @Override
    public List<Emp> listEmp() {
        return empMapper.listEmp();
    }

    @Override
    public List<Emp> ifListEmp(Emp emp) {
        return empMapper.ifListEmp(emp);
    }

    @Override
    public int saveEmp(Emp emp) {
        return empMapper.saveEmp(emp);
    }

    @Override
    public int getAutoEmpno() {
        return empMapper.getAutoEmpno();
    }

    @Override
    public List<String> getJobName() {
        return empMapper.getJobName();
    }

    @Override
    public List<Integer> listDeptno() {
        return empMapper.listDeptno();
    }

    @Override
    public int deleteEmp(Emp emp) {
        return empMapper.deleteEmp(emp);
    }

    @Override
    public int updateEmp(Emp emp) {
        return empMapper.updateEmp(emp);
    }
}
