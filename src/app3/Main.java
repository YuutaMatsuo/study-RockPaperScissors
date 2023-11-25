package app3;

//実行クラス
public class Main {
	public static void main(String[] args) {
		// プレイヤーとコンピュータをクラスを元にインスタンス化する
		RockPaperScissors player = new RockPaperScissors();
		RockPaperScissors cpu = new RockPaperScissors();

		System.out.println("じゃんけんゲームへようこそ！");
		do {
			player.input(); // RockPaperScissorsクラスのinputメソッドを実行
			cpu.random(); // RockPaperScissorsクラスのrandomメソッドを実行
			Logic.gameStart(player.disp(), cpu.disp());
			Logic.judgment(player.hund, cpu.hund);// 勝負判定
		} while (player.hund == cpu.hund);
	}
}
