package net.shenru.bindingview;

import net.shenru.binding.Binding;
import net.shenru.binding.BindingMode;
import net.shenru.binding.BindingOperations;
import net.shenru.binding.PropertyPath;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

		ListView lv = onCreateListView();
		SRTextView iv = (SRTextView) findViewById(R.id.tv);

		Binding binding = new Binding();
		//TODO
		binding.setElementName("");
		binding.setMode(BindingMode.OneWay);
		binding.setPath(new PropertyPath(""));

		//ͨ������iv�е�setBackgroundColor����
		//��ȡbinding����
		//����������������lv.getAdapter()�е�view��ȷ��
		BindingOperations.setBinding(iv, "backgroundColor", binding);

	}

	public ListView onCreateListView() {
		ListView lv = (ListView) findViewById(R.id.lv);
		lv.setAdapter(new ArrayAdapter<String>(this, R.layout.binding, R.id.tv, new String[] { "Green", "Blue",
				"Orange" }));

		return lv;
	}

}
