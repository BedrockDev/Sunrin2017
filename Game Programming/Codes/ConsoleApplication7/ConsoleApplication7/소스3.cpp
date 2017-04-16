#include<iostream>
#include<string>
using namespace std;

class Movie {
private:
	string title;
	int length, rating;
public:
	Movie(string in_title, int in_length, int in_rating) : title(in_title), length(in_length), rating(in_rating) {
		print_info();
	}
	void print_info();
};

void Movie::print_info() {
	cout << "------------------------" << endl;
	cout << "Movie : " << title << "\n" << "�󿵽ð� : " << length << ", �� " << rating << endl;
	cout << "------------------------" << endl;
} 

void swapMovies(Movie m1, Movie m2) {
	Movie tmp = m1;
	m1 = m2;
	m2 = tmp;
}

void main() {
	Movie star_wars = Movie("��Ÿ����", 133, 9);
	Movie blade_runner = Movie("���̵� ����", 117, 100);
	swapMovies(star_wars, blade_runner);
}