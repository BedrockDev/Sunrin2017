#include <iostream>
#include <string>

using namespace std;

int main() {
	string s1 = "This is a test string";

	s1.insert(4, " [Inserted text] ");

	cout << s1 << endl;

	int index = s1.find("This");
	cout << "Index of found text of \"This\" " << index << endl;

	s1.append(" [Appended text]");
	cout << s1 << endl;

	return 0;
}