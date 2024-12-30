package com.sky.service;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.sky.constant.PasswordConstant;
import com.sky.constant.StatusConstant;
import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.mapper.EmployeeMapper;
import com.sky.result.PageResult;
import org.springframework.beans.BeanUtils;

import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
    * 新增员工
    **/

    public void save(EmployeeDTO employeeDTO);

    //
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);//参数有问题
    /**
     * 停用启用员工账号
     */
    void startOrStop(Integer status, Long id);
    //根据id查询员工
    Employee getById(Long id);

    void update(EmployeeDTO employeeDTO);
}
