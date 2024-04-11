package com.ekenya.rnd.common.di.dfm.activity;

import android.content.Context;
import android.content.Intent;


public final class ActivityHelperKt {

    public static Intent intentTo(Context context, AddressableActivity addressableActivity) {
        Intent var10000 = (new Intent("android.intent.action.VIEW"))
                .setClassName(context.getPackageName(), addressableActivity.getClassName());

        return var10000;
    }
}
