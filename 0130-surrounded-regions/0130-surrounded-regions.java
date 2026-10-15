class Solution {
    public void solve(char[][] board) {
         //queue<pair> , vis , drow , dcol
        Queue<Pair> q = new LinkedList<>();
        int n = board.length;
        int m = board[0].length;
        int [][] vis = new int[n][m];
        //all boundary ones in the queue
        //first and last row 
        for(int i=0;i<m;i++){
            //first row 0,i
            if(board[0][i]=='O' && vis[0][i]==0){
                q.offer(new Pair(0,i));
                vis[0][i] = 1;
            }
            //last row 
            //last row n-1,i
            if(board[n-1][i] == 'O' && vis[n-1][i]==0){
                q.offer(new Pair(n-1, i));
                vis[n-1][i] = 1;
            }
        }
        //first and the last column
        for(int i=0;i<n;i++){
            //first col-> i,0
            if(board[i][0]=='O' && vis[i][0]==0){
                vis[i][0] = 1;
                q.offer(new Pair(i , 0));
            }
            //last col -> i  m-1
            if(board[i][m-1]=='O' && vis[i][m-1]==0){
                q.offer(new Pair(i , m-1));
                vis[i][m-1] = 1;
            }
        }
        //bfs traversal 
        int [] drow = {-1, 0, 1,   0};
        int [] dcol = {0 , 1 , 0 , -1};
        while(!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            q.poll();
            for(int i=0;i<4;i++){
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                if(nrow>=0 && nrow<=n-1 && ncol>=0 && ncol<=m-1 && board[nrow][ncol]=='O' && vis[nrow][ncol]==0){
                    q.offer(new Pair(nrow , ncol));
                    vis[nrow][ncol] = 1;
                }
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j = 0 ;j<m;j++){
                if(board[i][j]=='O' && vis[i][j]==0){
                  board[i][j]='X'; 
                }
            }
        }
    }
}
//bfs traversal on a grid
class Pair{
    int row;
    int col;
    Pair(int _row , int _col){
        this.row = _row;
        this.col = _col;
    }
}