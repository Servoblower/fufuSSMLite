package com.hatsune.ServiceImpl;

import com.hatsune.Service.EmployeeService;
import com.hatsune.mappers.EmployeeMapper;
import com.hatsune.pojo.Employee;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:EmployeeServiceImpl
 * Package:com.fufuSSM.ServiceImpl
 * Description:
 *
 * @date:2022/11/10 12:47
 * @author:ServoWater
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public PageInfo<Employee> getEmployeeList(Integer pageNum) {
        PageHelper.startPage(pageNum, 4);
        List<Employee> list = employeeMapper.getEmployeeList();
        PageInfo<Employee> page = new PageInfo<>(list, 5);
        return page;
    }
}
