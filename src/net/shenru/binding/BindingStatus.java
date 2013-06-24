package net.shenru.binding;

/**
 * 绑定状态
 * @author xtdhwl
 */
public enum BindingStatus {
	//在win上有err表示，自己理解不应该使用
	//statue error  状态与错误不该混淆 
	/** 已成功激活绑定 */
	Active,
	/** 绑定尚未激活 */
	Inactive
}
  