
public class text2 {
    String str = new String("hello");
    char ch[]= {'d','b'};
    public static void main(String[] args) {
        text2 ex = new text2();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str + " and "+ex.ch[0]);
    }
    public void change(String str, char ch[]){
        str = "test ok";
        ch[0] = 'a';
    }
}