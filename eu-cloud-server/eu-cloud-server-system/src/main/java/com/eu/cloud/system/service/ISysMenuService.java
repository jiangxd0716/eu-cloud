package com.eu.cloud.system.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.eu.cloud.server.system.api.pojo.po.SysMenu;
import com.eu.cloud.server.system.api.pojo.vo.MenuVO;
import com.eu.cloud.server.system.api.pojo.vo.RouterVO;
import com.eu.cloud.server.system.api.pojo.vo.TreeVO;

import java.util.List;

/**
 * @author haoxr
 * @date 2020-11-06
 */
public interface ISysMenuService extends IService<SysMenu> {

    List<MenuVO> listMenuVO(LambdaQueryWrapper<SysMenu> baseQuery);

    List<TreeVO> listTreeVO(LambdaQueryWrapper<SysMenu> baseQuery);

    List<RouterVO> listRouterVO();
}
