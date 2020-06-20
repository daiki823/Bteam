package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import model.BaseModel;
import view.BaseView;
import view.TestWindowView;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			BaseView.setSTAGE(primaryStage); //ステージを保持させる
			//最初のページの表示処理
			TestWindowView twv = new TestWindowView("TestWindow.fxml");
			twv.NextView(new BaseModel());
			
		} catch(Exception e) {
			System.out.println("Main:start() 例外発生");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
