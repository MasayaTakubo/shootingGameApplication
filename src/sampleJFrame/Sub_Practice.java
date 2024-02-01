package sampleJFrame;
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;



public class Sub_Practice extends JFrame{
	public Sub_Practice(String title) {
		setTitle(title);		//ウィンドウの
		setSize(300, 200);	//ウィンドウのサイズを指定する。。第一引数がwidth、第二引数がhight　単位はpx
		//frame.setLocation(300, 250);		//実行した際のロケーションを指定する。
		setLocationRelativeTo(null);		//引数ｎｕｌｌで実行した際のウィンドウを中央に移動する
		//ウィンドウをクローズした際のデフォルトで実行される処理を設定する。引数はWindowConstantsオブジェクトで定義されている。JFrameはConstantsインターフェイスを実装しているため、JFrame.なしでも呼べるよ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		
		//JFrameから作成したフレームは1枚の板（ペイン）のように層が重なっている。　ペインを取り出し、コンポーネントを追加する。
		Container contentPane = getContentPane();		//contentPaneを取り出す。
		
		//JButtonクラスのコンストラクタにボタン名を渡す。
		JButton button = new JButton("MyButton");
		
		//取り出したcontentPaneにJButtonクラスのインスタンス(ボタン機能）
		contentPane.add(button, BorderLayout.CENTER);
		
		
		
	}
}
