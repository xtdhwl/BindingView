package net.shenru.binding;

/**
 * ���ݰ���Ϣ
 * @author xtdhwl
 */
public class Binding extends BindingBase {

	/** ��ȡ������Ҫ������Դ�����Ԫ�ص����� */
	private String elementName;
	/** ��ȡ������һ��ֵ����ֵָʾ�󶨵����������� */
	private BindingMode mode;
	/** ��ȡ�����ð�Դ���Ե�·���� */
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
