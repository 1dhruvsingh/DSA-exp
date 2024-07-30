#include <iostream>
#include <stack>
#include <string>
using namespace std;
int evaluate(string exp) {
    stack<int> stack;
    
    for (char& c : exp) {
        if (isdigit(c)) {
            stack.push(c - '0');
        } 
        else {
            int val1 = stack.top();
            stack.pop();
            int val2 = stack.top();
            stack.pop();
            
            switch (c) {
                case '+':
                    stack.push(val2 + val1);
                    break;
                case '-':
                    stack.push(val2 - val1);
                    break;
                case '*':
                    stack.push(val2 * val1);
                    break;
                case '/':
                    stack.push(val2 / val1);
                    break;
            }
        }
    }
    
    return stack.top();
}

int main() {
    string exp;
    cout << "Enter a postfix expression: ";
    cin >> exp;
    
    int result = evaluate(exp);
    cout << "Result: " << result << endl;
    
    return 0;
}