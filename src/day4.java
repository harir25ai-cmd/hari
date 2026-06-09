void main() {
     int[][] attendence = new int[][]{
             {0, 1, 0},
             {1, 0, 0},
             {1, 1, 1},
             {1, 0, 1},
             {0, 0, 0}
     };
     System.out.println("Output :");
     for (int i = 0;i < attendence.length;i++)
     {
         System.out.println("student " + (i+1) +":");
         for (int j = 0;j < attendence[i].length;j++)
         {
             if (attendence[i][j] == 1)
             {
                 System.out.println("Class"+(j+1)+": Present");
             }
             else
             {
                 System.out.println("Class"+(j+1)+": Absent");
             }
         }
     }
}