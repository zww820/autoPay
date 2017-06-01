package org.pay.utils;



import java.io.IOException;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;


/**
 * 模拟http请求的工具类
 * @author Nature_night
 *
 */
public class HttpUtil {
	
	private static final Integer socketTimeout=10000;//请求时间
	private static final Integer connectTimeout=10000;//传输超时时间
	
	//使用raw格式请求(即json体)
	public static JSONObject postForJson(String url,Map<String,Object> params){
		CloseableHttpClient httpclient = HttpClients.createDefault();

		try{
			HttpPost httpPost = new HttpPost(url);
			RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(socketTimeout).setConnectTimeout(connectTimeout).build();//设置请求和传输超时时间
			httpPost.setConfig(requestConfig);
			if(params != null){
				JSONObject jsonParam = new JSONObject();  
				//List <NameValuePair> nvps = new LinkedList<NameValuePair>();
				for(String key : params.keySet()){
					jsonParam.put(key, params.get(key));
					//nvps.add(new BasicNameValuePair(key, params.get(key).toString()));
				}
				StringEntity entity = new StringEntity(jsonParam.toString(),"UTF-8");
	            entity.setContentType("application/json");    
				httpPost.setEntity(entity);
				//httpPost.setEntity(new UrlEncodedFormEntity(nvps));
			} 
            
	        CloseableHttpResponse response = httpclient.execute(httpPost);
	        StatusLine statusLine = response.getStatusLine();
	        if(statusLine.getStatusCode() == 200){
	        	String resData = EntityUtils.toString(response.getEntity());  
                JSONObject resJson = JSON.parseObject(resData);  
                return resJson;
	        }else{
	        	throw new RuntimeException(statusLine.getReasonPhrase());
	        }
		}catch(Exception e){
			throw new RuntimeException(e);
		}finally{
			try {
				httpclient.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
	
	//使用form格式请求(即key=value&...)
	public static JSONObject post(String url,Map<String,Object> params){
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try{
			HttpPost httpPost = new HttpPost(url);
			RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(socketTimeout).setConnectTimeout(connectTimeout).build();//设置请求和传输超时时间
			httpPost.setConfig(requestConfig);
			if(params != null){
				List <NameValuePair> nvps = new LinkedList<NameValuePair>();
				for(String key : params.keySet()){
					nvps.add(new BasicNameValuePair(key, params.get(key).toString()));
				}
				UrlEncodedFormEntity urlEncodedFormEntity = new UrlEncodedFormEntity(nvps,"UTF-8");
				httpPost.setEntity(urlEncodedFormEntity);
			} 

	        CloseableHttpResponse response = httpclient.execute(httpPost);
	        StatusLine statusLine = response.getStatusLine();
	        if(statusLine.getStatusCode() == 200){
	        	String resData = EntityUtils.toString(response.getEntity());
                JSONObject resJson = JSON.parseObject(resData);  
                return resJson;
	        }else{
	        	throw new RuntimeException(statusLine.getReasonPhrase());
	        }
		}catch(Exception e){
			throw new RuntimeException(e);
		}finally{
			try {
				httpclient.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
	
	public static JSONObject get(String url,Map<String,Object> params){
		Map<String, Object> sortedMap = new TreeMap<String, Object>(new KeyComparator());
		if(params != null){
			sortedMap.putAll(params);
		}
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try{
			StringBuffer sb = new StringBuffer();
			if(params != null){
				for(String key : params.keySet()){
					sb.append(key);
					sb.append("=");
					sb.append(sortedMap.get(key));
					sb.append("&");
				}
				if(url.indexOf("?") <= 0){
					url += "?";
				}
				url += sb.substring(0, sb.length()-1);
			}
			
			HttpGet httpGet = new HttpGet(url);
			RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(socketTimeout).setConnectTimeout(connectTimeout).build();//设置请求和传输超时时间
			httpGet.setConfig(requestConfig);
	        CloseableHttpResponse response = httpclient.execute(httpGet);
	        StatusLine statusLine = response.getStatusLine();
	        if(statusLine.getStatusCode() == 200){
	        	String resData = EntityUtils.toString(response.getEntity());  
                JSONObject resJson = JSON.parseObject(resData);  
                return resJson;
	        }else{
	        	throw new RuntimeException(statusLine.getReasonPhrase());
	        }
		}catch(Exception e){
			throw new RuntimeException(e);
		}finally{
			try {
				httpclient.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
	
	
	 /**
	 * 使用xml体请求
	 */
	public static String httpPostRequest(String url, String bodyContent) {
		String result = null;
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			HttpPost httpPost = new HttpPost(url);
			RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(socketTimeout).setConnectTimeout(connectTimeout).build();//设置请求和传输超时时间
			httpPost.setConfig(requestConfig);
			StringEntity requestEntity = new StringEntity(bodyContent, "UTF-8");
			httpPost.setEntity(requestEntity);

			CloseableHttpResponse response = httpclient.execute(httpPost,
					HttpClientContext.create());
			HttpEntity responseEntity = response.getEntity();

			StatusLine statusLine = response.getStatusLine();
			if (HttpStatus.SC_OK == statusLine.getStatusCode()
					&& responseEntity != null) {
				result = EntityUtils.toString(responseEntity, "UTF-8");
				response.close();
			} else {
				throw new RuntimeException(statusLine.getReasonPhrase());
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			try {
				httpclient.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return result;
	}
	
	
	static class KeyComparator implements Comparator<String>{

		public int compare(String o1, String o2) {
			return o1.compareTo(o2);
		}
		
	}
	
/*	public String getSign(Map<String, String> params){
		Map<String, String> sortedMap = new TreeMap<String, String>(new KeyComparator());
		sortedMap.putAll(params);
		StringBuffer buf = new StringBuffer();
		for(String key : sortedMap.keySet()){
			buf.append(key);
			buf.append("=");
			buf.append(sortedMap.get(sortedMap.get(key)));
			buf.append("&");
		}
		String signData = buf.substring(0, buf.length() - 1);
		return Md5Crypt.apr1Crypt(signData.getBytes());
	}*/
	
	public static String getIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		} 
		if (ip == null || ip.length() == 0
				|| "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		} 
		if (ip == null || ip.length() == 0
				|| "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}
	
	public static String getUrl(HttpServletRequest request,String path){
		String basePath = getBasePath(request);
		if(StringUtils.isEmpty(path)){
			return basePath;
		}
		StringBuffer buf  = new StringBuffer();
		buf.append(basePath);
		if(path.startsWith("/")){
			buf.append(path.substring(1));
		}else{
			buf.append(path);
		}
		return buf.toString();
	}
	
	public static String getBasePath(HttpServletRequest request){
		int port = request.getServerPort();
		
		StringBuffer buf = new StringBuffer();
		buf.append(request.getScheme());
		buf.append("://");
		buf.append(request.getServerName());
		if(port != 80){
			buf.append(":");
			buf.append(port);
		}
		buf.append(request.getContextPath());
		buf.append("/");
		return buf.toString();
	}
	
	public static void main(String[] args) {
		JSONObject rs = post("http://www.qq.com", null);
		System.out.println(rs);
	}

}
