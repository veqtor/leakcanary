//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.squareup.leakcanary;

import java.io.Serializable;

public final class AnalysisResult implements Serializable {

    public static AnalysisResult noLeak(long analysisDurationMs) {
        return new AnalysisResult(false, false, (String)null, (LeakTrace)null, (Throwable)null, 0L, analysisDurationMs);
    }

    public static AnalysisResult leakDetected(boolean excludedLeak, String className, LeakTrace leakTrace, long retainedHeapSize, long analysisDurationMs) {
        return new AnalysisResult(true, excludedLeak, className, leakTrace, (Throwable)null, retainedHeapSize, analysisDurationMs);
    }

    public static AnalysisResult failure(Throwable failure, long analysisDurationMs) {
        return new AnalysisResult(false, false, (String)null, (LeakTrace)null, failure, 0L, analysisDurationMs);
    }

    private AnalysisResult(boolean leakFound, boolean excludedLeak, String className, LeakTrace leakTrace, Throwable failure, long retainedHeapSize, long analysisDurationMs) {
    }
}
