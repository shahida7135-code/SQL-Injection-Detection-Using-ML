class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      ArrayList<Integer> res = new ArrayList<>();
      int rB=0;
      int rE=matrix.length-1;
      int cB=0;
      int cE=matrix[0].length-1;
      while(rB<=rE && cB<=cE){
        //Right
        for(int i=cB;i<=cE;i++){
            res.add(matrix[rB][i]);
        }
        rB++;
        //Down
        for(int j=rB;j<=rE;j++){
            res.add(matrix[j][cE]);
        }
        cE--;
        //Left
        if(rB<=rE){
         for(int k=cE;k>=cB;k--){
            res.add(matrix[rE][k]);
            }
          rE--;
        }
     
        //up
        if(cB<=cE){
            for(int x=rE;x>=rB;x--){
            res.add(matrix[x][cB]);
            }
            cB++;
        }
      }
      return res;
    }
}