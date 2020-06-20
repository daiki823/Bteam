package view;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class TestWindowView extends BaseView{

	public TestWindowView(String i_fileName) {
		super(i_fileName);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void Init() {
		// TODO 自動生成されたメソッド・スタブ

		Button button1 = (Button)getObject("button1");
		button1.setText("ゲームで遊ぶ");

		Button button2 = (Button)getObject("button2");
		button2.setText("おわる");

		Button button3 = (Button)getObject("button3");
		button3.setText("設定画面");
	}

	void sizeToScene(ActionEvent event) {
		  // reconstruct scene
	}
}
