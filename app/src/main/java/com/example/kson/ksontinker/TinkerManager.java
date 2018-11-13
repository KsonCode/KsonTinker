package com.example.kson.ksontinker;

import android.content.Context;

import com.tencent.tinker.lib.tinker.Tinker;
import com.tencent.tinker.lib.tinker.TinkerInstaller;
import com.tencent.tinker.loader.app.ApplicationLike;

/**
 * 对tinker所有api做一层封装
 */
public class TinkerManager {
    private static boolean isInstalled = false;
    private static ApplicationLike mAppLite;

    /**
     * thinker初始化
     * @param applicationLike
     */
    public static void installTinker(ApplicationLike applicationLike){
        mAppLite = applicationLike;
        if (isInstalled){
            return;
        }

        TinkerInstaller.install(mAppLite);
        isInstalled = true;
    }

    /**
     * 完成patch文件的加载
     */
    public static void loadPatch(String path){
        if (Tinker.isTinkerInstalled()){
            TinkerInstaller.onReceiveUpgradePatch(getApplicationContext(),path);
        }
    }

    private static Context getApplicationContext(){
        if (mAppLite!=null){
            return mAppLite.getApplication().getApplicationContext();
        }

        return null;
    }
}
