#include<iostream>
using namespace std;

int queue [100], max = 100, front = 1, rear = 1, val;
void insert(){
   if (rear==max-1){
        cout<<" overflow";}
   else
   if (front == 1&& rear==-1){
      rear=0;
      front = 0;
      cout<<"Insert the element in queue: "<<endl;
      cin>>val;
      rear++;
      queue[rear] = val;
    }
}
void deleteElement(){
  if (front==-1){
   cout<<"underflow";
   }
  else{
    cout<<"Element deleted from queue is: "<< queue [front] <<endl;
    front++;}
    }
void Display(){
   if (front == 1){
     cout<<"Queue is empty"<<endl;}
   else {
     cout<<"Queue elements are: ";}
   for (int i = front; i <= rear; i++){
      cout<<queue[i]<<" ";  
      cout<<endl;}
}
int main(){
  int c;
  cout<<"1. insert \n 2.delete \n 3.display \n 4. exit \n";
do{
  cout<<"enter choice"<<endl;
  cin>>c;
  switch(c){
     case 1: insert(); 
     break;
     case 2: deleteElement();
     break;
     case 3: Display(); 
     break;
     case 4: cout<<"exit"; 
     break;
     default: cout<<" invalid choice ";}
}
while(c!=4);
return 0;
}