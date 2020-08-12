package com.zhq.module_knowledge;

import android.app.Application;

import com.zhq.library_base.base.IModuleInit;
import com.zhq.library_base.base_library.utils.KLog;


/**
 * @Description: java类作用描述
 * @Author: 曾海强
 * @CreateDate: 2019/3/22 15:07
 */
public class KnowledgeModuleInit implements IModuleInit {
    @Override
    public boolean onInitAhead(Application application) {
        KLog.e("====zhq====>知识体系onInitAhead<");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        KLog.e("====zhq====>知识体系onInitLow<");
        return false;
    }
}
