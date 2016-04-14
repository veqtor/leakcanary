/*
 * Copyright (C) 2015 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.squareup.leakcanary;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
/**
 * Prevents specific references from being taken into account when computing the shortest reference
 * path from a suspected leaking instance to the GC roots.
 *
 * This class lets you ignore known memory leaks that you know about. If the shortest path
 * matches {@link ExcludedRefs}, than the heap analyzer should look for a longer path with nothing
 * matching in {@link ExcludedRefs}.
 */
public final class ExcludedRefs implements Serializable {

    public static Builder builder() {
        return new BuilderWithParams();
    }

    ExcludedRefs(BuilderWithParams builder) {
    }


    @Override public String toString() {
        String string = "";

        return string;
    }

    static final class ParamsBuilder {
        final String matching;

        ParamsBuilder(String matching) {
            this.matching = matching;
        }
    }

    public interface Builder {
        BuilderWithParams instanceField(String className, String fieldName);

        BuilderWithParams staticField(String className, String fieldName);

        BuilderWithParams thread(String threadName);

        BuilderWithParams clazz(String className);

        BuilderWithParams rootClass(String rootSuperClassName);

        ExcludedRefs build();
    }

    public static final class BuilderWithParams implements Builder {

        private final Map<String, Map<String, ParamsBuilder>> fieldNameByClassName =
                new LinkedHashMap<>();
        private final Map<String, Map<String, ParamsBuilder>> staticFieldNameByClassName =
                new LinkedHashMap<>();
        private final Map<String, ParamsBuilder> threadNames = new LinkedHashMap<>();
        private final Map<String, ParamsBuilder> classNames = new LinkedHashMap<>();
        private final Map<String, ParamsBuilder> rootClassNames = new LinkedHashMap<>();

        private ParamsBuilder lastParams;

        BuilderWithParams() {
        }

        @Override public BuilderWithParams instanceField(String className, String fieldName) {
            return this;
        }

        @Override public BuilderWithParams staticField(String className, String fieldName) {
            return this;
        }

        @Override public BuilderWithParams thread(String threadName) {
            return this;
        }

        /** Ignores all fields and static fields of all subclasses of the provided class name. */
        @Override public BuilderWithParams clazz(String className) {
            return this;
        }

        /** Ignores any GC root that belongs to a subclass of the provided class name. */
        @Override public BuilderWithParams rootClass(String rootClassName) {
            return this;
        }

        public BuilderWithParams named(String name) {
            return this;
        }

        public BuilderWithParams reason(String reason) {
            return this;
        }

        public BuilderWithParams alwaysExclude() {
            return this;
        }

        public ExcludedRefs build() {
            return new ExcludedRefs(this);
        }
    }
}
