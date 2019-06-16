import java.io.*;

class omikuji{
  private int un;
  omikuji()throws IOException{
    System.out.println("ラッキーナンバーを入れてください");
    BufferedReader br=
    new BufferedReader(new InputStreamReader(System.in));
    String str=br.readLine();
    un=Integer.parseInt(str);

  }
  void hiku(){
    int x=(int)(Math.random()*5)+1;
    System.out.print("あなたの運勢は");
    if(x==un){
      System.out.println("大吉です");
    }
    else{
      System.out.println("ぼちぼちです");

    }

  }
}

class random
{
  public static void main(String[] args)throws IOException{
    omikuji today=new omikuji();
    today.hiku();
  }
}
