package sampleJFrame;

public class Practice {
	public static void main(String[] args) {
		Sub_Practice frame = new Sub_Practice("TestWindow");		//引数がウィンドウのタイトルになる この場合はサブクラスのコンストラクタに渡している
		frame.setVisible(true);		//ウィンドウの見える見えないを決める
		
	}
}
	