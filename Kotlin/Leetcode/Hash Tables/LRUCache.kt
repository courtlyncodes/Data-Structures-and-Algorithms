class LRUCache(private val capacity: Int) {
    
    // holds the key value pairs
    val cache = mutableMapOf<Int, Int>()
    // maintains order
    val deque = ArrayDeque<Int>()
        
        fun get(key: Int): Int {
            if (key in cache) {
                val result = cache[key]!!
                deque.remove(key)
                deque.addLast(key)
                return result
            }
            return -1
        }
    
        fun put(key: Int, value: Int) {
            // check for capacity,
            if (cache.contains(key)) {
                deque.remove(key)
            } else if (deque.size == this.capacity){
                val lru = deque.removeFirst()
                cache.remove(lru)
            }
            cache[key] = value
            deque.addLast(key)
        }
    }
    