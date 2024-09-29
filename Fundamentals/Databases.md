### Database Indexing

Overview : https://www.youtube.com/watch?v=fsG1XaZEa78
Best Explanation : https://www.youtube.com/watch?v=lYh6LrSIDvY

### Database Sharding & Partitioning

Sharding - Dividing Data  Across Multiple Database Servers

- Geo Based Sharding
- Range Based Sharding
- Hash Based Sharding (Consistent Hashing)

Partitioning the Database to Multiple Partitions/ Creating Multple Databases with in the Same Server. 
- Partitioning Overview : https://www.youtube.com/watch?v=l8kUZvM_rvQ
- Sharding Overview : https://www.youtube.com/watch?v=XP98YCr-iXQ


Sharding & Partitioning Explanation : https://www.youtube.com/watch?v=wXvljefXyEo

#### Partitioning vs Indexing

We use Partitioning to Isolate Chunks of Data from Large database where as Indexing is used to Query Relatively Small amounts of data.
- Partitioning is useful for Data Warehouses.

Ex : Partitioning database based on User location
Indexing Based on Last Name


### Database Replication (Master Slave Architecture)

Overview : https://www.youtube.com/watch?v=bI8Ry6GhMSE&t

- Leader - Follower Architecture  
    - Synchronous Replication (Slower but Strong Consitency, During Failover write operations are blocked)
    - Asynchronous Replication (Faster But no Consistency (During Failover read operations are incosistent as well, write operations are blocked))
- Multi- Leader (During Failover, other leaders can take write requests - consenus algorithms such as paxos can be used) 
    - It is complex (Leader election and Conflict resolution is resource intensive) but Effective.
- Leaderless Replication (Amazon Dynamo DB re Popularized this), Most Cloud providers use this architecture.
    - consistency is achieved through a combination of mechanisms such as quorum-based voting and conflict resolution.
NOTE : Consensus Algorithms (Paxos, Raft) are used in Terms of Failover, Quorum based voting methods are used in agreements and resolutions.

### Consistent Hashing

- Overview : https://www.youtube.com/watch?v=UF9Iqmg94tk
    - Basic Consistent Hashing  - Uneven Distribution
    - Virtual Nodes + Basic Consistent Hashing - Uniform Distribution


