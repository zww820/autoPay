package org.pay.utils;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Md5编码处理类，signMap方法中加入了签名串排序
 * @author vincent
 *
 */
public class Md5 {
	
	private static final Logger logger = LoggerFactory.getLogger(Md5.class);

	private static Md5 md5 = new Md5();

	public static Md5 getInstance() {
		return md5;
	}
	
	/**
	 * 将map转换成待签名的字符串格式，然后MD5
	 * @param params 待签名的参数Map
	 * @param signKey 签名密钥
	 * @return 签名
	 */
	public static String signMap(Map<String, ?> params, String signKey) {
		List<String> keys = new ArrayList<String>(params.keySet());
		Collections.sort(keys);
		StringBuffer content = new StringBuffer();
		for (int i = 0; i < keys.size(); ++i) {
			String key = (String) keys.get(i);
            if ("sign".equals(key)) {
                continue;
            }
            Object value = params.get(key);
            String strValue = String.valueOf(value);
            if (null != value && !"".equals(strValue)) {
                content.append((i == 0 ? "" : "&") + key + "=" + strValue);
            }
		}
		return sign(content.toString(), signKey);
	}

	/**
	 * 签名字符串
	 * @param text 待签名字符串
	 * @param signKey 签名密钥 
	 * @return 签名
	 */
	private static String sign(String text, String signKey) {
		String signcontent = text + signKey;
		try {
			if(logger.isDebugEnabled()){
				logger.debug("signcontent:{}",signcontent);
			}
			return DigestUtils.md5Hex(signcontent.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
		    throw new RuntimeException("MD5签名过程中出现错误,指定的编码集不对,您目前指定的编码集是:UTF-8");
		}
	}

	public static boolean verify(Map<String, ?> map, String key, String sign) {
		String mySign = signMap(map, key);
    	return mySign.equalsIgnoreCase(sign);
    }
	
	public static void main(String[] args) {
		
		/*
		 * sign:CB62CA81AAC3754D309A7ACDF1CA9FB7
inputCharset:UTF-8
cifpayNo:平安银行银信证*77.77RMB*PAB0000002011446520367827
orderID:1446520367827
remark:收证
validTime:2015-11-06 11:13:39
state:CREDIT_RECEIVED
tradeID:2fd0a16a839a4af6b2b704eb6c91b97e
mid:PAB000000201
		 * 
		 */
		
		String key = "3Q21f8rQxT";
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("sign","A7F97A505B52F2711DAF44621D6AC193");
		paramMap.put("inputCharset","UTF-8");
		paramMap.put("cifpayNo","平安银行银信证*77.77RMB*PAB0000002011446522265467");
		paramMap.put("totalFee","7777");
		paramMap.put("orderID","1446522265467");
		paramMap.put("remark","收证");
		paramMap.put("validTime","2015-11-06 11:45:19");
		paramMap.put("feeType","CNY");
		paramMap.put("state","CREDIT_RECEIVED");
		paramMap.put("tradeID","3a77492a00d9408eaf465ebdfcea3717");
		paramMap.put("mid","PAB000000201");
		paramMap.put("bankCode","PAB");
		
 		System.out.println(signMap(paramMap, key));
	}
	
}
