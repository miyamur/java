import java.io.*;

class quiz{
  public static void main(String[] args) throws IOException{
    int i=0;
    while(true){
      System.out.println("日本一高い山は");
      System.out.println("1富士山　2ヒマラヤ　3雲仙普賢岳");
      BufferedReader br=
      new BufferedReader(new InputStreamReader(System.in));
      String str=br.readLine();
      i=Integer.parseInt(str);
      if(i==2){
        break;
      }
      System.out.println("ハズレです");
    }
    System.out.println("終了しました");
  }
}
