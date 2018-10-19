package com.vormela.common.dcutils;

public class StringUtils {
	/**
	 * 非空判断
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str){
		if(str == null || str.equals("") || str.trim().length() == 0 || str.trim().equalsIgnoreCase("null"))
			return false;
		return true;
	}
	/**
	 * 空判断
	 * @param string
	 * @return
	 */
	public static boolean isEmpty(String string) {
		return !isNotEmpty(string);
	}
}
