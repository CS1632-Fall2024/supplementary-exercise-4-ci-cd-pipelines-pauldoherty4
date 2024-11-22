package edu.pitt.cs;

public class CatImpl implements Cat {

	// TODO: Fill in with member variables
	int catID;
	String catName;
	boolean isRented;

	public CatImpl(int id, String name) {
		// TODO: Fill in
		catID = id;
		catName = name;
	}

	public void rentCat() {
		// TODO: Fill in
		isRented = true;
	}

	public void returnCat() {
		// TODO: Fill in
		isRented = false;
	}

	public void renameCat(String name) {
		// TODO: Fill in
		catName = name;
	}

	public String getName() {
		// TODO: Fill in
		return catName;
	}

	public int getId() {
		// TODO: Fill in
		return catID;
	}

	public boolean getRented() {
		// TODO: Fill in
		return isRented;
	}

	public String toString() {
		// TODO: Fill in
		return "ID " + catID + ". " + catName;
	}

}