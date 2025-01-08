#include <iostream>
using namespace std;

int main() {
    int arr[10];

    for (int i = 0; i < 10; i++) {
        cout << "element - " << i << " : ";
        cin >> arr[i];
    }

    cout << "Elements in array are: ";
    for (int i = 0; i < 10; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
    return 0;
}


#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Input the number of elements to store in the array: ";
    cin >> n;

    int arr[n];
    for (int i = 0; i < n; i++) {
        cout << "element - " << i << " : ";
        cin >> arr[i];
    }

    cout << "The values stored in the array are: ";
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    cout << "The values stored in the array in reverse are: ";
    for (int i = n - 1; i >= 0; i--) {
        cout << arr[i] << " ";
    }
    cout << endl;

    return 0;
}


#include <iostream>
using namespace std;

int main() {
    int n, sum = 0;
    cout << "Input the number of elements to be stored in the array: ";
    cin >> n;
    
    int arr[n];
    for (int i = 0; i < n; i++) {
        cout << "element - " << i << " : ";
        cin >> arr[i];
    }
    
    for (int i = 0; i < n; i++) {
        sum += arr[i];
    }
    
    cout << "Sum of all elements stored in the array is : " << sum << endl;
    return 0;
}

#include <iostream>
#include <vector>
using namespace std;

// Function to perform insertion sort and count operations
void insertionSort(vector<int>& arr, int& comparisons, int& swaps) {
    int n = arr.size();
    comparisons = 0;
    swaps = 0;
    
    for (int i = 1; i < n; i++) {
        int key = arr[i];
        int j = i - 1;
        
        while (j >= 0 && arr[j] > key) {
            comparisons++;
            arr[j + 1] = arr[j];
            swaps++;
            j--;
        }
        if (j >= 0) comparisons++; // Count the last comparison that fails the while condition
        arr[j + 1] = key;
    }
}

// Function to print array
void printArray(const vector<int>& arr) {
    for (int i : arr) {
        cout << i << " ";
    }
    cout << endl;
}

int main() {
    // Task 1: Demonstrate Insertion Sort
    vector<int> arr = {32, 45, 29, 66, 41, 58};
    cout << "Original array: ";
    printArray(arr);
    
    cout << "\nInsertion Sort steps:\n";
    int comparisons = 0, swaps = 0;
    
    // Print each step
    for (int i = 1; i < arr.size(); i++) {
        cout << "Step " << i << ": ";
        int key = arr[i];
        int j = i - 1;
        
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
        printArray(arr);
    }
    
    // Task 3: Fill the table for different sizes
    cout << "\nPerformance Analysis:\n";
    cout << "Size(n)\tComparisons\tSwaps\n";
    
    vector<int> sizes = {4, 8, 16};
    for (int size : sizes) {
        vector<int> testArr(size);
        // Fill array with random numbers
        for (int i = 0; i < size; i++) {
            testArr[i] = rand() % 100;
        }
        
        insertionSort(testArr, comparisons, swaps);
        cout << size << "\t" << comparisons << "\t\t" << swaps << endl;
    }
    
    // Task 4: Almost sorted array example
    cout << "\nTask 4 - Almost Sorted Array Example:\n";
    vector<int> almostSorted = {1, 2, 4, 3, 5, 6};
    cout << "Almost sorted array: ";
    printArray(almostSorted);
    
    insertionSort(almostSorted, comparisons, swaps);
    cout << "Number of comparisons: " << comparisons << endl;
    cout << "Number of swaps: " << swaps << endl;
    
    return 0;
}