
Types of Caching

- __Client Side__ Caching (at Web Browser - HTTP Caching)
- __CDN caching__
- __Load Balancer Caching__ (eg : Reverse Proxy such as Nginx)
- __Server Caching__ (Backend Server Might have in-built cache - Every Programming Language have it)
- __Database Caching__ (MySQL, Mongo DB have default Caching)
- __Application caching__  (Prominent One - Application Takes care of Caching Strategy, Eviction Policies etc.. and Cache is an External Source (Redis, etc..))

__Distributed Caching__ is often used in Modern Systems.

Best Explanation
- https://www.youtube.com/watch?v=bP4BeUjNkXc&t
- https://www.youtube.com/watch?v=dGAgxozNWFE
- https://www.youtube.com/watch?v=jzPSuBiidF4
- https://www.enjoyalgorithms.com/blog/caching-system-design-concept/

## Application Caching 

### Caching Strategies
Best Explanation : https://www.youtube.com/watch?v=2zIFUqTx_TU

#### Read Heavy
- __Cache Aside__ (Read from Cache If present else read from DB, Later Cache is updated) - Widely used (Redis, Memcached etc..)
- __Read Through__ (Read from Cache If present else cache updates iself from DB and return to client)

Both Cache Around and Readthrough are same except that in Cache Around application takes care of Updating Cache, In Read-Through Strategy Cache by default updates itself.

#### Write Heavy

- __Write Through__ (Write to Cache and Write to DB -- Both happens synchronously) - Best when write operations are less
- __Write Back__ (Write to Cache every Time -- DB is updated at intervals using Cache -- Asynchronously) 
    - Best for Write Heavy
    - Widely used in Relational Databases
- __Write Around__ (Write Directly to DB and Update Cache when required)


### Cache Eviction Policies

- __LRU__ Least recently Used
- __LFU__ Least Frequently usedd
- __MRU__ - Most recently Used
- __FIFO__ - First in Firt Out
- __RR__ Random Replacement
