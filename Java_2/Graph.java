import java.util.*;
import java.util.LinkedList;
public class Graph {

    void display(int graph[][],int vertex){
        for(int i=0;i<vertex;i++){
            System.out.print(i+"->");
            for(int j=0;j<vertex;j++){
                if(graph[i][j]==1){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
    
    void addEdge(int graph[][],int v,int u){
        graph[v][u]=1;
        graph[u][v]=1;
    }

    //This part is to get input from the user

    // void create(Scanner sc,int graph[][],int vertex){
    //     for(int i=0;i<vertex;i++){
    //         for(int j=0;j<vertex;j++){
    //             System.out.println("Do you want to make an edge bw"+ i+"->"+j+"(Y/N):");
    //             char flag=sc.next().charAt(0);
    //             flag=(flag=='Y'||flag=='y')?'Y':'N';
    //             if(flag=='Y'){
    //                 graph[i][j]=1;
    //             }
    //         }
    //     }
    // }

    void bfs(int graph[][],int v,int s){
        if(s<0||s>=v)return;
        boolean visited[]=new boolean[v];
        visited[s]=true;
        Queue<Integer>q=new LinkedList<>();
        q.add(s);
        for(int i=0;i<v;i++){
            s=q.remove();
            System.out.println(s+" ");
            for(int j=0;j<v;j++){
                if(!visited[j]&&graph[s][j]==1){
                    q.add(j);
                    visited[j]=true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph g=new Graph();
        int vertex=4;
        int graph[][]=new int[4][4];

        g.addEdge(graph, 0,1);
        g.addEdge(graph, 1,2);
        g.addEdge(graph, 2,3);
        g.addEdge(graph, 3,0);

        //Scanner sc=new Scanner(System.in);
        //g.create(sc,graph,vertex);

        g.display(graph, vertex);
    }
}
