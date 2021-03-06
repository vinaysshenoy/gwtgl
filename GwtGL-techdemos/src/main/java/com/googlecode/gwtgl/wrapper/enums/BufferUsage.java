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
 * @author Steffen Schäfer
 * 
 */
public enum BufferUsage implements IWebGLConstEnum {
	/**
	 * Value to identify BufferUsage STREAM_DRAW.
	 */
	STREAM_DRAW(WebGLRenderingContext.STREAM_DRAW),
	/**
	 * Value to identify BufferUsage STATIC_DRAW.
	 */
	STATIC_DRAW(WebGLRenderingContext.STATIC_DRAW),
	/**
	 * Value to identify BufferUsage DYNAMIC_DRAW.
	 */
	DYNAMIC_DRAW(WebGLRenderingContext.DYNAMIC_DRAW);

	private final int usage;

	BufferUsage(int usage) {
		this.usage = usage;
	}

	public int getIntValue() {
		return usage;
	}

	/**
	 * Returns the matching enum value for the given int value.
	 * 
	 * @param value
	 * @return the matching enum value for the given int value
	 */
	public static BufferUsage getByIntValue(int value) {
		return EnumUtil.getByIntValue(values(), value);
	}

}