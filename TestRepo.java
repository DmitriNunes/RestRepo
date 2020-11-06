
class ListItem{
    public int data;
    public ListItem next;

    public ListItem(int data){
        this.data = data;
        this.next = null;
    }

    public ListItem(int data, ListItem next){
        this.data = data;
        this.next = next;
    }
}


public class TestRepo{



    public static void main(String[] args){
        System.out.println("Hello Repo!");
    }
}