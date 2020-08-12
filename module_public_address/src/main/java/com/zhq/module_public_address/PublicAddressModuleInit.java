package com.zhq.module_public_address;

import android.app.Application;

import com.zhq.library_base.base.IModuleInit;
import com.zhq.library_base.base_library.utils.KLog;

/**
 * @Description: java类作用描述
 * @Author: 曾海强
 * @CreateDate: 2019/3/22 15:10
 */
public class PublicAddressModuleInit implements IModuleInit {
    @Override
    public boolean onInitAhead(Application application) {
        KLog.e("====zhq====>公众号onInitAhead<");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        KLog.e("====zhq====>公众号onInitLow<");
        return false;
    }
}
