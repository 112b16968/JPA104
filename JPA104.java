import java.util.Scanner;
// import java.lang.Math;
public class JPA104 {
    public static void main(String[] args) {
       Scanner  a = new Scanner(System.in);
       System.out.print("輸入第1組的x和y座標:");
       String[] axy = a.nextLine().split("\\s+");
       Scanner  b = new Scanner(System.in);
       System.out.print("輸入第2組的x和y座標:");
       String[] bxy = b.nextLine().split("\\s+"); //建立一個字串陣列 並將輸入的數字用.split放式將空格分離
       if (axy.length == 2 && bxy.length == 2) {  //判斷輸入的是不是要的形式 將座標分別放入每一個變數
        double x1= Double.parseDouble(axy[0]);  //建立一個浮點數 並將字串陣列轉成浮點數
        double y1= Double.parseDouble(axy[1]);
        double x2 = Double.parseDouble(bxy[0]);
        double y2 = Double.parseDouble(bxy[1]);
        double distance = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        System.out.printf("介於(%.2f, %.2f) 和(%.2f, %.2f) 之間的距離是 %.2f。", x1, y1, x2, y2, distance);  

        } else {
            System.out.println("輸入格式錯誤");
       }
       
       a.close();  
       b.close();
    }
}
