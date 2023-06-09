package com.miracle.frame;

import java.util.List;

public interface MiracleService<K,V> {
	public V get(K k) throws Exception;
	public List<V> get() throws Exception;
	public void register(V v) throws Exception;
	public void modify(V v) throws Exception;
	public void remove(K k) throws Exception;
}
