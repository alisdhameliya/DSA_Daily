public class _q2_shortestPath {
    public static double sortestPath(String path){
        int x= 0 ;
        int y = 0;

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i)=='W') {
                x--;
            }else if (path.charAt(i)=='E') {
                x++;
            }else if (path.charAt(i)=='N') {
                y++;
            }else {
                y--;
            }
        }
        return (Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)));
    }
    public static void main(String[] args) {
        String path = "NS";
        // String path = "WNEENESENNN";
        System.out.println(sortestPath(path));
    }
}
