package com.eu.cloud.auth.constants;

public interface  CacheConstants {

    /**
     * oauth 缓存前缀
     */
    String PROJECT_OAUTH_ACCESS = "eu_oauth:access:";

    /**
     * 验证码前缀
     */
    String DEFAULT_CODE_KEY = "DEFAULT_CODE_KEY:";

    /**
     * 菜单信息缓存
     */
    String MENU_DETAILS = "menu_details";

    /**
     * 用户信息缓存
     */
    String USER_DETAILS = "user_details";

    /**
     * 字典信息缓存
     */
    String DICT_DETAILS = "dict_details";

    /**
     * oauth 客户端信息
     */
    String CLIENT_DETAILS_KEY = "eu_oauth:client:details";

    /**
     * 参数缓存
     */
    String PARAMS_DETAILS = "params_details";

}
