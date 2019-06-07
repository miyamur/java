import java.io.*;

class rocket{
  private int nenryo;
  private int sokudo;
  rocket(int x){
    nenryo=x;
    sokudo=0;
  }
  void kasoku(){
    if(nenryo>=2){
      sokudo+=2;
      nenryo-=2;
      System.out.println("現在の燃料は"+nenryo);
      System.out.println("現在の速度は"+sokudo);

    }
    else{
      System.out.println("燃料切れ");
    }
  }
}

class rocket_sample{
  public static void main(String [] args)throws IOException{
    BufferedReader br=
    new BufferedReader(new InputStreamReader(System.in));
    System.out.println("ロケットを作ります");
    String str=br.readLine();
    int n=Integer.parseInt(str);

    rocket ohtori=new rocket(n);
    System.out.println("加速します");
    ohtori.kasoku();
    System.out.println("再加速");
    ohtori.kasoku();

  }
}
