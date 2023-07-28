class Solution {

  /*
  formula
  y2-y1/x2-x1 != y3-y2/x3-x2

  dy1/dx1 != dy3/dy2

  dy1 * dy2 != dy3 * dy1
  
  */
    public boolean isBoomerang(int[][] points) {
        
        int dx1=points[1][0]-points[0][0];
        int dx2=points[2][0]-points[1][0];
        int dy1=points[1][1]-points[0][1];
        int dy2=points[2][1]-points[1][1];

        return (dy1*dx2!=dy2*dx1);

    }
}
