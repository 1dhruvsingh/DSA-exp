#include <iostream>
using namespace std;
int main(){  

    //Part 1 a- SUM of the elements of the array 
    int n;
    cout<<"enter the number of elements in array"<<endl;
    cin>>n;
    int arr[n];
    cout<<"enter the elements in array"<<endl;
    for(int i=0; i<n; i++){
        cin>>arr[i];
    }
    int sum=0;
    for(int i=0; i<n; i++){
        sum=sum+arr[i];
    }
    cout<<"the sum is "<<sum<<endl;

    // Part 1 b-Avreage of the array 
    int avg;
    avg=sum/n;
    cout<<"the average is "<<avg<<endl;

    //Part 2- insert an element
    /*
    int a;
    cout<<"enter the position of element"<<endl;
    cin>>a;
    int b;
    cout<<"enter the element"<<endl;
    cin>>b;
    for(int i=n-1; i>=a-1;i--){
        arr[i]=arr[i-1];
    }
    arr[a-1]=b;
    cout<<"new array"<<endl;
    for(int i=0;i<=n+1;i++){
        cout<<arr[i]<<endl;
    }
    // Part 3- Delete an element
    int c;
    cout<<"enter the position of element to be deleted"<<endl;
    cin>>c;
    for (int i=c-1;i<n;i++){
        arr[i]=arr[i+1];
    }
    cout<<"new array"<<endl;
    for(int i=0;i<n-1;i++){
        cout<<arr[i]<<endl;
    }*/
    // Part 4- Smallest element in an array
    int k;
    k=arr[0];
    for(int i=0;i<n;i++){
    if(k>arr[i]){
        k=arr[i];
    }
    }
    cout<<"smallest element:"<<k<<endl;
    
    //Part 7- Reverse the array
    /*cout<<"Reversing the array"<<endl;
    for(int i=0; i<n; --i){
        cout<<arr[i];
    }*/

    
    return 0;
}