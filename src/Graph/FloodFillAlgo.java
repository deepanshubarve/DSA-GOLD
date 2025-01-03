package Graph;

public class FloodFillAlgo {

    public static int[][] floodfill(int[][] image ,int sr,int sc,int color){
        boolean[][] vis = new boolean[image.length][image[0].length];
        helper(image,sr,sc,color,1,vis);
        return image;
    }

    public static void helper(int[][]image,int sr,int sc,int color,int orgColor,boolean[][]vis){

        if(sc < 0 || sr<0 || sc >= image.length|| sr >= image[0].length || vis[sc][sr] ||
        image[sc][sr] != orgColor){
            return;
        }
        //left
        helper(image,sr,sc-1,color,orgColor,vis);
        //right
        helper(image,sr,sc+1,color,orgColor,vis);
        //up
        helper(image,sr-1,sc,color,orgColor,vis);
        //down
        helper(image,sr+1,sc,color,orgColor,vis);

    }
    public static void main(String[] args) {
        int[][] image = {{1,1,1},
                {1,1,0},
                {1,0,1}};
        int sr = 1;
        int sc = 1;
        int color = 2;
        floodfill(image,sr,sc,color);
    }
}
