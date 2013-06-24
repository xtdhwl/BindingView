package net.shenru.binding;

/**
 * 数据绑定信息
 * @author xtdhwl
 */
public class Binding extends BindingBase {

	/** 获取或设置要用作绑定源对象的元素的名称 */
	private String elementName;
	/** 获取或设置一个值，该值指示绑定的数据流方向。 */
	private BindingMode mode;
	/** 获取或设置绑定源属性的路径。 */
	private PropertyPath path;

	public String getElementName() {
		return elementName;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}

	public BindingMode getMode() {
		return mode;
	}

	public void setMode(BindingMode mode) {
		this.mode = mode;
	}

	public PropertyPath getPath() {
		return path;
	}

	public void setPath(PropertyPath path) {
		this.path = path;
	}

}
