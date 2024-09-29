### Queues

- One to One Communication (Asynchronous)
- Suitable for Parallel Processing
- Messages are removed once consumed

Eg : Stock Broker Application (all requests are in Queue, Stock Broker has 1 Core logic which is replicated across multiple servers, they all process the requests parallely )

- AWS SQS

### Pub Sub (Publish - Subscribe)

- One to Many Communication(Asynchronous)
- Suitable for Sending Messages to wide consumers
- Best for extension (A subscriber can be easily added / removed)
- Messages can be retained for a period such that new consumers can consume them.
- AWS SNS

### Kafka vs Queue
- Messages are consumed by any one in Queue, where as all Consumers can read message in Kafka
- Messages are removed once consumed in Queue, Kafka Retains them (Default 1 Week)
- Message Ordering (Any Queue can access any message) , In Kafka Partitions, Offsets are present to ensure order is maintained.
- Queues have no Limit over consumers, Kafka has no.of consumers  Per consumer Group = no.of partitions in the topic
- Queues are Push Based (broker pushes messages to consumers as soon as they become available in the queue.), Kafka (Pull Based - onsumers pull messages from the broker at their own pace.)

Explanation : https://www.youtube.com/watch?v=7gMm0iQNZGA

#### Kafka Combines the best of Both Queues and Sub-Pub paradigms.

