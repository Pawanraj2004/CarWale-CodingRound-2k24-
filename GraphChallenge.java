/*
 * Input : Array of strings with length 3.(example: arr[]={{A,B,C,D},{A-B,B-C,B-D,A-D},{C}})
 * arr[0] : String of vertices ({A,B,C,D})
 * arr[1] : String of edges ({A-B,B-C,C-D,A-C})
 * arr[2] : String of endpoints({C})
 * We need to find that whether the given endpoint is trully an endpoint or not i.e. connected to every edge.
 * If it is, then we will return "yes"
 * else we will return the string of edges that does not consist of endpoint( here : {A-B,B-D,A-D})
 */
public class GraphChallenge {
    static String function(String[] strArray){
        String[] edges = strArray[1].substring(1,strArray[1].length()-1).split(",");
        String[] endpoints = strArray[2].substring(1,strArray[2].length()-1).split(",");
        String str="{";
        for(int i=0;i<edges.length;i++){
            for(int j=0;j<endpoints.length;j++){
                if(!edges[i].contains(endpoints[j]))
                str+=edges[i]+",";
            }
        }
        if(str.equals("{"))
        return "yes";
        return str.substring(0, str.length()-1)+"}";
    }
    public static void main(String[] args) {
        String[] strArray={"{A,B,C,D}","{A-B,B-C,B-D}","{B}"};
        System.out.println(function(strArray));
    }
}
