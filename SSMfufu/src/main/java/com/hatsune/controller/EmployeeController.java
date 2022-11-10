package com.hatsune.controller;

import com.github.pagehelper.PageInfo;
import com.hatsune.Service.EmployeeService;
import com.hatsune.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ClassName:EmloyeeController
 * Package:com.hatsune.controller
 * Description:
 *
 * @date:2022/11/10 13:37
 * @author:ServoWater
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping(value = "/employee/page/{pageNum}", method =
            RequestMethod.GET)
    public String getEmployeeList(Model model, @PathVariable("pageNum") Integer
            pageNum){
        PageInfo<Employee> page = employeeService.getEmployeeList(pageNum);
        model.addAttribute("page", page);
        return "employee_list";
    }
}
