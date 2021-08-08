package chapter24;

import java.util.Iterator;

public class MyArrayList<E> implements MyList<E>{
	
	public static final int INITIAL_CAPACITY=16;
	private E[] data= (E[]) new Object[INITIAL_CAPACITY];
	private int size=0;// Number of elements in the list
	
	public MyArrayList() {
		
	}
	
	
	public MyArrayList(E[] objects) {
		for(int i=0;i<objects.length;i++) {
			add(objects[i]);
		}
	}
	
	public void trimToSize( int size) {
		this.size=size;
	}
	
	
	
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(int index, E e) {
		if(index<0||index>size)
			throw new IndexOutOfBoundsException
			("Index: "+index+", Size: "+ size);
		ensureCapacity();
		for(int i=size-1;i>=index;i--) {
			data[index]=e;
			
		}
		
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(E e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E set(int index, E e) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
}
