class Game {
	private String name;  //ゲーム名
	private int price;    //価格

	public  Game(String name, int price) { //コンストラクタ
		this.name = name;
		this.price = price;
	}
	 public String getName() {return name;} //ゲーム名を取得
	 public int getPrice()   {return price;} //価格を取得
}
