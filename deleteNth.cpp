#include <vector>
#include <iostream>
#include <map>
using namespace std;

std::vector<int> deleteNth(std::vector<int> arr, int n)
{
    std::map<int, int> counter;
    std::vector<int> v;
    for (const int& i: arr) {
        if (counter[i]++ < n) {
            v.push_back(i);
        }
    }
    return v;
}

int main()
{
    auto vec = deleteNth({34, 34, 44, 16, 21, 21, 43, 18, 16}, 1);
    for (const auto& n: vec) {
        cout << n << " ";
    }
    cout << endl;
}
