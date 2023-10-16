package com.neuedu.service;

import com.neuedu.common.ServerResponse;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *@Author teacher.zhang & teacher.guo
 * */
public interface IProductService {

    /*产品搜索及动态排序List*/
    ServerResponse getList(@RequestParam(required = false) Integer categoryId,
                           @RequestParam(required = false) String keyword,
                           @RequestParam(required = false,defaultValue ="1") Integer pageNum,
                           @RequestParam(required = false,defaultValue = "10") Integer pageSize,
                           @RequestParam(required = false,defaultValue = "") String orderBy);

    /*获取产品detail*/
    ServerResponse getDetail(Integer productId,
                             @RequestParam(required = false,defaultValue="0") Integer is_new,
                             @RequestParam(required = false,defaultValue="0") Integer is_hot,
                             @RequestParam(required = false,defaultValue="0") Integer is_banner);

    /*获取产品顶级分类*/
    ServerResponse topcategory(Integer sid);
}
