package backtracking;

class Question1{
    public static void mazeprint(int maze[][]){

        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze.length;j++){
                System.out.print(" "+maze[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static boolean isSafe(int maze[][],int x,int y){

        if(x >=0 && y >=0 && x < maze.length && y < maze.length && maze[x][y]==1 ){
           return true;
        }else{
            return false;
        }

    }
    public static boolean newmaze(int maze[][]){
        int N = maze.length;
        int sol[][] = new int[N][N];
    if(solvemaze(maze, 0, 0, sol)==false){
        System.out.println("Solution doesnt exist");
        return false;
    }
    mazeprint(sol);
    return true;

    } 

    public static boolean solvemaze(int maze[][],int x,int y,int sol[][]){
        if(x==maze.length-1 && y==maze.length-1 && maze[x][y]==1){
            sol[x][y] = 1;
            return true;
        }
        if(isSafe(maze, x, y)==true){
            if(sol[x][y]== 1){
                return false;
            }
            sol[x][y] = 1;

            if(solvemaze(maze, x+1, y, sol))
                return true;
            if (solvemaze(maze, x, y+1, sol))
                return true;

            sol[x][y]=0;
            return false;    
            }

            return false;
        }

    
    public static void main(String[] args) {
        int maze[][] =  {{ 1, 0, 0, 0 },
                         { 1, 1, 0, 1 },
                         { 0, 1, 0, 0 },
                         { 1, 1, 1, 1 } };

                         mazeprint(maze);
                         System.out.println();
                         newmaze(maze);

    }
}