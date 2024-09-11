/*bit wise operator
 * 1. AND -> &  (both ->1 -> 1)   (decreass)
 * 2. OR -> |   (any one -> 1 -> 1)   (increass)
 * 3. XOR -> ^   (same bit -> 0 , diffrent bit ->1)
 * 4. One's complement -> ~
 * 5. left shift -> <<
 * 6. right shift -> >>
 */


 /*
  *  One's complement -> 2'complement(0->1 , 1->0) -> 1's complement -> +1
     if msb(most significant bit -> 0 (+ve ans) , ->1 (-ve))
     mostly come in '-ve' and +1
     ex -> ~5 -> -6,   ~0 -> -1
  */

 import java.util.*;
 public class _01Basics{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(5&6);
        System.out.println(5|6);
        System.out.println(~2);
    }
 }

