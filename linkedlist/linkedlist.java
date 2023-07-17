
    
class Node{
    int data;
    Node next;

    Node(int d){
    this.data = d;
    this.next = null;
    } 
}

public class linkedlist {
    Node first,last = null;
    int size = 0;

 public void add(int d){
  Node newNode = new Node(d);
      
      if(first == null && last == null){
        first = newNode;
        last=newNode;
      }

      else{
         last.next=newNode;
         last=newNode;
        
      } size++;                  
}


public void addfirst(int d){
    Node newNode = new Node(d);
      
      if(first == null && last == null){
        first = newNode;
        last=newNode;
      }

      else{
         newNode.next=first;
         first=newNode;
        
      } size++;                  
}

public void removefirst(){
  
  if(first == null && last == null){
    System.out.println("linked list is empty");
    return;
  }
    else if (first == last){
      first = last = null;
    }
    else 
    first = first.next;
  
   size--; 
}

  public void removelast(){

    if(first == null && last == null){
      System.out.println("linked list is empty");
      return;
    }
    else if (first == last){
      first = last = null;
    }
    else{
      Node temp = first;
      while(temp.next != last){
        temp = temp.next;
      }
      temp.next = null;
      last = temp;
    }

 }

public void printlist(){
  Node temp =first;
  while(temp!=null){
    System.out.println(temp.data+"  ");
    temp=temp.next;
  }
}
  public void addatindex(int index,int element){
      if(index > size){
    System.out.println("index out of bond");
     return;
    }
    node newnode = new node(element);
     if(index==0){
     addfirst(element);
     }
     else if(index==size)
     add(element);
 
  else {
    Node temp=first;
    int i=0;

    while(i<index-1){
      temp=temp.next;
      i++;
    }
     newnode=temp.next;
     temp.next=newnode.next;
     size++;
  }
}

  
   


public static void main(String[] args) {
      
   linkedlist ll=new linkedlist();
   ll.add(10);
   ll.add(30);
   ll.add(40);
   ll.add(50); 
   ll.printlist();  
   // System.out.println(size+"  size - ");
   System.out.println( "after add starting point -" );
   
   
   ll.addfirst(0);
   ll.addfirst(-10);
   ll.addfirst(-20);
  ll.addfirst(-30);
   ll.printlist();
    }
  }




