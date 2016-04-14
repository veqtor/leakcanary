//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.squareup.leakcanary;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;

public abstract class AbstractAnalysisResultService extends IntentService {

    public static void sendResultToListener(Context context, String listenerServiceClassName, HeapDump heapDump, AnalysisResult result) {

    }

    public AbstractAnalysisResultService() {
        super(AbstractAnalysisResultService.class.getName());
    }

    protected final void onHandleIntent(Intent intent) {

    }

    protected abstract void onHeapAnalyzed(HeapDump var1, AnalysisResult var2);
}
