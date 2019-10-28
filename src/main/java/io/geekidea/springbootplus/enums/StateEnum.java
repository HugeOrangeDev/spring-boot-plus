/*
 * Copyright 2019-2029 geekidea(https://github.com/geekidea)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.geekidea.springbootplus.enums;

import io.geekidea.springbootplus.common.enums.BaseTypeStateEnum;

/**
 * @author geekidea
 * @date 2019-10-24
 **/
public enum StateEnum implements BaseTypeStateEnum {
    DISABLE,ENABLE;

    @Override
    public Integer getKey() {
        return this.ordinal();
    }

    @Override
    public String getValue() {
        return this.name();
    }
}
