package com.zhq.module_project.debug;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.zhq.library_base.base_library.base.ContainerActivity;

import androidx.annotation.Nullable;


/**
 * 组件单独运行时的调试界面，不会被编译进release里
 * Created by goldze on 2018/6/21
 */

public class DebugActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, ContainerActivity.class);
//        intent.putExtra("fragment", MsgFragment.class.getCanonicalName());
        this.startActivity(intent);
        finish();
    }
}
