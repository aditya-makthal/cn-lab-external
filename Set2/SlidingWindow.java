import java.util.*;
class SlidingWindow{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter window size");
        int n = sc.nextInt();
        System.out.println("Enter frame size");
        int frame = sc.nextInt();
        int[] frames = new int[frame];
        System.out.println("Enter "+frame+" frames");
        for(int i=0;i<frame;i++){
            frames[i] = sc.nextInt();
        }
        sc.close();
        for(int i=0;i<frame;i++){
            if((i+1)%n==0){
                System.out.println(frames[i]);
                System.out.println("Acknowledgement recieved");
            }
            else{
                System.out.print(frames[i]+" ");
            }
        }
    }
}