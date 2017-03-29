package com.hekewangzi.httpProxyServer.constants;

/**
 * 请求方法 enum
 * 
 * @author qq
 * 
 */
public enum RequestMethod {
	/**
	 * 从服务器获取一份文档
	 * 
	 * 请求实体（不支持）
	 * 
	 * 响应实体（支持）
	 */
	GET,

	/**
	 * 向服务器发送需要处理的数据
	 * 
	 * 请求实体（支持）
	 * 
	 * 响应实体（支持）
	 */
	POST,

	/**
	 * 只从服务器获取文档的首部
	 * 
	 * 请求实体（不支持）
	 * 
	 * 响应实体（不支持）
	 */
	HEAD,

	/**
	 * 将请求的主体部分存储在服务器上
	 * 
	 * 请求实体（支持）
	 * 
	 * 响应实体（支持）
	 */
	PUT,

	/**
	 * 对可能经过代理服务器传送到服务器上去的报文进行追踪
	 * 
	 * 请求实体（不支持）
	 * 
	 * 响应实体（支持）
	 */
	TRACE,

	/**
	 * 决定可以在服务器上执行哪些方法
	 * 
	 * 请求实体（不支持）
	 * 
	 * 响应实体（不支持）
	 */
	OPTIONS,

	/**
	 * 从服务器上删除一份文档
	 * 
	 * 请求实体（不支持）
	 * 
	 * 响应实体（支持）
	 */
	DELETE,

	/**
	 * 用于https
	 * 
	 * 请求实体（不支持）
	 * 
	 * 响应实体（支持）
	 */
	CONNECT;
}
