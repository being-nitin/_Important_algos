import java.util.*;

public class SumOfNodes {
    public static int sum(Treenode root){
        if(root==null){
            return 0;
        }
        return sum(root.left)+sum(root.right)+root.val;
    }
}
