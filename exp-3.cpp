#include<iostream>
using namespace std;
int num;
int top=-1;
int push (int num)
{
if (top>=5)
{
cout<<"overflow"<<endl;
}
top=top+1;
s[top]=num;
}
int pop()
{
if (top<0)
{
cout<<"underflow"<<endl;
}
num=s(top);
top-top-1;
return num;
}
int evaluate (char* expression)
int i=0;
char symbol=expression[i];
int op1, op2, result;
while (symbol!= '\0')
{
if (symbol>='0' && symbol<='9')
{
int num-symbol-'0';
push (num);
}
else if (symbol)
{
op2=pop();
op1=pop();
switch (symbol)
{
case '+':
{
result=op1+op2;
break;
}
case '-':
{
result=op1-op2;
break;
}
case '*':
{
result=op1*op2;

case '-':
{ result=opl-op2; break;
}
case '*': {
result=op1*op2; break;
}
case '/':
{
result=opl/op2;
break;
}
push (result);
}
i++;
}
symbol=expression [i];
}
result=pop();
return result;
}
int main(){
char expression [] = "5 6 7 + * 8";
int result = evaluate (expression);
cout<<result<<endl;
return 0;
}