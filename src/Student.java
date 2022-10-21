/**
 * Demo class
 * @author liuchao
 * @date 2022/10/21
 */
import java.util.*;

public class Student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        ArrayList list = new ArrayList();
        for(int i=1;i<=num;i++)
        {
            list.add(i);
        }

        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int p=sc.nextInt();
            int q=sc.nextInt();
            int index=list.indexOf(p);
            list.remove(index);
            list.add(index+q,p);
        }
        for(Object i:list)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        }
    }

