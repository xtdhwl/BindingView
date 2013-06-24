package net.shenru.binding;

/**
 * 描述绑定流方向
 * @author xtdhwl
 */
public enum BindingMode {
	// 需求：单向 ：捆绑源发生改变捆绑目标也发送改变
	// 				捆绑目标发送改变捆绑源不变
	// 双向：捆绑源发生改变捆绑目标发生改变
	// 捆绑目标发送改变捆绑源也发生改变
	// 第一次绑定：捆绑成功更新捆绑目标，在解绑

	/** 无论是目标属性还是源属性，只要发生了更改，TwoWay 就会更新目标属性或源属性。 */
	Default,
	/** 仅当应用程序启动时或 DataContext 进行更改时更新目标属性。 */
	/* OneTime, */
	/** 仅当源属性发生更改时更新目标属性。 */
	OneWay,
	/** 在目标属性更改时更新源属性。 */
	OneWayToSource,
	/** 使用目标属性的默认 Mode 值 */
	TwoWay
}
