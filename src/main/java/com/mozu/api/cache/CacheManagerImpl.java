package com.mozu.api.cache;

import org.apache.jcs.JCS;
import org.apache.jcs.access.exception.CacheException;

public class CacheManagerImpl<T> implements CacheManager<T> {
	private JCS jcsCache;
	private boolean _isInitialized = false;
	
    public CacheManagerImpl() {
          try {
            // Loading the cache using the configuration file
            jcsCache = JCS.getInstance("mozuCache");
            _isInitialized = true;
          } catch (CacheException e) {
                e.printStackTrace();
          }
    }

    public void put(String id, T cacheObject) {
    	if (!_isInitialized) return;
        try {
              jcsCache.put(id, cacheObject);
        } catch (CacheException e) {
              e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
	public T get(String id) {
    	if (!_isInitialized) return null;
    	return (T)jcsCache.get(id);
    }
	
	public void remove(String id) {
		if (!_isInitialized) return;
		try {
	        jcsCache.remove(id);
		} catch (CacheException e) {
	        e.printStackTrace();
		}
	}
}
