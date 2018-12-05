package com.canxue.basemb.common.base;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 
 * controller基类,目前功能比较简单
 * @author Carry Xie
 * 2016年7月12日 下午3:02:14
 *
 */
public abstract class BaseController {
	
	public Logger logger = LoggerFactory.getLogger(this.getClass());



    protected String toJson(Object object) {
        return JSON.toJSONString(object, new SerializerFeature[]{SerializerFeature.BrowserCompatible});
    }
}