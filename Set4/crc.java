import java.util.*;
public class crc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of data bits : ");
        int n = sc.nextInt();
        int data[] = new int[n];
        System.out.print("enter data : ");
        for (int i = 0; i < n; i++) data[i] = sc.nextInt();
        System.out.print("enter size of generator : ");
        int m = sc.nextInt();
        int gen[] = new int[m];
        System.out.print("enter generator : ");
        for (int i = 0; i < m; i++) gen[i] = sc.nextInt();
        System.out.print("the generator matrix : ");
        for (int i = 0; i < m; i++) System.out.print(gen[i]);
        System.out.println();
        System.out.print("the appended matrix is : ");
        int temp[] = new int[n + m - 1];
        for (int i = 0; i < n; i++) temp[i] = data[i];
        for (int i = n; i < n + m - 1; i++) temp[i] = 0;
        for (int i : temp) System.out.print(i);
        System.out.println();
        int crc[] = new int[m - 1];
        for (int i = 0; i < m - 1; i++) crc[i] = 0;
        for (int i = 0; i < n; i++) { // xor
            if (temp[i] == 1) {
                for (int j = 0; j < m; j++)
                    temp[i + j] = temp[i + j] ^ gen[j];
            }
        }
        for (int i = 0; i < m - 1; i++) crc[i] = temp[n + i];
        System.out.print("the crc is : ");
        for (int i : crc) System.out.print(i);
        System.out.println();
        System.out.print("transmitter code for crc is : ");
        int[] transmit = new int[n + m - 1];
        for (int i = 0; i < n; i++) transmit[i] = data[i];
        for (int i = n; i < n + m - 1; i++) transmit[i] = crc[i - n];
        for (int i : transmit) System.out.print(i);
        System.out.println();
        sc.close();
    }
}