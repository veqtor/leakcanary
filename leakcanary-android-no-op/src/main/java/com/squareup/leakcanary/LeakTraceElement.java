//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.squareup.leakcanary;

import java.io.Serializable;
import java.util.List;

public final class LeakTraceElement implements Serializable {

    LeakTraceElement(String referenceName, LeakTraceElement.Type type, LeakTraceElement.Holder holder, String className, String extra, Exclusion exclusion, List<String> fields) {

    }

    public String toString() {
        String string = "";
        return string;
    }

    public String toDetailedString() {
        String string = "* ";
        return string;
    }

    public static enum Holder {
        OBJECT,
        CLASS,
        THREAD,
        ARRAY;

        private Holder() {
        }
    }

    public static enum Type {
        INSTANCE_FIELD,
        STATIC_FIELD,
        LOCAL,
        ARRAY_ENTRY;

        private Type() {
        }
    }
}
