package com.zhq.module_project;

import android.app.Application;

import com.zhq.library_base.base.IModuleInit;
import com.zhq.library_base.base_library.utils.KLog;

/**
 * @Description: java类作用描述
 * @Author: 曾海强
 * @CreateDate: 2019/3/22 15:09
 */
public class ProjectModuleInit implements IModuleInit {
    @Override
    public boolean onInitAhead(Application application) {
        KLog.e("====zhq====>项目onInitAhead<");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        KLog.e("====zhq====>项目onInitLow<");
        return false;
    }
}
