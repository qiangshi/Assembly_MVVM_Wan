package com.zhq.library_base.config;

/**
 * Created by goldze on 2018/6/21 0021.
 * 组件生命周期反射类名管理，在这里注册需要初始化的组件，通过反射动态调用各个组件的初始化方法
 * 注意：以下模块中初始化的Module类不能被混淆
 */

public class ModuleLifecycleReflexs {
    private static final String BaseInit = "com.zhq.library_base.base.BaseModuleInit";
    //主业务模块
    private static final String MainInit = "com.zhq.module_main.MainModuleInit";
    //首页业务模块
    private static final String HomeInit = "com.zhq.module_home.HomeModuleInit";
    //知识体系模块
    private static final String KnowledgeInit = "com.zhq.module_knowledge.KnowledgeModuleInit";
    //公众号模块
    private static final String PublicAddressInit = "com.zhq.module_public_address.PublicAddressModuleInit";
    //导航模块
    private static final String UserInit = "com.zhq.module_navigation.NavigationModuleInit";
    //项目模块
    private static final String ProjectInit = "com.zhq.module_project.ProjectModuleInit";

    public static String[] initModuleNames = {BaseInit, MainInit, HomeInit, KnowledgeInit, PublicAddressInit,UserInit,ProjectInit};
}
