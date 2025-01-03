package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Dish;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

import java.util.List;

public interface DishService {
    //新增菜品和其口味
    public void saveWithFlavor(DishDTO dishDTO);
    //菜品分页查询
    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);
    //菜品批量删除
    public void deleteBatch(List<Long> ids);
    //根据id查询菜品和口味
    DishVO getByIdwithFlavor(Long id);
    //修改菜品
    void updateWithFlavor(DishDTO dishDTO);
}
