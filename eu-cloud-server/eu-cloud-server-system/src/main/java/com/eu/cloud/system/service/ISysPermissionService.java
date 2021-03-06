package com.eu.cloud.system.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.eu.cloud.server.system.api.pojo.po.SysPermission;

import java.util.List;

public interface ISysPermissionService extends IService<SysPermission> {

    List<SysPermission> listPermissionRoles();

    IPage<SysPermission> list(Page<SysPermission> page, SysPermission permission);

    boolean refreshPermissionRolesCache();

    List<String> listPermsByRoleIds(List<Long> roleIds, Integer type);

}
