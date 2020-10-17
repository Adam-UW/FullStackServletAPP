package com.demo.dal;

import java.util.ArrayList;

public interface DaoInterface<T>{
	ArrayList<T> findall();
	
	T findById(int id);
	
	void update(T obj);
	
	T save(T obj);
	
	void delete(String name);

}
