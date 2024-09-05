public class Backtracking {
    static int nxt_row[]={0,1,0,-1};
    static int nxt_col[]={1,0,-1,-0};
    static char move[]={'R','B','L','T'};
    static String optimal_res="";


    static boolean validate(int row,int col,int maze[][],int n){
        return (row>=0 && row<n) && (col>=0 && col<n) && (maze[row][col]==1);
    }

    static void findpath(int row,int col,int maze[][],int n,String res){
        if(row==n-1 && col==n-1){
            if(res.length()<optimal_res.length()||optimal_res.equals("")){
                optimal_res=res;
            }
            System.out.println(res);
            return;
        }
    
    maze[row][col]=0;
    for(int i=0;i<4;i++){
        int n_row=row+nxt_row[i];
        int n_col=col+nxt_col[i];
        if(validate(n_row, n-col, maze, n)){
            findpath(n_row, n_col, maze, n, res+move[i]);
        }
        else{
            System.out.println(false);
        }
    }
    maze[row][col]=1;
}
    public static void main(String[] args) {
        int maze[][]={{1,1,1},{1,0,0},{1,1,1}};
        int n=maze.length;
        if(maze[0][0]!=0 && maze[n-1][n-1]!=0){
            findpath(0, 0, maze, n, optimal_res);
        }
        else{
            System.out.println("Not Possible");
        }
    }
}
