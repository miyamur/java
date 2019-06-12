import java.io.*;

class glass
{
  private int nakami;
  glass(int x){nakami=x;}
  void dasu(int x){
    if(nakami>=x){
      nakami-=x;
      System.out.println("水を出しました");
  System.out.println("今の中身は"+nakami);}
  else{
    System.out.println("水はそんなにありません");
  }
}
}

class sample_glass2
{
  public static void main(String [] args)throws IOException{
    BufferedReader br=
    new BufferedReader(new InputStreamReader(System.in));
    System.out.println("水の量");
    String str;
    int x;
    str=br.readLine();
    x=Integer.parseInt(str);
    glass cup=new glass(x);
    System.out.println("コップを作りました");
    System.out.println("水を出す量を決めます");
    str=br.readLine();
    x=Integer.parseInt(str);
    cup.dasu(x);
    System.out.println("end");
  }
}
