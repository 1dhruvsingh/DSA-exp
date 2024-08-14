#include<iostream>
using namespace std;
int main()
{
    int queue[20];
    int front,rear,num,option,i;
    front=-1;
    rear=-1;
    int m=5;
    do
    {
        cout<<"Enter option for operations on queue: \n 1)To insert element in queue \n 2)To delete element from the queue \n 3)To display the elements of the stack \n 4)Exit";
        cin>>option;
    switch(option)
    {
        case 1:
        {
            cout<<"Enter the number to be inserted";
            cin>>num;
            if(rear==m-1)
            {
                cout<<"Overflow";
            }
            else if(front==-1 && rear==-1)
            {
                front=0;
                rear=0;
                queue[rear]=num;
            }
            else if(rear==m-1 and front!=0)
            {
                rear=0;
            }
            else
            {
                rear=rear+1;
                queue[rear]=num;
            }
            break;
        }
        case 2:
        {
            if(front==-1 || front>rear)
            {
                cout<<"Underflow";
            }
            else if(front==rear)
            {
                front=-1;
                rear=-1;
            }
            else if(front==m-1)
            {
                front=0;
            }
            else{
                front=front+1;
            }
            break;
        }
        case 3:
        {
            for(i=front;i<=rear;i++)
            {
                cout<<queue[i];
            }
            break;
        }
        case 4:
        {
            break;
        }
    }
}
while(option!=4);
return 0;
}