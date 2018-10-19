package com.vormela.common.dcutils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataApiServiceHandle {
	/**
	 * 客户端需要的元素个性化返回
	 * @param dataList
	 * @param elements
	 * @return
	 */
	public static List<Map<String, Object>> changeToclientReturnElemnts(List<Map<String, Object>> dataList,String[] elements) {
		List<Map<String, Object>> returnList = new ArrayList<Map<String, Object>>();
		
		if (dataList != null && dataList.size() > 0) {
			for (Map<String,Object> data:dataList) {
				Map<String,Object> bean = new HashMap<String,Object>();
				
				for (String element:elements) {
					bean.put(element, data.get(element));
				}
				
				returnList.add(bean);
			}
		}
		
		return returnList;
	}
}
