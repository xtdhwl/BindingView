package net.shenru.binding;

import android.view.View;

/**
 * 提供用于操作绑定的静态方法
 * @author xtdhwl
 */
public class BindingOperations {
	//如果绑定TextView的setText()绑定到Person的name属性上。
	//			DependencyObject TextView，
	//      	DependencyProperty text 
	//			XXX Binding的Path设置name.
	//考虑java使用单继承如果我们自定义的SRTextView继承与TextView，所以我们应该把DependencyObject定义为接口
	/**
	 * @param target
	 * @param dp
	 * @param binding
	 */
	public static void setBinding(View target, String dp, BindingBase binding) {
		//TODO
	}
}
