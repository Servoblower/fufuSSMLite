package com.hatsune.Service;

import com.hatsune.pojo.Employee;
import com.github.pagehelper.PageInfo;


/**
 * ClassName:EmployeeService
 * Package:com.fufuSSM.Service
 * Description:
 *
 * @date:2022/11/10 12:45
 * @author:ServoWater
 */
public interface EmployeeService {
    PageInfo<Employee> getEmployeeList(Integer pageNum);
}
