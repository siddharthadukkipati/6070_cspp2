import java.util.Scanner;
public class Solution {
    private Solution() { }
    public static void main(String[] args) {
        client p = new client();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String line = sc.nextLine();
            String[] tokens = line.split(" ",2);
            switch(tokens[0]){
                case "food":
                String[] info = tokens[1].split(",");
                p.food(info[0], Integer.parseInt(info[1]), info[2], info[3]);
                break;
                case "water":
                String[] in = tokens[1].split(",");
                p.drinking(Integer.parseInt(in[0]), in[1], in[2]);
                break;
                case "physicalactivity":
                String[] arr = tokens[1].split(",");
                p.physical(arr[0], arr[1], arr[2], arr[3]);
                break;
                case "weight":
                String[] we = tokens[1].split(",");
                p.weight(Integer.parseInt(we[0]), we[1],we[2]);
                break;
                case "sleep":
                String[] sl = tokens[1].split(",");
                p.sleep(sl[0],sl[1], sl[2]);
                break;
                case "summary":
                p.print();
                break;
                case "foodlog":
                p.foodlog();
                break;
                case "waterlog":
                p.waterlog();
                break;
                case "weightlog":
                p.weightlog();
                break;
                case "activitylog":
                p.activitylog();
                break;
                case "sleeplog":
                p.sleeplog();
                break;
            }
        }
    }
}
