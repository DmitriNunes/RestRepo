
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

        ListItem li1 = new ListItem(0);
        ListItem head = li1;

        for(int i = 0; i < 10; i++){
            ListItem li2 = new ListItem(i);
            li1.next = li2;
            li1 = li2;
            System.out.println("Created ListItem "+i);
            System.out.println("ListItem address "+li1);
        }

        while(true){
            System.out.println("ListItem at:"+head+" has data: "+head.data);
            head = head.next;
            if(head.next == null) break;
        }
        
    }
}