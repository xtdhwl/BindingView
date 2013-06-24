package net.shenru.binding;

/**
 * 实现描述的特性一种数据结构作为路径在另一个属性下，或在一个所属类型下。 属性路径用于绑定到对象的数据和在演示图板和时间处理。动画。[ 自己理解为描述路径]
 * @author xtdhwl
 */
public class PropertyPath {

	/** 获取或设置来描述路径的字符串。 */
	private String path;
	/** 获取参数列表中使用路径时引用索引参数。 */
	private String[] pathParametes;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String[] getPathParametes() {
		return pathParametes;
	}

	public void setPathParametes(String[] pathParametes) {
		this.pathParametes = pathParametes;
	}

}
