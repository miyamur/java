import java.io.*;
class Inu
{
  private String name;
  Inu(String s){
    name=s;

  }
  void naku(){
    System.out.println("僕は"+name);
  }
}

class inu2
{
  public static void main(String[] args)throws IOException{
    System.out.println("name");
    String s;
    BufferedReader br=
    new BufferedReader(new InputStreamReader(System.in));
    s=br.readLine();

    Inu d=new Inu(s);
    System.out.println("生成されました");
    System.out.println("泣きます");
    d.naku();
  }
}
