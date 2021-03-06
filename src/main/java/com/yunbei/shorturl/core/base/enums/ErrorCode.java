/**
 * 
 */
package com.yunbei.shorturl.core.base.enums;

/**
 * 
 * @title ReturnCodeMsg.java
 * @author lizhong.chen
 * @data 2013-12-12下午12:20:17
 * @description 接口返回的code和msg
 * @version V1.0
 * 
 */
public enum ErrorCode {
	/**
	 * 
	 */
	SUCCESS(200, "操作正确"),

	URL_IS_NULL(300, "网址不能为空"),

	CONVERT_SHORT_URL_ERROR(301, "转换短链接失败")

	;
	ErrorCode(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	private int code;
	private String msg;

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

}
