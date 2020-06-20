package view;

import javafx.scene.control.Button;

public class ConfigWindowView extends BaseView{

	public ConfigWindowView(String i_fileName) {
		super(i_fileName);
		// TODO 自動生成されたコンストラクター・スタブ
		Button button1 = (Button)getObject("button1");
		button1.setText("小");

		Button button2 = (Button)getObject("button2");
		button2.setText("中");

		Button button3 = (Button)getObject("button3");
		button3.setText("大");
		
		Button button4 = (Button)getObject("button4");
		button4.setText("無");

		Button button5 = (Button)getObject("button5");
		button5.setText("小");

		Button button6 = (Button)getObject("button6");
		button6.setText("中");
		
		Button button7 = (Button)getObject("button6");
		button6.setText("大");
		
		Button button8 = (Button)getObject("button6");
		button6.setText("ゲームに進む");
		
		Button button9 = (Button)getObject("button6");
		button6.setText("もどる");
	}

	@Override
	public void Init() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
