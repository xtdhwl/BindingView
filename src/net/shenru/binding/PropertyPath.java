package net.shenru.binding;

/**
 * ʵ������������һ�����ݽṹ��Ϊ·������һ�������£�����һ�����������¡� ����·�����ڰ󶨵���������ݺ�����ʾͼ���ʱ�䴦��������[ �Լ����Ϊ����·��]
 * @author xtdhwl
 */
public class PropertyPath {

	/** ��ȡ������������·�����ַ����� */
	private String path;
	/** ��ȡ�����б���ʹ��·��ʱ�������������� */
	private String[] pathParametes;

	public PropertyPath(String path) {
		super();
		this.path = path;
	}

	public PropertyPath(String path, String[] pathParametes) {
		super();
		this.path = path;
		this.pathParametes = pathParametes;
	}

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
