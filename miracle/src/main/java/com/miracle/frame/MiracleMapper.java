package com.miracle.frame;

import java.util.List;

public interface MiracleMapper<K,V> {
	public V select(K k) throws Exception;
	public List<V> selectall() throws Exception;
	public void insert(V v) throws Exception;
	public void update(V v) throws Exception;
	public void delete(K k) throws Exception;
}
