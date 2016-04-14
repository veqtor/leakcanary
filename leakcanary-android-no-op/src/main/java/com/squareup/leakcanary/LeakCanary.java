package com.squareup.leakcanary;

import android.app.Application;
import android.content.Context;

/**
 * A no-op version of {@link LeakCanary} that can be used in release builds.
 */
public final class LeakCanary {

  public static RefWatcher install(Application application) {
    return RefWatcher.DISABLED;
  }

  private LeakCanary() {
    throw new AssertionError();
  }

  public static RefWatcher androidWatcher(Context context, HeapDump.Listener heapDumpListener,
                                          ExcludedRefs excludedRefs) {
    return RefWatcher.DISABLED;
  }

  public static void enableDisplayLeakActivity(Context context) {
  }

  public static void setDisplayLeakActivityDirectoryProvider(
          LeakDirectoryProvider leakDirectoryProvider) {
  }

  public static boolean isInAnalyzerProcess(Context context) {
    return false;
  }

}
