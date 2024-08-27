// class NonStatic{
//     public void run(String str){
//         System.out.println(str + " Running");
//     }
//     public static void main(String[] args) {
//         NonStatic ns = new NonStatic();
//         ns.run("Naveen is");
//     }
// }

class NonStatic{
    public void java(){
    System.out.println("loops "+" methods "+" oops ");
    }
    public static void main(String[] args) {
        new NonStatic().java();
    }
}