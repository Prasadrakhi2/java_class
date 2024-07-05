/* We are given N points in a 2D plane which are locations of N cars.
   if we are the origin, print the nearest K cars
   C0 = (3,3) , c1 = (5,-1) , c2 = (-2,4)
 */

//1.by normal array mathod
import java.util.*;
public class Near_Car{

    public static void main(String args[]){
        // int ptn[][] = {{3,3},{5,-1},{-2,4}};  //point of 'x' axis and 'y' axis
        int ax[] = {3,5,-2};
        int ay[] = {3,-1,4};
        int k = 2;

        int dis[] = new int[ax.length];
        for(int i = 0; i < ax.length ; i++){
            dis[i] = (ax[i]*ax[i]) + (ay[i]*ay[i]);
        }

        Arrays.sort(dis);
        for(int i=0 ; i<k; i++){
            System.out.println("c" + i);
        }
    }
}


//2. using priority queue
import java.util.*;
public class Near_Car{

    //priority queue class , here wo place the element int basis of disq prioity
    public class Point implements Comparable<Point>{
        int x;    //for x axis
        int y;    //for y axis
        int dissq;  //sqare root of the x and y index
        int indx;
        
        public Point(int x, int y, int dissq , int indx){
            this.x = x;
            this.y = y;
            this.dissq = dissq;
            this.indx = indx;
        }

        @Override
        public int compareTo(Point p2){
            return this.dissq - p2.dissq;
        }
    }


    public static void main(String args[]){
        int pts[][] = {{3,3} , {5,-1} , {-2, 4}};
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();

        for(int i=0; i<pts.length; i++){
            int dissq = (pts[i][0] *pts[i][0]) + (pts[i][1]*pts[i][1]);
            // pq.add(new Point(pts[i][0] , pts[i][1] , dissq , i));
            pq.add(new Point(pts[i][0],pts[i][1],dissq,i));
        }

        for(int i = 0; i<k; i++){
            System.out.println("C" + pq.remove().indx);
        }
    }
}