#include <iostream>

using namespace std;

class Book{
public:
	Book() {
		cout << "book������" << endl;
	}
};

class NovelBook : public Book{
public:
	NovelBook() {
		cout << "novelbook������" << endl;
	}
};

class ActionBook : public NovelBook{
public:
	ActionBook() {
		cout << "actionbook������" << endl;
	}
};

int main() {
	ActionBook obj;
	return 0;
}