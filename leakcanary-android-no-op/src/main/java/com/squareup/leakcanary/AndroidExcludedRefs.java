//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.squareup.leakcanary;

import android.os.Build;
import android.os.Build.VERSION;
import com.squareup.leakcanary.ExcludedRefs;
import com.squareup.leakcanary.ExcludedRefs.Builder;
import com.squareup.leakcanary.ExcludedRefs.BuilderWithParams;
import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.Iterator;

public enum AndroidExcludedRefs {
    DUMMY;

    final boolean applies;

    public static Builder createAndroidDefaults() {
        return null;
    }

    public static Builder createAppDefaults() {
        return null;
    }

    public static Builder createBuilder(EnumSet<AndroidExcludedRefs> refs) {
        return null;
    }

    private AndroidExcludedRefs() {
        this(true);
    }

    private AndroidExcludedRefs(boolean applies) {
        this.applies = applies;
    }
}
