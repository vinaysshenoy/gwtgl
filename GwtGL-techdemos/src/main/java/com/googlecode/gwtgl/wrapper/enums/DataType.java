/**   
 * Copyright 2009-2010 Sönke Sothmann, Steffen Schäfer and others
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.googlecode.gwtgl.wrapper.enums;

import com.googlecode.gwtgl.binding.WebGLRenderingContext;
import com.googlecode.gwtgl.wrapper.util.EnumUtil;

/**
 * Enum to identify different primitive data types.
 * 
 * @author Steffen Schäfer
 * 
 */
public enum DataType implements IWebGLConstEnum {
	/**
	 * Value to identify DataType BYTE.
	 */
	BYTE(WebGLRenderingContext.BYTE),
	/**
	 * Value to identify DataType UNSIGNED_BYTE.
	 */
	UNSIGNED_BYTE(WebGLRenderingContext.UNSIGNED_BYTE),
	/**
	 * Value to identify DataType SHORT.
	 */
	SHORT(WebGLRenderingContext.SHORT),
	/**
	 * Value to identify DataType UNSIGNED_SHORT.
	 */
	UNSIGNED_SHORT(WebGLRenderingContext.UNSIGNED_SHORT),
	/**
	 * Value to identify DataType INT.
	 */
	INT(WebGLRenderingContext.INT),
	/**
	 * Value to identify DataType UNSIGNED_INT.
	 */
	UNSIGNED_INT(WebGLRenderingContext.UNSIGNED_INT),
	/**
	 * Value to identify DataType FLOAT.
	 */
	FLOAT(WebGLRenderingContext.FLOAT);

	private final int value;

	DataType(int value) {
		this.value = value;
	}

	public int getIntValue() {
		return value;
	}

	/**
	 * Returns the matching enum value for the given int value.
	 * 
	 * @param value
	 * @return the matching enum value for the given int value
	 */
	public static DataType getByIntValue(int value) {
		return EnumUtil.getByIntValue(values(), value);
	}

}