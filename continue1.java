public class Main {
  public static void main(String[] args ) {
    //0-9まで繰り返し
    for(int i=0; i<10; i++){
	    System.out.print(i);
	    //8を表示した後for文中断→条件式に戻る
	    if(i>8){
	        continue;
	    }
	    System.out.print(",");
	}
  }
}

//0,1,2,3,4,5,6,7,8,9
