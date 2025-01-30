#include <iostream>
#include <vector>
using namespace std;

vector<int> quickSort(vector<int> arr) {
    if (arr.size() <= 1)
        return arr; 

    int pivot = arr.back();
    vector<int> leftPart, rightPart;

    for (size_t i = 0; i < arr.size() - 1; i++) {
        if (arr[i] <= pivot)
            leftPart.push_back(arr[i]);
        else
            rightPart.push_back(arr[i]);
    }

    leftPart = quickSort(leftPart);
    rightPart = quickSort(rightPart);

    leftPart.push_back(pivot);
    leftPart.insert(leftPart.end(), rightPart.begin(), rightPart.end());
    return leftPart;
}

int main() {
    vector<int> numbers = {3, 41, 52, 26, 38, 57, 9, 49, 25, 19, 23};
    
    vector<int> sortedNumbers = quickSort(numbers);
    
    cout << "Sorted List: ";
    for (int num : sortedNumbers) {
        cout << num << " ";
    }
    cout << endl;
    
    return 0;
}