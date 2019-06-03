import java.io.*;

class hello2
{
  public static void main(String[] args)throws IOException{
    System.out.println("こんにちは");
    System.out.println("あなたの名前は");
    String name;
    BufferedReader br=
    new BufferedReader(new InputStreamReader(System.in));
    name=br.readLine();
    System.out.println(name+"さん");

   }
}
